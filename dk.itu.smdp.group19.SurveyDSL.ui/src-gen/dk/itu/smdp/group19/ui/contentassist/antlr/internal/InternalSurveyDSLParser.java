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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'title:'", "'pages:'", "'end survey'", "'add question page'", "'questions:'", "'end page'", "'text:'", "'add description page'", "'add result page'", "'add free text question'", "'answers:'", "'end question'", "'requires:'", "'add single choice question'", "'add multi choice question'", "'and('", "'and'", "')'", "'or('", "'or'", "'answer reference:'", "'add answer choice'", "'name:'", "'add answer text'", "'optional'"
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:153:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:157:2: ( ( ( rule__Dependency__Alternatives ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:158:1: ( ( rule__Dependency__Alternatives ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:158:1: ( ( rule__Dependency__Alternatives ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:159:1: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:160:1: ( rule__Dependency__Alternatives )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:160:2: rule__Dependency__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Dependency__Alternatives_in_ruleDependency274);
            rule__Dependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

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
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_entryRuleAnswer301);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswer308); 

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
            pushFollow(FollowSets000.FOLLOW_rule__Answer__Alternatives_in_ruleAnswer334);
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
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString368); 

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
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString394);
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
            pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage421);
            ruleQuestionPage();

            state._fsp--;

             after(grammarAccess.getQuestionPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQuestionPage428); 

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
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__0_in_ruleQuestionPage454);
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
            pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage481);
            ruleDescriptionPage();

            state._fsp--;

             after(grammarAccess.getDescriptionPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDescriptionPage488); 

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
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__0_in_ruleDescriptionPage514);
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
            pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_entryRuleResultPage541);
            ruleResultPage();

            state._fsp--;

             after(grammarAccess.getResultPageRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResultPage548); 

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
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__0_in_ruleResultPage574);
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
            pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion603);
            ruleFreetextQuestion();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextQuestion610); 

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
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__0_in_ruleFreetextQuestion636);
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
            pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion663);
            ruleSingleChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSingleChoiceQuestion670); 

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
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__0_in_ruleSingleChoiceQuestion696);
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
            pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion723);
            ruleMultiChoiceQuestion();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiChoiceQuestion730); 

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
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__0_in_ruleMultiChoiceQuestion756);
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


    // $ANTLR start "entryRuleAnd"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:398:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:399:1: ( ruleAnd EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:400:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnd_in_entryRuleAnd783);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnd790); 

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:407:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:411:2: ( ( ( rule__And__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:412:1: ( ( rule__And__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:412:1: ( ( rule__And__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:413:1: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:414:1: ( rule__And__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:414:2: rule__And__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__0_in_ruleAnd816);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:426:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:427:1: ( ruleOr EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:428:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOr_in_entryRuleOr843);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOr850); 

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:435:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:439:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:440:1: ( ( rule__Or__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:440:1: ( ( rule__Or__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:441:1: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:442:1: ( rule__Or__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:442:2: rule__Or__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__0_in_ruleOr876);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnswerRef"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:454:1: entryRuleAnswerRef : ruleAnswerRef EOF ;
    public final void entryRuleAnswerRef() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:455:1: ( ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:456:1: ruleAnswerRef EOF
            {
             before(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef903);
            ruleAnswerRef();

            state._fsp--;

             after(grammarAccess.getAnswerRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef910); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:463:1: ruleAnswerRef : ( ( rule__AnswerRef__Group__0 ) ) ;
    public final void ruleAnswerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:467:2: ( ( ( rule__AnswerRef__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:468:1: ( ( rule__AnswerRef__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:468:1: ( ( rule__AnswerRef__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:469:1: ( rule__AnswerRef__Group__0 )
            {
             before(grammarAccess.getAnswerRefAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:1: ( rule__AnswerRef__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:2: rule__AnswerRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__0_in_ruleAnswerRef936);
            rule__AnswerRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerRefAccess().getGroup()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:482:1: entryRuleChoiceAnswer : ruleChoiceAnswer EOF ;
    public final void entryRuleChoiceAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:483:1: ( ruleChoiceAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:484:1: ruleChoiceAnswer EOF
            {
             before(grammarAccess.getChoiceAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer963);
            ruleChoiceAnswer();

            state._fsp--;

             after(grammarAccess.getChoiceAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer970); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:491:1: ruleChoiceAnswer : ( ( rule__ChoiceAnswer__Group__0 ) ) ;
    public final void ruleChoiceAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:495:2: ( ( ( rule__ChoiceAnswer__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:496:1: ( ( rule__ChoiceAnswer__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:496:1: ( ( rule__ChoiceAnswer__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:497:1: ( rule__ChoiceAnswer__Group__0 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:1: ( rule__ChoiceAnswer__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:2: rule__ChoiceAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0_in_ruleChoiceAnswer996);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:510:1: entryRuleFreetextAnswer : ruleFreetextAnswer EOF ;
    public final void entryRuleFreetextAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:511:1: ( ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:512:1: ruleFreetextAnswer EOF
            {
             before(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer1023);
            ruleFreetextAnswer();

            state._fsp--;

             after(grammarAccess.getFreetextAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer1030); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:519:1: ruleFreetextAnswer : ( ( rule__FreetextAnswer__Group__0 ) ) ;
    public final void ruleFreetextAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:523:2: ( ( ( rule__FreetextAnswer__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:524:1: ( ( rule__FreetextAnswer__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:524:1: ( ( rule__FreetextAnswer__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:525:1: ( rule__FreetextAnswer__Group__0 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:526:1: ( rule__FreetextAnswer__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:526:2: rule__FreetextAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0_in_ruleFreetextAnswer1056);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:538:1: rule__Page__Alternatives : ( ( ruleQuestionPage ) | ( ruleDescriptionPage ) | ( ruleResultPage ) );
    public final void rule__Page__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:542:1: ( ( ruleQuestionPage ) | ( ruleDescriptionPage ) | ( ruleResultPage ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:543:1: ( ruleQuestionPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:543:1: ( ruleQuestionPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:544:1: ruleQuestionPage
                    {
                     before(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_rule__Page__Alternatives1092);
                    ruleQuestionPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:549:6: ( ruleDescriptionPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:549:6: ( ruleDescriptionPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:550:1: ruleDescriptionPage
                    {
                     before(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_rule__Page__Alternatives1109);
                    ruleDescriptionPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:555:6: ( ruleResultPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:555:6: ( ruleResultPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:556:1: ruleResultPage
                    {
                     before(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_rule__Page__Alternatives1126);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:566:1: rule__Question__Alternatives : ( ( ruleFreetextQuestion ) | ( ruleSingleChoiceQuestion ) | ( ruleMultiChoiceQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:570:1: ( ( ruleFreetextQuestion ) | ( ruleSingleChoiceQuestion ) | ( ruleMultiChoiceQuestion ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 26:
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:571:1: ( ruleFreetextQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:571:1: ( ruleFreetextQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:572:1: ruleFreetextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives1158);
                    ruleFreetextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:577:6: ( ruleSingleChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:577:6: ( ruleSingleChoiceQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:578:1: ruleSingleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_rule__Question__Alternatives1175);
                    ruleSingleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:583:6: ( ruleMultiChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:583:6: ( ruleMultiChoiceQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:584:1: ruleMultiChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_rule__Question__Alternatives1192);
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


    // $ANTLR start "rule__Dependency__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:594:1: rule__Dependency__Alternatives : ( ( ruleAnd ) | ( ruleOr ) | ( ruleAnswerRef ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:598:1: ( ( ruleAnd ) | ( ruleOr ) | ( ruleAnswerRef ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 32:
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:599:1: ( ruleAnd )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:599:1: ( ruleAnd )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:600:1: ruleAnd
                    {
                     before(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_rule__Dependency__Alternatives1224);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:605:6: ( ruleOr )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:605:6: ( ruleOr )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:606:1: ruleOr
                    {
                     before(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOr_in_rule__Dependency__Alternatives1241);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:611:6: ( ruleAnswerRef )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:611:6: ( ruleAnswerRef )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:612:1: ruleAnswerRef
                    {
                     before(grammarAccess.getDependencyAccess().getAnswerRefParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_rule__Dependency__Alternatives1258);
                    ruleAnswerRef();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getAnswerRefParserRuleCall_2()); 

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
    // $ANTLR end "rule__Dependency__Alternatives"


    // $ANTLR start "rule__Answer__Alternatives"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:622:1: rule__Answer__Alternatives : ( ( ruleChoiceAnswer ) | ( ruleFreetextAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:626:1: ( ( ruleChoiceAnswer ) | ( ruleFreetextAnswer ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:627:1: ( ruleChoiceAnswer )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:627:1: ( ruleChoiceAnswer )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:628:1: ruleChoiceAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_rule__Answer__Alternatives1290);
                    ruleChoiceAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:633:6: ( ruleFreetextAnswer )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:633:6: ( ruleFreetextAnswer )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:634:1: ruleFreetextAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__Answer__Alternatives1307);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:644:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:648:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:649:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:649:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:650:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1339); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:655:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:655:6: ( RULE_ID )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:656:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1356); 
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


    // $ANTLR start "rule__Survey__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:669:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:673:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:674:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01387);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01390);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:681:1: rule__Survey__Group__0__Impl : ( 'start survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:685:1: ( ( 'start survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:686:1: ( 'start survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:686:1: ( 'start survey' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:687:1: 'start survey'
            {
             before(grammarAccess.getSurveyAccess().getStartSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl1418); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:700:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:704:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:705:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11449);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11452);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:712:1: rule__Survey__Group__1__Impl : ( 'title:' ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:716:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:717:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:717:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:718:1: 'title:'
            {
             before(grammarAccess.getSurveyAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__1__Impl1480); 
             after(grammarAccess.getSurveyAccess().getTitleKeyword_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:731:1: rule__Survey__Group__2 : rule__Survey__Group__2__Impl rule__Survey__Group__3 ;
    public final void rule__Survey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:735:1: ( rule__Survey__Group__2__Impl rule__Survey__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:736:2: rule__Survey__Group__2__Impl rule__Survey__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21511);
            rule__Survey__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21514);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:743:1: rule__Survey__Group__2__Impl : ( ( rule__Survey__TitleAssignment_2 ) ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:747:1: ( ( ( rule__Survey__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:748:1: ( ( rule__Survey__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:748:1: ( ( rule__Survey__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:749:1: ( rule__Survey__TitleAssignment_2 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:750:1: ( rule__Survey__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:750:2: rule__Survey__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl1541);
            rule__Survey__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getTitleAssignment_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:760:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:764:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:765:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31571);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31574);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:772:1: rule__Survey__Group__3__Impl : ( 'pages:' ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:776:1: ( ( 'pages:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:777:1: ( 'pages:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:777:1: ( 'pages:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:778:1: 'pages:'
            {
             before(grammarAccess.getSurveyAccess().getPagesKeyword_3()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group__3__Impl1602); 
             after(grammarAccess.getSurveyAccess().getPagesKeyword_3()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:791:1: rule__Survey__Group__4 : rule__Survey__Group__4__Impl rule__Survey__Group__5 ;
    public final void rule__Survey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:795:1: ( rule__Survey__Group__4__Impl rule__Survey__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:796:2: rule__Survey__Group__4__Impl rule__Survey__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41633);
            rule__Survey__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41636);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:803:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__PagesAssignment_4 ) ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:807:1: ( ( ( rule__Survey__PagesAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:808:1: ( ( rule__Survey__PagesAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:808:1: ( ( rule__Survey__PagesAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:809:1: ( rule__Survey__PagesAssignment_4 )
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:810:1: ( rule__Survey__PagesAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:810:2: rule__Survey__PagesAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1663);
            rule__Survey__PagesAssignment_4();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:820:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl rule__Survey__Group__6 ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:824:1: ( rule__Survey__Group__5__Impl rule__Survey__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:825:2: rule__Survey__Group__5__Impl rule__Survey__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51693);
            rule__Survey__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__51696);
            rule__Survey__Group__6();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:832:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__PagesAssignment_5 )* ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:836:1: ( ( ( rule__Survey__PagesAssignment_5 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:837:1: ( ( rule__Survey__PagesAssignment_5 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:837:1: ( ( rule__Survey__PagesAssignment_5 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:838:1: ( rule__Survey__PagesAssignment_5 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:839:1: ( rule__Survey__PagesAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15||(LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:839:2: rule__Survey__PagesAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_5_in_rule__Survey__Group__5__Impl1723);
            	    rule__Survey__PagesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getPagesAssignment_5()); 

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


    // $ANTLR start "rule__Survey__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:849:1: rule__Survey__Group__6 : rule__Survey__Group__6__Impl ;
    public final void rule__Survey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:853:1: ( rule__Survey__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:854:2: rule__Survey__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61754);
            rule__Survey__Group__6__Impl();

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
    // $ANTLR end "rule__Survey__Group__6"


    // $ANTLR start "rule__Survey__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:860:1: rule__Survey__Group__6__Impl : ( 'end survey' ) ;
    public final void rule__Survey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:864:1: ( ( 'end survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:865:1: ( 'end survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:865:1: ( 'end survey' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:866:1: 'end survey'
            {
             before(grammarAccess.getSurveyAccess().getEndSurveyKeyword_6()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__Survey__Group__6__Impl1782); 
             after(grammarAccess.getSurveyAccess().getEndSurveyKeyword_6()); 

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
    // $ANTLR end "rule__Survey__Group__6__Impl"


    // $ANTLR start "rule__QuestionPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:893:1: rule__QuestionPage__Group__0 : rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 ;
    public final void rule__QuestionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:897:1: ( rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:898:2: rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01827);
            rule__QuestionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01830);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:905:1: rule__QuestionPage__Group__0__Impl : ( 'add question page' ) ;
    public final void rule__QuestionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:909:1: ( ( 'add question page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:910:1: ( 'add question page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:910:1: ( 'add question page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:911:1: 'add question page'
            {
             before(grammarAccess.getQuestionPageAccess().getAddQuestionPageKeyword_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuestionPage__Group__0__Impl1858); 
             after(grammarAccess.getQuestionPageAccess().getAddQuestionPageKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:924:1: rule__QuestionPage__Group__1 : rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 ;
    public final void rule__QuestionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:928:1: ( rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:929:2: rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__11889);
            rule__QuestionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__11892);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:936:1: rule__QuestionPage__Group__1__Impl : ( 'title:' ) ;
    public final void rule__QuestionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:940:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:941:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:941:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:942:1: 'title:'
            {
             before(grammarAccess.getQuestionPageAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__QuestionPage__Group__1__Impl1920); 
             after(grammarAccess.getQuestionPageAccess().getTitleKeyword_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:955:1: rule__QuestionPage__Group__2 : rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 ;
    public final void rule__QuestionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:959:1: ( rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:960:2: rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__21951);
            rule__QuestionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__21954);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:967:1: rule__QuestionPage__Group__2__Impl : ( ( rule__QuestionPage__TitleAssignment_2 ) ) ;
    public final void rule__QuestionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:971:1: ( ( ( rule__QuestionPage__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:972:1: ( ( rule__QuestionPage__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:972:1: ( ( rule__QuestionPage__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:973:1: ( rule__QuestionPage__TitleAssignment_2 )
            {
             before(grammarAccess.getQuestionPageAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:974:1: ( rule__QuestionPage__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:974:2: rule__QuestionPage__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TitleAssignment_2_in_rule__QuestionPage__Group__2__Impl1981);
            rule__QuestionPage__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getTitleAssignment_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:984:1: rule__QuestionPage__Group__3 : rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 ;
    public final void rule__QuestionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:988:1: ( rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:989:2: rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__32011);
            rule__QuestionPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__32014);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:996:1: rule__QuestionPage__Group__3__Impl : ( ( rule__QuestionPage__Group_3__0 )? ) ;
    public final void rule__QuestionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1000:1: ( ( ( rule__QuestionPage__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1001:1: ( ( rule__QuestionPage__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1001:1: ( ( rule__QuestionPage__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1002:1: ( rule__QuestionPage__Group_3__0 )?
            {
             before(grammarAccess.getQuestionPageAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1003:1: ( rule__QuestionPage__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1003:2: rule__QuestionPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__0_in_rule__QuestionPage__Group__3__Impl2041);
                    rule__QuestionPage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionPageAccess().getGroup_3()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1013:1: rule__QuestionPage__Group__4 : rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 ;
    public final void rule__QuestionPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1017:1: ( rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1018:2: rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42072);
            rule__QuestionPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42075);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1025:1: rule__QuestionPage__Group__4__Impl : ( 'questions:' ) ;
    public final void rule__QuestionPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1029:1: ( ( 'questions:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1030:1: ( 'questions:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1030:1: ( 'questions:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1031:1: 'questions:'
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsKeyword_4()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuestionPage__Group__4__Impl2103); 
             after(grammarAccess.getQuestionPageAccess().getQuestionsKeyword_4()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1044:1: rule__QuestionPage__Group__5 : rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 ;
    public final void rule__QuestionPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1048:1: ( rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1049:2: rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52134);
            rule__QuestionPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52137);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1056:1: rule__QuestionPage__Group__5__Impl : ( ( rule__QuestionPage__QuestionsAssignment_5 ) ) ;
    public final void rule__QuestionPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1060:1: ( ( ( rule__QuestionPage__QuestionsAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1061:1: ( ( rule__QuestionPage__QuestionsAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1061:1: ( ( rule__QuestionPage__QuestionsAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1062:1: ( rule__QuestionPage__QuestionsAssignment_5 )
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1063:1: ( rule__QuestionPage__QuestionsAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1063:2: rule__QuestionPage__QuestionsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2164);
            rule__QuestionPage__QuestionsAssignment_5();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1073:1: rule__QuestionPage__Group__6 : rule__QuestionPage__Group__6__Impl rule__QuestionPage__Group__7 ;
    public final void rule__QuestionPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1077:1: ( rule__QuestionPage__Group__6__Impl rule__QuestionPage__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1078:2: rule__QuestionPage__Group__6__Impl rule__QuestionPage__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62194);
            rule__QuestionPage__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__7_in_rule__QuestionPage__Group__62197);
            rule__QuestionPage__Group__7();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1085:1: rule__QuestionPage__Group__6__Impl : ( ( rule__QuestionPage__QuestionsAssignment_6 )* ) ;
    public final void rule__QuestionPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1089:1: ( ( ( rule__QuestionPage__QuestionsAssignment_6 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1090:1: ( ( rule__QuestionPage__QuestionsAssignment_6 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1090:1: ( ( rule__QuestionPage__QuestionsAssignment_6 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1091:1: ( rule__QuestionPage__QuestionsAssignment_6 )*
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1092:1: ( rule__QuestionPage__QuestionsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||(LA8_0>=25 && LA8_0<=26)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1092:2: rule__QuestionPage__QuestionsAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_6_in_rule__QuestionPage__Group__6__Impl2224);
            	    rule__QuestionPage__QuestionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_6()); 

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


    // $ANTLR start "rule__QuestionPage__Group__7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1102:1: rule__QuestionPage__Group__7 : rule__QuestionPage__Group__7__Impl ;
    public final void rule__QuestionPage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1106:1: ( rule__QuestionPage__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1107:2: rule__QuestionPage__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__7__Impl_in_rule__QuestionPage__Group__72255);
            rule__QuestionPage__Group__7__Impl();

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
    // $ANTLR end "rule__QuestionPage__Group__7"


    // $ANTLR start "rule__QuestionPage__Group__7__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1113:1: rule__QuestionPage__Group__7__Impl : ( 'end page' ) ;
    public final void rule__QuestionPage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1117:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1118:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1118:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1119:1: 'end page'
            {
             before(grammarAccess.getQuestionPageAccess().getEndPageKeyword_7()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuestionPage__Group__7__Impl2283); 
             after(grammarAccess.getQuestionPageAccess().getEndPageKeyword_7()); 

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
    // $ANTLR end "rule__QuestionPage__Group__7__Impl"


    // $ANTLR start "rule__QuestionPage__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1148:1: rule__QuestionPage__Group_3__0 : rule__QuestionPage__Group_3__0__Impl rule__QuestionPage__Group_3__1 ;
    public final void rule__QuestionPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1152:1: ( rule__QuestionPage__Group_3__0__Impl rule__QuestionPage__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1153:2: rule__QuestionPage__Group_3__0__Impl rule__QuestionPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__0__Impl_in_rule__QuestionPage__Group_3__02330);
            rule__QuestionPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__1_in_rule__QuestionPage__Group_3__02333);
            rule__QuestionPage__Group_3__1();

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
    // $ANTLR end "rule__QuestionPage__Group_3__0"


    // $ANTLR start "rule__QuestionPage__Group_3__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1160:1: rule__QuestionPage__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__QuestionPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1164:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1165:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1165:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1166:1: 'text:'
            {
             before(grammarAccess.getQuestionPageAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QuestionPage__Group_3__0__Impl2361); 
             after(grammarAccess.getQuestionPageAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__QuestionPage__Group_3__0__Impl"


    // $ANTLR start "rule__QuestionPage__Group_3__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1179:1: rule__QuestionPage__Group_3__1 : rule__QuestionPage__Group_3__1__Impl ;
    public final void rule__QuestionPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1183:1: ( rule__QuestionPage__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1184:2: rule__QuestionPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__1__Impl_in_rule__QuestionPage__Group_3__12392);
            rule__QuestionPage__Group_3__1__Impl();

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
    // $ANTLR end "rule__QuestionPage__Group_3__1"


    // $ANTLR start "rule__QuestionPage__Group_3__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1190:1: rule__QuestionPage__Group_3__1__Impl : ( ( rule__QuestionPage__TextAssignment_3_1 ) ) ;
    public final void rule__QuestionPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1194:1: ( ( ( rule__QuestionPage__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1195:1: ( ( rule__QuestionPage__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1195:1: ( ( rule__QuestionPage__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1196:1: ( rule__QuestionPage__TextAssignment_3_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1197:1: ( rule__QuestionPage__TextAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1197:2: rule__QuestionPage__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TextAssignment_3_1_in_rule__QuestionPage__Group_3__1__Impl2419);
            rule__QuestionPage__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__QuestionPage__Group_3__1__Impl"


    // $ANTLR start "rule__DescriptionPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1211:1: rule__DescriptionPage__Group__0 : rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 ;
    public final void rule__DescriptionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1215:1: ( rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1216:2: rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02453);
            rule__DescriptionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02456);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1223:1: rule__DescriptionPage__Group__0__Impl : ( 'add description page' ) ;
    public final void rule__DescriptionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1227:1: ( ( 'add description page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1228:1: ( 'add description page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1228:1: ( 'add description page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1229:1: 'add description page'
            {
             before(grammarAccess.getDescriptionPageAccess().getAddDescriptionPageKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DescriptionPage__Group__0__Impl2484); 
             after(grammarAccess.getDescriptionPageAccess().getAddDescriptionPageKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1242:1: rule__DescriptionPage__Group__1 : rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 ;
    public final void rule__DescriptionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1246:1: ( rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1247:2: rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12515);
            rule__DescriptionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12518);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1254:1: rule__DescriptionPage__Group__1__Impl : ( 'title:' ) ;
    public final void rule__DescriptionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1258:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1259:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1259:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1260:1: 'title:'
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__DescriptionPage__Group__1__Impl2546); 
             after(grammarAccess.getDescriptionPageAccess().getTitleKeyword_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1273:1: rule__DescriptionPage__Group__2 : rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 ;
    public final void rule__DescriptionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1277:1: ( rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1278:2: rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22577);
            rule__DescriptionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22580);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1285:1: rule__DescriptionPage__Group__2__Impl : ( ( rule__DescriptionPage__TitleAssignment_2 ) ) ;
    public final void rule__DescriptionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1289:1: ( ( ( rule__DescriptionPage__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:1: ( ( rule__DescriptionPage__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:1: ( ( rule__DescriptionPage__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1291:1: ( rule__DescriptionPage__TitleAssignment_2 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1292:1: ( rule__DescriptionPage__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1292:2: rule__DescriptionPage__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TitleAssignment_2_in_rule__DescriptionPage__Group__2__Impl2607);
            rule__DescriptionPage__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionPageAccess().getTitleAssignment_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1302:1: rule__DescriptionPage__Group__3 : rule__DescriptionPage__Group__3__Impl rule__DescriptionPage__Group__4 ;
    public final void rule__DescriptionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1306:1: ( rule__DescriptionPage__Group__3__Impl rule__DescriptionPage__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1307:2: rule__DescriptionPage__Group__3__Impl rule__DescriptionPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32637);
            rule__DescriptionPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__4_in_rule__DescriptionPage__Group__32640);
            rule__DescriptionPage__Group__4();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1314:1: rule__DescriptionPage__Group__3__Impl : ( ( rule__DescriptionPage__Group_3__0 )? ) ;
    public final void rule__DescriptionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1318:1: ( ( ( rule__DescriptionPage__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1319:1: ( ( rule__DescriptionPage__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1319:1: ( ( rule__DescriptionPage__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1320:1: ( rule__DescriptionPage__Group_3__0 )?
            {
             before(grammarAccess.getDescriptionPageAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:1: ( rule__DescriptionPage__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:2: rule__DescriptionPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__0_in_rule__DescriptionPage__Group__3__Impl2667);
                    rule__DescriptionPage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptionPageAccess().getGroup_3()); 

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


    // $ANTLR start "rule__DescriptionPage__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1331:1: rule__DescriptionPage__Group__4 : rule__DescriptionPage__Group__4__Impl ;
    public final void rule__DescriptionPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1335:1: ( rule__DescriptionPage__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1336:2: rule__DescriptionPage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__4__Impl_in_rule__DescriptionPage__Group__42698);
            rule__DescriptionPage__Group__4__Impl();

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
    // $ANTLR end "rule__DescriptionPage__Group__4"


    // $ANTLR start "rule__DescriptionPage__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1342:1: rule__DescriptionPage__Group__4__Impl : ( 'end page' ) ;
    public final void rule__DescriptionPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1346:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1347:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1347:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1348:1: 'end page'
            {
             before(grammarAccess.getDescriptionPageAccess().getEndPageKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DescriptionPage__Group__4__Impl2726); 
             after(grammarAccess.getDescriptionPageAccess().getEndPageKeyword_4()); 

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
    // $ANTLR end "rule__DescriptionPage__Group__4__Impl"


    // $ANTLR start "rule__DescriptionPage__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1371:1: rule__DescriptionPage__Group_3__0 : rule__DescriptionPage__Group_3__0__Impl rule__DescriptionPage__Group_3__1 ;
    public final void rule__DescriptionPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1375:1: ( rule__DescriptionPage__Group_3__0__Impl rule__DescriptionPage__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1376:2: rule__DescriptionPage__Group_3__0__Impl rule__DescriptionPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__0__Impl_in_rule__DescriptionPage__Group_3__02767);
            rule__DescriptionPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__1_in_rule__DescriptionPage__Group_3__02770);
            rule__DescriptionPage__Group_3__1();

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
    // $ANTLR end "rule__DescriptionPage__Group_3__0"


    // $ANTLR start "rule__DescriptionPage__Group_3__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1383:1: rule__DescriptionPage__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__DescriptionPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1387:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1388:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1388:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1389:1: 'text:'
            {
             before(grammarAccess.getDescriptionPageAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DescriptionPage__Group_3__0__Impl2798); 
             after(grammarAccess.getDescriptionPageAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__DescriptionPage__Group_3__0__Impl"


    // $ANTLR start "rule__DescriptionPage__Group_3__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1402:1: rule__DescriptionPage__Group_3__1 : rule__DescriptionPage__Group_3__1__Impl ;
    public final void rule__DescriptionPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1406:1: ( rule__DescriptionPage__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1407:2: rule__DescriptionPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__1__Impl_in_rule__DescriptionPage__Group_3__12829);
            rule__DescriptionPage__Group_3__1__Impl();

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
    // $ANTLR end "rule__DescriptionPage__Group_3__1"


    // $ANTLR start "rule__DescriptionPage__Group_3__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1413:1: rule__DescriptionPage__Group_3__1__Impl : ( ( rule__DescriptionPage__TextAssignment_3_1 ) ) ;
    public final void rule__DescriptionPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1417:1: ( ( ( rule__DescriptionPage__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1418:1: ( ( rule__DescriptionPage__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1418:1: ( ( rule__DescriptionPage__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1419:1: ( rule__DescriptionPage__TextAssignment_3_1 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1420:1: ( rule__DescriptionPage__TextAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1420:2: rule__DescriptionPage__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TextAssignment_3_1_in_rule__DescriptionPage__Group_3__1__Impl2856);
            rule__DescriptionPage__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptionPageAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__DescriptionPage__Group_3__1__Impl"


    // $ANTLR start "rule__ResultPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1434:1: rule__ResultPage__Group__0 : rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 ;
    public final void rule__ResultPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1438:1: ( rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1439:2: rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__02890);
            rule__ResultPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__02893);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1446:1: rule__ResultPage__Group__0__Impl : ( 'add result page' ) ;
    public final void rule__ResultPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1450:1: ( ( 'add result page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1451:1: ( 'add result page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1451:1: ( 'add result page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1452:1: 'add result page'
            {
             before(grammarAccess.getResultPageAccess().getAddResultPageKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ResultPage__Group__0__Impl2921); 
             after(grammarAccess.getResultPageAccess().getAddResultPageKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1465:1: rule__ResultPage__Group__1 : rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 ;
    public final void rule__ResultPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1469:1: ( rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1470:2: rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__12952);
            rule__ResultPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__12955);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1477:1: rule__ResultPage__Group__1__Impl : ( 'title:' ) ;
    public final void rule__ResultPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1481:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1482:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1482:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1483:1: 'title:'
            {
             before(grammarAccess.getResultPageAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ResultPage__Group__1__Impl2983); 
             after(grammarAccess.getResultPageAccess().getTitleKeyword_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1496:1: rule__ResultPage__Group__2 : rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 ;
    public final void rule__ResultPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1500:1: ( rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1501:2: rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__23014);
            rule__ResultPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__23017);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1508:1: rule__ResultPage__Group__2__Impl : ( ( rule__ResultPage__TitleAssignment_2 ) ) ;
    public final void rule__ResultPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1512:1: ( ( ( rule__ResultPage__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1513:1: ( ( rule__ResultPage__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1513:1: ( ( rule__ResultPage__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1514:1: ( rule__ResultPage__TitleAssignment_2 )
            {
             before(grammarAccess.getResultPageAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1515:1: ( rule__ResultPage__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1515:2: rule__ResultPage__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TitleAssignment_2_in_rule__ResultPage__Group__2__Impl3044);
            rule__ResultPage__TitleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResultPageAccess().getTitleAssignment_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1525:1: rule__ResultPage__Group__3 : rule__ResultPage__Group__3__Impl rule__ResultPage__Group__4 ;
    public final void rule__ResultPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1529:1: ( rule__ResultPage__Group__3__Impl rule__ResultPage__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1530:2: rule__ResultPage__Group__3__Impl rule__ResultPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__33074);
            rule__ResultPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__4_in_rule__ResultPage__Group__33077);
            rule__ResultPage__Group__4();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1537:1: rule__ResultPage__Group__3__Impl : ( ( rule__ResultPage__Group_3__0 )? ) ;
    public final void rule__ResultPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1541:1: ( ( ( rule__ResultPage__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1542:1: ( ( rule__ResultPage__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1542:1: ( ( rule__ResultPage__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1543:1: ( rule__ResultPage__Group_3__0 )?
            {
             before(grammarAccess.getResultPageAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1544:1: ( rule__ResultPage__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1544:2: rule__ResultPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__0_in_rule__ResultPage__Group__3__Impl3104);
                    rule__ResultPage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResultPageAccess().getGroup_3()); 

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


    // $ANTLR start "rule__ResultPage__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1554:1: rule__ResultPage__Group__4 : rule__ResultPage__Group__4__Impl ;
    public final void rule__ResultPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1558:1: ( rule__ResultPage__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1559:2: rule__ResultPage__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__4__Impl_in_rule__ResultPage__Group__43135);
            rule__ResultPage__Group__4__Impl();

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
    // $ANTLR end "rule__ResultPage__Group__4"


    // $ANTLR start "rule__ResultPage__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1565:1: rule__ResultPage__Group__4__Impl : ( 'end page' ) ;
    public final void rule__ResultPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1569:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1570:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1570:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1571:1: 'end page'
            {
             before(grammarAccess.getResultPageAccess().getEndPageKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ResultPage__Group__4__Impl3163); 
             after(grammarAccess.getResultPageAccess().getEndPageKeyword_4()); 

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
    // $ANTLR end "rule__ResultPage__Group__4__Impl"


    // $ANTLR start "rule__ResultPage__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1594:1: rule__ResultPage__Group_3__0 : rule__ResultPage__Group_3__0__Impl rule__ResultPage__Group_3__1 ;
    public final void rule__ResultPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1598:1: ( rule__ResultPage__Group_3__0__Impl rule__ResultPage__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1599:2: rule__ResultPage__Group_3__0__Impl rule__ResultPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__0__Impl_in_rule__ResultPage__Group_3__03204);
            rule__ResultPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__1_in_rule__ResultPage__Group_3__03207);
            rule__ResultPage__Group_3__1();

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
    // $ANTLR end "rule__ResultPage__Group_3__0"


    // $ANTLR start "rule__ResultPage__Group_3__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1606:1: rule__ResultPage__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__ResultPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1610:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1611:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1611:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1612:1: 'text:'
            {
             before(grammarAccess.getResultPageAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ResultPage__Group_3__0__Impl3235); 
             after(grammarAccess.getResultPageAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__ResultPage__Group_3__0__Impl"


    // $ANTLR start "rule__ResultPage__Group_3__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1625:1: rule__ResultPage__Group_3__1 : rule__ResultPage__Group_3__1__Impl ;
    public final void rule__ResultPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1629:1: ( rule__ResultPage__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1630:2: rule__ResultPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__1__Impl_in_rule__ResultPage__Group_3__13266);
            rule__ResultPage__Group_3__1__Impl();

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
    // $ANTLR end "rule__ResultPage__Group_3__1"


    // $ANTLR start "rule__ResultPage__Group_3__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1636:1: rule__ResultPage__Group_3__1__Impl : ( ( rule__ResultPage__TextAssignment_3_1 ) ) ;
    public final void rule__ResultPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1640:1: ( ( ( rule__ResultPage__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1641:1: ( ( rule__ResultPage__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1641:1: ( ( rule__ResultPage__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1642:1: ( rule__ResultPage__TextAssignment_3_1 )
            {
             before(grammarAccess.getResultPageAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1643:1: ( rule__ResultPage__TextAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1643:2: rule__ResultPage__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TextAssignment_3_1_in_rule__ResultPage__Group_3__1__Impl3293);
            rule__ResultPage__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResultPageAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__ResultPage__Group_3__1__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1657:1: rule__FreetextQuestion__Group__0 : rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 ;
    public final void rule__FreetextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1661:1: ( rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1662:2: rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03327);
            rule__FreetextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03330);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1669:1: rule__FreetextQuestion__Group__0__Impl : ( 'add free text question' ) ;
    public final void rule__FreetextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1673:1: ( ( 'add free text question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1674:1: ( 'add free text question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1674:1: ( 'add free text question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1675:1: 'add free text question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getAddFreeTextQuestionKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__FreetextQuestion__Group__0__Impl3358); 
             after(grammarAccess.getFreetextQuestionAccess().getAddFreeTextQuestionKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1688:1: rule__FreetextQuestion__Group__1 : rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 ;
    public final void rule__FreetextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1692:1: ( rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1693:2: rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13389);
            rule__FreetextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13392);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1700:1: rule__FreetextQuestion__Group__1__Impl : ( ( rule__FreetextQuestion__OptionalAssignment_1 )? ) ;
    public final void rule__FreetextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1704:1: ( ( ( rule__FreetextQuestion__OptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1705:1: ( ( rule__FreetextQuestion__OptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1705:1: ( ( rule__FreetextQuestion__OptionalAssignment_1 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1706:1: ( rule__FreetextQuestion__OptionalAssignment_1 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1707:1: ( rule__FreetextQuestion__OptionalAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==36) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1707:2: rule__FreetextQuestion__OptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__OptionalAssignment_1_in_rule__FreetextQuestion__Group__1__Impl3419);
                    rule__FreetextQuestion__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1717:1: rule__FreetextQuestion__Group__2 : rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 ;
    public final void rule__FreetextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1721:1: ( rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1722:2: rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23450);
            rule__FreetextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23453);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1729:1: rule__FreetextQuestion__Group__2__Impl : ( 'text:' ) ;
    public final void rule__FreetextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1733:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1734:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1734:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1735:1: 'text:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FreetextQuestion__Group__2__Impl3481); 
             after(grammarAccess.getFreetextQuestionAccess().getTextKeyword_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1748:1: rule__FreetextQuestion__Group__3 : rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 ;
    public final void rule__FreetextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1752:1: ( rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1753:2: rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33512);
            rule__FreetextQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33515);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1760:1: rule__FreetextQuestion__Group__3__Impl : ( ( rule__FreetextQuestion__TextAssignment_3 ) ) ;
    public final void rule__FreetextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1764:1: ( ( ( rule__FreetextQuestion__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1765:1: ( ( rule__FreetextQuestion__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1765:1: ( ( rule__FreetextQuestion__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1766:1: ( rule__FreetextQuestion__TextAssignment_3 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1767:1: ( rule__FreetextQuestion__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1767:2: rule__FreetextQuestion__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__TextAssignment_3_in_rule__FreetextQuestion__Group__3__Impl3542);
            rule__FreetextQuestion__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getTextAssignment_3()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1777:1: rule__FreetextQuestion__Group__4 : rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 ;
    public final void rule__FreetextQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1781:1: ( rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1782:2: rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43572);
            rule__FreetextQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43575);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1789:1: rule__FreetextQuestion__Group__4__Impl : ( ( rule__FreetextQuestion__Group_4__0 )? ) ;
    public final void rule__FreetextQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1793:1: ( ( ( rule__FreetextQuestion__Group_4__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1794:1: ( ( rule__FreetextQuestion__Group_4__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1794:1: ( ( rule__FreetextQuestion__Group_4__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1795:1: ( rule__FreetextQuestion__Group_4__0 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getGroup_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1796:1: ( rule__FreetextQuestion__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1796:2: rule__FreetextQuestion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_4__0_in_rule__FreetextQuestion__Group__4__Impl3602);
                    rule__FreetextQuestion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextQuestionAccess().getGroup_4()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1806:1: rule__FreetextQuestion__Group__5 : rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 ;
    public final void rule__FreetextQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1810:1: ( rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1811:2: rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53633);
            rule__FreetextQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53636);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1818:1: rule__FreetextQuestion__Group__5__Impl : ( 'answers:' ) ;
    public final void rule__FreetextQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1822:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1823:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1823:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1824:1: 'answers:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__FreetextQuestion__Group__5__Impl3664); 
             after(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_5()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1837:1: rule__FreetextQuestion__Group__6 : rule__FreetextQuestion__Group__6__Impl rule__FreetextQuestion__Group__7 ;
    public final void rule__FreetextQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1841:1: ( rule__FreetextQuestion__Group__6__Impl rule__FreetextQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1842:2: rule__FreetextQuestion__Group__6__Impl rule__FreetextQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63695);
            rule__FreetextQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__7_in_rule__FreetextQuestion__Group__63698);
            rule__FreetextQuestion__Group__7();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1849:1: rule__FreetextQuestion__Group__6__Impl : ( ( rule__FreetextQuestion__AnswersAssignment_6 ) ) ;
    public final void rule__FreetextQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1853:1: ( ( ( rule__FreetextQuestion__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1854:1: ( ( rule__FreetextQuestion__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1854:1: ( ( rule__FreetextQuestion__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1855:1: ( rule__FreetextQuestion__AnswersAssignment_6 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1856:1: ( rule__FreetextQuestion__AnswersAssignment_6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1856:2: rule__FreetextQuestion__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__AnswersAssignment_6_in_rule__FreetextQuestion__Group__6__Impl3725);
            rule__FreetextQuestion__AnswersAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_6()); 

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


    // $ANTLR start "rule__FreetextQuestion__Group__7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1866:1: rule__FreetextQuestion__Group__7 : rule__FreetextQuestion__Group__7__Impl ;
    public final void rule__FreetextQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1870:1: ( rule__FreetextQuestion__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1871:2: rule__FreetextQuestion__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__7__Impl_in_rule__FreetextQuestion__Group__73755);
            rule__FreetextQuestion__Group__7__Impl();

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
    // $ANTLR end "rule__FreetextQuestion__Group__7"


    // $ANTLR start "rule__FreetextQuestion__Group__7__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1877:1: rule__FreetextQuestion__Group__7__Impl : ( 'end question' ) ;
    public final void rule__FreetextQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1881:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1882:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1882:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1883:1: 'end question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_7()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FreetextQuestion__Group__7__Impl3783); 
             after(grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_7()); 

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
    // $ANTLR end "rule__FreetextQuestion__Group__7__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group_4__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1912:1: rule__FreetextQuestion__Group_4__0 : rule__FreetextQuestion__Group_4__0__Impl rule__FreetextQuestion__Group_4__1 ;
    public final void rule__FreetextQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1916:1: ( rule__FreetextQuestion__Group_4__0__Impl rule__FreetextQuestion__Group_4__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1917:2: rule__FreetextQuestion__Group_4__0__Impl rule__FreetextQuestion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_4__0__Impl_in_rule__FreetextQuestion__Group_4__03830);
            rule__FreetextQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_4__1_in_rule__FreetextQuestion__Group_4__03833);
            rule__FreetextQuestion__Group_4__1();

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
    // $ANTLR end "rule__FreetextQuestion__Group_4__0"


    // $ANTLR start "rule__FreetextQuestion__Group_4__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1924:1: rule__FreetextQuestion__Group_4__0__Impl : ( 'requires:' ) ;
    public final void rule__FreetextQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1928:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1929:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1929:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1930:1: 'requires:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__FreetextQuestion__Group_4__0__Impl3861); 
             after(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_4_0()); 

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
    // $ANTLR end "rule__FreetextQuestion__Group_4__0__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group_4__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1943:1: rule__FreetextQuestion__Group_4__1 : rule__FreetextQuestion__Group_4__1__Impl ;
    public final void rule__FreetextQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1947:1: ( rule__FreetextQuestion__Group_4__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1948:2: rule__FreetextQuestion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_4__1__Impl_in_rule__FreetextQuestion__Group_4__13892);
            rule__FreetextQuestion__Group_4__1__Impl();

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
    // $ANTLR end "rule__FreetextQuestion__Group_4__1"


    // $ANTLR start "rule__FreetextQuestion__Group_4__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1954:1: rule__FreetextQuestion__Group_4__1__Impl : ( ( rule__FreetextQuestion__RequiresAssignment_4_1 ) ) ;
    public final void rule__FreetextQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1958:1: ( ( ( rule__FreetextQuestion__RequiresAssignment_4_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1959:1: ( ( rule__FreetextQuestion__RequiresAssignment_4_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1959:1: ( ( rule__FreetextQuestion__RequiresAssignment_4_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1960:1: ( rule__FreetextQuestion__RequiresAssignment_4_1 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_4_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1961:1: ( rule__FreetextQuestion__RequiresAssignment_4_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1961:2: rule__FreetextQuestion__RequiresAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__RequiresAssignment_4_1_in_rule__FreetextQuestion__Group_4__1__Impl3919);
            rule__FreetextQuestion__RequiresAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_4_1()); 

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
    // $ANTLR end "rule__FreetextQuestion__Group_4__1__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1975:1: rule__SingleChoiceQuestion__Group__0 : rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 ;
    public final void rule__SingleChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1979:1: ( rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1980:2: rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__03953);
            rule__SingleChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__03956);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1987:1: rule__SingleChoiceQuestion__Group__0__Impl : ( 'add single choice question' ) ;
    public final void rule__SingleChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1991:1: ( ( 'add single choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1992:1: ( 'add single choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1992:1: ( 'add single choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1993:1: 'add single choice question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAddSingleChoiceQuestionKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__SingleChoiceQuestion__Group__0__Impl3984); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getAddSingleChoiceQuestionKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2006:1: rule__SingleChoiceQuestion__Group__1 : rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 ;
    public final void rule__SingleChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2010:1: ( rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2011:2: rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__14015);
            rule__SingleChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__14018);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2018:1: rule__SingleChoiceQuestion__Group__1__Impl : ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2022:1: ( ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2023:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2023:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2024:1: ( rule__SingleChoiceQuestion__OptionalAssignment_1 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2025:1: ( rule__SingleChoiceQuestion__OptionalAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2025:2: rule__SingleChoiceQuestion__OptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_1_in_rule__SingleChoiceQuestion__Group__1__Impl4045);
                    rule__SingleChoiceQuestion__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2035:1: rule__SingleChoiceQuestion__Group__2 : rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 ;
    public final void rule__SingleChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2039:1: ( rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2040:2: rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__24076);
            rule__SingleChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__24079);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2047:1: rule__SingleChoiceQuestion__Group__2__Impl : ( 'text:' ) ;
    public final void rule__SingleChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2051:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2052:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2052:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2053:1: 'text:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SingleChoiceQuestion__Group__2__Impl4107); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2066:1: rule__SingleChoiceQuestion__Group__3 : rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 ;
    public final void rule__SingleChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2070:1: ( rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2071:2: rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__34138);
            rule__SingleChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__34141);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2078:1: rule__SingleChoiceQuestion__Group__3__Impl : ( ( rule__SingleChoiceQuestion__TextAssignment_3 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2082:1: ( ( ( rule__SingleChoiceQuestion__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2083:1: ( ( rule__SingleChoiceQuestion__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2083:1: ( ( rule__SingleChoiceQuestion__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2084:1: ( rule__SingleChoiceQuestion__TextAssignment_3 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2085:1: ( rule__SingleChoiceQuestion__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2085:2: rule__SingleChoiceQuestion__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__TextAssignment_3_in_rule__SingleChoiceQuestion__Group__3__Impl4168);
            rule__SingleChoiceQuestion__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_3()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2095:1: rule__SingleChoiceQuestion__Group__4 : rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 ;
    public final void rule__SingleChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2099:1: ( rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2100:2: rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__44198);
            rule__SingleChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__44201);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2107:1: rule__SingleChoiceQuestion__Group__4__Impl : ( ( rule__SingleChoiceQuestion__Group_4__0 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2111:1: ( ( ( rule__SingleChoiceQuestion__Group_4__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2112:1: ( ( rule__SingleChoiceQuestion__Group_4__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2112:1: ( ( rule__SingleChoiceQuestion__Group_4__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2113:1: ( rule__SingleChoiceQuestion__Group_4__0 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getGroup_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2114:1: ( rule__SingleChoiceQuestion__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2114:2: rule__SingleChoiceQuestion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_4__0_in_rule__SingleChoiceQuestion__Group__4__Impl4228);
                    rule__SingleChoiceQuestion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getGroup_4()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2124:1: rule__SingleChoiceQuestion__Group__5 : rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 ;
    public final void rule__SingleChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2128:1: ( rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2129:2: rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__54259);
            rule__SingleChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__54262);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2136:1: rule__SingleChoiceQuestion__Group__5__Impl : ( 'answers:' ) ;
    public final void rule__SingleChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2140:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2141:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2141:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2142:1: 'answers:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SingleChoiceQuestion__Group__5__Impl4290); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_5()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2155:1: rule__SingleChoiceQuestion__Group__6 : rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 ;
    public final void rule__SingleChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2159:1: ( rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2160:2: rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64321);
            rule__SingleChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64324);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2167:1: rule__SingleChoiceQuestion__Group__6__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2171:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2172:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2172:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2173:1: ( rule__SingleChoiceQuestion__AnswersAssignment_6 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2174:1: ( rule__SingleChoiceQuestion__AnswersAssignment_6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2174:2: rule__SingleChoiceQuestion__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_6_in_rule__SingleChoiceQuestion__Group__6__Impl4351);
            rule__SingleChoiceQuestion__AnswersAssignment_6();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2184:1: rule__SingleChoiceQuestion__Group__7 : rule__SingleChoiceQuestion__Group__7__Impl rule__SingleChoiceQuestion__Group__8 ;
    public final void rule__SingleChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2188:1: ( rule__SingleChoiceQuestion__Group__7__Impl rule__SingleChoiceQuestion__Group__8 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2189:2: rule__SingleChoiceQuestion__Group__7__Impl rule__SingleChoiceQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74381);
            rule__SingleChoiceQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__8_in_rule__SingleChoiceQuestion__Group__74384);
            rule__SingleChoiceQuestion__Group__8();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2196:1: rule__SingleChoiceQuestion__Group__7__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 )* ) ;
    public final void rule__SingleChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2200:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2201:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2201:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2202:1: ( rule__SingleChoiceQuestion__AnswersAssignment_7 )*
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2203:1: ( rule__SingleChoiceQuestion__AnswersAssignment_7 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33||LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2203:2: rule__SingleChoiceQuestion__AnswersAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_7_in_rule__SingleChoiceQuestion__Group__7__Impl4411);
            	    rule__SingleChoiceQuestion__AnswersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_7()); 

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


    // $ANTLR start "rule__SingleChoiceQuestion__Group__8"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2213:1: rule__SingleChoiceQuestion__Group__8 : rule__SingleChoiceQuestion__Group__8__Impl ;
    public final void rule__SingleChoiceQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2217:1: ( rule__SingleChoiceQuestion__Group__8__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2218:2: rule__SingleChoiceQuestion__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__8__Impl_in_rule__SingleChoiceQuestion__Group__84442);
            rule__SingleChoiceQuestion__Group__8__Impl();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__8"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2224:1: rule__SingleChoiceQuestion__Group__8__Impl : ( 'end question' ) ;
    public final void rule__SingleChoiceQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2228:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2229:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2229:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2230:1: 'end question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_8()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SingleChoiceQuestion__Group__8__Impl4470); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_8()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group__8__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_4__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2261:1: rule__SingleChoiceQuestion__Group_4__0 : rule__SingleChoiceQuestion__Group_4__0__Impl rule__SingleChoiceQuestion__Group_4__1 ;
    public final void rule__SingleChoiceQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2265:1: ( rule__SingleChoiceQuestion__Group_4__0__Impl rule__SingleChoiceQuestion__Group_4__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2266:2: rule__SingleChoiceQuestion__Group_4__0__Impl rule__SingleChoiceQuestion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_4__0__Impl_in_rule__SingleChoiceQuestion__Group_4__04519);
            rule__SingleChoiceQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_4__1_in_rule__SingleChoiceQuestion__Group_4__04522);
            rule__SingleChoiceQuestion__Group_4__1();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_4__0"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_4__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2273:1: rule__SingleChoiceQuestion__Group_4__0__Impl : ( 'requires:' ) ;
    public final void rule__SingleChoiceQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2277:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2278:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2278:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2279:1: 'requires:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SingleChoiceQuestion__Group_4__0__Impl4550); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_4_0()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_4__0__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_4__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2292:1: rule__SingleChoiceQuestion__Group_4__1 : rule__SingleChoiceQuestion__Group_4__1__Impl ;
    public final void rule__SingleChoiceQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2296:1: ( rule__SingleChoiceQuestion__Group_4__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2297:2: rule__SingleChoiceQuestion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_4__1__Impl_in_rule__SingleChoiceQuestion__Group_4__14581);
            rule__SingleChoiceQuestion__Group_4__1__Impl();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_4__1"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_4__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2303:1: rule__SingleChoiceQuestion__Group_4__1__Impl : ( ( rule__SingleChoiceQuestion__RequiresAssignment_4_1 ) ) ;
    public final void rule__SingleChoiceQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2307:1: ( ( ( rule__SingleChoiceQuestion__RequiresAssignment_4_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2308:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_4_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2308:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_4_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2309:1: ( rule__SingleChoiceQuestion__RequiresAssignment_4_1 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_4_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2310:1: ( rule__SingleChoiceQuestion__RequiresAssignment_4_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2310:2: rule__SingleChoiceQuestion__RequiresAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_4_1_in_rule__SingleChoiceQuestion__Group_4__1__Impl4608);
            rule__SingleChoiceQuestion__RequiresAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_4_1()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_4__1__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2324:1: rule__MultiChoiceQuestion__Group__0 : rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 ;
    public final void rule__MultiChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2328:1: ( rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2329:2: rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04642);
            rule__MultiChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04645);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2336:1: rule__MultiChoiceQuestion__Group__0__Impl : ( 'add multi choice question' ) ;
    public final void rule__MultiChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2340:1: ( ( 'add multi choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2341:1: ( 'add multi choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2341:1: ( 'add multi choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2342:1: 'add multi choice question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAddMultiChoiceQuestionKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MultiChoiceQuestion__Group__0__Impl4673); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getAddMultiChoiceQuestionKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2355:1: rule__MultiChoiceQuestion__Group__1 : rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 ;
    public final void rule__MultiChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2359:1: ( rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2360:2: rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14704);
            rule__MultiChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14707);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2367:1: rule__MultiChoiceQuestion__Group__1__Impl : ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2371:1: ( ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2372:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2372:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2373:1: ( rule__MultiChoiceQuestion__OptionalAssignment_1 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2374:1: ( rule__MultiChoiceQuestion__OptionalAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2374:2: rule__MultiChoiceQuestion__OptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_1_in_rule__MultiChoiceQuestion__Group__1__Impl4734);
                    rule__MultiChoiceQuestion__OptionalAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2384:1: rule__MultiChoiceQuestion__Group__2 : rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 ;
    public final void rule__MultiChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2388:1: ( rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2389:2: rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24765);
            rule__MultiChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24768);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2396:1: rule__MultiChoiceQuestion__Group__2__Impl : ( 'text:' ) ;
    public final void rule__MultiChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2400:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2401:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2401:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2402:1: 'text:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextKeyword_2()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MultiChoiceQuestion__Group__2__Impl4796); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getTextKeyword_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2415:1: rule__MultiChoiceQuestion__Group__3 : rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 ;
    public final void rule__MultiChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2419:1: ( rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2420:2: rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__34827);
            rule__MultiChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__34830);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2427:1: rule__MultiChoiceQuestion__Group__3__Impl : ( ( rule__MultiChoiceQuestion__TextAssignment_3 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2431:1: ( ( ( rule__MultiChoiceQuestion__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2432:1: ( ( rule__MultiChoiceQuestion__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2432:1: ( ( rule__MultiChoiceQuestion__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2433:1: ( rule__MultiChoiceQuestion__TextAssignment_3 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2434:1: ( rule__MultiChoiceQuestion__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2434:2: rule__MultiChoiceQuestion__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__TextAssignment_3_in_rule__MultiChoiceQuestion__Group__3__Impl4857);
            rule__MultiChoiceQuestion__TextAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_3()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2444:1: rule__MultiChoiceQuestion__Group__4 : rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 ;
    public final void rule__MultiChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2448:1: ( rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2449:2: rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__44887);
            rule__MultiChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__44890);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2456:1: rule__MultiChoiceQuestion__Group__4__Impl : ( ( rule__MultiChoiceQuestion__Group_4__0 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2460:1: ( ( ( rule__MultiChoiceQuestion__Group_4__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2461:1: ( ( rule__MultiChoiceQuestion__Group_4__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2461:1: ( ( rule__MultiChoiceQuestion__Group_4__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2462:1: ( rule__MultiChoiceQuestion__Group_4__0 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getGroup_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2463:1: ( rule__MultiChoiceQuestion__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2463:2: rule__MultiChoiceQuestion__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_4__0_in_rule__MultiChoiceQuestion__Group__4__Impl4917);
                    rule__MultiChoiceQuestion__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getGroup_4()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2473:1: rule__MultiChoiceQuestion__Group__5 : rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 ;
    public final void rule__MultiChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2477:1: ( rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2478:2: rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__54948);
            rule__MultiChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__54951);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2485:1: rule__MultiChoiceQuestion__Group__5__Impl : ( 'answers:' ) ;
    public final void rule__MultiChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2489:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2490:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2490:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2491:1: 'answers:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_5()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MultiChoiceQuestion__Group__5__Impl4979); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_5()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2504:1: rule__MultiChoiceQuestion__Group__6 : rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 ;
    public final void rule__MultiChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2508:1: ( rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2509:2: rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__65010);
            rule__MultiChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__65013);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2516:1: rule__MultiChoiceQuestion__Group__6__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2520:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2521:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2521:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2522:1: ( rule__MultiChoiceQuestion__AnswersAssignment_6 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2523:1: ( rule__MultiChoiceQuestion__AnswersAssignment_6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2523:2: rule__MultiChoiceQuestion__AnswersAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_6_in_rule__MultiChoiceQuestion__Group__6__Impl5040);
            rule__MultiChoiceQuestion__AnswersAssignment_6();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2533:1: rule__MultiChoiceQuestion__Group__7 : rule__MultiChoiceQuestion__Group__7__Impl rule__MultiChoiceQuestion__Group__8 ;
    public final void rule__MultiChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2537:1: ( rule__MultiChoiceQuestion__Group__7__Impl rule__MultiChoiceQuestion__Group__8 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2538:2: rule__MultiChoiceQuestion__Group__7__Impl rule__MultiChoiceQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__75070);
            rule__MultiChoiceQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__8_in_rule__MultiChoiceQuestion__Group__75073);
            rule__MultiChoiceQuestion__Group__8();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2545:1: rule__MultiChoiceQuestion__Group__7__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 )* ) ;
    public final void rule__MultiChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2549:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2550:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2550:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2551:1: ( rule__MultiChoiceQuestion__AnswersAssignment_7 )*
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2552:1: ( rule__MultiChoiceQuestion__AnswersAssignment_7 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33||LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2552:2: rule__MultiChoiceQuestion__AnswersAssignment_7
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_7_in_rule__MultiChoiceQuestion__Group__7__Impl5100);
            	    rule__MultiChoiceQuestion__AnswersAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_7()); 

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


    // $ANTLR start "rule__MultiChoiceQuestion__Group__8"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2562:1: rule__MultiChoiceQuestion__Group__8 : rule__MultiChoiceQuestion__Group__8__Impl ;
    public final void rule__MultiChoiceQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2566:1: ( rule__MultiChoiceQuestion__Group__8__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2567:2: rule__MultiChoiceQuestion__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__8__Impl_in_rule__MultiChoiceQuestion__Group__85131);
            rule__MultiChoiceQuestion__Group__8__Impl();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__8"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__8__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2573:1: rule__MultiChoiceQuestion__Group__8__Impl : ( 'end question' ) ;
    public final void rule__MultiChoiceQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2577:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2578:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2578:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2579:1: 'end question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_8()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MultiChoiceQuestion__Group__8__Impl5159); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_8()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group__8__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_4__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2610:1: rule__MultiChoiceQuestion__Group_4__0 : rule__MultiChoiceQuestion__Group_4__0__Impl rule__MultiChoiceQuestion__Group_4__1 ;
    public final void rule__MultiChoiceQuestion__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2614:1: ( rule__MultiChoiceQuestion__Group_4__0__Impl rule__MultiChoiceQuestion__Group_4__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2615:2: rule__MultiChoiceQuestion__Group_4__0__Impl rule__MultiChoiceQuestion__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_4__0__Impl_in_rule__MultiChoiceQuestion__Group_4__05208);
            rule__MultiChoiceQuestion__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_4__1_in_rule__MultiChoiceQuestion__Group_4__05211);
            rule__MultiChoiceQuestion__Group_4__1();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_4__0"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_4__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2622:1: rule__MultiChoiceQuestion__Group_4__0__Impl : ( 'requires:' ) ;
    public final void rule__MultiChoiceQuestion__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2626:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2627:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2627:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2628:1: 'requires:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_4_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MultiChoiceQuestion__Group_4__0__Impl5239); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_4_0()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_4__0__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_4__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2641:1: rule__MultiChoiceQuestion__Group_4__1 : rule__MultiChoiceQuestion__Group_4__1__Impl ;
    public final void rule__MultiChoiceQuestion__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2645:1: ( rule__MultiChoiceQuestion__Group_4__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2646:2: rule__MultiChoiceQuestion__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_4__1__Impl_in_rule__MultiChoiceQuestion__Group_4__15270);
            rule__MultiChoiceQuestion__Group_4__1__Impl();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_4__1"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_4__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2652:1: rule__MultiChoiceQuestion__Group_4__1__Impl : ( ( rule__MultiChoiceQuestion__RequiresAssignment_4_1 ) ) ;
    public final void rule__MultiChoiceQuestion__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2656:1: ( ( ( rule__MultiChoiceQuestion__RequiresAssignment_4_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2657:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_4_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2657:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_4_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2658:1: ( rule__MultiChoiceQuestion__RequiresAssignment_4_1 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_4_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2659:1: ( rule__MultiChoiceQuestion__RequiresAssignment_4_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2659:2: rule__MultiChoiceQuestion__RequiresAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_4_1_in_rule__MultiChoiceQuestion__Group_4__1__Impl5297);
            rule__MultiChoiceQuestion__RequiresAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_4_1()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_4__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2673:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2677:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2678:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05331);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__1_in_rule__And__Group__05334);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2685:1: rule__And__Group__0__Impl : ( 'and(' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2689:1: ( ( 'and(' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2690:1: ( 'and(' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2690:1: ( 'and(' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2691:1: 'and('
            {
             before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__And__Group__0__Impl5362); 
             after(grammarAccess.getAndAccess().getAndKeyword_0()); 

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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2704:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2708:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2709:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15393);
            rule__And__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__2_in_rule__And__Group__15396);
            rule__And__Group__2();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2716:1: rule__And__Group__1__Impl : ( ( rule__And__LhsAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2720:1: ( ( ( rule__And__LhsAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2721:1: ( ( rule__And__LhsAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2721:1: ( ( rule__And__LhsAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2722:1: ( rule__And__LhsAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getLhsAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2723:1: ( rule__And__LhsAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2723:2: rule__And__LhsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__LhsAssignment_1_in_rule__And__Group__1__Impl5423);
            rule__And__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getLhsAssignment_1()); 

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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2733:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2737:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2738:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__2__Impl_in_rule__And__Group__25453);
            rule__And__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__3_in_rule__And__Group__25456);
            rule__And__Group__3();

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
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2745:1: rule__And__Group__2__Impl : ( 'and' ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2749:1: ( ( 'and' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2750:1: ( 'and' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2750:1: ( 'and' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2751:1: 'and'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__And__Group__2__Impl5484); 
             after(grammarAccess.getAndAccess().getAndKeyword_2()); 

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
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2764:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2768:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2769:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__3__Impl_in_rule__And__Group__35515);
            rule__And__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__4_in_rule__And__Group__35518);
            rule__And__Group__4();

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
    // $ANTLR end "rule__And__Group__3"


    // $ANTLR start "rule__And__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2776:1: rule__And__Group__3__Impl : ( ( rule__And__RhsAssignment_3 ) ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2780:1: ( ( ( rule__And__RhsAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2781:1: ( ( rule__And__RhsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2781:1: ( ( rule__And__RhsAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2782:1: ( rule__And__RhsAssignment_3 )
            {
             before(grammarAccess.getAndAccess().getRhsAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2783:1: ( rule__And__RhsAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2783:2: rule__And__RhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__RhsAssignment_3_in_rule__And__Group__3__Impl5545);
            rule__And__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRhsAssignment_3()); 

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
    // $ANTLR end "rule__And__Group__3__Impl"


    // $ANTLR start "rule__And__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2793:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2797:1: ( rule__And__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2798:2: rule__And__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__4__Impl_in_rule__And__Group__45575);
            rule__And__Group__4__Impl();

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
    // $ANTLR end "rule__And__Group__4"


    // $ANTLR start "rule__And__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2804:1: rule__And__Group__4__Impl : ( ')' ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2808:1: ( ( ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2809:1: ( ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2809:1: ( ')' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2810:1: ')'
            {
             before(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__And__Group__4__Impl5603); 
             after(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__And__Group__4__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2833:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2837:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2838:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05644);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05647);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2845:1: rule__Or__Group__0__Impl : ( 'or(' ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2849:1: ( ( 'or(' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2850:1: ( 'or(' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2850:1: ( 'or(' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2851:1: 'or('
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Or__Group__0__Impl5675); 
             after(grammarAccess.getOrAccess().getOrKeyword_0()); 

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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2864:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2868:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2869:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15706);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__2_in_rule__Or__Group__15709);
            rule__Or__Group__2();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:1: rule__Or__Group__1__Impl : ( ( rule__Or__LhsAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2880:1: ( ( ( rule__Or__LhsAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2881:1: ( ( rule__Or__LhsAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2881:1: ( ( rule__Or__LhsAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2882:1: ( rule__Or__LhsAssignment_1 )
            {
             before(grammarAccess.getOrAccess().getLhsAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2883:1: ( rule__Or__LhsAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2883:2: rule__Or__LhsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__LhsAssignment_1_in_rule__Or__Group__1__Impl5736);
            rule__Or__LhsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getLhsAssignment_1()); 

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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2893:1: rule__Or__Group__2 : rule__Or__Group__2__Impl rule__Or__Group__3 ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2897:1: ( rule__Or__Group__2__Impl rule__Or__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2898:2: rule__Or__Group__2__Impl rule__Or__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__25766);
            rule__Or__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__3_in_rule__Or__Group__25769);
            rule__Or__Group__3();

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
    // $ANTLR end "rule__Or__Group__2"


    // $ANTLR start "rule__Or__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2905:1: rule__Or__Group__2__Impl : ( 'or' ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2909:1: ( ( 'or' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2910:1: ( 'or' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2910:1: ( 'or' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2911:1: 'or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Or__Group__2__Impl5797); 
             after(grammarAccess.getOrAccess().getOrKeyword_2()); 

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
    // $ANTLR end "rule__Or__Group__2__Impl"


    // $ANTLR start "rule__Or__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2924:1: rule__Or__Group__3 : rule__Or__Group__3__Impl rule__Or__Group__4 ;
    public final void rule__Or__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2928:1: ( rule__Or__Group__3__Impl rule__Or__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2929:2: rule__Or__Group__3__Impl rule__Or__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__3__Impl_in_rule__Or__Group__35828);
            rule__Or__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__4_in_rule__Or__Group__35831);
            rule__Or__Group__4();

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
    // $ANTLR end "rule__Or__Group__3"


    // $ANTLR start "rule__Or__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2936:1: rule__Or__Group__3__Impl : ( ( rule__Or__RhsAssignment_3 ) ) ;
    public final void rule__Or__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2940:1: ( ( ( rule__Or__RhsAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2941:1: ( ( rule__Or__RhsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2941:1: ( ( rule__Or__RhsAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2942:1: ( rule__Or__RhsAssignment_3 )
            {
             before(grammarAccess.getOrAccess().getRhsAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2943:1: ( rule__Or__RhsAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2943:2: rule__Or__RhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__RhsAssignment_3_in_rule__Or__Group__3__Impl5858);
            rule__Or__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRhsAssignment_3()); 

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
    // $ANTLR end "rule__Or__Group__3__Impl"


    // $ANTLR start "rule__Or__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2953:1: rule__Or__Group__4 : rule__Or__Group__4__Impl ;
    public final void rule__Or__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2957:1: ( rule__Or__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2958:2: rule__Or__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__4__Impl_in_rule__Or__Group__45888);
            rule__Or__Group__4__Impl();

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
    // $ANTLR end "rule__Or__Group__4"


    // $ANTLR start "rule__Or__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2964:1: rule__Or__Group__4__Impl : ( ')' ) ;
    public final void rule__Or__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2968:1: ( ( ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2969:1: ( ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2969:1: ( ')' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2970:1: ')'
            {
             before(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Or__Group__4__Impl5916); 
             after(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__Or__Group__4__Impl"


    // $ANTLR start "rule__AnswerRef__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2993:1: rule__AnswerRef__Group__0 : rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1 ;
    public final void rule__AnswerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2997:1: ( rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2998:2: rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__0__Impl_in_rule__AnswerRef__Group__05957);
            rule__AnswerRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__1_in_rule__AnswerRef__Group__05960);
            rule__AnswerRef__Group__1();

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
    // $ANTLR end "rule__AnswerRef__Group__0"


    // $ANTLR start "rule__AnswerRef__Group__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3005:1: rule__AnswerRef__Group__0__Impl : ( 'answer reference:' ) ;
    public final void rule__AnswerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3009:1: ( ( 'answer reference:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3010:1: ( 'answer reference:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3010:1: ( 'answer reference:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3011:1: 'answer reference:'
            {
             before(grammarAccess.getAnswerRefAccess().getAnswerReferenceKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__AnswerRef__Group__0__Impl5988); 
             after(grammarAccess.getAnswerRefAccess().getAnswerReferenceKeyword_0()); 

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
    // $ANTLR end "rule__AnswerRef__Group__0__Impl"


    // $ANTLR start "rule__AnswerRef__Group__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3024:1: rule__AnswerRef__Group__1 : rule__AnswerRef__Group__1__Impl ;
    public final void rule__AnswerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3028:1: ( rule__AnswerRef__Group__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3029:2: rule__AnswerRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__1__Impl_in_rule__AnswerRef__Group__16019);
            rule__AnswerRef__Group__1__Impl();

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
    // $ANTLR end "rule__AnswerRef__Group__1"


    // $ANTLR start "rule__AnswerRef__Group__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3035:1: rule__AnswerRef__Group__1__Impl : ( ( rule__AnswerRef__RefersAssignment_1 ) ) ;
    public final void rule__AnswerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3039:1: ( ( ( rule__AnswerRef__RefersAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3040:1: ( ( rule__AnswerRef__RefersAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3040:1: ( ( rule__AnswerRef__RefersAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3041:1: ( rule__AnswerRef__RefersAssignment_1 )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3042:1: ( rule__AnswerRef__RefersAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3042:2: rule__AnswerRef__RefersAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__RefersAssignment_1_in_rule__AnswerRef__Group__1__Impl6046);
            rule__AnswerRef__RefersAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerRefAccess().getRefersAssignment_1()); 

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
    // $ANTLR end "rule__AnswerRef__Group__1__Impl"


    // $ANTLR start "rule__ChoiceAnswer__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3056:1: rule__ChoiceAnswer__Group__0 : rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 ;
    public final void rule__ChoiceAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3060:1: ( rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3061:2: rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__06080);
            rule__ChoiceAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__06083);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3068:1: rule__ChoiceAnswer__Group__0__Impl : ( 'add answer choice' ) ;
    public final void rule__ChoiceAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3072:1: ( ( 'add answer choice' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3073:1: ( 'add answer choice' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3073:1: ( 'add answer choice' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3074:1: 'add answer choice'
            {
             before(grammarAccess.getChoiceAnswerAccess().getAddAnswerChoiceKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__ChoiceAnswer__Group__0__Impl6111); 
             after(grammarAccess.getChoiceAnswerAccess().getAddAnswerChoiceKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3087:1: rule__ChoiceAnswer__Group__1 : rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 ;
    public final void rule__ChoiceAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3091:1: ( rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3092:2: rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__16142);
            rule__ChoiceAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__16145);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3099:1: rule__ChoiceAnswer__Group__1__Impl : ( 'name:' ) ;
    public final void rule__ChoiceAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3103:1: ( ( 'name:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3104:1: ( 'name:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3104:1: ( 'name:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3105:1: 'name:'
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ChoiceAnswer__Group__1__Impl6173); 
             after(grammarAccess.getChoiceAnswerAccess().getNameKeyword_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3118:1: rule__ChoiceAnswer__Group__2 : rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 ;
    public final void rule__ChoiceAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3122:1: ( rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3123:2: rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__26204);
            rule__ChoiceAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__26207);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3130:1: rule__ChoiceAnswer__Group__2__Impl : ( ( rule__ChoiceAnswer__NameAssignment_2 ) ) ;
    public final void rule__ChoiceAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3134:1: ( ( ( rule__ChoiceAnswer__NameAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3135:1: ( ( rule__ChoiceAnswer__NameAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3135:1: ( ( rule__ChoiceAnswer__NameAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3136:1: ( rule__ChoiceAnswer__NameAssignment_2 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3137:1: ( rule__ChoiceAnswer__NameAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3137:2: rule__ChoiceAnswer__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__NameAssignment_2_in_rule__ChoiceAnswer__Group__2__Impl6234);
            rule__ChoiceAnswer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAnswerAccess().getNameAssignment_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3147:1: rule__ChoiceAnswer__Group__3 : rule__ChoiceAnswer__Group__3__Impl rule__ChoiceAnswer__Group__4 ;
    public final void rule__ChoiceAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3151:1: ( rule__ChoiceAnswer__Group__3__Impl rule__ChoiceAnswer__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3152:2: rule__ChoiceAnswer__Group__3__Impl rule__ChoiceAnswer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__36264);
            rule__ChoiceAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__4_in_rule__ChoiceAnswer__Group__36267);
            rule__ChoiceAnswer__Group__4();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3159:1: rule__ChoiceAnswer__Group__3__Impl : ( 'text:' ) ;
    public final void rule__ChoiceAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3163:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3164:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3164:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3165:1: 'text:'
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ChoiceAnswer__Group__3__Impl6295); 
             after(grammarAccess.getChoiceAnswerAccess().getTextKeyword_3()); 

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


    // $ANTLR start "rule__ChoiceAnswer__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3178:1: rule__ChoiceAnswer__Group__4 : rule__ChoiceAnswer__Group__4__Impl ;
    public final void rule__ChoiceAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3182:1: ( rule__ChoiceAnswer__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3183:2: rule__ChoiceAnswer__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__4__Impl_in_rule__ChoiceAnswer__Group__46326);
            rule__ChoiceAnswer__Group__4__Impl();

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
    // $ANTLR end "rule__ChoiceAnswer__Group__4"


    // $ANTLR start "rule__ChoiceAnswer__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3189:1: rule__ChoiceAnswer__Group__4__Impl : ( ( rule__ChoiceAnswer__TextAssignment_4 ) ) ;
    public final void rule__ChoiceAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3193:1: ( ( ( rule__ChoiceAnswer__TextAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3194:1: ( ( rule__ChoiceAnswer__TextAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3194:1: ( ( rule__ChoiceAnswer__TextAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3195:1: ( rule__ChoiceAnswer__TextAssignment_4 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3196:1: ( rule__ChoiceAnswer__TextAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3196:2: rule__ChoiceAnswer__TextAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__TextAssignment_4_in_rule__ChoiceAnswer__Group__4__Impl6353);
            rule__ChoiceAnswer__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAnswerAccess().getTextAssignment_4()); 

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
    // $ANTLR end "rule__ChoiceAnswer__Group__4__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3216:1: rule__FreetextAnswer__Group__0 : rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 ;
    public final void rule__FreetextAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3220:1: ( rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3221:2: rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__06393);
            rule__FreetextAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__06396);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3228:1: rule__FreetextAnswer__Group__0__Impl : ( 'add answer text' ) ;
    public final void rule__FreetextAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3232:1: ( ( 'add answer text' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3233:1: ( 'add answer text' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3233:1: ( 'add answer text' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3234:1: 'add answer text'
            {
             before(grammarAccess.getFreetextAnswerAccess().getAddAnswerTextKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__FreetextAnswer__Group__0__Impl6424); 
             after(grammarAccess.getFreetextAnswerAccess().getAddAnswerTextKeyword_0()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3247:1: rule__FreetextAnswer__Group__1 : rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 ;
    public final void rule__FreetextAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3251:1: ( rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3252:2: rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__16455);
            rule__FreetextAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__16458);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3259:1: rule__FreetextAnswer__Group__1__Impl : ( 'name:' ) ;
    public final void rule__FreetextAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3263:1: ( ( 'name:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3264:1: ( 'name:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3264:1: ( 'name:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3265:1: 'name:'
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameKeyword_1()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__FreetextAnswer__Group__1__Impl6486); 
             after(grammarAccess.getFreetextAnswerAccess().getNameKeyword_1()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3278:1: rule__FreetextAnswer__Group__2 : rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 ;
    public final void rule__FreetextAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3282:1: ( rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3283:2: rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__26517);
            rule__FreetextAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__26520);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3290:1: rule__FreetextAnswer__Group__2__Impl : ( ( rule__FreetextAnswer__NameAssignment_2 ) ) ;
    public final void rule__FreetextAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3294:1: ( ( ( rule__FreetextAnswer__NameAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3295:1: ( ( rule__FreetextAnswer__NameAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3295:1: ( ( rule__FreetextAnswer__NameAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3296:1: ( rule__FreetextAnswer__NameAssignment_2 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3297:1: ( rule__FreetextAnswer__NameAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3297:2: rule__FreetextAnswer__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__NameAssignment_2_in_rule__FreetextAnswer__Group__2__Impl6547);
            rule__FreetextAnswer__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAnswerAccess().getNameAssignment_2()); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3307:1: rule__FreetextAnswer__Group__3 : rule__FreetextAnswer__Group__3__Impl rule__FreetextAnswer__Group__4 ;
    public final void rule__FreetextAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3311:1: ( rule__FreetextAnswer__Group__3__Impl rule__FreetextAnswer__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3312:2: rule__FreetextAnswer__Group__3__Impl rule__FreetextAnswer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__36577);
            rule__FreetextAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__4_in_rule__FreetextAnswer__Group__36580);
            rule__FreetextAnswer__Group__4();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3319:1: rule__FreetextAnswer__Group__3__Impl : ( 'text:' ) ;
    public final void rule__FreetextAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3323:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3324:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3324:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3325:1: 'text:'
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FreetextAnswer__Group__3__Impl6608); 
             after(grammarAccess.getFreetextAnswerAccess().getTextKeyword_3()); 

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


    // $ANTLR start "rule__FreetextAnswer__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3338:1: rule__FreetextAnswer__Group__4 : rule__FreetextAnswer__Group__4__Impl ;
    public final void rule__FreetextAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3342:1: ( rule__FreetextAnswer__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3343:2: rule__FreetextAnswer__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__4__Impl_in_rule__FreetextAnswer__Group__46639);
            rule__FreetextAnswer__Group__4__Impl();

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
    // $ANTLR end "rule__FreetextAnswer__Group__4"


    // $ANTLR start "rule__FreetextAnswer__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3349:1: rule__FreetextAnswer__Group__4__Impl : ( ( rule__FreetextAnswer__TextAssignment_4 ) ) ;
    public final void rule__FreetextAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3353:1: ( ( ( rule__FreetextAnswer__TextAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3354:1: ( ( rule__FreetextAnswer__TextAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3354:1: ( ( rule__FreetextAnswer__TextAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3355:1: ( rule__FreetextAnswer__TextAssignment_4 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3356:1: ( rule__FreetextAnswer__TextAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3356:2: rule__FreetextAnswer__TextAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__TextAssignment_4_in_rule__FreetextAnswer__Group__4__Impl6666);
            rule__FreetextAnswer__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAnswerAccess().getTextAssignment_4()); 

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
    // $ANTLR end "rule__FreetextAnswer__Group__4__Impl"


    // $ANTLR start "rule__Survey__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3377:1: rule__Survey__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3381:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3382:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3382:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3383:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_26711);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Survey__TitleAssignment_2"


    // $ANTLR start "rule__Survey__PagesAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3392:1: rule__Survey__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3396:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3397:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3397:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3398:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_46742);
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


    // $ANTLR start "rule__Survey__PagesAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3407:1: rule__Survey__PagesAssignment_5 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3411:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3412:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3412:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3413:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_56773);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Survey__PagesAssignment_5"


    // $ANTLR start "rule__QuestionPage__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3422:1: rule__QuestionPage__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionPage__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3426:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3427:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3427:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3428:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_26804);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__QuestionPage__TitleAssignment_2"


    // $ANTLR start "rule__QuestionPage__TextAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3437:1: rule__QuestionPage__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__QuestionPage__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3441:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3442:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3442:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3443:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_3_16835);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__QuestionPage__TextAssignment_3_1"


    // $ANTLR start "rule__QuestionPage__QuestionsAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3452:1: rule__QuestionPage__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3456:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3457:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3457:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3458:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_56866);
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


    // $ANTLR start "rule__QuestionPage__QuestionsAssignment_6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3467:1: rule__QuestionPage__QuestionsAssignment_6 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3471:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3472:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3472:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3473:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_66897);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__QuestionPage__QuestionsAssignment_6"


    // $ANTLR start "rule__DescriptionPage__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3482:1: rule__DescriptionPage__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3486:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3487:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3487:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3488:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_26928);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DescriptionPage__TitleAssignment_2"


    // $ANTLR start "rule__DescriptionPage__TextAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3497:1: rule__DescriptionPage__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3501:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3502:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3502:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3503:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_3_16959);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DescriptionPage__TextAssignment_3_1"


    // $ANTLR start "rule__ResultPage__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3512:1: rule__ResultPage__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__ResultPage__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3516:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3517:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3517:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3518:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_26990);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ResultPage__TitleAssignment_2"


    // $ANTLR start "rule__ResultPage__TextAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3527:1: rule__ResultPage__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ResultPage__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3531:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3532:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3532:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3533:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_3_17021);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ResultPage__TextAssignment_3_1"


    // $ANTLR start "rule__FreetextQuestion__OptionalAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3542:1: rule__FreetextQuestion__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__FreetextQuestion__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3546:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3547:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3547:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3548:1: ( 'optional' )
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3549:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3550:1: 'optional'
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__FreetextQuestion__OptionalAssignment_17057); 
             after(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0()); 

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
    // $ANTLR end "rule__FreetextQuestion__OptionalAssignment_1"


    // $ANTLR start "rule__FreetextQuestion__TextAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3565:1: rule__FreetextQuestion__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__FreetextQuestion__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3569:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3570:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3570:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3571:1: ruleEString
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_37096);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__FreetextQuestion__TextAssignment_3"


    // $ANTLR start "rule__FreetextQuestion__RequiresAssignment_4_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3580:1: rule__FreetextQuestion__RequiresAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__FreetextQuestion__RequiresAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3584:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3585:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3585:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3586:1: ruleDependency
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_4_17127);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FreetextQuestion__RequiresAssignment_4_1"


    // $ANTLR start "rule__FreetextQuestion__AnswersAssignment_6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3595:1: rule__FreetextQuestion__AnswersAssignment_6 : ( ruleFreetextAnswer ) ;
    public final void rule__FreetextQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3599:1: ( ( ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3600:1: ( ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3600:1: ( ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3601:1: ruleFreetextAnswer
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_67158);
            ruleFreetextAnswer();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__FreetextQuestion__AnswersAssignment_6"


    // $ANTLR start "rule__SingleChoiceQuestion__OptionalAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3610:1: rule__SingleChoiceQuestion__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__SingleChoiceQuestion__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3614:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3615:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3615:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3616:1: ( 'optional' )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3617:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3618:1: 'optional'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__SingleChoiceQuestion__OptionalAssignment_17194); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__OptionalAssignment_1"


    // $ANTLR start "rule__SingleChoiceQuestion__TextAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3633:1: rule__SingleChoiceQuestion__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__SingleChoiceQuestion__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3637:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3638:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3638:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3639:1: ruleEString
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_37233);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__TextAssignment_3"


    // $ANTLR start "rule__SingleChoiceQuestion__RequiresAssignment_4_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3648:1: rule__SingleChoiceQuestion__RequiresAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__SingleChoiceQuestion__RequiresAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3652:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3653:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3653:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3654:1: ruleDependency
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_4_17264);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__RequiresAssignment_4_1"


    // $ANTLR start "rule__SingleChoiceQuestion__AnswersAssignment_6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3663:1: rule__SingleChoiceQuestion__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3667:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3668:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3668:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3669:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_67295);
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


    // $ANTLR start "rule__SingleChoiceQuestion__AnswersAssignment_7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3678:1: rule__SingleChoiceQuestion__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3682:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3683:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3683:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3684:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_77326);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__SingleChoiceQuestion__AnswersAssignment_7"


    // $ANTLR start "rule__MultiChoiceQuestion__OptionalAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3693:1: rule__MultiChoiceQuestion__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__MultiChoiceQuestion__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3697:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3698:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3698:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3699:1: ( 'optional' )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3700:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3701:1: 'optional'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__MultiChoiceQuestion__OptionalAssignment_17362); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__OptionalAssignment_1"


    // $ANTLR start "rule__MultiChoiceQuestion__TextAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3716:1: rule__MultiChoiceQuestion__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__MultiChoiceQuestion__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3720:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3721:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3721:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3722:1: ruleEString
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_37401);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__TextAssignment_3"


    // $ANTLR start "rule__MultiChoiceQuestion__RequiresAssignment_4_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3731:1: rule__MultiChoiceQuestion__RequiresAssignment_4_1 : ( ruleDependency ) ;
    public final void rule__MultiChoiceQuestion__RequiresAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3735:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3736:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3736:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3737:1: ruleDependency
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_4_17432);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__RequiresAssignment_4_1"


    // $ANTLR start "rule__MultiChoiceQuestion__AnswersAssignment_6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3746:1: rule__MultiChoiceQuestion__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3750:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3751:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3751:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3752:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_67463);
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


    // $ANTLR start "rule__MultiChoiceQuestion__AnswersAssignment_7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3761:1: rule__MultiChoiceQuestion__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3765:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3766:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3766:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3767:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_77494);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__MultiChoiceQuestion__AnswersAssignment_7"


    // $ANTLR start "rule__And__LhsAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3776:1: rule__And__LhsAssignment_1 : ( ruleDependency ) ;
    public final void rule__And__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3780:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3781:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3781:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3782:1: ruleDependency
            {
             before(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__And__LhsAssignment_17525);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__And__LhsAssignment_1"


    // $ANTLR start "rule__And__RhsAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3791:1: rule__And__RhsAssignment_3 : ( ruleDependency ) ;
    public final void rule__And__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3795:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3796:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3796:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3797:1: ruleDependency
            {
             before(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__And__RhsAssignment_37556);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__And__RhsAssignment_3"


    // $ANTLR start "rule__Or__LhsAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3806:1: rule__Or__LhsAssignment_1 : ( ruleDependency ) ;
    public final void rule__Or__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3810:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3811:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3811:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3812:1: ruleDependency
            {
             before(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Or__LhsAssignment_17587);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Or__LhsAssignment_1"


    // $ANTLR start "rule__Or__RhsAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3821:1: rule__Or__RhsAssignment_3 : ( ruleDependency ) ;
    public final void rule__Or__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3825:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3826:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3826:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3827:1: ruleDependency
            {
             before(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Or__RhsAssignment_37618);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Or__RhsAssignment_3"


    // $ANTLR start "rule__AnswerRef__RefersAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3836:1: rule__AnswerRef__RefersAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__AnswerRef__RefersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3840:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3841:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3841:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3842:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3843:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3844:1: ruleEString
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment_17653);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_1_0()); 

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
    // $ANTLR end "rule__AnswerRef__RefersAssignment_1"


    // $ANTLR start "rule__ChoiceAnswer__NameAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3855:1: rule__ChoiceAnswer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ChoiceAnswer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3859:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3860:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3860:1: ( RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3861:1: RULE_ID
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ChoiceAnswer__NameAssignment_27688); 
             after(grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ChoiceAnswer__NameAssignment_2"


    // $ANTLR start "rule__ChoiceAnswer__TextAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3870:1: rule__ChoiceAnswer__TextAssignment_4 : ( ruleEString ) ;
    public final void rule__ChoiceAnswer__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3874:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3875:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3875:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3876:1: ruleEString
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_47719);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ChoiceAnswer__TextAssignment_4"


    // $ANTLR start "rule__FreetextAnswer__NameAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3885:1: rule__FreetextAnswer__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FreetextAnswer__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3889:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3890:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3890:1: ( RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3891:1: RULE_ID
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FreetextAnswer__NameAssignment_27750); 
             after(grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FreetextAnswer__NameAssignment_2"


    // $ANTLR start "rule__FreetextAnswer__TextAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3900:1: rule__FreetextAnswer__TextAssignment_4 : ( ruleEString ) ;
    public final void rule__FreetextAnswer__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3904:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3905:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3905:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3906:1: ruleEString
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_47781);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__FreetextAnswer__TextAssignment_4"

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
        public static final BitSet FOLLOW_rule__Dependency__Alternatives_in_ruleDependency274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_entryRuleAnswer301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswer308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Answer__Alternatives_in_ruleAnswer334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_entryRuleQuestionPage421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQuestionPage428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__0_in_ruleQuestionPage454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_entryRuleDescriptionPage481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionPage488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__0_in_ruleDescriptionPage514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_entryRuleResultPage541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResultPage548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__0_in_ruleResultPage574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_entryRuleFreetextQuestion603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextQuestion610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0_in_ruleFreetextQuestion636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion663 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__0_in_ruleSingleChoiceQuestion696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_entryRuleMultiChoiceQuestion723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiChoiceQuestion730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__0_in_ruleMultiChoiceQuestion756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnd790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_entryRuleOr843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOr850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef903 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__0_in_ruleAnswerRef936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0_in_ruleChoiceAnswer996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer1023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer1030 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0_in_ruleFreetextAnswer1056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_rule__Page__Alternatives1092 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_rule__Page__Alternatives1109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_rule__Page__Alternatives1126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives1158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_rule__Question__Alternatives1175 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_rule__Question__Alternatives1192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_rule__Dependency__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_rule__Dependency__Alternatives1241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_rule__Dependency__Alternatives1258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_rule__Answer__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__Answer__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl1418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11449 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__1__Impl1480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21511 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__TitleAssignment_2_in_rule__Survey__Group__2__Impl1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31571 = new BitSet(new long[]{0x0000000000188000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group__3__Impl1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41633 = new BitSet(new long[]{0x000000000018C000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51693 = new BitSet(new long[]{0x000000000018C000L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__51696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_5_in_rule__Survey__Group__5__Impl1723 = new BitSet(new long[]{0x0000000000188002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Survey__Group__6__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01827 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuestionPage__Group__0__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__11889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__11892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__QuestionPage__Group__1__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__21951 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__21954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TitleAssignment_2_in_rule__QuestionPage__Group__2__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__32011 = new BitSet(new long[]{0x0000000000050000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__32014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__0_in_rule__QuestionPage__Group__3__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42072 = new BitSet(new long[]{0x0000000006200000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuestionPage__Group__4__Impl2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52134 = new BitSet(new long[]{0x0000000006220000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62194 = new BitSet(new long[]{0x0000000006220000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__7_in_rule__QuestionPage__Group__62197 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_6_in_rule__QuestionPage__Group__6__Impl2224 = new BitSet(new long[]{0x0000000006200002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__7__Impl_in_rule__QuestionPage__Group__72255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuestionPage__Group__7__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__0__Impl_in_rule__QuestionPage__Group_3__02330 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__1_in_rule__QuestionPage__Group_3__02333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QuestionPage__Group_3__0__Impl2361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__1__Impl_in_rule__QuestionPage__Group_3__12392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TextAssignment_3_1_in_rule__QuestionPage__Group_3__1__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02453 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DescriptionPage__Group__0__Impl2484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__DescriptionPage__Group__1__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22577 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TitleAssignment_2_in_rule__DescriptionPage__Group__2__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32637 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__4_in_rule__DescriptionPage__Group__32640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__0_in_rule__DescriptionPage__Group__3__Impl2667 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__4__Impl_in_rule__DescriptionPage__Group__42698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DescriptionPage__Group__4__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__0__Impl_in_rule__DescriptionPage__Group_3__02767 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__1_in_rule__DescriptionPage__Group_3__02770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DescriptionPage__Group_3__0__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__1__Impl_in_rule__DescriptionPage__Group_3__12829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TextAssignment_3_1_in_rule__DescriptionPage__Group_3__1__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__02890 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__02893 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ResultPage__Group__0__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__12952 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__12955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ResultPage__Group__1__Impl2983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__23014 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__23017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TitleAssignment_2_in_rule__ResultPage__Group__2__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__33074 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__4_in_rule__ResultPage__Group__33077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__0_in_rule__ResultPage__Group__3__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__4__Impl_in_rule__ResultPage__Group__43135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ResultPage__Group__4__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__0__Impl_in_rule__ResultPage__Group_3__03204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__1_in_rule__ResultPage__Group_3__03207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ResultPage__Group_3__0__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__1__Impl_in_rule__ResultPage__Group_3__13266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TextAssignment_3_1_in_rule__ResultPage__Group_3__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03327 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__FreetextQuestion__Group__0__Impl3358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13389 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__OptionalAssignment_1_in_rule__FreetextQuestion__Group__1__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23450 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FreetextQuestion__Group__2__Impl3481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33512 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__TextAssignment_3_in_rule__FreetextQuestion__Group__3__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43572 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_4__0_in_rule__FreetextQuestion__Group__4__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53633 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__FreetextQuestion__Group__5__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63695 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__7_in_rule__FreetextQuestion__Group__63698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__AnswersAssignment_6_in_rule__FreetextQuestion__Group__6__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__7__Impl_in_rule__FreetextQuestion__Group__73755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FreetextQuestion__Group__7__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_4__0__Impl_in_rule__FreetextQuestion__Group_4__03830 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_4__1_in_rule__FreetextQuestion__Group_4__03833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__FreetextQuestion__Group_4__0__Impl3861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_4__1__Impl_in_rule__FreetextQuestion__Group_4__13892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__RequiresAssignment_4_1_in_rule__FreetextQuestion__Group_4__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__03953 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__03956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SingleChoiceQuestion__Group__0__Impl3984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__14015 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__14018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_1_in_rule__SingleChoiceQuestion__Group__1__Impl4045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__24076 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__24079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SingleChoiceQuestion__Group__2__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__34138 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__34141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__TextAssignment_3_in_rule__SingleChoiceQuestion__Group__3__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__44198 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__44201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_4__0_in_rule__SingleChoiceQuestion__Group__4__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__54259 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__54262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SingleChoiceQuestion__Group__5__Impl4290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64321 = new BitSet(new long[]{0x0000000A00800000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_6_in_rule__SingleChoiceQuestion__Group__6__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74381 = new BitSet(new long[]{0x0000000A00800000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__8_in_rule__SingleChoiceQuestion__Group__74384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_7_in_rule__SingleChoiceQuestion__Group__7__Impl4411 = new BitSet(new long[]{0x0000000A00000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__8__Impl_in_rule__SingleChoiceQuestion__Group__84442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SingleChoiceQuestion__Group__8__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_4__0__Impl_in_rule__SingleChoiceQuestion__Group_4__04519 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_4__1_in_rule__SingleChoiceQuestion__Group_4__04522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SingleChoiceQuestion__Group_4__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_4__1__Impl_in_rule__SingleChoiceQuestion__Group_4__14581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_4_1_in_rule__SingleChoiceQuestion__Group_4__1__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04642 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultiChoiceQuestion__Group__0__Impl4673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14704 = new BitSet(new long[]{0x0000001000040000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_1_in_rule__MultiChoiceQuestion__Group__1__Impl4734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24765 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MultiChoiceQuestion__Group__2__Impl4796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__34827 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__34830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__TextAssignment_3_in_rule__MultiChoiceQuestion__Group__3__Impl4857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__44887 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__44890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_4__0_in_rule__MultiChoiceQuestion__Group__4__Impl4917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__54948 = new BitSet(new long[]{0x0000000A00000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__54951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MultiChoiceQuestion__Group__5__Impl4979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__65010 = new BitSet(new long[]{0x0000000A00800000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__65013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_6_in_rule__MultiChoiceQuestion__Group__6__Impl5040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__75070 = new BitSet(new long[]{0x0000000A00800000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__8_in_rule__MultiChoiceQuestion__Group__75073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_7_in_rule__MultiChoiceQuestion__Group__7__Impl5100 = new BitSet(new long[]{0x0000000A00000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__8__Impl_in_rule__MultiChoiceQuestion__Group__85131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MultiChoiceQuestion__Group__8__Impl5159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_4__0__Impl_in_rule__MultiChoiceQuestion__Group_4__05208 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_4__1_in_rule__MultiChoiceQuestion__Group_4__05211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MultiChoiceQuestion__Group_4__0__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_4__1__Impl_in_rule__MultiChoiceQuestion__Group_4__15270 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_4_1_in_rule__MultiChoiceQuestion__Group_4__1__Impl5297 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05331 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__05334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__And__Group__0__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15393 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__And__Group__2_in_rule__And__Group__15396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__LhsAssignment_1_in_rule__And__Group__1__Impl5423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__2__Impl_in_rule__And__Group__25453 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__And__Group__3_in_rule__And__Group__25456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__And__Group__2__Impl5484 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__3__Impl_in_rule__And__Group__35515 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__And__Group__4_in_rule__And__Group__35518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__RhsAssignment_3_in_rule__And__Group__3__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__4__Impl_in_rule__And__Group__45575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__And__Group__4__Impl5603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05644 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Or__Group__0__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15706 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__15709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__LhsAssignment_1_in_rule__Or__Group__1__Impl5736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__25766 = new BitSet(new long[]{0x0000000148000000L});
        public static final BitSet FOLLOW_rule__Or__Group__3_in_rule__Or__Group__25769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Or__Group__2__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__3__Impl_in_rule__Or__Group__35828 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__Or__Group__4_in_rule__Or__Group__35831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__RhsAssignment_3_in_rule__Or__Group__3__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__4__Impl_in_rule__Or__Group__45888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Or__Group__4__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__0__Impl_in_rule__AnswerRef__Group__05957 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__1_in_rule__AnswerRef__Group__05960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__AnswerRef__Group__0__Impl5988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__1__Impl_in_rule__AnswerRef__Group__16019 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__RefersAssignment_1_in_rule__AnswerRef__Group__1__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__06080 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__06083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__ChoiceAnswer__Group__0__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__16142 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__16145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ChoiceAnswer__Group__1__Impl6173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__26204 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__26207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__NameAssignment_2_in_rule__ChoiceAnswer__Group__2__Impl6234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__36264 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__4_in_rule__ChoiceAnswer__Group__36267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ChoiceAnswer__Group__3__Impl6295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__4__Impl_in_rule__ChoiceAnswer__Group__46326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__TextAssignment_4_in_rule__ChoiceAnswer__Group__4__Impl6353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__06393 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__06396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__FreetextAnswer__Group__0__Impl6424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__16455 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__16458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__FreetextAnswer__Group__1__Impl6486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__26517 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__26520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__NameAssignment_2_in_rule__FreetextAnswer__Group__2__Impl6547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__36577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__4_in_rule__FreetextAnswer__Group__36580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FreetextAnswer__Group__3__Impl6608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__4__Impl_in_rule__FreetextAnswer__Group__46639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__TextAssignment_4_in_rule__FreetextAnswer__Group__4__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_26711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_46742 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_56773 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_26804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_3_16835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_56866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_66897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_26928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_3_16959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_26990 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_3_17021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__FreetextQuestion__OptionalAssignment_17057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_37096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_4_17127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_67158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__SingleChoiceQuestion__OptionalAssignment_17194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_37233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_4_17264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_67295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_77326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__MultiChoiceQuestion__OptionalAssignment_17362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_37401 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_4_17432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_67463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_77494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__And__LhsAssignment_17525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__And__RhsAssignment_37556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Or__LhsAssignment_17587 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Or__RhsAssignment_37618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment_17653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ChoiceAnswer__NameAssignment_27688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_47719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FreetextAnswer__NameAssignment_27750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_47781 = new BitSet(new long[]{0x0000000000000002L});
    }


}