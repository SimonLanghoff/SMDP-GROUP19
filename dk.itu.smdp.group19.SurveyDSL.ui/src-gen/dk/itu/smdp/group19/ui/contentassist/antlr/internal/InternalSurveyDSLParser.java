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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'pages:'", "'end survey'", "'question page'", "'questions:'", "'end page'", "':'", "'description page'", "'result page'", "'free text question'", "'answers:'", "'end question'", "'requires:'", "'single choice question'", "'multi choice question'", "'and('", "'and'", "')'", "'or('", "'or'", "'answer reference:'", "'answer choice'", "'answer text'", "'optional'"
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:456:1: entryRuleAnswerRef : ruleAnswerRef EOF ;
    public final void entryRuleAnswerRef() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:457:1: ( ruleAnswerRef EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:458:1: ruleAnswerRef EOF
            {
             before(grammarAccess.getAnswerRefRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef905);
            ruleAnswerRef();

            state._fsp--;

             after(grammarAccess.getAnswerRefRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnswerRef912); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:465:1: ruleAnswerRef : ( ( rule__AnswerRef__Group__0 ) ) ;
    public final void ruleAnswerRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:469:2: ( ( ( rule__AnswerRef__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:1: ( ( rule__AnswerRef__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:470:1: ( ( rule__AnswerRef__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:471:1: ( rule__AnswerRef__Group__0 )
            {
             before(grammarAccess.getAnswerRefAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:472:1: ( rule__AnswerRef__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:472:2: rule__AnswerRef__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__0_in_ruleAnswerRef938);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:484:1: entryRuleChoiceAnswer : ruleChoiceAnswer EOF ;
    public final void entryRuleChoiceAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:485:1: ( ruleChoiceAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:486:1: ruleChoiceAnswer EOF
            {
             before(grammarAccess.getChoiceAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer965);
            ruleChoiceAnswer();

            state._fsp--;

             after(grammarAccess.getChoiceAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleChoiceAnswer972); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:493:1: ruleChoiceAnswer : ( ( rule__ChoiceAnswer__Group__0 ) ) ;
    public final void ruleChoiceAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:497:2: ( ( ( rule__ChoiceAnswer__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:1: ( ( rule__ChoiceAnswer__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:498:1: ( ( rule__ChoiceAnswer__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:499:1: ( rule__ChoiceAnswer__Group__0 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:500:1: ( rule__ChoiceAnswer__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:500:2: rule__ChoiceAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0_in_ruleChoiceAnswer998);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:512:1: entryRuleFreetextAnswer : ruleFreetextAnswer EOF ;
    public final void entryRuleFreetextAnswer() throws RecognitionException {
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:513:1: ( ruleFreetextAnswer EOF )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:514:1: ruleFreetextAnswer EOF
            {
             before(grammarAccess.getFreetextAnswerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer1025);
            ruleFreetextAnswer();

            state._fsp--;

             after(grammarAccess.getFreetextAnswerRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFreetextAnswer1032); 

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:521:1: ruleFreetextAnswer : ( ( rule__FreetextAnswer__Group__0 ) ) ;
    public final void ruleFreetextAnswer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:525:2: ( ( ( rule__FreetextAnswer__Group__0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:526:1: ( ( rule__FreetextAnswer__Group__0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:526:1: ( ( rule__FreetextAnswer__Group__0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:527:1: ( rule__FreetextAnswer__Group__0 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getGroup()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:528:1: ( rule__FreetextAnswer__Group__0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:528:2: rule__FreetextAnswer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0_in_ruleFreetextAnswer1058);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:540:1: rule__Page__Alternatives : ( ( ruleQuestionPage ) | ( ruleDescriptionPage ) | ( ruleResultPage ) );
    public final void rule__Page__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:544:1: ( ( ruleQuestionPage ) | ( ruleDescriptionPage ) | ( ruleResultPage ) )
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:545:1: ( ruleQuestionPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:545:1: ( ruleQuestionPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:546:1: ruleQuestionPage
                    {
                     before(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleQuestionPage_in_rule__Page__Alternatives1094);
                    ruleQuestionPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getQuestionPageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:551:6: ( ruleDescriptionPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:551:6: ( ruleDescriptionPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:552:1: ruleDescriptionPage
                    {
                     before(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleDescriptionPage_in_rule__Page__Alternatives1111);
                    ruleDescriptionPage();

                    state._fsp--;

                     after(grammarAccess.getPageAccess().getDescriptionPageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:557:6: ( ruleResultPage )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:557:6: ( ruleResultPage )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:558:1: ruleResultPage
                    {
                     before(grammarAccess.getPageAccess().getResultPageParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleResultPage_in_rule__Page__Alternatives1128);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:568:1: rule__Question__Alternatives : ( ( ruleFreetextQuestion ) | ( ruleSingleChoiceQuestion ) | ( ruleMultiChoiceQuestion ) );
    public final void rule__Question__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:572:1: ( ( ruleFreetextQuestion ) | ( ruleSingleChoiceQuestion ) | ( ruleMultiChoiceQuestion ) )
            int alt2=3;
            switch ( input.LA(1) ) {
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:573:1: ( ruleFreetextQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:573:1: ( ruleFreetextQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:574:1: ruleFreetextQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives1160);
                    ruleFreetextQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getFreetextQuestionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:579:6: ( ruleSingleChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:579:6: ( ruleSingleChoiceQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:580:1: ruleSingleChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleSingleChoiceQuestion_in_rule__Question__Alternatives1177);
                    ruleSingleChoiceQuestion();

                    state._fsp--;

                     after(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:585:6: ( ruleMultiChoiceQuestion )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:585:6: ( ruleMultiChoiceQuestion )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:586:1: ruleMultiChoiceQuestion
                    {
                     before(grammarAccess.getQuestionAccess().getMultiChoiceQuestionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleMultiChoiceQuestion_in_rule__Question__Alternatives1194);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:596:1: rule__Dependency__Alternatives : ( ( ruleAnd ) | ( ruleOr ) | ( ruleAnswerRef ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:600:1: ( ( ruleAnd ) | ( ruleOr ) | ( ruleAnswerRef ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 31:
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:601:1: ( ruleAnd )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:601:1: ( ruleAnd )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:602:1: ruleAnd
                    {
                     before(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnd_in_rule__Dependency__Alternatives1226);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getAndParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:607:6: ( ruleOr )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:607:6: ( ruleOr )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:608:1: ruleOr
                    {
                     before(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleOr_in_rule__Dependency__Alternatives1243);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getOrParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:613:6: ( ruleAnswerRef )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:613:6: ( ruleAnswerRef )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:614:1: ruleAnswerRef
                    {
                     before(grammarAccess.getDependencyAccess().getAnswerRefParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleAnswerRef_in_rule__Dependency__Alternatives1260);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:624:1: rule__Answer__Alternatives : ( ( ruleChoiceAnswer ) | ( ruleFreetextAnswer ) );
    public final void rule__Answer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:628:1: ( ( ruleChoiceAnswer ) | ( ruleFreetextAnswer ) )
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:629:1: ( ruleChoiceAnswer )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:629:1: ( ruleChoiceAnswer )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:630:1: ruleChoiceAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleChoiceAnswer_in_rule__Answer__Alternatives1292);
                    ruleChoiceAnswer();

                    state._fsp--;

                     after(grammarAccess.getAnswerAccess().getChoiceAnswerParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:635:6: ( ruleFreetextAnswer )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:635:6: ( ruleFreetextAnswer )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:636:1: ruleFreetextAnswer
                    {
                     before(grammarAccess.getAnswerAccess().getFreetextAnswerParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__Answer__Alternatives1309);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:646:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:650:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:651:1: ( RULE_STRING )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:651:1: ( RULE_STRING )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:652:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1341); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:657:6: ( RULE_ID )
                    {
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:657:6: ( RULE_ID )
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:658:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1358); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:671:1: rule__Survey__Group__0 : rule__Survey__Group__0__Impl rule__Survey__Group__1 ;
    public final void rule__Survey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:675:1: ( rule__Survey__Group__0__Impl rule__Survey__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:676:2: rule__Survey__Group__0__Impl rule__Survey__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01389);
            rule__Survey__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01392);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:683:1: rule__Survey__Group__0__Impl : ( 'start survey' ) ;
    public final void rule__Survey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:687:1: ( ( 'start survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:688:1: ( 'start survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:688:1: ( 'start survey' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:689:1: 'start survey'
            {
             before(grammarAccess.getSurveyAccess().getStartSurveyKeyword_0()); 
            match(input,11,FollowSets000.FOLLOW_11_in_rule__Survey__Group__0__Impl1420); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:702:1: rule__Survey__Group__1 : rule__Survey__Group__1__Impl rule__Survey__Group__2 ;
    public final void rule__Survey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:706:1: ( rule__Survey__Group__1__Impl rule__Survey__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:707:2: rule__Survey__Group__1__Impl rule__Survey__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11451);
            rule__Survey__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11454);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:714:1: rule__Survey__Group__1__Impl : ( ( rule__Survey__TitleAssignment_1 ) ) ;
    public final void rule__Survey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:718:1: ( ( ( rule__Survey__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:719:1: ( ( rule__Survey__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:719:1: ( ( rule__Survey__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:720:1: ( rule__Survey__TitleAssignment_1 )
            {
             before(grammarAccess.getSurveyAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:721:1: ( rule__Survey__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:721:2: rule__Survey__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1481);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:743:1: rule__Survey__Group__2__Impl : ( 'pages:' ) ;
    public final void rule__Survey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:747:1: ( ( 'pages:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:748:1: ( 'pages:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:748:1: ( 'pages:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:749:1: 'pages:'
            {
             before(grammarAccess.getSurveyAccess().getPagesKeyword_2()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__Survey__Group__2__Impl1542); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:762:1: rule__Survey__Group__3 : rule__Survey__Group__3__Impl rule__Survey__Group__4 ;
    public final void rule__Survey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:766:1: ( rule__Survey__Group__3__Impl rule__Survey__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:767:2: rule__Survey__Group__3__Impl rule__Survey__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31573);
            rule__Survey__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31576);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:774:1: rule__Survey__Group__3__Impl : ( ( rule__Survey__PagesAssignment_3 ) ) ;
    public final void rule__Survey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:778:1: ( ( ( rule__Survey__PagesAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:779:1: ( ( rule__Survey__PagesAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:779:1: ( ( rule__Survey__PagesAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:780:1: ( rule__Survey__PagesAssignment_3 )
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:781:1: ( rule__Survey__PagesAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:781:2: rule__Survey__PagesAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl1603);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:803:1: rule__Survey__Group__4__Impl : ( ( rule__Survey__PagesAssignment_4 )* ) ;
    public final void rule__Survey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:807:1: ( ( ( rule__Survey__PagesAssignment_4 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:808:1: ( ( rule__Survey__PagesAssignment_4 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:808:1: ( ( rule__Survey__PagesAssignment_4 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:809:1: ( rule__Survey__PagesAssignment_4 )*
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:810:1: ( rule__Survey__PagesAssignment_4 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||(LA6_0>=18 && LA6_0<=19)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:810:2: rule__Survey__PagesAssignment_4
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1663);
            	    rule__Survey__PagesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:820:1: rule__Survey__Group__5 : rule__Survey__Group__5__Impl ;
    public final void rule__Survey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:824:1: ( rule__Survey__Group__5__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:825:2: rule__Survey__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51694);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:831:1: rule__Survey__Group__5__Impl : ( 'end survey' ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:835:1: ( ( 'end survey' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:836:1: ( 'end survey' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:836:1: ( 'end survey' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:837:1: 'end survey'
            {
             before(grammarAccess.getSurveyAccess().getEndSurveyKeyword_5()); 
            match(input,13,FollowSets000.FOLLOW_13_in_rule__Survey__Group__5__Impl1722); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:862:1: rule__QuestionPage__Group__0 : rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 ;
    public final void rule__QuestionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:866:1: ( rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:867:2: rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01765);
            rule__QuestionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01768);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:874:1: rule__QuestionPage__Group__0__Impl : ( 'question page' ) ;
    public final void rule__QuestionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:878:1: ( ( 'question page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:879:1: ( 'question page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:879:1: ( 'question page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:880:1: 'question page'
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionPageKeyword_0()); 
            match(input,14,FollowSets000.FOLLOW_14_in_rule__QuestionPage__Group__0__Impl1796); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:893:1: rule__QuestionPage__Group__1 : rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 ;
    public final void rule__QuestionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:897:1: ( rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:898:2: rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__11827);
            rule__QuestionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__11830);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:905:1: rule__QuestionPage__Group__1__Impl : ( ( rule__QuestionPage__TitleAssignment_1 ) ) ;
    public final void rule__QuestionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:909:1: ( ( ( rule__QuestionPage__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:910:1: ( ( rule__QuestionPage__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:910:1: ( ( rule__QuestionPage__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:911:1: ( rule__QuestionPage__TitleAssignment_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:912:1: ( rule__QuestionPage__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:912:2: rule__QuestionPage__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TitleAssignment_1_in_rule__QuestionPage__Group__1__Impl1857);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:922:1: rule__QuestionPage__Group__2 : rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 ;
    public final void rule__QuestionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:926:1: ( rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:927:2: rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__21887);
            rule__QuestionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__21890);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:934:1: rule__QuestionPage__Group__2__Impl : ( ( rule__QuestionPage__Group_2__0 )? ) ;
    public final void rule__QuestionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:938:1: ( ( ( rule__QuestionPage__Group_2__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:939:1: ( ( rule__QuestionPage__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:939:1: ( ( rule__QuestionPage__Group_2__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:940:1: ( rule__QuestionPage__Group_2__0 )?
            {
             before(grammarAccess.getQuestionPageAccess().getGroup_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:941:1: ( rule__QuestionPage__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:941:2: rule__QuestionPage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__0_in_rule__QuestionPage__Group__2__Impl1917);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:951:1: rule__QuestionPage__Group__3 : rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 ;
    public final void rule__QuestionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:955:1: ( rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:956:2: rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__31948);
            rule__QuestionPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__31951);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:963:1: rule__QuestionPage__Group__3__Impl : ( 'questions:' ) ;
    public final void rule__QuestionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:967:1: ( ( 'questions:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:968:1: ( 'questions:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:968:1: ( 'questions:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:969:1: 'questions:'
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsKeyword_3()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuestionPage__Group__3__Impl1979); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:982:1: rule__QuestionPage__Group__4 : rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 ;
    public final void rule__QuestionPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:986:1: ( rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:987:2: rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42010);
            rule__QuestionPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42013);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:994:1: rule__QuestionPage__Group__4__Impl : ( ( rule__QuestionPage__QuestionsAssignment_4 ) ) ;
    public final void rule__QuestionPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:998:1: ( ( ( rule__QuestionPage__QuestionsAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:999:1: ( ( rule__QuestionPage__QuestionsAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:999:1: ( ( rule__QuestionPage__QuestionsAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1000:1: ( rule__QuestionPage__QuestionsAssignment_4 )
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1001:1: ( rule__QuestionPage__QuestionsAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1001:2: rule__QuestionPage__QuestionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_4_in_rule__QuestionPage__Group__4__Impl2040);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1011:1: rule__QuestionPage__Group__5 : rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 ;
    public final void rule__QuestionPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1015:1: ( rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1016:2: rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52070);
            rule__QuestionPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52073);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1023:1: rule__QuestionPage__Group__5__Impl : ( ( rule__QuestionPage__QuestionsAssignment_5 )* ) ;
    public final void rule__QuestionPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1027:1: ( ( ( rule__QuestionPage__QuestionsAssignment_5 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1028:1: ( ( rule__QuestionPage__QuestionsAssignment_5 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1028:1: ( ( rule__QuestionPage__QuestionsAssignment_5 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1029:1: ( rule__QuestionPage__QuestionsAssignment_5 )*
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1030:1: ( rule__QuestionPage__QuestionsAssignment_5 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||(LA8_0>=24 && LA8_0<=25)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1030:2: rule__QuestionPage__QuestionsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2100);
            	    rule__QuestionPage__QuestionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1040:1: rule__QuestionPage__Group__6 : rule__QuestionPage__Group__6__Impl ;
    public final void rule__QuestionPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1044:1: ( rule__QuestionPage__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1045:2: rule__QuestionPage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62131);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1051:1: rule__QuestionPage__Group__6__Impl : ( 'end page' ) ;
    public final void rule__QuestionPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1055:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1056:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1056:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1057:1: 'end page'
            {
             before(grammarAccess.getQuestionPageAccess().getEndPageKeyword_6()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuestionPage__Group__6__Impl2159); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1084:1: rule__QuestionPage__Group_2__0 : rule__QuestionPage__Group_2__0__Impl rule__QuestionPage__Group_2__1 ;
    public final void rule__QuestionPage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1088:1: ( rule__QuestionPage__Group_2__0__Impl rule__QuestionPage__Group_2__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1089:2: rule__QuestionPage__Group_2__0__Impl rule__QuestionPage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__0__Impl_in_rule__QuestionPage__Group_2__02204);
            rule__QuestionPage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__1_in_rule__QuestionPage__Group_2__02207);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1096:1: rule__QuestionPage__Group_2__0__Impl : ( ':' ) ;
    public final void rule__QuestionPage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1100:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1101:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1101:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1102:1: ':'
            {
             before(grammarAccess.getQuestionPageAccess().getColonKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuestionPage__Group_2__0__Impl2235); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1115:1: rule__QuestionPage__Group_2__1 : rule__QuestionPage__Group_2__1__Impl ;
    public final void rule__QuestionPage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1119:1: ( rule__QuestionPage__Group_2__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1120:2: rule__QuestionPage__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_2__1__Impl_in_rule__QuestionPage__Group_2__12266);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1126:1: rule__QuestionPage__Group_2__1__Impl : ( ( rule__QuestionPage__TextAssignment_2_1 ) ) ;
    public final void rule__QuestionPage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1130:1: ( ( ( rule__QuestionPage__TextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1131:1: ( ( rule__QuestionPage__TextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1131:1: ( ( rule__QuestionPage__TextAssignment_2_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1132:1: ( rule__QuestionPage__TextAssignment_2_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getTextAssignment_2_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1133:1: ( rule__QuestionPage__TextAssignment_2_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1133:2: rule__QuestionPage__TextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TextAssignment_2_1_in_rule__QuestionPage__Group_2__1__Impl2293);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1147:1: rule__DescriptionPage__Group__0 : rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 ;
    public final void rule__DescriptionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1151:1: ( rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1152:2: rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02327);
            rule__DescriptionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02330);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1159:1: rule__DescriptionPage__Group__0__Impl : ( 'description page' ) ;
    public final void rule__DescriptionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1163:1: ( ( 'description page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1164:1: ( 'description page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1164:1: ( 'description page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1165:1: 'description page'
            {
             before(grammarAccess.getDescriptionPageAccess().getDescriptionPageKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DescriptionPage__Group__0__Impl2358); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1178:1: rule__DescriptionPage__Group__1 : rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 ;
    public final void rule__DescriptionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1182:1: ( rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1183:2: rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12389);
            rule__DescriptionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12392);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1190:1: rule__DescriptionPage__Group__1__Impl : ( ( rule__DescriptionPage__TitleAssignment_1 ) ) ;
    public final void rule__DescriptionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1194:1: ( ( ( rule__DescriptionPage__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1195:1: ( ( rule__DescriptionPage__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1195:1: ( ( rule__DescriptionPage__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1196:1: ( rule__DescriptionPage__TitleAssignment_1 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1197:1: ( rule__DescriptionPage__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1197:2: rule__DescriptionPage__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TitleAssignment_1_in_rule__DescriptionPage__Group__1__Impl2419);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1207:1: rule__DescriptionPage__Group__2 : rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 ;
    public final void rule__DescriptionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1211:1: ( rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1212:2: rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22449);
            rule__DescriptionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22452);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1219:1: rule__DescriptionPage__Group__2__Impl : ( ( rule__DescriptionPage__Group_2__0 )? ) ;
    public final void rule__DescriptionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1223:1: ( ( ( rule__DescriptionPage__Group_2__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1224:1: ( ( rule__DescriptionPage__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1224:1: ( ( rule__DescriptionPage__Group_2__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1225:1: ( rule__DescriptionPage__Group_2__0 )?
            {
             before(grammarAccess.getDescriptionPageAccess().getGroup_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1226:1: ( rule__DescriptionPage__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1226:2: rule__DescriptionPage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__0_in_rule__DescriptionPage__Group__2__Impl2479);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1236:1: rule__DescriptionPage__Group__3 : rule__DescriptionPage__Group__3__Impl ;
    public final void rule__DescriptionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1240:1: ( rule__DescriptionPage__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1241:2: rule__DescriptionPage__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32510);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1247:1: rule__DescriptionPage__Group__3__Impl : ( 'end page' ) ;
    public final void rule__DescriptionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1251:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1252:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1252:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1253:1: 'end page'
            {
             before(grammarAccess.getDescriptionPageAccess().getEndPageKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__DescriptionPage__Group__3__Impl2538); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1274:1: rule__DescriptionPage__Group_2__0 : rule__DescriptionPage__Group_2__0__Impl rule__DescriptionPage__Group_2__1 ;
    public final void rule__DescriptionPage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1278:1: ( rule__DescriptionPage__Group_2__0__Impl rule__DescriptionPage__Group_2__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1279:2: rule__DescriptionPage__Group_2__0__Impl rule__DescriptionPage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__0__Impl_in_rule__DescriptionPage__Group_2__02577);
            rule__DescriptionPage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__1_in_rule__DescriptionPage__Group_2__02580);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1286:1: rule__DescriptionPage__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DescriptionPage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1291:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1291:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1292:1: ':'
            {
             before(grammarAccess.getDescriptionPageAccess().getColonKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__DescriptionPage__Group_2__0__Impl2608); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1305:1: rule__DescriptionPage__Group_2__1 : rule__DescriptionPage__Group_2__1__Impl ;
    public final void rule__DescriptionPage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1309:1: ( rule__DescriptionPage__Group_2__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1310:2: rule__DescriptionPage__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_2__1__Impl_in_rule__DescriptionPage__Group_2__12639);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1316:1: rule__DescriptionPage__Group_2__1__Impl : ( ( rule__DescriptionPage__TextAssignment_2_1 ) ) ;
    public final void rule__DescriptionPage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1320:1: ( ( ( rule__DescriptionPage__TextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:1: ( ( rule__DescriptionPage__TextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:1: ( ( rule__DescriptionPage__TextAssignment_2_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1322:1: ( rule__DescriptionPage__TextAssignment_2_1 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTextAssignment_2_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1323:1: ( rule__DescriptionPage__TextAssignment_2_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1323:2: rule__DescriptionPage__TextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TextAssignment_2_1_in_rule__DescriptionPage__Group_2__1__Impl2666);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1337:1: rule__ResultPage__Group__0 : rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 ;
    public final void rule__ResultPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1341:1: ( rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1342:2: rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__02700);
            rule__ResultPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__02703);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1349:1: rule__ResultPage__Group__0__Impl : ( 'result page' ) ;
    public final void rule__ResultPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1353:1: ( ( 'result page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1354:1: ( 'result page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1354:1: ( 'result page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1355:1: 'result page'
            {
             before(grammarAccess.getResultPageAccess().getResultPageKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__ResultPage__Group__0__Impl2731); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1368:1: rule__ResultPage__Group__1 : rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 ;
    public final void rule__ResultPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1372:1: ( rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1373:2: rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__12762);
            rule__ResultPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__12765);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1380:1: rule__ResultPage__Group__1__Impl : ( ( rule__ResultPage__TitleAssignment_1 ) ) ;
    public final void rule__ResultPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1384:1: ( ( ( rule__ResultPage__TitleAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1385:1: ( ( rule__ResultPage__TitleAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1385:1: ( ( rule__ResultPage__TitleAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1386:1: ( rule__ResultPage__TitleAssignment_1 )
            {
             before(grammarAccess.getResultPageAccess().getTitleAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1387:1: ( rule__ResultPage__TitleAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1387:2: rule__ResultPage__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TitleAssignment_1_in_rule__ResultPage__Group__1__Impl2792);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1397:1: rule__ResultPage__Group__2 : rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 ;
    public final void rule__ResultPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1401:1: ( rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1402:2: rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__22822);
            rule__ResultPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__22825);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1409:1: rule__ResultPage__Group__2__Impl : ( ( rule__ResultPage__Group_2__0 )? ) ;
    public final void rule__ResultPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1413:1: ( ( ( rule__ResultPage__Group_2__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1414:1: ( ( rule__ResultPage__Group_2__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1414:1: ( ( rule__ResultPage__Group_2__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1415:1: ( rule__ResultPage__Group_2__0 )?
            {
             before(grammarAccess.getResultPageAccess().getGroup_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1416:1: ( rule__ResultPage__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1416:2: rule__ResultPage__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__0_in_rule__ResultPage__Group__2__Impl2852);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1426:1: rule__ResultPage__Group__3 : rule__ResultPage__Group__3__Impl ;
    public final void rule__ResultPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1430:1: ( rule__ResultPage__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1431:2: rule__ResultPage__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__32883);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1437:1: rule__ResultPage__Group__3__Impl : ( 'end page' ) ;
    public final void rule__ResultPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1441:1: ( ( 'end page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1442:1: ( 'end page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1442:1: ( 'end page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1443:1: 'end page'
            {
             before(grammarAccess.getResultPageAccess().getEndPageKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__ResultPage__Group__3__Impl2911); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1464:1: rule__ResultPage__Group_2__0 : rule__ResultPage__Group_2__0__Impl rule__ResultPage__Group_2__1 ;
    public final void rule__ResultPage__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1468:1: ( rule__ResultPage__Group_2__0__Impl rule__ResultPage__Group_2__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1469:2: rule__ResultPage__Group_2__0__Impl rule__ResultPage__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__0__Impl_in_rule__ResultPage__Group_2__02950);
            rule__ResultPage__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__1_in_rule__ResultPage__Group_2__02953);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1476:1: rule__ResultPage__Group_2__0__Impl : ( ':' ) ;
    public final void rule__ResultPage__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1480:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1481:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1481:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1482:1: ':'
            {
             before(grammarAccess.getResultPageAccess().getColonKeyword_2_0()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ResultPage__Group_2__0__Impl2981); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1495:1: rule__ResultPage__Group_2__1 : rule__ResultPage__Group_2__1__Impl ;
    public final void rule__ResultPage__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1499:1: ( rule__ResultPage__Group_2__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1500:2: rule__ResultPage__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_2__1__Impl_in_rule__ResultPage__Group_2__13012);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1506:1: rule__ResultPage__Group_2__1__Impl : ( ( rule__ResultPage__TextAssignment_2_1 ) ) ;
    public final void rule__ResultPage__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1510:1: ( ( ( rule__ResultPage__TextAssignment_2_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1511:1: ( ( rule__ResultPage__TextAssignment_2_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1511:1: ( ( rule__ResultPage__TextAssignment_2_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1512:1: ( rule__ResultPage__TextAssignment_2_1 )
            {
             before(grammarAccess.getResultPageAccess().getTextAssignment_2_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1513:1: ( rule__ResultPage__TextAssignment_2_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1513:2: rule__ResultPage__TextAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TextAssignment_2_1_in_rule__ResultPage__Group_2__1__Impl3039);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1527:1: rule__FreetextQuestion__Group__0 : rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 ;
    public final void rule__FreetextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1531:1: ( rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1532:2: rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03073);
            rule__FreetextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03076);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1539:1: rule__FreetextQuestion__Group__0__Impl : ( 'free text question' ) ;
    public final void rule__FreetextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1543:1: ( ( 'free text question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1544:1: ( 'free text question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1544:1: ( 'free text question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1545:1: 'free text question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getFreeTextQuestionKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__FreetextQuestion__Group__0__Impl3104); 
             after(grammarAccess.getFreetextQuestionAccess().getFreeTextQuestionKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1558:1: rule__FreetextQuestion__Group__1 : rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 ;
    public final void rule__FreetextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1562:1: ( rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1563:2: rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13135);
            rule__FreetextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13138);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1570:1: rule__FreetextQuestion__Group__1__Impl : ( ( rule__FreetextQuestion__TextAssignment_1 ) ) ;
    public final void rule__FreetextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1574:1: ( ( ( rule__FreetextQuestion__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1575:1: ( ( rule__FreetextQuestion__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1575:1: ( ( rule__FreetextQuestion__TextAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1576:1: ( rule__FreetextQuestion__TextAssignment_1 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1577:1: ( rule__FreetextQuestion__TextAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1577:2: rule__FreetextQuestion__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__TextAssignment_1_in_rule__FreetextQuestion__Group__1__Impl3165);
            rule__FreetextQuestion__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getTextAssignment_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1587:1: rule__FreetextQuestion__Group__2 : rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 ;
    public final void rule__FreetextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1591:1: ( rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1592:2: rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23195);
            rule__FreetextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23198);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1599:1: rule__FreetextQuestion__Group__2__Impl : ( ( rule__FreetextQuestion__OptionalAssignment_2 )? ) ;
    public final void rule__FreetextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1603:1: ( ( ( rule__FreetextQuestion__OptionalAssignment_2 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1604:1: ( ( rule__FreetextQuestion__OptionalAssignment_2 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1604:1: ( ( rule__FreetextQuestion__OptionalAssignment_2 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1605:1: ( rule__FreetextQuestion__OptionalAssignment_2 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1606:1: ( rule__FreetextQuestion__OptionalAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1606:2: rule__FreetextQuestion__OptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__OptionalAssignment_2_in_rule__FreetextQuestion__Group__2__Impl3225);
                    rule__FreetextQuestion__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1616:1: rule__FreetextQuestion__Group__3 : rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 ;
    public final void rule__FreetextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1620:1: ( rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1621:2: rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33256);
            rule__FreetextQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33259);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1628:1: rule__FreetextQuestion__Group__3__Impl : ( ( rule__FreetextQuestion__Group_3__0 )? ) ;
    public final void rule__FreetextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1632:1: ( ( ( rule__FreetextQuestion__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1633:1: ( ( rule__FreetextQuestion__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1633:1: ( ( rule__FreetextQuestion__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1634:1: ( rule__FreetextQuestion__Group_3__0 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1635:1: ( rule__FreetextQuestion__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1635:2: rule__FreetextQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__0_in_rule__FreetextQuestion__Group__3__Impl3286);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1645:1: rule__FreetextQuestion__Group__4 : rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 ;
    public final void rule__FreetextQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1649:1: ( rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1650:2: rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43317);
            rule__FreetextQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43320);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1657:1: rule__FreetextQuestion__Group__4__Impl : ( 'answers:' ) ;
    public final void rule__FreetextQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1661:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1662:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1662:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1663:1: 'answers:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__FreetextQuestion__Group__4__Impl3348); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1676:1: rule__FreetextQuestion__Group__5 : rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 ;
    public final void rule__FreetextQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1680:1: ( rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1681:2: rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53379);
            rule__FreetextQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53382);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1688:1: rule__FreetextQuestion__Group__5__Impl : ( ( rule__FreetextQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__FreetextQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1692:1: ( ( ( rule__FreetextQuestion__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1693:1: ( ( rule__FreetextQuestion__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1693:1: ( ( rule__FreetextQuestion__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1694:1: ( rule__FreetextQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1695:1: ( rule__FreetextQuestion__AnswersAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1695:2: rule__FreetextQuestion__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__AnswersAssignment_5_in_rule__FreetextQuestion__Group__5__Impl3409);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1705:1: rule__FreetextQuestion__Group__6 : rule__FreetextQuestion__Group__6__Impl ;
    public final void rule__FreetextQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1709:1: ( rule__FreetextQuestion__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1710:2: rule__FreetextQuestion__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63439);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1716:1: rule__FreetextQuestion__Group__6__Impl : ( 'end question' ) ;
    public final void rule__FreetextQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1720:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1721:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1721:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1722:1: 'end question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getEndQuestionKeyword_6()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__FreetextQuestion__Group__6__Impl3467); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1749:1: rule__FreetextQuestion__Group_3__0 : rule__FreetextQuestion__Group_3__0__Impl rule__FreetextQuestion__Group_3__1 ;
    public final void rule__FreetextQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1753:1: ( rule__FreetextQuestion__Group_3__0__Impl rule__FreetextQuestion__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1754:2: rule__FreetextQuestion__Group_3__0__Impl rule__FreetextQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__0__Impl_in_rule__FreetextQuestion__Group_3__03512);
            rule__FreetextQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__1_in_rule__FreetextQuestion__Group_3__03515);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1761:1: rule__FreetextQuestion__Group_3__0__Impl : ( 'requires:' ) ;
    public final void rule__FreetextQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1765:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1766:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1766:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1767:1: 'requires:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FreetextQuestion__Group_3__0__Impl3543); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1780:1: rule__FreetextQuestion__Group_3__1 : rule__FreetextQuestion__Group_3__1__Impl ;
    public final void rule__FreetextQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1784:1: ( rule__FreetextQuestion__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1785:2: rule__FreetextQuestion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_3__1__Impl_in_rule__FreetextQuestion__Group_3__13574);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1791:1: rule__FreetextQuestion__Group_3__1__Impl : ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) ) ;
    public final void rule__FreetextQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1795:1: ( ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1796:1: ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1796:1: ( ( rule__FreetextQuestion__RequiresAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1797:1: ( rule__FreetextQuestion__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1798:1: ( rule__FreetextQuestion__RequiresAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1798:2: rule__FreetextQuestion__RequiresAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__RequiresAssignment_3_1_in_rule__FreetextQuestion__Group_3__1__Impl3601);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1812:1: rule__SingleChoiceQuestion__Group__0 : rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 ;
    public final void rule__SingleChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1816:1: ( rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1817:2: rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__03635);
            rule__SingleChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__03638);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1824:1: rule__SingleChoiceQuestion__Group__0__Impl : ( 'single choice question' ) ;
    public final void rule__SingleChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1828:1: ( ( 'single choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1829:1: ( 'single choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1829:1: ( 'single choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1830:1: 'single choice question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SingleChoiceQuestion__Group__0__Impl3666); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1843:1: rule__SingleChoiceQuestion__Group__1 : rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 ;
    public final void rule__SingleChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1847:1: ( rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1848:2: rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__13697);
            rule__SingleChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__13700);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1855:1: rule__SingleChoiceQuestion__Group__1__Impl : ( ( rule__SingleChoiceQuestion__TextAssignment_1 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1859:1: ( ( ( rule__SingleChoiceQuestion__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1860:1: ( ( rule__SingleChoiceQuestion__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1860:1: ( ( rule__SingleChoiceQuestion__TextAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1861:1: ( rule__SingleChoiceQuestion__TextAssignment_1 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1862:1: ( rule__SingleChoiceQuestion__TextAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1862:2: rule__SingleChoiceQuestion__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__TextAssignment_1_in_rule__SingleChoiceQuestion__Group__1__Impl3727);
            rule__SingleChoiceQuestion__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1872:1: rule__SingleChoiceQuestion__Group__2 : rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 ;
    public final void rule__SingleChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1876:1: ( rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1877:2: rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__23757);
            rule__SingleChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__23760);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1884:1: rule__SingleChoiceQuestion__Group__2__Impl : ( ( rule__SingleChoiceQuestion__OptionalAssignment_2 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1888:1: ( ( ( rule__SingleChoiceQuestion__OptionalAssignment_2 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1889:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_2 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1889:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_2 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1890:1: ( rule__SingleChoiceQuestion__OptionalAssignment_2 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1891:1: ( rule__SingleChoiceQuestion__OptionalAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1891:2: rule__SingleChoiceQuestion__OptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_2_in_rule__SingleChoiceQuestion__Group__2__Impl3787);
                    rule__SingleChoiceQuestion__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1901:1: rule__SingleChoiceQuestion__Group__3 : rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 ;
    public final void rule__SingleChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1905:1: ( rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1906:2: rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__33818);
            rule__SingleChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__33821);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1913:1: rule__SingleChoiceQuestion__Group__3__Impl : ( ( rule__SingleChoiceQuestion__Group_3__0 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1917:1: ( ( ( rule__SingleChoiceQuestion__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1918:1: ( ( rule__SingleChoiceQuestion__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1918:1: ( ( rule__SingleChoiceQuestion__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1919:1: ( rule__SingleChoiceQuestion__Group_3__0 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1920:1: ( rule__SingleChoiceQuestion__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1920:2: rule__SingleChoiceQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__0_in_rule__SingleChoiceQuestion__Group__3__Impl3848);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1930:1: rule__SingleChoiceQuestion__Group__4 : rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 ;
    public final void rule__SingleChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1934:1: ( rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1935:2: rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__43879);
            rule__SingleChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__43882);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1942:1: rule__SingleChoiceQuestion__Group__4__Impl : ( 'answers:' ) ;
    public final void rule__SingleChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1946:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1947:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1947:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1948:1: 'answers:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SingleChoiceQuestion__Group__4__Impl3910); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1961:1: rule__SingleChoiceQuestion__Group__5 : rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 ;
    public final void rule__SingleChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1965:1: ( rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1966:2: rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__53941);
            rule__SingleChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__53944);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1973:1: rule__SingleChoiceQuestion__Group__5__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1977:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1978:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1978:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1979:1: ( rule__SingleChoiceQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1980:1: ( rule__SingleChoiceQuestion__AnswersAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1980:2: rule__SingleChoiceQuestion__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_5_in_rule__SingleChoiceQuestion__Group__5__Impl3971);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1990:1: rule__SingleChoiceQuestion__Group__6 : rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 ;
    public final void rule__SingleChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1994:1: ( rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1995:2: rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64001);
            rule__SingleChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64004);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2002:1: rule__SingleChoiceQuestion__Group__6__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* ) ;
    public final void rule__SingleChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2006:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2007:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2007:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2008:1: ( rule__SingleChoiceQuestion__AnswersAssignment_6 )*
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2009:1: ( rule__SingleChoiceQuestion__AnswersAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=32 && LA15_0<=33)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2009:2: rule__SingleChoiceQuestion__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_6_in_rule__SingleChoiceQuestion__Group__6__Impl4031);
            	    rule__SingleChoiceQuestion__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2019:1: rule__SingleChoiceQuestion__Group__7 : rule__SingleChoiceQuestion__Group__7__Impl ;
    public final void rule__SingleChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2023:1: ( rule__SingleChoiceQuestion__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2024:2: rule__SingleChoiceQuestion__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74062);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2030:1: rule__SingleChoiceQuestion__Group__7__Impl : ( 'end question' ) ;
    public final void rule__SingleChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2034:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2035:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2035:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2036:1: 'end question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getEndQuestionKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__SingleChoiceQuestion__Group__7__Impl4090); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2065:1: rule__SingleChoiceQuestion__Group_3__0 : rule__SingleChoiceQuestion__Group_3__0__Impl rule__SingleChoiceQuestion__Group_3__1 ;
    public final void rule__SingleChoiceQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2069:1: ( rule__SingleChoiceQuestion__Group_3__0__Impl rule__SingleChoiceQuestion__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2070:2: rule__SingleChoiceQuestion__Group_3__0__Impl rule__SingleChoiceQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__0__Impl_in_rule__SingleChoiceQuestion__Group_3__04137);
            rule__SingleChoiceQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__1_in_rule__SingleChoiceQuestion__Group_3__04140);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2077:1: rule__SingleChoiceQuestion__Group_3__0__Impl : ( 'requires:' ) ;
    public final void rule__SingleChoiceQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2081:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2082:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2082:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2083:1: 'requires:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SingleChoiceQuestion__Group_3__0__Impl4168); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2096:1: rule__SingleChoiceQuestion__Group_3__1 : rule__SingleChoiceQuestion__Group_3__1__Impl ;
    public final void rule__SingleChoiceQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2100:1: ( rule__SingleChoiceQuestion__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2101:2: rule__SingleChoiceQuestion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_3__1__Impl_in_rule__SingleChoiceQuestion__Group_3__14199);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2107:1: rule__SingleChoiceQuestion__Group_3__1__Impl : ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) ) ;
    public final void rule__SingleChoiceQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2111:1: ( ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2112:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2112:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2113:1: ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2114:1: ( rule__SingleChoiceQuestion__RequiresAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2114:2: rule__SingleChoiceQuestion__RequiresAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_3_1_in_rule__SingleChoiceQuestion__Group_3__1__Impl4226);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2128:1: rule__MultiChoiceQuestion__Group__0 : rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 ;
    public final void rule__MultiChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2132:1: ( rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2133:2: rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04260);
            rule__MultiChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04263);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2140:1: rule__MultiChoiceQuestion__Group__0__Impl : ( 'multi choice question' ) ;
    public final void rule__MultiChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2144:1: ( ( 'multi choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2145:1: ( 'multi choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2145:1: ( 'multi choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2146:1: 'multi choice question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__MultiChoiceQuestion__Group__0__Impl4291); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2159:1: rule__MultiChoiceQuestion__Group__1 : rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 ;
    public final void rule__MultiChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2163:1: ( rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2164:2: rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14322);
            rule__MultiChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14325);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2171:1: rule__MultiChoiceQuestion__Group__1__Impl : ( ( rule__MultiChoiceQuestion__TextAssignment_1 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2175:1: ( ( ( rule__MultiChoiceQuestion__TextAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2176:1: ( ( rule__MultiChoiceQuestion__TextAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2176:1: ( ( rule__MultiChoiceQuestion__TextAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2177:1: ( rule__MultiChoiceQuestion__TextAssignment_1 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2178:1: ( rule__MultiChoiceQuestion__TextAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2178:2: rule__MultiChoiceQuestion__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__TextAssignment_1_in_rule__MultiChoiceQuestion__Group__1__Impl4352);
            rule__MultiChoiceQuestion__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2188:1: rule__MultiChoiceQuestion__Group__2 : rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 ;
    public final void rule__MultiChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2192:1: ( rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2193:2: rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24382);
            rule__MultiChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24385);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2200:1: rule__MultiChoiceQuestion__Group__2__Impl : ( ( rule__MultiChoiceQuestion__OptionalAssignment_2 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2204:1: ( ( ( rule__MultiChoiceQuestion__OptionalAssignment_2 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2205:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_2 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2205:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_2 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2206:1: ( rule__MultiChoiceQuestion__OptionalAssignment_2 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2207:1: ( rule__MultiChoiceQuestion__OptionalAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2207:2: rule__MultiChoiceQuestion__OptionalAssignment_2
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_2_in_rule__MultiChoiceQuestion__Group__2__Impl4412);
                    rule__MultiChoiceQuestion__OptionalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2217:1: rule__MultiChoiceQuestion__Group__3 : rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 ;
    public final void rule__MultiChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2221:1: ( rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2222:2: rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__34443);
            rule__MultiChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__34446);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2229:1: rule__MultiChoiceQuestion__Group__3__Impl : ( ( rule__MultiChoiceQuestion__Group_3__0 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2233:1: ( ( ( rule__MultiChoiceQuestion__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2234:1: ( ( rule__MultiChoiceQuestion__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2234:1: ( ( rule__MultiChoiceQuestion__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2235:1: ( rule__MultiChoiceQuestion__Group_3__0 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2236:1: ( rule__MultiChoiceQuestion__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2236:2: rule__MultiChoiceQuestion__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__0_in_rule__MultiChoiceQuestion__Group__3__Impl4473);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2246:1: rule__MultiChoiceQuestion__Group__4 : rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 ;
    public final void rule__MultiChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2250:1: ( rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2251:2: rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__44504);
            rule__MultiChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__44507);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2258:1: rule__MultiChoiceQuestion__Group__4__Impl : ( 'answers:' ) ;
    public final void rule__MultiChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2262:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2263:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2263:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2264:1: 'answers:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_4()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MultiChoiceQuestion__Group__4__Impl4535); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2277:1: rule__MultiChoiceQuestion__Group__5 : rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 ;
    public final void rule__MultiChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2281:1: ( rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2282:2: rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__54566);
            rule__MultiChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__54569);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2289:1: rule__MultiChoiceQuestion__Group__5__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2293:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2294:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2294:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2295:1: ( rule__MultiChoiceQuestion__AnswersAssignment_5 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2296:1: ( rule__MultiChoiceQuestion__AnswersAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2296:2: rule__MultiChoiceQuestion__AnswersAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_5_in_rule__MultiChoiceQuestion__Group__5__Impl4596);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2306:1: rule__MultiChoiceQuestion__Group__6 : rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 ;
    public final void rule__MultiChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2310:1: ( rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2311:2: rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__64626);
            rule__MultiChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__64629);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2318:1: rule__MultiChoiceQuestion__Group__6__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* ) ;
    public final void rule__MultiChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2322:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2323:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2323:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_6 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2324:1: ( rule__MultiChoiceQuestion__AnswersAssignment_6 )*
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2325:1: ( rule__MultiChoiceQuestion__AnswersAssignment_6 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=32 && LA18_0<=33)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2325:2: rule__MultiChoiceQuestion__AnswersAssignment_6
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_6_in_rule__MultiChoiceQuestion__Group__6__Impl4656);
            	    rule__MultiChoiceQuestion__AnswersAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2335:1: rule__MultiChoiceQuestion__Group__7 : rule__MultiChoiceQuestion__Group__7__Impl ;
    public final void rule__MultiChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2339:1: ( rule__MultiChoiceQuestion__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2340:2: rule__MultiChoiceQuestion__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__74687);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2346:1: rule__MultiChoiceQuestion__Group__7__Impl : ( 'end question' ) ;
    public final void rule__MultiChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2350:1: ( ( 'end question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2351:1: ( 'end question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2351:1: ( 'end question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2352:1: 'end question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getEndQuestionKeyword_7()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__MultiChoiceQuestion__Group__7__Impl4715); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2381:1: rule__MultiChoiceQuestion__Group_3__0 : rule__MultiChoiceQuestion__Group_3__0__Impl rule__MultiChoiceQuestion__Group_3__1 ;
    public final void rule__MultiChoiceQuestion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2385:1: ( rule__MultiChoiceQuestion__Group_3__0__Impl rule__MultiChoiceQuestion__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2386:2: rule__MultiChoiceQuestion__Group_3__0__Impl rule__MultiChoiceQuestion__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__0__Impl_in_rule__MultiChoiceQuestion__Group_3__04762);
            rule__MultiChoiceQuestion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__1_in_rule__MultiChoiceQuestion__Group_3__04765);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2393:1: rule__MultiChoiceQuestion__Group_3__0__Impl : ( 'requires:' ) ;
    public final void rule__MultiChoiceQuestion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2397:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2398:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2398:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2399:1: 'requires:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_3_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MultiChoiceQuestion__Group_3__0__Impl4793); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2412:1: rule__MultiChoiceQuestion__Group_3__1 : rule__MultiChoiceQuestion__Group_3__1__Impl ;
    public final void rule__MultiChoiceQuestion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2416:1: ( rule__MultiChoiceQuestion__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2417:2: rule__MultiChoiceQuestion__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_3__1__Impl_in_rule__MultiChoiceQuestion__Group_3__14824);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2423:1: rule__MultiChoiceQuestion__Group_3__1__Impl : ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) ) ;
    public final void rule__MultiChoiceQuestion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2427:1: ( ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2428:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2428:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2429:1: ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2430:1: ( rule__MultiChoiceQuestion__RequiresAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2430:2: rule__MultiChoiceQuestion__RequiresAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_3_1_in_rule__MultiChoiceQuestion__Group_3__1__Impl4851);
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


    // $ANTLR start "rule__And__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2444:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2448:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2449:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__04885);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__1_in_rule__And__Group__04888);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2456:1: rule__And__Group__0__Impl : ( 'and(' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2460:1: ( ( 'and(' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2461:1: ( 'and(' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2461:1: ( 'and(' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2462:1: 'and('
            {
             before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__And__Group__0__Impl4916); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2475:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2479:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2480:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__14947);
            rule__And__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__2_in_rule__And__Group__14950);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2487:1: rule__And__Group__1__Impl : ( ( rule__And__LhsAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2491:1: ( ( ( rule__And__LhsAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2492:1: ( ( rule__And__LhsAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2492:1: ( ( rule__And__LhsAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2493:1: ( rule__And__LhsAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getLhsAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2494:1: ( rule__And__LhsAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2494:2: rule__And__LhsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__LhsAssignment_1_in_rule__And__Group__1__Impl4977);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2504:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2508:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2509:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__2__Impl_in_rule__And__Group__25007);
            rule__And__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__3_in_rule__And__Group__25010);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2516:1: rule__And__Group__2__Impl : ( 'and' ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2520:1: ( ( 'and' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2521:1: ( 'and' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2521:1: ( 'and' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2522:1: 'and'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__And__Group__2__Impl5038); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2535:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2539:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2540:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__3__Impl_in_rule__And__Group__35069);
            rule__And__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__4_in_rule__And__Group__35072);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2547:1: rule__And__Group__3__Impl : ( ( rule__And__RhsAssignment_3 ) ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2551:1: ( ( ( rule__And__RhsAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2552:1: ( ( rule__And__RhsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2552:1: ( ( rule__And__RhsAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2553:1: ( rule__And__RhsAssignment_3 )
            {
             before(grammarAccess.getAndAccess().getRhsAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2554:1: ( rule__And__RhsAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2554:2: rule__And__RhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__RhsAssignment_3_in_rule__And__Group__3__Impl5099);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2564:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2568:1: ( rule__And__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2569:2: rule__And__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__4__Impl_in_rule__And__Group__45129);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2575:1: rule__And__Group__4__Impl : ( ')' ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2579:1: ( ( ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2580:1: ( ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2580:1: ( ')' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2581:1: ')'
            {
             before(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__And__Group__4__Impl5157); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2604:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2608:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2609:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05198);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05201);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2616:1: rule__Or__Group__0__Impl : ( 'or(' ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2620:1: ( ( 'or(' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2621:1: ( 'or(' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2621:1: ( 'or(' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2622:1: 'or('
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Or__Group__0__Impl5229); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2635:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2639:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2640:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15260);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__2_in_rule__Or__Group__15263);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2647:1: rule__Or__Group__1__Impl : ( ( rule__Or__LhsAssignment_1 ) ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2651:1: ( ( ( rule__Or__LhsAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2652:1: ( ( rule__Or__LhsAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2652:1: ( ( rule__Or__LhsAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2653:1: ( rule__Or__LhsAssignment_1 )
            {
             before(grammarAccess.getOrAccess().getLhsAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2654:1: ( rule__Or__LhsAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2654:2: rule__Or__LhsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__LhsAssignment_1_in_rule__Or__Group__1__Impl5290);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2664:1: rule__Or__Group__2 : rule__Or__Group__2__Impl rule__Or__Group__3 ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2668:1: ( rule__Or__Group__2__Impl rule__Or__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2669:2: rule__Or__Group__2__Impl rule__Or__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__25320);
            rule__Or__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__3_in_rule__Or__Group__25323);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2676:1: rule__Or__Group__2__Impl : ( 'or' ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2680:1: ( ( 'or' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2681:1: ( 'or' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2681:1: ( 'or' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2682:1: 'or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_2()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Or__Group__2__Impl5351); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2695:1: rule__Or__Group__3 : rule__Or__Group__3__Impl rule__Or__Group__4 ;
    public final void rule__Or__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2699:1: ( rule__Or__Group__3__Impl rule__Or__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2700:2: rule__Or__Group__3__Impl rule__Or__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__3__Impl_in_rule__Or__Group__35382);
            rule__Or__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__4_in_rule__Or__Group__35385);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2707:1: rule__Or__Group__3__Impl : ( ( rule__Or__RhsAssignment_3 ) ) ;
    public final void rule__Or__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2711:1: ( ( ( rule__Or__RhsAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2712:1: ( ( rule__Or__RhsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2712:1: ( ( rule__Or__RhsAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2713:1: ( rule__Or__RhsAssignment_3 )
            {
             before(grammarAccess.getOrAccess().getRhsAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2714:1: ( rule__Or__RhsAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2714:2: rule__Or__RhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__RhsAssignment_3_in_rule__Or__Group__3__Impl5412);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2724:1: rule__Or__Group__4 : rule__Or__Group__4__Impl ;
    public final void rule__Or__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2728:1: ( rule__Or__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2729:2: rule__Or__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__4__Impl_in_rule__Or__Group__45442);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2735:1: rule__Or__Group__4__Impl : ( ')' ) ;
    public final void rule__Or__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2739:1: ( ( ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2740:1: ( ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2740:1: ( ')' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2741:1: ')'
            {
             before(grammarAccess.getOrAccess().getRightParenthesisKeyword_4()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Or__Group__4__Impl5470); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2765:1: rule__AnswerRef__Group__0 : rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1 ;
    public final void rule__AnswerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2769:1: ( rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2770:2: rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__0__Impl_in_rule__AnswerRef__Group__05512);
            rule__AnswerRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__1_in_rule__AnswerRef__Group__05515);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2777:1: rule__AnswerRef__Group__0__Impl : ( 'answer reference:' ) ;
    public final void rule__AnswerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2781:1: ( ( 'answer reference:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2782:1: ( 'answer reference:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2782:1: ( 'answer reference:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2783:1: 'answer reference:'
            {
             before(grammarAccess.getAnswerRefAccess().getAnswerReferenceKeyword_0()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AnswerRef__Group__0__Impl5543); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2796:1: rule__AnswerRef__Group__1 : rule__AnswerRef__Group__1__Impl ;
    public final void rule__AnswerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2800:1: ( rule__AnswerRef__Group__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2801:2: rule__AnswerRef__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__1__Impl_in_rule__AnswerRef__Group__15574);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2807:1: rule__AnswerRef__Group__1__Impl : ( ( rule__AnswerRef__RefersAssignment_1 ) ) ;
    public final void rule__AnswerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2811:1: ( ( ( rule__AnswerRef__RefersAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2812:1: ( ( rule__AnswerRef__RefersAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2812:1: ( ( rule__AnswerRef__RefersAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2813:1: ( rule__AnswerRef__RefersAssignment_1 )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2814:1: ( rule__AnswerRef__RefersAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2814:2: rule__AnswerRef__RefersAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__RefersAssignment_1_in_rule__AnswerRef__Group__1__Impl5601);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2828:1: rule__ChoiceAnswer__Group__0 : rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 ;
    public final void rule__ChoiceAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2832:1: ( rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2833:2: rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__05635);
            rule__ChoiceAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__05638);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2840:1: rule__ChoiceAnswer__Group__0__Impl : ( 'answer choice' ) ;
    public final void rule__ChoiceAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2844:1: ( ( 'answer choice' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2845:1: ( 'answer choice' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2845:1: ( 'answer choice' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2846:1: 'answer choice'
            {
             before(grammarAccess.getChoiceAnswerAccess().getAnswerChoiceKeyword_0()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__ChoiceAnswer__Group__0__Impl5666); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2859:1: rule__ChoiceAnswer__Group__1 : rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 ;
    public final void rule__ChoiceAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2863:1: ( rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2864:2: rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__15697);
            rule__ChoiceAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__15700);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2871:1: rule__ChoiceAnswer__Group__1__Impl : ( ( rule__ChoiceAnswer__NameAssignment_1 ) ) ;
    public final void rule__ChoiceAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2875:1: ( ( ( rule__ChoiceAnswer__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:1: ( ( rule__ChoiceAnswer__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:1: ( ( rule__ChoiceAnswer__NameAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2877:1: ( rule__ChoiceAnswer__NameAssignment_1 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2878:1: ( rule__ChoiceAnswer__NameAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2878:2: rule__ChoiceAnswer__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__NameAssignment_1_in_rule__ChoiceAnswer__Group__1__Impl5727);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2888:1: rule__ChoiceAnswer__Group__2 : rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 ;
    public final void rule__ChoiceAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2892:1: ( rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2893:2: rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__25757);
            rule__ChoiceAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__25760);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2900:1: rule__ChoiceAnswer__Group__2__Impl : ( ':' ) ;
    public final void rule__ChoiceAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2904:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2905:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2905:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2906:1: ':'
            {
             before(grammarAccess.getChoiceAnswerAccess().getColonKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__ChoiceAnswer__Group__2__Impl5788); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2919:1: rule__ChoiceAnswer__Group__3 : rule__ChoiceAnswer__Group__3__Impl ;
    public final void rule__ChoiceAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2923:1: ( rule__ChoiceAnswer__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2924:2: rule__ChoiceAnswer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__35819);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2930:1: rule__ChoiceAnswer__Group__3__Impl : ( ( rule__ChoiceAnswer__TextAssignment_3 ) ) ;
    public final void rule__ChoiceAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2934:1: ( ( ( rule__ChoiceAnswer__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2935:1: ( ( rule__ChoiceAnswer__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2935:1: ( ( rule__ChoiceAnswer__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2936:1: ( rule__ChoiceAnswer__TextAssignment_3 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2937:1: ( rule__ChoiceAnswer__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2937:2: rule__ChoiceAnswer__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__TextAssignment_3_in_rule__ChoiceAnswer__Group__3__Impl5846);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2955:1: rule__FreetextAnswer__Group__0 : rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 ;
    public final void rule__FreetextAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2959:1: ( rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2960:2: rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__05884);
            rule__FreetextAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__05887);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2967:1: rule__FreetextAnswer__Group__0__Impl : ( 'answer text' ) ;
    public final void rule__FreetextAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2971:1: ( ( 'answer text' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2972:1: ( 'answer text' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2972:1: ( 'answer text' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2973:1: 'answer text'
            {
             before(grammarAccess.getFreetextAnswerAccess().getAnswerTextKeyword_0()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__FreetextAnswer__Group__0__Impl5915); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2986:1: rule__FreetextAnswer__Group__1 : rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 ;
    public final void rule__FreetextAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2990:1: ( rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2991:2: rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__15946);
            rule__FreetextAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__15949);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2998:1: rule__FreetextAnswer__Group__1__Impl : ( ( rule__FreetextAnswer__NameAssignment_1 ) ) ;
    public final void rule__FreetextAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3002:1: ( ( ( rule__FreetextAnswer__NameAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3003:1: ( ( rule__FreetextAnswer__NameAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3003:1: ( ( rule__FreetextAnswer__NameAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3004:1: ( rule__FreetextAnswer__NameAssignment_1 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3005:1: ( rule__FreetextAnswer__NameAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3005:2: rule__FreetextAnswer__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__NameAssignment_1_in_rule__FreetextAnswer__Group__1__Impl5976);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3015:1: rule__FreetextAnswer__Group__2 : rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 ;
    public final void rule__FreetextAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3019:1: ( rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3020:2: rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__26006);
            rule__FreetextAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__26009);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3027:1: rule__FreetextAnswer__Group__2__Impl : ( ':' ) ;
    public final void rule__FreetextAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3031:1: ( ( ':' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3032:1: ( ':' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3032:1: ( ':' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3033:1: ':'
            {
             before(grammarAccess.getFreetextAnswerAccess().getColonKeyword_2()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__FreetextAnswer__Group__2__Impl6037); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3046:1: rule__FreetextAnswer__Group__3 : rule__FreetextAnswer__Group__3__Impl ;
    public final void rule__FreetextAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3050:1: ( rule__FreetextAnswer__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3051:2: rule__FreetextAnswer__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__36068);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3057:1: rule__FreetextAnswer__Group__3__Impl : ( ( rule__FreetextAnswer__TextAssignment_3 ) ) ;
    public final void rule__FreetextAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3061:1: ( ( ( rule__FreetextAnswer__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3062:1: ( ( rule__FreetextAnswer__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3062:1: ( ( rule__FreetextAnswer__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3063:1: ( rule__FreetextAnswer__TextAssignment_3 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3064:1: ( rule__FreetextAnswer__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3064:2: rule__FreetextAnswer__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__TextAssignment_3_in_rule__FreetextAnswer__Group__3__Impl6095);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3083:1: rule__Survey__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3087:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3088:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3088:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3089:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16138);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3098:1: rule__Survey__PagesAssignment_3 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3102:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3103:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3103:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3104:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_36169);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3113:1: rule__Survey__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3117:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3118:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3118:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3119:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_46200);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3128:1: rule__QuestionPage__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__QuestionPage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3132:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3133:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3133:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3134:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_16231);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3143:1: rule__QuestionPage__TextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__QuestionPage__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3147:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3148:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3148:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3149:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_2_16262);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3158:1: rule__QuestionPage__QuestionsAssignment_4 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3162:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3163:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3163:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3164:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_46293);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3173:1: rule__QuestionPage__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3177:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3178:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3178:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3179:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_56324);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3188:1: rule__DescriptionPage__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3192:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3193:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3193:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3194:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_16355);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3203:1: rule__DescriptionPage__TextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3207:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3208:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3208:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3209:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_2_16386);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3218:1: rule__ResultPage__TitleAssignment_1 : ( ruleEString ) ;
    public final void rule__ResultPage__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3222:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3223:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3223:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3224:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_16417);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3233:1: rule__ResultPage__TextAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ResultPage__TextAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3237:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3238:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3238:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3239:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_2_16448);
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


    // $ANTLR start "rule__FreetextQuestion__TextAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3248:1: rule__FreetextQuestion__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__FreetextQuestion__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3252:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3253:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3253:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3254:1: ruleEString
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_16479);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__TextAssignment_1"


    // $ANTLR start "rule__FreetextQuestion__OptionalAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3263:1: rule__FreetextQuestion__OptionalAssignment_2 : ( ( 'optional' ) ) ;
    public final void rule__FreetextQuestion__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3267:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3268:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3268:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3269:1: ( 'optional' )
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_2_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3270:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3271:1: 'optional'
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__FreetextQuestion__OptionalAssignment_26515); 
             after(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_2_0()); 

            }

             after(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__OptionalAssignment_2"


    // $ANTLR start "rule__FreetextQuestion__RequiresAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3286:1: rule__FreetextQuestion__RequiresAssignment_3_1 : ( ruleDependency ) ;
    public final void rule__FreetextQuestion__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3290:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3291:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3291:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3292:1: ruleDependency
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_3_16554);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3301:1: rule__FreetextQuestion__AnswersAssignment_5 : ( ruleFreetextAnswer ) ;
    public final void rule__FreetextQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3305:1: ( ( ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3306:1: ( ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3306:1: ( ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3307:1: ruleFreetextAnswer
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_56585);
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


    // $ANTLR start "rule__SingleChoiceQuestion__TextAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3316:1: rule__SingleChoiceQuestion__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__SingleChoiceQuestion__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3320:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3321:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3321:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3322:1: ruleEString
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_16616);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__TextAssignment_1"


    // $ANTLR start "rule__SingleChoiceQuestion__OptionalAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3331:1: rule__SingleChoiceQuestion__OptionalAssignment_2 : ( ( 'optional' ) ) ;
    public final void rule__SingleChoiceQuestion__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3335:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3336:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3336:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3337:1: ( 'optional' )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3338:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3339:1: 'optional'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__SingleChoiceQuestion__OptionalAssignment_26652); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__OptionalAssignment_2"


    // $ANTLR start "rule__SingleChoiceQuestion__RequiresAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3354:1: rule__SingleChoiceQuestion__RequiresAssignment_3_1 : ( ruleDependency ) ;
    public final void rule__SingleChoiceQuestion__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3358:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3359:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3359:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3360:1: ruleDependency
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_3_16691);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3369:1: rule__SingleChoiceQuestion__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3373:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3374:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3374:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3375:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_56722);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3384:1: rule__SingleChoiceQuestion__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3388:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3389:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3389:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3390:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_66753);
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


    // $ANTLR start "rule__MultiChoiceQuestion__TextAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3399:1: rule__MultiChoiceQuestion__TextAssignment_1 : ( ruleEString ) ;
    public final void rule__MultiChoiceQuestion__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3403:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3404:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3404:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3405:1: ruleEString
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_16784);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__TextAssignment_1"


    // $ANTLR start "rule__MultiChoiceQuestion__OptionalAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3414:1: rule__MultiChoiceQuestion__OptionalAssignment_2 : ( ( 'optional' ) ) ;
    public final void rule__MultiChoiceQuestion__OptionalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3418:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3419:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3419:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3420:1: ( 'optional' )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3421:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3422:1: 'optional'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__MultiChoiceQuestion__OptionalAssignment_26820); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__OptionalAssignment_2"


    // $ANTLR start "rule__MultiChoiceQuestion__RequiresAssignment_3_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3437:1: rule__MultiChoiceQuestion__RequiresAssignment_3_1 : ( ruleDependency ) ;
    public final void rule__MultiChoiceQuestion__RequiresAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3441:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3442:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3442:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3443:1: ruleDependency
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_3_16859);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3452:1: rule__MultiChoiceQuestion__AnswersAssignment_5 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3456:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3457:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3457:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3458:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_56890);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3467:1: rule__MultiChoiceQuestion__AnswersAssignment_6 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3471:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3472:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3472:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3473:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_66921);
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


    // $ANTLR start "rule__And__LhsAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3482:1: rule__And__LhsAssignment_1 : ( ruleDependency ) ;
    public final void rule__And__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3486:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3487:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3487:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3488:1: ruleDependency
            {
             before(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__And__LhsAssignment_16952);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3497:1: rule__And__RhsAssignment_3 : ( ruleDependency ) ;
    public final void rule__And__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3501:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3502:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3502:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3503:1: ruleDependency
            {
             before(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__And__RhsAssignment_36983);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3512:1: rule__Or__LhsAssignment_1 : ( ruleDependency ) ;
    public final void rule__Or__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3516:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3517:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3517:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3518:1: ruleDependency
            {
             before(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Or__LhsAssignment_17014);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3527:1: rule__Or__RhsAssignment_3 : ( ruleDependency ) ;
    public final void rule__Or__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3531:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3532:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3532:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3533:1: ruleDependency
            {
             before(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Or__RhsAssignment_37045);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3543:1: rule__AnswerRef__RefersAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__AnswerRef__RefersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3547:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3548:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3548:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3549:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3550:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3551:1: ruleEString
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment_17081);
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


    // $ANTLR start "rule__ChoiceAnswer__NameAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3562:1: rule__ChoiceAnswer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ChoiceAnswer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3566:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3567:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3567:1: ( RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3568:1: RULE_ID
            {
             before(grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__ChoiceAnswer__NameAssignment_17116); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3577:1: rule__ChoiceAnswer__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__ChoiceAnswer__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3581:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3582:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3582:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3583:1: ruleEString
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_37147);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3592:1: rule__FreetextAnswer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FreetextAnswer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3596:1: ( ( RULE_ID ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3597:1: ( RULE_ID )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3597:1: ( RULE_ID )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3598:1: RULE_ID
            {
             before(grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__FreetextAnswer__NameAssignment_17178); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3607:1: rule__FreetextAnswer__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__FreetextAnswer__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3611:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3612:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3612:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3613:1: ruleEString
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_37209);
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
        public static final BitSet FOLLOW_ruleAnswerRef_in_entryRuleAnswerRef905 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnswerRef912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__0_in_ruleAnswerRef938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_entryRuleChoiceAnswer965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleChoiceAnswer972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0_in_ruleChoiceAnswer998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_entryRuleFreetextAnswer1025 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFreetextAnswer1032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0_in_ruleFreetextAnswer1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestionPage_in_rule__Page__Alternatives1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDescriptionPage_in_rule__Page__Alternatives1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResultPage_in_rule__Page__Alternatives1128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextQuestion_in_rule__Question__Alternatives1160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_rule__Question__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiChoiceQuestion_in_rule__Question__Alternatives1194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnd_in_rule__Dependency__Alternatives1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOr_in_rule__Dependency__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswerRef_in_rule__Dependency__Alternatives1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleChoiceAnswer_in_rule__Answer__Alternatives1292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__Answer__Alternatives1309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__0__Impl_in_rule__Survey__Group__01389 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Survey__Group__1_in_rule__Survey__Group__01392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__Survey__Group__0__Impl1420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__1__Impl_in_rule__Survey__Group__11451 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__Survey__Group__2_in_rule__Survey__Group__11454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__TitleAssignment_1_in_rule__Survey__Group__1__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__2__Impl_in_rule__Survey__Group__21511 = new BitSet(new long[]{0x00000000000C4000L});
        public static final BitSet FOLLOW_rule__Survey__Group__3_in_rule__Survey__Group__21514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__Survey__Group__2__Impl1542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31573 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_3_in_rule__Survey__Group__3__Impl1603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41633 = new BitSet(new long[]{0x00000000000C6000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1663 = new BitSet(new long[]{0x00000000000C4002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51694 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group__5__Impl1722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01765 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__QuestionPage__Group__0__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__11827 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__11830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TitleAssignment_1_in_rule__QuestionPage__Group__1__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__21887 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__21890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__0_in_rule__QuestionPage__Group__2__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__31948 = new BitSet(new long[]{0x0000000003100000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__31951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuestionPage__Group__3__Impl1979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42010 = new BitSet(new long[]{0x0000000003110000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_4_in_rule__QuestionPage__Group__4__Impl2040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52070 = new BitSet(new long[]{0x0000000003110000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2100 = new BitSet(new long[]{0x0000000003100002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuestionPage__Group__6__Impl2159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__0__Impl_in_rule__QuestionPage__Group_2__02204 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__1_in_rule__QuestionPage__Group_2__02207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuestionPage__Group_2__0__Impl2235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_2__1__Impl_in_rule__QuestionPage__Group_2__12266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TextAssignment_2_1_in_rule__QuestionPage__Group_2__1__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DescriptionPage__Group__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12389 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TitleAssignment_1_in_rule__DescriptionPage__Group__1__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22449 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__0_in_rule__DescriptionPage__Group__2__Impl2479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__DescriptionPage__Group__3__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__0__Impl_in_rule__DescriptionPage__Group_2__02577 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__1_in_rule__DescriptionPage__Group_2__02580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__DescriptionPage__Group_2__0__Impl2608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_2__1__Impl_in_rule__DescriptionPage__Group_2__12639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TextAssignment_2_1_in_rule__DescriptionPage__Group_2__1__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__02700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__02703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__ResultPage__Group__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__12762 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__12765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TitleAssignment_1_in_rule__ResultPage__Group__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__22822 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__22825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__0_in_rule__ResultPage__Group__2__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__32883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ResultPage__Group__3__Impl2911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__0__Impl_in_rule__ResultPage__Group_2__02950 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__1_in_rule__ResultPage__Group_2__02953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ResultPage__Group_2__0__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_2__1__Impl_in_rule__ResultPage__Group_2__13012 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TextAssignment_2_1_in_rule__ResultPage__Group_2__1__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03073 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__FreetextQuestion__Group__0__Impl3104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13135 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__TextAssignment_1_in_rule__FreetextQuestion__Group__1__Impl3165 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23195 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__OptionalAssignment_2_in_rule__FreetextQuestion__Group__2__Impl3225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33256 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__0_in_rule__FreetextQuestion__Group__3__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43317 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__FreetextQuestion__Group__4__Impl3348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53379 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__AnswersAssignment_5_in_rule__FreetextQuestion__Group__5__Impl3409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63439 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__FreetextQuestion__Group__6__Impl3467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__0__Impl_in_rule__FreetextQuestion__Group_3__03512 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__1_in_rule__FreetextQuestion__Group_3__03515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FreetextQuestion__Group_3__0__Impl3543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_3__1__Impl_in_rule__FreetextQuestion__Group_3__13574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__RequiresAssignment_3_1_in_rule__FreetextQuestion__Group_3__1__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__03635 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__03638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SingleChoiceQuestion__Group__0__Impl3666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__13697 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__13700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__TextAssignment_1_in_rule__SingleChoiceQuestion__Group__1__Impl3727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__23757 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__23760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_2_in_rule__SingleChoiceQuestion__Group__2__Impl3787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__33818 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__33821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__0_in_rule__SingleChoiceQuestion__Group__3__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__43879 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__43882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SingleChoiceQuestion__Group__4__Impl3910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__53941 = new BitSet(new long[]{0x0000000300400000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__53944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_5_in_rule__SingleChoiceQuestion__Group__5__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64001 = new BitSet(new long[]{0x0000000300400000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_6_in_rule__SingleChoiceQuestion__Group__6__Impl4031 = new BitSet(new long[]{0x0000000300000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__SingleChoiceQuestion__Group__7__Impl4090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__0__Impl_in_rule__SingleChoiceQuestion__Group_3__04137 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__1_in_rule__SingleChoiceQuestion__Group_3__04140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SingleChoiceQuestion__Group_3__0__Impl4168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_3__1__Impl_in_rule__SingleChoiceQuestion__Group_3__14199 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_3_1_in_rule__SingleChoiceQuestion__Group_3__1__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04260 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__MultiChoiceQuestion__Group__0__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14322 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__TextAssignment_1_in_rule__MultiChoiceQuestion__Group__1__Impl4352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24382 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_2_in_rule__MultiChoiceQuestion__Group__2__Impl4412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__34443 = new BitSet(new long[]{0x0000000400A00000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__34446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__0_in_rule__MultiChoiceQuestion__Group__3__Impl4473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__44504 = new BitSet(new long[]{0x0000000300000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__44507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MultiChoiceQuestion__Group__4__Impl4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__54566 = new BitSet(new long[]{0x0000000300400000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__54569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_5_in_rule__MultiChoiceQuestion__Group__5__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__64626 = new BitSet(new long[]{0x0000000300400000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__64629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_6_in_rule__MultiChoiceQuestion__Group__6__Impl4656 = new BitSet(new long[]{0x0000000300000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__74687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__MultiChoiceQuestion__Group__7__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__0__Impl_in_rule__MultiChoiceQuestion__Group_3__04762 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__1_in_rule__MultiChoiceQuestion__Group_3__04765 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MultiChoiceQuestion__Group_3__0__Impl4793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_3__1__Impl_in_rule__MultiChoiceQuestion__Group_3__14824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_3_1_in_rule__MultiChoiceQuestion__Group_3__1__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__04885 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__04888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__And__Group__0__Impl4916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__14947 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__And__Group__2_in_rule__And__Group__14950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__LhsAssignment_1_in_rule__And__Group__1__Impl4977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__2__Impl_in_rule__And__Group__25007 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__And__Group__3_in_rule__And__Group__25010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__And__Group__2__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__3__Impl_in_rule__And__Group__35069 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__And__Group__4_in_rule__And__Group__35072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__RhsAssignment_3_in_rule__And__Group__3__Impl5099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__4__Impl_in_rule__And__Group__45129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__And__Group__4__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05198 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05201 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Or__Group__0__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__15260 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__15263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__LhsAssignment_1_in_rule__Or__Group__1__Impl5290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__25320 = new BitSet(new long[]{0x00000000A4000000L});
        public static final BitSet FOLLOW_rule__Or__Group__3_in_rule__Or__Group__25323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Or__Group__2__Impl5351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__3__Impl_in_rule__Or__Group__35382 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Or__Group__4_in_rule__Or__Group__35385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__RhsAssignment_3_in_rule__Or__Group__3__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__4__Impl_in_rule__Or__Group__45442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Or__Group__4__Impl5470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__0__Impl_in_rule__AnswerRef__Group__05512 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__1_in_rule__AnswerRef__Group__05515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AnswerRef__Group__0__Impl5543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__1__Impl_in_rule__AnswerRef__Group__15574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__RefersAssignment_1_in_rule__AnswerRef__Group__1__Impl5601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__05635 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__05638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__ChoiceAnswer__Group__0__Impl5666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__15697 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__15700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__NameAssignment_1_in_rule__ChoiceAnswer__Group__1__Impl5727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__25757 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__25760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ChoiceAnswer__Group__2__Impl5788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__35819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__TextAssignment_3_in_rule__ChoiceAnswer__Group__3__Impl5846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__05884 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__05887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__FreetextAnswer__Group__0__Impl5915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__15946 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__15949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__NameAssignment_1_in_rule__FreetextAnswer__Group__1__Impl5976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__26006 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__26009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__FreetextAnswer__Group__2__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__36068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__TextAssignment_3_in_rule__FreetextAnswer__Group__3__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_16138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_36169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_46200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_16231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_2_16262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_46293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_56324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_16355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_2_16386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_16417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_2_16448 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_16479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__FreetextQuestion__OptionalAssignment_26515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_3_16554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_56585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_16616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__SingleChoiceQuestion__OptionalAssignment_26652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_3_16691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_56722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_66753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_16784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__MultiChoiceQuestion__OptionalAssignment_26820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_3_16859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_56890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_66921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__And__LhsAssignment_16952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__And__RhsAssignment_36983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Or__LhsAssignment_17014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Or__RhsAssignment_37045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment_17081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__ChoiceAnswer__NameAssignment_17116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_37147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__FreetextAnswer__NameAssignment_17178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_37209 = new BitSet(new long[]{0x0000000000000002L});
    }


}