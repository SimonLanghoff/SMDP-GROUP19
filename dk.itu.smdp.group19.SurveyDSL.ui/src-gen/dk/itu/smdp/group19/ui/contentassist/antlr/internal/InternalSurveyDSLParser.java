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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'start survey'", "'title:'", "'pages:'", "'end survey'", "','", "'add question page'", "'questions:'", "'text:'", "'add description page'", "'add result page'", "'add'", "'freetext question'", "'answers:'", "'requires:'", "'single choice question'", "'multi choice question'", "'('", "'and'", "')'", "'Or'", "'{'", "'lhs'", "'rhs'", "'}'", "'AnswerRef'", "'refers'", "'ChoiceAnswer'", "'text'", "'FreetextAnswer'", "'input'", "'optional'", "'selected'"
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
            case 16:
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
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    switch ( input.LA(3) ) {
                    case 22:
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
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 22:
                    {
                    alt2=1;
                    }
                    break;
                case 26:
                    {
                    alt2=3;
                    }
                    break;
                case 25:
                    {
                    alt2=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

            }
            else {
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
            case 35:
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

            if ( (LA4_0==42) ) {
                alt4=1;
            }
            else if ( (LA4_0==39) ) {
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:832:1: rule__Survey__Group__5__Impl : ( ( rule__Survey__Group_5__0 )* ) ;
    public final void rule__Survey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:836:1: ( ( ( rule__Survey__Group_5__0 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:837:1: ( ( rule__Survey__Group_5__0 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:837:1: ( ( rule__Survey__Group_5__0 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:838:1: ( rule__Survey__Group_5__0 )*
            {
             before(grammarAccess.getSurveyAccess().getGroup_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:839:1: ( rule__Survey__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:839:2: rule__Survey__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__0_in_rule__Survey__Group__5__Impl1723);
            	    rule__Survey__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSurveyAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Survey__Group_5__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:893:1: rule__Survey__Group_5__0 : rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1 ;
    public final void rule__Survey__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:897:1: ( rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:898:2: rule__Survey__Group_5__0__Impl rule__Survey__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__0__Impl_in_rule__Survey__Group_5__01827);
            rule__Survey__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__1_in_rule__Survey__Group_5__01830);
            rule__Survey__Group_5__1();

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
    // $ANTLR end "rule__Survey__Group_5__0"


    // $ANTLR start "rule__Survey__Group_5__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:905:1: rule__Survey__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Survey__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:909:1: ( ( ',' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:910:1: ( ',' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:910:1: ( ',' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:911:1: ','
            {
             before(grammarAccess.getSurveyAccess().getCommaKeyword_5_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Survey__Group_5__0__Impl1858); 
             after(grammarAccess.getSurveyAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_5__0__Impl"


    // $ANTLR start "rule__Survey__Group_5__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:924:1: rule__Survey__Group_5__1 : rule__Survey__Group_5__1__Impl ;
    public final void rule__Survey__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:928:1: ( rule__Survey__Group_5__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:929:2: rule__Survey__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__Group_5__1__Impl_in_rule__Survey__Group_5__11889);
            rule__Survey__Group_5__1__Impl();

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
    // $ANTLR end "rule__Survey__Group_5__1"


    // $ANTLR start "rule__Survey__Group_5__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:935:1: rule__Survey__Group_5__1__Impl : ( ( rule__Survey__PagesAssignment_5_1 ) ) ;
    public final void rule__Survey__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:939:1: ( ( ( rule__Survey__PagesAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:940:1: ( ( rule__Survey__PagesAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:940:1: ( ( rule__Survey__PagesAssignment_5_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:941:1: ( rule__Survey__PagesAssignment_5_1 )
            {
             before(grammarAccess.getSurveyAccess().getPagesAssignment_5_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:942:1: ( rule__Survey__PagesAssignment_5_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:942:2: rule__Survey__PagesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Survey__PagesAssignment_5_1_in_rule__Survey__Group_5__1__Impl1916);
            rule__Survey__PagesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSurveyAccess().getPagesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__Group_5__1__Impl"


    // $ANTLR start "rule__QuestionPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:956:1: rule__QuestionPage__Group__0 : rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 ;
    public final void rule__QuestionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:960:1: ( rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:961:2: rule__QuestionPage__Group__0__Impl rule__QuestionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01950);
            rule__QuestionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01953);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:968:1: rule__QuestionPage__Group__0__Impl : ( 'add question page' ) ;
    public final void rule__QuestionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:972:1: ( ( 'add question page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:973:1: ( 'add question page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:973:1: ( 'add question page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:974:1: 'add question page'
            {
             before(grammarAccess.getQuestionPageAccess().getAddQuestionPageKeyword_0()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__QuestionPage__Group__0__Impl1981); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:987:1: rule__QuestionPage__Group__1 : rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 ;
    public final void rule__QuestionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:991:1: ( rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:992:2: rule__QuestionPage__Group__1__Impl rule__QuestionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__12012);
            rule__QuestionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__12015);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:999:1: rule__QuestionPage__Group__1__Impl : ( 'title:' ) ;
    public final void rule__QuestionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1003:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1004:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1004:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1005:1: 'title:'
            {
             before(grammarAccess.getQuestionPageAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__QuestionPage__Group__1__Impl2043); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1018:1: rule__QuestionPage__Group__2 : rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 ;
    public final void rule__QuestionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1022:1: ( rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1023:2: rule__QuestionPage__Group__2__Impl rule__QuestionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__22074);
            rule__QuestionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__22077);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1030:1: rule__QuestionPage__Group__2__Impl : ( ( rule__QuestionPage__TitleAssignment_2 ) ) ;
    public final void rule__QuestionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1034:1: ( ( ( rule__QuestionPage__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1035:1: ( ( rule__QuestionPage__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1035:1: ( ( rule__QuestionPage__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1036:1: ( rule__QuestionPage__TitleAssignment_2 )
            {
             before(grammarAccess.getQuestionPageAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1037:1: ( rule__QuestionPage__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1037:2: rule__QuestionPage__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TitleAssignment_2_in_rule__QuestionPage__Group__2__Impl2104);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1047:1: rule__QuestionPage__Group__3 : rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 ;
    public final void rule__QuestionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1051:1: ( rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1052:2: rule__QuestionPage__Group__3__Impl rule__QuestionPage__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__32134);
            rule__QuestionPage__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__32137);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1059:1: rule__QuestionPage__Group__3__Impl : ( ( rule__QuestionPage__Group_3__0 )? ) ;
    public final void rule__QuestionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1063:1: ( ( ( rule__QuestionPage__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1064:1: ( ( rule__QuestionPage__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1064:1: ( ( rule__QuestionPage__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1065:1: ( rule__QuestionPage__Group_3__0 )?
            {
             before(grammarAccess.getQuestionPageAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1066:1: ( rule__QuestionPage__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1066:2: rule__QuestionPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__0_in_rule__QuestionPage__Group__3__Impl2164);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1076:1: rule__QuestionPage__Group__4 : rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 ;
    public final void rule__QuestionPage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1080:1: ( rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1081:2: rule__QuestionPage__Group__4__Impl rule__QuestionPage__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42195);
            rule__QuestionPage__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42198);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1088:1: rule__QuestionPage__Group__4__Impl : ( 'questions:' ) ;
    public final void rule__QuestionPage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1092:1: ( ( 'questions:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1093:1: ( 'questions:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1093:1: ( 'questions:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1094:1: 'questions:'
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__QuestionPage__Group__4__Impl2226); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1107:1: rule__QuestionPage__Group__5 : rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 ;
    public final void rule__QuestionPage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1111:1: ( rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1112:2: rule__QuestionPage__Group__5__Impl rule__QuestionPage__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52257);
            rule__QuestionPage__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52260);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1119:1: rule__QuestionPage__Group__5__Impl : ( ( rule__QuestionPage__QuestionsAssignment_5 ) ) ;
    public final void rule__QuestionPage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1123:1: ( ( ( rule__QuestionPage__QuestionsAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1124:1: ( ( rule__QuestionPage__QuestionsAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1124:1: ( ( rule__QuestionPage__QuestionsAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1125:1: ( rule__QuestionPage__QuestionsAssignment_5 )
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1126:1: ( rule__QuestionPage__QuestionsAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1126:2: rule__QuestionPage__QuestionsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2287);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1136:1: rule__QuestionPage__Group__6 : rule__QuestionPage__Group__6__Impl ;
    public final void rule__QuestionPage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1140:1: ( rule__QuestionPage__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1141:2: rule__QuestionPage__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62317);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1147:1: rule__QuestionPage__Group__6__Impl : ( ( rule__QuestionPage__Group_6__0 )* ) ;
    public final void rule__QuestionPage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1151:1: ( ( ( rule__QuestionPage__Group_6__0 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1152:1: ( ( rule__QuestionPage__Group_6__0 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1152:1: ( ( rule__QuestionPage__Group_6__0 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1153:1: ( rule__QuestionPage__Group_6__0 )*
            {
             before(grammarAccess.getQuestionPageAccess().getGroup_6()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1154:1: ( rule__QuestionPage__Group_6__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    int LA8_2 = input.LA(2);

                    if ( (LA8_2==21) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1154:2: rule__QuestionPage__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_6__0_in_rule__QuestionPage__Group__6__Impl2344);
            	    rule__QuestionPage__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getQuestionPageAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__QuestionPage__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1178:1: rule__QuestionPage__Group_3__0 : rule__QuestionPage__Group_3__0__Impl rule__QuestionPage__Group_3__1 ;
    public final void rule__QuestionPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1182:1: ( rule__QuestionPage__Group_3__0__Impl rule__QuestionPage__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1183:2: rule__QuestionPage__Group_3__0__Impl rule__QuestionPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__0__Impl_in_rule__QuestionPage__Group_3__02389);
            rule__QuestionPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__1_in_rule__QuestionPage__Group_3__02392);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1190:1: rule__QuestionPage__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__QuestionPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1194:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1195:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1195:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1196:1: 'text:'
            {
             before(grammarAccess.getQuestionPageAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__QuestionPage__Group_3__0__Impl2420); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1209:1: rule__QuestionPage__Group_3__1 : rule__QuestionPage__Group_3__1__Impl ;
    public final void rule__QuestionPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1213:1: ( rule__QuestionPage__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1214:2: rule__QuestionPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_3__1__Impl_in_rule__QuestionPage__Group_3__12451);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1220:1: rule__QuestionPage__Group_3__1__Impl : ( ( rule__QuestionPage__TextAssignment_3_1 ) ) ;
    public final void rule__QuestionPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1224:1: ( ( ( rule__QuestionPage__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1225:1: ( ( rule__QuestionPage__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1225:1: ( ( rule__QuestionPage__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1226:1: ( rule__QuestionPage__TextAssignment_3_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1227:1: ( rule__QuestionPage__TextAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1227:2: rule__QuestionPage__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__TextAssignment_3_1_in_rule__QuestionPage__Group_3__1__Impl2478);
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


    // $ANTLR start "rule__QuestionPage__Group_6__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1241:1: rule__QuestionPage__Group_6__0 : rule__QuestionPage__Group_6__0__Impl rule__QuestionPage__Group_6__1 ;
    public final void rule__QuestionPage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1245:1: ( rule__QuestionPage__Group_6__0__Impl rule__QuestionPage__Group_6__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1246:2: rule__QuestionPage__Group_6__0__Impl rule__QuestionPage__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_6__0__Impl_in_rule__QuestionPage__Group_6__02512);
            rule__QuestionPage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_6__1_in_rule__QuestionPage__Group_6__02515);
            rule__QuestionPage__Group_6__1();

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
    // $ANTLR end "rule__QuestionPage__Group_6__0"


    // $ANTLR start "rule__QuestionPage__Group_6__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1253:1: rule__QuestionPage__Group_6__0__Impl : ( ',' ) ;
    public final void rule__QuestionPage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1257:1: ( ( ',' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1258:1: ( ',' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1258:1: ( ',' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1259:1: ','
            {
             before(grammarAccess.getQuestionPageAccess().getCommaKeyword_6_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__QuestionPage__Group_6__0__Impl2543); 
             after(grammarAccess.getQuestionPageAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group_6__0__Impl"


    // $ANTLR start "rule__QuestionPage__Group_6__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1272:1: rule__QuestionPage__Group_6__1 : rule__QuestionPage__Group_6__1__Impl ;
    public final void rule__QuestionPage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1276:1: ( rule__QuestionPage__Group_6__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1277:2: rule__QuestionPage__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__Group_6__1__Impl_in_rule__QuestionPage__Group_6__12574);
            rule__QuestionPage__Group_6__1__Impl();

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
    // $ANTLR end "rule__QuestionPage__Group_6__1"


    // $ANTLR start "rule__QuestionPage__Group_6__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1283:1: rule__QuestionPage__Group_6__1__Impl : ( ( rule__QuestionPage__QuestionsAssignment_6_1 ) ) ;
    public final void rule__QuestionPage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1287:1: ( ( ( rule__QuestionPage__QuestionsAssignment_6_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1288:1: ( ( rule__QuestionPage__QuestionsAssignment_6_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1288:1: ( ( rule__QuestionPage__QuestionsAssignment_6_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1289:1: ( rule__QuestionPage__QuestionsAssignment_6_1 )
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_6_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:1: ( rule__QuestionPage__QuestionsAssignment_6_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1290:2: rule__QuestionPage__QuestionsAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QuestionPage__QuestionsAssignment_6_1_in_rule__QuestionPage__Group_6__1__Impl2601);
            rule__QuestionPage__QuestionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__Group_6__1__Impl"


    // $ANTLR start "rule__DescriptionPage__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1304:1: rule__DescriptionPage__Group__0 : rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 ;
    public final void rule__DescriptionPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1308:1: ( rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1309:2: rule__DescriptionPage__Group__0__Impl rule__DescriptionPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02635);
            rule__DescriptionPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02638);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1316:1: rule__DescriptionPage__Group__0__Impl : ( 'add description page' ) ;
    public final void rule__DescriptionPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1320:1: ( ( 'add description page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:1: ( 'add description page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1321:1: ( 'add description page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1322:1: 'add description page'
            {
             before(grammarAccess.getDescriptionPageAccess().getAddDescriptionPageKeyword_0()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DescriptionPage__Group__0__Impl2666); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1335:1: rule__DescriptionPage__Group__1 : rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 ;
    public final void rule__DescriptionPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1339:1: ( rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1340:2: rule__DescriptionPage__Group__1__Impl rule__DescriptionPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12697);
            rule__DescriptionPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12700);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1347:1: rule__DescriptionPage__Group__1__Impl : ( 'title:' ) ;
    public final void rule__DescriptionPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1351:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1352:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1352:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1353:1: 'title:'
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__DescriptionPage__Group__1__Impl2728); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1366:1: rule__DescriptionPage__Group__2 : rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 ;
    public final void rule__DescriptionPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1370:1: ( rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1371:2: rule__DescriptionPage__Group__2__Impl rule__DescriptionPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22759);
            rule__DescriptionPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22762);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1378:1: rule__DescriptionPage__Group__2__Impl : ( ( rule__DescriptionPage__TitleAssignment_2 ) ) ;
    public final void rule__DescriptionPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1382:1: ( ( ( rule__DescriptionPage__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1383:1: ( ( rule__DescriptionPage__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1383:1: ( ( rule__DescriptionPage__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1384:1: ( rule__DescriptionPage__TitleAssignment_2 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1385:1: ( rule__DescriptionPage__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1385:2: rule__DescriptionPage__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TitleAssignment_2_in_rule__DescriptionPage__Group__2__Impl2789);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1395:1: rule__DescriptionPage__Group__3 : rule__DescriptionPage__Group__3__Impl ;
    public final void rule__DescriptionPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1399:1: ( rule__DescriptionPage__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1400:2: rule__DescriptionPage__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32819);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1406:1: rule__DescriptionPage__Group__3__Impl : ( ( rule__DescriptionPage__Group_3__0 )? ) ;
    public final void rule__DescriptionPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1410:1: ( ( ( rule__DescriptionPage__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1411:1: ( ( rule__DescriptionPage__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1411:1: ( ( rule__DescriptionPage__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1412:1: ( rule__DescriptionPage__Group_3__0 )?
            {
             before(grammarAccess.getDescriptionPageAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1413:1: ( rule__DescriptionPage__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1413:2: rule__DescriptionPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__0_in_rule__DescriptionPage__Group__3__Impl2846);
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


    // $ANTLR start "rule__DescriptionPage__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1431:1: rule__DescriptionPage__Group_3__0 : rule__DescriptionPage__Group_3__0__Impl rule__DescriptionPage__Group_3__1 ;
    public final void rule__DescriptionPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1435:1: ( rule__DescriptionPage__Group_3__0__Impl rule__DescriptionPage__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1436:2: rule__DescriptionPage__Group_3__0__Impl rule__DescriptionPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__0__Impl_in_rule__DescriptionPage__Group_3__02885);
            rule__DescriptionPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__1_in_rule__DescriptionPage__Group_3__02888);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1443:1: rule__DescriptionPage__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__DescriptionPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1447:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1448:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1448:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1449:1: 'text:'
            {
             before(grammarAccess.getDescriptionPageAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__DescriptionPage__Group_3__0__Impl2916); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1462:1: rule__DescriptionPage__Group_3__1 : rule__DescriptionPage__Group_3__1__Impl ;
    public final void rule__DescriptionPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1466:1: ( rule__DescriptionPage__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1467:2: rule__DescriptionPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__Group_3__1__Impl_in_rule__DescriptionPage__Group_3__12947);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1473:1: rule__DescriptionPage__Group_3__1__Impl : ( ( rule__DescriptionPage__TextAssignment_3_1 ) ) ;
    public final void rule__DescriptionPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1477:1: ( ( ( rule__DescriptionPage__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1478:1: ( ( rule__DescriptionPage__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1478:1: ( ( rule__DescriptionPage__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1479:1: ( rule__DescriptionPage__TextAssignment_3_1 )
            {
             before(grammarAccess.getDescriptionPageAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1480:1: ( rule__DescriptionPage__TextAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1480:2: rule__DescriptionPage__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DescriptionPage__TextAssignment_3_1_in_rule__DescriptionPage__Group_3__1__Impl2974);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1494:1: rule__ResultPage__Group__0 : rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 ;
    public final void rule__ResultPage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1498:1: ( rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1499:2: rule__ResultPage__Group__0__Impl rule__ResultPage__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__03008);
            rule__ResultPage__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__03011);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1506:1: rule__ResultPage__Group__0__Impl : ( 'add result page' ) ;
    public final void rule__ResultPage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1510:1: ( ( 'add result page' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1511:1: ( 'add result page' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1511:1: ( 'add result page' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1512:1: 'add result page'
            {
             before(grammarAccess.getResultPageAccess().getAddResultPageKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__ResultPage__Group__0__Impl3039); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1525:1: rule__ResultPage__Group__1 : rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 ;
    public final void rule__ResultPage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1529:1: ( rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1530:2: rule__ResultPage__Group__1__Impl rule__ResultPage__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__13070);
            rule__ResultPage__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__13073);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1537:1: rule__ResultPage__Group__1__Impl : ( 'title:' ) ;
    public final void rule__ResultPage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1541:1: ( ( 'title:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1542:1: ( 'title:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1542:1: ( 'title:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1543:1: 'title:'
            {
             before(grammarAccess.getResultPageAccess().getTitleKeyword_1()); 
            match(input,12,FollowSets000.FOLLOW_12_in_rule__ResultPage__Group__1__Impl3101); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1556:1: rule__ResultPage__Group__2 : rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 ;
    public final void rule__ResultPage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1560:1: ( rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1561:2: rule__ResultPage__Group__2__Impl rule__ResultPage__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__23132);
            rule__ResultPage__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__23135);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1568:1: rule__ResultPage__Group__2__Impl : ( ( rule__ResultPage__TitleAssignment_2 ) ) ;
    public final void rule__ResultPage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1572:1: ( ( ( rule__ResultPage__TitleAssignment_2 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1573:1: ( ( rule__ResultPage__TitleAssignment_2 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1573:1: ( ( rule__ResultPage__TitleAssignment_2 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1574:1: ( rule__ResultPage__TitleAssignment_2 )
            {
             before(grammarAccess.getResultPageAccess().getTitleAssignment_2()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1575:1: ( rule__ResultPage__TitleAssignment_2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1575:2: rule__ResultPage__TitleAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TitleAssignment_2_in_rule__ResultPage__Group__2__Impl3162);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1585:1: rule__ResultPage__Group__3 : rule__ResultPage__Group__3__Impl ;
    public final void rule__ResultPage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1589:1: ( rule__ResultPage__Group__3__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1590:2: rule__ResultPage__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__33192);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1596:1: rule__ResultPage__Group__3__Impl : ( ( rule__ResultPage__Group_3__0 )? ) ;
    public final void rule__ResultPage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1600:1: ( ( ( rule__ResultPage__Group_3__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1601:1: ( ( rule__ResultPage__Group_3__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1601:1: ( ( rule__ResultPage__Group_3__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1602:1: ( rule__ResultPage__Group_3__0 )?
            {
             before(grammarAccess.getResultPageAccess().getGroup_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1603:1: ( rule__ResultPage__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1603:2: rule__ResultPage__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__0_in_rule__ResultPage__Group__3__Impl3219);
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


    // $ANTLR start "rule__ResultPage__Group_3__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1621:1: rule__ResultPage__Group_3__0 : rule__ResultPage__Group_3__0__Impl rule__ResultPage__Group_3__1 ;
    public final void rule__ResultPage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1625:1: ( rule__ResultPage__Group_3__0__Impl rule__ResultPage__Group_3__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1626:2: rule__ResultPage__Group_3__0__Impl rule__ResultPage__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__0__Impl_in_rule__ResultPage__Group_3__03258);
            rule__ResultPage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__1_in_rule__ResultPage__Group_3__03261);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1633:1: rule__ResultPage__Group_3__0__Impl : ( 'text:' ) ;
    public final void rule__ResultPage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1637:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1638:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1638:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1639:1: 'text:'
            {
             before(grammarAccess.getResultPageAccess().getTextKeyword_3_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__ResultPage__Group_3__0__Impl3289); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1652:1: rule__ResultPage__Group_3__1 : rule__ResultPage__Group_3__1__Impl ;
    public final void rule__ResultPage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1656:1: ( rule__ResultPage__Group_3__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1657:2: rule__ResultPage__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__Group_3__1__Impl_in_rule__ResultPage__Group_3__13320);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1663:1: rule__ResultPage__Group_3__1__Impl : ( ( rule__ResultPage__TextAssignment_3_1 ) ) ;
    public final void rule__ResultPage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1667:1: ( ( ( rule__ResultPage__TextAssignment_3_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1668:1: ( ( rule__ResultPage__TextAssignment_3_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1668:1: ( ( rule__ResultPage__TextAssignment_3_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1669:1: ( rule__ResultPage__TextAssignment_3_1 )
            {
             before(grammarAccess.getResultPageAccess().getTextAssignment_3_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1670:1: ( rule__ResultPage__TextAssignment_3_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1670:2: rule__ResultPage__TextAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ResultPage__TextAssignment_3_1_in_rule__ResultPage__Group_3__1__Impl3347);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1684:1: rule__FreetextQuestion__Group__0 : rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 ;
    public final void rule__FreetextQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1688:1: ( rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1689:2: rule__FreetextQuestion__Group__0__Impl rule__FreetextQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03381);
            rule__FreetextQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03384);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1696:1: rule__FreetextQuestion__Group__0__Impl : ( 'add' ) ;
    public final void rule__FreetextQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1700:1: ( ( 'add' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1701:1: ( 'add' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1701:1: ( 'add' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1702:1: 'add'
            {
             before(grammarAccess.getFreetextQuestionAccess().getAddKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__FreetextQuestion__Group__0__Impl3412); 
             after(grammarAccess.getFreetextQuestionAccess().getAddKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1715:1: rule__FreetextQuestion__Group__1 : rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 ;
    public final void rule__FreetextQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1719:1: ( rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1720:2: rule__FreetextQuestion__Group__1__Impl rule__FreetextQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13443);
            rule__FreetextQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13446);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1727:1: rule__FreetextQuestion__Group__1__Impl : ( ( rule__FreetextQuestion__OptionalAssignment_1 )? ) ;
    public final void rule__FreetextQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1731:1: ( ( ( rule__FreetextQuestion__OptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1732:1: ( ( rule__FreetextQuestion__OptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1732:1: ( ( rule__FreetextQuestion__OptionalAssignment_1 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1733:1: ( rule__FreetextQuestion__OptionalAssignment_1 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1734:1: ( rule__FreetextQuestion__OptionalAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1734:2: rule__FreetextQuestion__OptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__OptionalAssignment_1_in_rule__FreetextQuestion__Group__1__Impl3473);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1744:1: rule__FreetextQuestion__Group__2 : rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 ;
    public final void rule__FreetextQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1748:1: ( rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1749:2: rule__FreetextQuestion__Group__2__Impl rule__FreetextQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23504);
            rule__FreetextQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23507);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1756:1: rule__FreetextQuestion__Group__2__Impl : ( 'freetext question' ) ;
    public final void rule__FreetextQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1760:1: ( ( 'freetext question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1761:1: ( 'freetext question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1761:1: ( 'freetext question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1762:1: 'freetext question'
            {
             before(grammarAccess.getFreetextQuestionAccess().getFreetextQuestionKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__FreetextQuestion__Group__2__Impl3535); 
             after(grammarAccess.getFreetextQuestionAccess().getFreetextQuestionKeyword_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1775:1: rule__FreetextQuestion__Group__3 : rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 ;
    public final void rule__FreetextQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1779:1: ( rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1780:2: rule__FreetextQuestion__Group__3__Impl rule__FreetextQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33566);
            rule__FreetextQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33569);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1787:1: rule__FreetextQuestion__Group__3__Impl : ( 'text:' ) ;
    public final void rule__FreetextQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1791:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1792:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1792:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1793:1: 'text:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__FreetextQuestion__Group__3__Impl3597); 
             after(grammarAccess.getFreetextQuestionAccess().getTextKeyword_3()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1806:1: rule__FreetextQuestion__Group__4 : rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 ;
    public final void rule__FreetextQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1810:1: ( rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1811:2: rule__FreetextQuestion__Group__4__Impl rule__FreetextQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43628);
            rule__FreetextQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43631);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1818:1: rule__FreetextQuestion__Group__4__Impl : ( ( rule__FreetextQuestion__TextAssignment_4 ) ) ;
    public final void rule__FreetextQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1822:1: ( ( ( rule__FreetextQuestion__TextAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1823:1: ( ( rule__FreetextQuestion__TextAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1823:1: ( ( rule__FreetextQuestion__TextAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1824:1: ( rule__FreetextQuestion__TextAssignment_4 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1825:1: ( rule__FreetextQuestion__TextAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1825:2: rule__FreetextQuestion__TextAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__TextAssignment_4_in_rule__FreetextQuestion__Group__4__Impl3658);
            rule__FreetextQuestion__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getTextAssignment_4()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1835:1: rule__FreetextQuestion__Group__5 : rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 ;
    public final void rule__FreetextQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1839:1: ( rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1840:2: rule__FreetextQuestion__Group__5__Impl rule__FreetextQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53688);
            rule__FreetextQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53691);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1847:1: rule__FreetextQuestion__Group__5__Impl : ( ( rule__FreetextQuestion__Group_5__0 )? ) ;
    public final void rule__FreetextQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1851:1: ( ( ( rule__FreetextQuestion__Group_5__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1852:1: ( ( rule__FreetextQuestion__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1852:1: ( ( rule__FreetextQuestion__Group_5__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1853:1: ( rule__FreetextQuestion__Group_5__0 )?
            {
             before(grammarAccess.getFreetextQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1854:1: ( rule__FreetextQuestion__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1854:2: rule__FreetextQuestion__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_5__0_in_rule__FreetextQuestion__Group__5__Impl3718);
                    rule__FreetextQuestion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFreetextQuestionAccess().getGroup_5()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1864:1: rule__FreetextQuestion__Group__6 : rule__FreetextQuestion__Group__6__Impl rule__FreetextQuestion__Group__7 ;
    public final void rule__FreetextQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1868:1: ( rule__FreetextQuestion__Group__6__Impl rule__FreetextQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1869:2: rule__FreetextQuestion__Group__6__Impl rule__FreetextQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63749);
            rule__FreetextQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__7_in_rule__FreetextQuestion__Group__63752);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1876:1: rule__FreetextQuestion__Group__6__Impl : ( 'answers:' ) ;
    public final void rule__FreetextQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1880:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1881:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1881:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1882:1: 'answers:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__FreetextQuestion__Group__6__Impl3780); 
             after(grammarAccess.getFreetextQuestionAccess().getAnswersKeyword_6()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1895:1: rule__FreetextQuestion__Group__7 : rule__FreetextQuestion__Group__7__Impl ;
    public final void rule__FreetextQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1899:1: ( rule__FreetextQuestion__Group__7__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1900:2: rule__FreetextQuestion__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group__7__Impl_in_rule__FreetextQuestion__Group__73811);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1906:1: rule__FreetextQuestion__Group__7__Impl : ( ( rule__FreetextQuestion__AnswersAssignment_7 ) ) ;
    public final void rule__FreetextQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1910:1: ( ( ( rule__FreetextQuestion__AnswersAssignment_7 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1911:1: ( ( rule__FreetextQuestion__AnswersAssignment_7 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1911:1: ( ( rule__FreetextQuestion__AnswersAssignment_7 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1912:1: ( rule__FreetextQuestion__AnswersAssignment_7 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1913:1: ( rule__FreetextQuestion__AnswersAssignment_7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1913:2: rule__FreetextQuestion__AnswersAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__AnswersAssignment_7_in_rule__FreetextQuestion__Group__7__Impl3838);
            rule__FreetextQuestion__AnswersAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__FreetextQuestion__Group_5__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1939:1: rule__FreetextQuestion__Group_5__0 : rule__FreetextQuestion__Group_5__0__Impl rule__FreetextQuestion__Group_5__1 ;
    public final void rule__FreetextQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1943:1: ( rule__FreetextQuestion__Group_5__0__Impl rule__FreetextQuestion__Group_5__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1944:2: rule__FreetextQuestion__Group_5__0__Impl rule__FreetextQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_5__0__Impl_in_rule__FreetextQuestion__Group_5__03884);
            rule__FreetextQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_5__1_in_rule__FreetextQuestion__Group_5__03887);
            rule__FreetextQuestion__Group_5__1();

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
    // $ANTLR end "rule__FreetextQuestion__Group_5__0"


    // $ANTLR start "rule__FreetextQuestion__Group_5__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1951:1: rule__FreetextQuestion__Group_5__0__Impl : ( 'requires:' ) ;
    public final void rule__FreetextQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1955:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1956:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1956:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1957:1: 'requires:'
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__FreetextQuestion__Group_5__0__Impl3915); 
             after(grammarAccess.getFreetextQuestionAccess().getRequiresKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group_5__0__Impl"


    // $ANTLR start "rule__FreetextQuestion__Group_5__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1970:1: rule__FreetextQuestion__Group_5__1 : rule__FreetextQuestion__Group_5__1__Impl ;
    public final void rule__FreetextQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1974:1: ( rule__FreetextQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1975:2: rule__FreetextQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__Group_5__1__Impl_in_rule__FreetextQuestion__Group_5__13946);
            rule__FreetextQuestion__Group_5__1__Impl();

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
    // $ANTLR end "rule__FreetextQuestion__Group_5__1"


    // $ANTLR start "rule__FreetextQuestion__Group_5__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1981:1: rule__FreetextQuestion__Group_5__1__Impl : ( ( rule__FreetextQuestion__RequiresAssignment_5_1 ) ) ;
    public final void rule__FreetextQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1985:1: ( ( ( rule__FreetextQuestion__RequiresAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1986:1: ( ( rule__FreetextQuestion__RequiresAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1986:1: ( ( rule__FreetextQuestion__RequiresAssignment_5_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1987:1: ( rule__FreetextQuestion__RequiresAssignment_5_1 )
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_5_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1988:1: ( rule__FreetextQuestion__RequiresAssignment_5_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:1988:2: rule__FreetextQuestion__RequiresAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextQuestion__RequiresAssignment_5_1_in_rule__FreetextQuestion__Group_5__1__Impl3973);
            rule__FreetextQuestion__RequiresAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__Group_5__1__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2002:1: rule__SingleChoiceQuestion__Group__0 : rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 ;
    public final void rule__SingleChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2006:1: ( rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2007:2: rule__SingleChoiceQuestion__Group__0__Impl rule__SingleChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__04007);
            rule__SingleChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__04010);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2014:1: rule__SingleChoiceQuestion__Group__0__Impl : ( 'add' ) ;
    public final void rule__SingleChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2018:1: ( ( 'add' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2019:1: ( 'add' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2019:1: ( 'add' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2020:1: 'add'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAddKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__SingleChoiceQuestion__Group__0__Impl4038); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getAddKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2033:1: rule__SingleChoiceQuestion__Group__1 : rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 ;
    public final void rule__SingleChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2037:1: ( rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2038:2: rule__SingleChoiceQuestion__Group__1__Impl rule__SingleChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__14069);
            rule__SingleChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__14072);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2045:1: rule__SingleChoiceQuestion__Group__1__Impl : ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2049:1: ( ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2050:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2050:1: ( ( rule__SingleChoiceQuestion__OptionalAssignment_1 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2051:1: ( rule__SingleChoiceQuestion__OptionalAssignment_1 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2052:1: ( rule__SingleChoiceQuestion__OptionalAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==41) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2052:2: rule__SingleChoiceQuestion__OptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_1_in_rule__SingleChoiceQuestion__Group__1__Impl4099);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2062:1: rule__SingleChoiceQuestion__Group__2 : rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 ;
    public final void rule__SingleChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2066:1: ( rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2067:2: rule__SingleChoiceQuestion__Group__2__Impl rule__SingleChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__24130);
            rule__SingleChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__24133);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2074:1: rule__SingleChoiceQuestion__Group__2__Impl : ( 'single choice question' ) ;
    public final void rule__SingleChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2078:1: ( ( 'single choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2079:1: ( 'single choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2079:1: ( 'single choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2080:1: 'single choice question'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_2()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__SingleChoiceQuestion__Group__2__Impl4161); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2093:1: rule__SingleChoiceQuestion__Group__3 : rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 ;
    public final void rule__SingleChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2097:1: ( rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2098:2: rule__SingleChoiceQuestion__Group__3__Impl rule__SingleChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__34192);
            rule__SingleChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__34195);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2105:1: rule__SingleChoiceQuestion__Group__3__Impl : ( 'text:' ) ;
    public final void rule__SingleChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2109:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2110:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2110:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2111:1: 'text:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__SingleChoiceQuestion__Group__3__Impl4223); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_3()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2124:1: rule__SingleChoiceQuestion__Group__4 : rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 ;
    public final void rule__SingleChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2128:1: ( rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2129:2: rule__SingleChoiceQuestion__Group__4__Impl rule__SingleChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__44254);
            rule__SingleChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__44257);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2136:1: rule__SingleChoiceQuestion__Group__4__Impl : ( ( rule__SingleChoiceQuestion__TextAssignment_4 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2140:1: ( ( ( rule__SingleChoiceQuestion__TextAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2141:1: ( ( rule__SingleChoiceQuestion__TextAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2141:1: ( ( rule__SingleChoiceQuestion__TextAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2142:1: ( rule__SingleChoiceQuestion__TextAssignment_4 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2143:1: ( rule__SingleChoiceQuestion__TextAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2143:2: rule__SingleChoiceQuestion__TextAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__TextAssignment_4_in_rule__SingleChoiceQuestion__Group__4__Impl4284);
            rule__SingleChoiceQuestion__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_4()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2153:1: rule__SingleChoiceQuestion__Group__5 : rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 ;
    public final void rule__SingleChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2157:1: ( rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2158:2: rule__SingleChoiceQuestion__Group__5__Impl rule__SingleChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__54314);
            rule__SingleChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__54317);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2165:1: rule__SingleChoiceQuestion__Group__5__Impl : ( ( rule__SingleChoiceQuestion__Group_5__0 )? ) ;
    public final void rule__SingleChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2169:1: ( ( ( rule__SingleChoiceQuestion__Group_5__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2170:1: ( ( rule__SingleChoiceQuestion__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2170:1: ( ( rule__SingleChoiceQuestion__Group_5__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2171:1: ( rule__SingleChoiceQuestion__Group_5__0 )?
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2172:1: ( rule__SingleChoiceQuestion__Group_5__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2172:2: rule__SingleChoiceQuestion__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_5__0_in_rule__SingleChoiceQuestion__Group__5__Impl4344);
                    rule__SingleChoiceQuestion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getGroup_5()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2182:1: rule__SingleChoiceQuestion__Group__6 : rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 ;
    public final void rule__SingleChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2186:1: ( rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2187:2: rule__SingleChoiceQuestion__Group__6__Impl rule__SingleChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64375);
            rule__SingleChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64378);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2194:1: rule__SingleChoiceQuestion__Group__6__Impl : ( 'answers:' ) ;
    public final void rule__SingleChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2198:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2199:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2199:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2200:1: 'answers:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__SingleChoiceQuestion__Group__6__Impl4406); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersKeyword_6()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2213:1: rule__SingleChoiceQuestion__Group__7 : rule__SingleChoiceQuestion__Group__7__Impl rule__SingleChoiceQuestion__Group__8 ;
    public final void rule__SingleChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2217:1: ( rule__SingleChoiceQuestion__Group__7__Impl rule__SingleChoiceQuestion__Group__8 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2218:2: rule__SingleChoiceQuestion__Group__7__Impl rule__SingleChoiceQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74437);
            rule__SingleChoiceQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__8_in_rule__SingleChoiceQuestion__Group__74440);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2225:1: rule__SingleChoiceQuestion__Group__7__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 ) ) ;
    public final void rule__SingleChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2229:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2230:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2230:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_7 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2231:1: ( rule__SingleChoiceQuestion__AnswersAssignment_7 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2232:1: ( rule__SingleChoiceQuestion__AnswersAssignment_7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2232:2: rule__SingleChoiceQuestion__AnswersAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_7_in_rule__SingleChoiceQuestion__Group__7__Impl4467);
            rule__SingleChoiceQuestion__AnswersAssignment_7();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2242:1: rule__SingleChoiceQuestion__Group__8 : rule__SingleChoiceQuestion__Group__8__Impl ;
    public final void rule__SingleChoiceQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2246:1: ( rule__SingleChoiceQuestion__Group__8__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2247:2: rule__SingleChoiceQuestion__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group__8__Impl_in_rule__SingleChoiceQuestion__Group__84497);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2253:1: rule__SingleChoiceQuestion__Group__8__Impl : ( ( rule__SingleChoiceQuestion__Group_8__0 )* ) ;
    public final void rule__SingleChoiceQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2257:1: ( ( ( rule__SingleChoiceQuestion__Group_8__0 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2258:1: ( ( rule__SingleChoiceQuestion__Group_8__0 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2258:1: ( ( rule__SingleChoiceQuestion__Group_8__0 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2259:1: ( rule__SingleChoiceQuestion__Group_8__0 )*
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getGroup_8()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2260:1: ( rule__SingleChoiceQuestion__Group_8__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==39||LA15_2==42) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2260:2: rule__SingleChoiceQuestion__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_8__0_in_rule__SingleChoiceQuestion__Group__8__Impl4524);
            	    rule__SingleChoiceQuestion__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSingleChoiceQuestionAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__SingleChoiceQuestion__Group_5__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2288:1: rule__SingleChoiceQuestion__Group_5__0 : rule__SingleChoiceQuestion__Group_5__0__Impl rule__SingleChoiceQuestion__Group_5__1 ;
    public final void rule__SingleChoiceQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2292:1: ( rule__SingleChoiceQuestion__Group_5__0__Impl rule__SingleChoiceQuestion__Group_5__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2293:2: rule__SingleChoiceQuestion__Group_5__0__Impl rule__SingleChoiceQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_5__0__Impl_in_rule__SingleChoiceQuestion__Group_5__04573);
            rule__SingleChoiceQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_5__1_in_rule__SingleChoiceQuestion__Group_5__04576);
            rule__SingleChoiceQuestion__Group_5__1();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_5__0"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_5__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2300:1: rule__SingleChoiceQuestion__Group_5__0__Impl : ( 'requires:' ) ;
    public final void rule__SingleChoiceQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2304:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2305:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2305:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2306:1: 'requires:'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__SingleChoiceQuestion__Group_5__0__Impl4604); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group_5__0__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_5__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2319:1: rule__SingleChoiceQuestion__Group_5__1 : rule__SingleChoiceQuestion__Group_5__1__Impl ;
    public final void rule__SingleChoiceQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2323:1: ( rule__SingleChoiceQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2324:2: rule__SingleChoiceQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_5__1__Impl_in_rule__SingleChoiceQuestion__Group_5__14635);
            rule__SingleChoiceQuestion__Group_5__1__Impl();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_5__1"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_5__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2330:1: rule__SingleChoiceQuestion__Group_5__1__Impl : ( ( rule__SingleChoiceQuestion__RequiresAssignment_5_1 ) ) ;
    public final void rule__SingleChoiceQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2334:1: ( ( ( rule__SingleChoiceQuestion__RequiresAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2335:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2335:1: ( ( rule__SingleChoiceQuestion__RequiresAssignment_5_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2336:1: ( rule__SingleChoiceQuestion__RequiresAssignment_5_1 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_5_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2337:1: ( rule__SingleChoiceQuestion__RequiresAssignment_5_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2337:2: rule__SingleChoiceQuestion__RequiresAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_5_1_in_rule__SingleChoiceQuestion__Group_5__1__Impl4662);
            rule__SingleChoiceQuestion__RequiresAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group_5__1__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_8__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2351:1: rule__SingleChoiceQuestion__Group_8__0 : rule__SingleChoiceQuestion__Group_8__0__Impl rule__SingleChoiceQuestion__Group_8__1 ;
    public final void rule__SingleChoiceQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2355:1: ( rule__SingleChoiceQuestion__Group_8__0__Impl rule__SingleChoiceQuestion__Group_8__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2356:2: rule__SingleChoiceQuestion__Group_8__0__Impl rule__SingleChoiceQuestion__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_8__0__Impl_in_rule__SingleChoiceQuestion__Group_8__04696);
            rule__SingleChoiceQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_8__1_in_rule__SingleChoiceQuestion__Group_8__04699);
            rule__SingleChoiceQuestion__Group_8__1();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_8__0"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_8__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2363:1: rule__SingleChoiceQuestion__Group_8__0__Impl : ( ',' ) ;
    public final void rule__SingleChoiceQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2367:1: ( ( ',' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2368:1: ( ',' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2368:1: ( ',' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2369:1: ','
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getCommaKeyword_8_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__SingleChoiceQuestion__Group_8__0__Impl4727); 
             after(grammarAccess.getSingleChoiceQuestionAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_8__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2382:1: rule__SingleChoiceQuestion__Group_8__1 : rule__SingleChoiceQuestion__Group_8__1__Impl ;
    public final void rule__SingleChoiceQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2386:1: ( rule__SingleChoiceQuestion__Group_8__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2387:2: rule__SingleChoiceQuestion__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__Group_8__1__Impl_in_rule__SingleChoiceQuestion__Group_8__14758);
            rule__SingleChoiceQuestion__Group_8__1__Impl();

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
    // $ANTLR end "rule__SingleChoiceQuestion__Group_8__1"


    // $ANTLR start "rule__SingleChoiceQuestion__Group_8__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2393:1: rule__SingleChoiceQuestion__Group_8__1__Impl : ( ( rule__SingleChoiceQuestion__AnswersAssignment_8_1 ) ) ;
    public final void rule__SingleChoiceQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2397:1: ( ( ( rule__SingleChoiceQuestion__AnswersAssignment_8_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2398:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_8_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2398:1: ( ( rule__SingleChoiceQuestion__AnswersAssignment_8_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2399:1: ( rule__SingleChoiceQuestion__AnswersAssignment_8_1 )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_8_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2400:1: ( rule__SingleChoiceQuestion__AnswersAssignment_8_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2400:2: rule__SingleChoiceQuestion__AnswersAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_8_1_in_rule__SingleChoiceQuestion__Group_8__1__Impl4785);
            rule__SingleChoiceQuestion__AnswersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2414:1: rule__MultiChoiceQuestion__Group__0 : rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 ;
    public final void rule__MultiChoiceQuestion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2418:1: ( rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2419:2: rule__MultiChoiceQuestion__Group__0__Impl rule__MultiChoiceQuestion__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04819);
            rule__MultiChoiceQuestion__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04822);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2426:1: rule__MultiChoiceQuestion__Group__0__Impl : ( 'add' ) ;
    public final void rule__MultiChoiceQuestion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2430:1: ( ( 'add' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2431:1: ( 'add' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2431:1: ( 'add' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2432:1: 'add'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAddKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__MultiChoiceQuestion__Group__0__Impl4850); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getAddKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2445:1: rule__MultiChoiceQuestion__Group__1 : rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 ;
    public final void rule__MultiChoiceQuestion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2449:1: ( rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2450:2: rule__MultiChoiceQuestion__Group__1__Impl rule__MultiChoiceQuestion__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14881);
            rule__MultiChoiceQuestion__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14884);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2457:1: rule__MultiChoiceQuestion__Group__1__Impl : ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2461:1: ( ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2462:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2462:1: ( ( rule__MultiChoiceQuestion__OptionalAssignment_1 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2463:1: ( rule__MultiChoiceQuestion__OptionalAssignment_1 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2464:1: ( rule__MultiChoiceQuestion__OptionalAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2464:2: rule__MultiChoiceQuestion__OptionalAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_1_in_rule__MultiChoiceQuestion__Group__1__Impl4911);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2474:1: rule__MultiChoiceQuestion__Group__2 : rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 ;
    public final void rule__MultiChoiceQuestion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2478:1: ( rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2479:2: rule__MultiChoiceQuestion__Group__2__Impl rule__MultiChoiceQuestion__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24942);
            rule__MultiChoiceQuestion__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24945);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2486:1: rule__MultiChoiceQuestion__Group__2__Impl : ( 'multi choice question' ) ;
    public final void rule__MultiChoiceQuestion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2490:1: ( ( 'multi choice question' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2491:1: ( 'multi choice question' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2491:1: ( 'multi choice question' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2492:1: 'multi choice question'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__MultiChoiceQuestion__Group__2__Impl4973); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getMultiChoiceQuestionKeyword_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2505:1: rule__MultiChoiceQuestion__Group__3 : rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 ;
    public final void rule__MultiChoiceQuestion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2509:1: ( rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2510:2: rule__MultiChoiceQuestion__Group__3__Impl rule__MultiChoiceQuestion__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__35004);
            rule__MultiChoiceQuestion__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__35007);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2517:1: rule__MultiChoiceQuestion__Group__3__Impl : ( 'text:' ) ;
    public final void rule__MultiChoiceQuestion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2521:1: ( ( 'text:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2522:1: ( 'text:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2522:1: ( 'text:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2523:1: 'text:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextKeyword_3()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__MultiChoiceQuestion__Group__3__Impl5035); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getTextKeyword_3()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2536:1: rule__MultiChoiceQuestion__Group__4 : rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 ;
    public final void rule__MultiChoiceQuestion__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2540:1: ( rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2541:2: rule__MultiChoiceQuestion__Group__4__Impl rule__MultiChoiceQuestion__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__45066);
            rule__MultiChoiceQuestion__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__45069);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2548:1: rule__MultiChoiceQuestion__Group__4__Impl : ( ( rule__MultiChoiceQuestion__TextAssignment_4 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2552:1: ( ( ( rule__MultiChoiceQuestion__TextAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2553:1: ( ( rule__MultiChoiceQuestion__TextAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2553:1: ( ( rule__MultiChoiceQuestion__TextAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2554:1: ( rule__MultiChoiceQuestion__TextAssignment_4 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2555:1: ( rule__MultiChoiceQuestion__TextAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2555:2: rule__MultiChoiceQuestion__TextAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__TextAssignment_4_in_rule__MultiChoiceQuestion__Group__4__Impl5096);
            rule__MultiChoiceQuestion__TextAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_4()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2565:1: rule__MultiChoiceQuestion__Group__5 : rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 ;
    public final void rule__MultiChoiceQuestion__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2569:1: ( rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2570:2: rule__MultiChoiceQuestion__Group__5__Impl rule__MultiChoiceQuestion__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__55126);
            rule__MultiChoiceQuestion__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__55129);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2577:1: rule__MultiChoiceQuestion__Group__5__Impl : ( ( rule__MultiChoiceQuestion__Group_5__0 )? ) ;
    public final void rule__MultiChoiceQuestion__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2581:1: ( ( ( rule__MultiChoiceQuestion__Group_5__0 )? ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2582:1: ( ( rule__MultiChoiceQuestion__Group_5__0 )? )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2582:1: ( ( rule__MultiChoiceQuestion__Group_5__0 )? )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2583:1: ( rule__MultiChoiceQuestion__Group_5__0 )?
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getGroup_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2584:1: ( rule__MultiChoiceQuestion__Group_5__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2584:2: rule__MultiChoiceQuestion__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_5__0_in_rule__MultiChoiceQuestion__Group__5__Impl5156);
                    rule__MultiChoiceQuestion__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getGroup_5()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2594:1: rule__MultiChoiceQuestion__Group__6 : rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 ;
    public final void rule__MultiChoiceQuestion__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2598:1: ( rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2599:2: rule__MultiChoiceQuestion__Group__6__Impl rule__MultiChoiceQuestion__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__65187);
            rule__MultiChoiceQuestion__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__65190);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2606:1: rule__MultiChoiceQuestion__Group__6__Impl : ( 'answers:' ) ;
    public final void rule__MultiChoiceQuestion__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2610:1: ( ( 'answers:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2611:1: ( 'answers:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2611:1: ( 'answers:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2612:1: 'answers:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_6()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__MultiChoiceQuestion__Group__6__Impl5218); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersKeyword_6()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2625:1: rule__MultiChoiceQuestion__Group__7 : rule__MultiChoiceQuestion__Group__7__Impl rule__MultiChoiceQuestion__Group__8 ;
    public final void rule__MultiChoiceQuestion__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2629:1: ( rule__MultiChoiceQuestion__Group__7__Impl rule__MultiChoiceQuestion__Group__8 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2630:2: rule__MultiChoiceQuestion__Group__7__Impl rule__MultiChoiceQuestion__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__75249);
            rule__MultiChoiceQuestion__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__8_in_rule__MultiChoiceQuestion__Group__75252);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2637:1: rule__MultiChoiceQuestion__Group__7__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 ) ) ;
    public final void rule__MultiChoiceQuestion__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2641:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2642:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2642:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_7 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2643:1: ( rule__MultiChoiceQuestion__AnswersAssignment_7 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_7()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2644:1: ( rule__MultiChoiceQuestion__AnswersAssignment_7 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2644:2: rule__MultiChoiceQuestion__AnswersAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_7_in_rule__MultiChoiceQuestion__Group__7__Impl5279);
            rule__MultiChoiceQuestion__AnswersAssignment_7();

            state._fsp--;


            }

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2654:1: rule__MultiChoiceQuestion__Group__8 : rule__MultiChoiceQuestion__Group__8__Impl ;
    public final void rule__MultiChoiceQuestion__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2658:1: ( rule__MultiChoiceQuestion__Group__8__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2659:2: rule__MultiChoiceQuestion__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group__8__Impl_in_rule__MultiChoiceQuestion__Group__85309);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2665:1: rule__MultiChoiceQuestion__Group__8__Impl : ( ( rule__MultiChoiceQuestion__Group_8__0 )* ) ;
    public final void rule__MultiChoiceQuestion__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2669:1: ( ( ( rule__MultiChoiceQuestion__Group_8__0 )* ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2670:1: ( ( rule__MultiChoiceQuestion__Group_8__0 )* )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2670:1: ( ( rule__MultiChoiceQuestion__Group_8__0 )* )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2671:1: ( rule__MultiChoiceQuestion__Group_8__0 )*
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getGroup_8()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2672:1: ( rule__MultiChoiceQuestion__Group_8__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==15) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==39||LA18_2==42) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2672:2: rule__MultiChoiceQuestion__Group_8__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_8__0_in_rule__MultiChoiceQuestion__Group__8__Impl5336);
            	    rule__MultiChoiceQuestion__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMultiChoiceQuestionAccess().getGroup_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__MultiChoiceQuestion__Group_5__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2700:1: rule__MultiChoiceQuestion__Group_5__0 : rule__MultiChoiceQuestion__Group_5__0__Impl rule__MultiChoiceQuestion__Group_5__1 ;
    public final void rule__MultiChoiceQuestion__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2704:1: ( rule__MultiChoiceQuestion__Group_5__0__Impl rule__MultiChoiceQuestion__Group_5__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2705:2: rule__MultiChoiceQuestion__Group_5__0__Impl rule__MultiChoiceQuestion__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_5__0__Impl_in_rule__MultiChoiceQuestion__Group_5__05385);
            rule__MultiChoiceQuestion__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_5__1_in_rule__MultiChoiceQuestion__Group_5__05388);
            rule__MultiChoiceQuestion__Group_5__1();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_5__0"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_5__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2712:1: rule__MultiChoiceQuestion__Group_5__0__Impl : ( 'requires:' ) ;
    public final void rule__MultiChoiceQuestion__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2716:1: ( ( 'requires:' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2717:1: ( 'requires:' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2717:1: ( 'requires:' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2718:1: 'requires:'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_5_0()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__MultiChoiceQuestion__Group_5__0__Impl5416); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group_5__0__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_5__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2731:1: rule__MultiChoiceQuestion__Group_5__1 : rule__MultiChoiceQuestion__Group_5__1__Impl ;
    public final void rule__MultiChoiceQuestion__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2735:1: ( rule__MultiChoiceQuestion__Group_5__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2736:2: rule__MultiChoiceQuestion__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_5__1__Impl_in_rule__MultiChoiceQuestion__Group_5__15447);
            rule__MultiChoiceQuestion__Group_5__1__Impl();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_5__1"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_5__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2742:1: rule__MultiChoiceQuestion__Group_5__1__Impl : ( ( rule__MultiChoiceQuestion__RequiresAssignment_5_1 ) ) ;
    public final void rule__MultiChoiceQuestion__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2746:1: ( ( ( rule__MultiChoiceQuestion__RequiresAssignment_5_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2747:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_5_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2747:1: ( ( rule__MultiChoiceQuestion__RequiresAssignment_5_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2748:1: ( rule__MultiChoiceQuestion__RequiresAssignment_5_1 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_5_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2749:1: ( rule__MultiChoiceQuestion__RequiresAssignment_5_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2749:2: rule__MultiChoiceQuestion__RequiresAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_5_1_in_rule__MultiChoiceQuestion__Group_5__1__Impl5474);
            rule__MultiChoiceQuestion__RequiresAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group_5__1__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_8__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2763:1: rule__MultiChoiceQuestion__Group_8__0 : rule__MultiChoiceQuestion__Group_8__0__Impl rule__MultiChoiceQuestion__Group_8__1 ;
    public final void rule__MultiChoiceQuestion__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2767:1: ( rule__MultiChoiceQuestion__Group_8__0__Impl rule__MultiChoiceQuestion__Group_8__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2768:2: rule__MultiChoiceQuestion__Group_8__0__Impl rule__MultiChoiceQuestion__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_8__0__Impl_in_rule__MultiChoiceQuestion__Group_8__05508);
            rule__MultiChoiceQuestion__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_8__1_in_rule__MultiChoiceQuestion__Group_8__05511);
            rule__MultiChoiceQuestion__Group_8__1();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_8__0"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_8__0__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2775:1: rule__MultiChoiceQuestion__Group_8__0__Impl : ( ',' ) ;
    public final void rule__MultiChoiceQuestion__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2779:1: ( ( ',' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2780:1: ( ',' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2780:1: ( ',' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2781:1: ','
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getCommaKeyword_8_0()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__MultiChoiceQuestion__Group_8__0__Impl5539); 
             after(grammarAccess.getMultiChoiceQuestionAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group_8__0__Impl"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_8__1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2794:1: rule__MultiChoiceQuestion__Group_8__1 : rule__MultiChoiceQuestion__Group_8__1__Impl ;
    public final void rule__MultiChoiceQuestion__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2798:1: ( rule__MultiChoiceQuestion__Group_8__1__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2799:2: rule__MultiChoiceQuestion__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__Group_8__1__Impl_in_rule__MultiChoiceQuestion__Group_8__15570);
            rule__MultiChoiceQuestion__Group_8__1__Impl();

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
    // $ANTLR end "rule__MultiChoiceQuestion__Group_8__1"


    // $ANTLR start "rule__MultiChoiceQuestion__Group_8__1__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2805:1: rule__MultiChoiceQuestion__Group_8__1__Impl : ( ( rule__MultiChoiceQuestion__AnswersAssignment_8_1 ) ) ;
    public final void rule__MultiChoiceQuestion__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2809:1: ( ( ( rule__MultiChoiceQuestion__AnswersAssignment_8_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2810:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_8_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2810:1: ( ( rule__MultiChoiceQuestion__AnswersAssignment_8_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2811:1: ( rule__MultiChoiceQuestion__AnswersAssignment_8_1 )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_8_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2812:1: ( rule__MultiChoiceQuestion__AnswersAssignment_8_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2812:2: rule__MultiChoiceQuestion__AnswersAssignment_8_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_8_1_in_rule__MultiChoiceQuestion__Group_8__1__Impl5597);
            rule__MultiChoiceQuestion__AnswersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__Group_8__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2826:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2830:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2831:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05631);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__1_in_rule__And__Group__05634);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2838:1: rule__And__Group__0__Impl : ( '(' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2842:1: ( ( '(' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2843:1: ( '(' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2843:1: ( '(' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2844:1: '('
            {
             before(grammarAccess.getAndAccess().getLeftParenthesisKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__And__Group__0__Impl5662); 
             after(grammarAccess.getAndAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2857:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2861:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2862:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15693);
            rule__And__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__2_in_rule__And__Group__15696);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2869:1: rule__And__Group__1__Impl : ( ( rule__And__LhsAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2873:1: ( ( ( rule__And__LhsAssignment_1 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2874:1: ( ( rule__And__LhsAssignment_1 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2874:1: ( ( rule__And__LhsAssignment_1 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2875:1: ( rule__And__LhsAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getLhsAssignment_1()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:1: ( rule__And__LhsAssignment_1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2876:2: rule__And__LhsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__LhsAssignment_1_in_rule__And__Group__1__Impl5723);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2886:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2890:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2891:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__2__Impl_in_rule__And__Group__25753);
            rule__And__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__3_in_rule__And__Group__25756);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2898:1: rule__And__Group__2__Impl : ( 'and' ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2902:1: ( ( 'and' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2903:1: ( 'and' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2903:1: ( 'and' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2904:1: 'and'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_2()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__And__Group__2__Impl5784); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2917:1: rule__And__Group__3 : rule__And__Group__3__Impl rule__And__Group__4 ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2921:1: ( rule__And__Group__3__Impl rule__And__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2922:2: rule__And__Group__3__Impl rule__And__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__3__Impl_in_rule__And__Group__35815);
            rule__And__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__And__Group__4_in_rule__And__Group__35818);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2929:1: rule__And__Group__3__Impl : ( ( rule__And__RhsAssignment_3 ) ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2933:1: ( ( ( rule__And__RhsAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2934:1: ( ( rule__And__RhsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2934:1: ( ( rule__And__RhsAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2935:1: ( rule__And__RhsAssignment_3 )
            {
             before(grammarAccess.getAndAccess().getRhsAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2936:1: ( rule__And__RhsAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2936:2: rule__And__RhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__RhsAssignment_3_in_rule__And__Group__3__Impl5845);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2946:1: rule__And__Group__4 : rule__And__Group__4__Impl ;
    public final void rule__And__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2950:1: ( rule__And__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2951:2: rule__And__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__And__Group__4__Impl_in_rule__And__Group__45875);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2957:1: rule__And__Group__4__Impl : ( ')' ) ;
    public final void rule__And__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2961:1: ( ( ')' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2962:1: ( ')' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2962:1: ( ')' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2963:1: ')'
            {
             before(grammarAccess.getAndAccess().getRightParenthesisKeyword_4()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__And__Group__4__Impl5903); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2986:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2990:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2991:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05944);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05947);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:2998:1: rule__Or__Group__0__Impl : ( 'Or' ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3002:1: ( ( 'Or' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3003:1: ( 'Or' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3003:1: ( 'Or' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3004:1: 'Or'
            {
             before(grammarAccess.getOrAccess().getOrKeyword_0()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Or__Group__0__Impl5975); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3017:1: rule__Or__Group__1 : rule__Or__Group__1__Impl rule__Or__Group__2 ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3021:1: ( rule__Or__Group__1__Impl rule__Or__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3022:2: rule__Or__Group__1__Impl rule__Or__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__16006);
            rule__Or__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__2_in_rule__Or__Group__16009);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3029:1: rule__Or__Group__1__Impl : ( '{' ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3033:1: ( ( '{' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3034:1: ( '{' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3034:1: ( '{' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3035:1: '{'
            {
             before(grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Or__Group__1__Impl6037); 
             after(grammarAccess.getOrAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3048:1: rule__Or__Group__2 : rule__Or__Group__2__Impl rule__Or__Group__3 ;
    public final void rule__Or__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3052:1: ( rule__Or__Group__2__Impl rule__Or__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3053:2: rule__Or__Group__2__Impl rule__Or__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__26068);
            rule__Or__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__3_in_rule__Or__Group__26071);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3060:1: rule__Or__Group__2__Impl : ( 'lhs' ) ;
    public final void rule__Or__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3064:1: ( ( 'lhs' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3065:1: ( 'lhs' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3065:1: ( 'lhs' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3066:1: 'lhs'
            {
             before(grammarAccess.getOrAccess().getLhsKeyword_2()); 
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Or__Group__2__Impl6099); 
             after(grammarAccess.getOrAccess().getLhsKeyword_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3079:1: rule__Or__Group__3 : rule__Or__Group__3__Impl rule__Or__Group__4 ;
    public final void rule__Or__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3083:1: ( rule__Or__Group__3__Impl rule__Or__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3084:2: rule__Or__Group__3__Impl rule__Or__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__3__Impl_in_rule__Or__Group__36130);
            rule__Or__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__4_in_rule__Or__Group__36133);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3091:1: rule__Or__Group__3__Impl : ( ( rule__Or__LhsAssignment_3 ) ) ;
    public final void rule__Or__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3095:1: ( ( ( rule__Or__LhsAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3096:1: ( ( rule__Or__LhsAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3096:1: ( ( rule__Or__LhsAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3097:1: ( rule__Or__LhsAssignment_3 )
            {
             before(grammarAccess.getOrAccess().getLhsAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3098:1: ( rule__Or__LhsAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3098:2: rule__Or__LhsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__LhsAssignment_3_in_rule__Or__Group__3__Impl6160);
            rule__Or__LhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getLhsAssignment_3()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3108:1: rule__Or__Group__4 : rule__Or__Group__4__Impl rule__Or__Group__5 ;
    public final void rule__Or__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3112:1: ( rule__Or__Group__4__Impl rule__Or__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3113:2: rule__Or__Group__4__Impl rule__Or__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__4__Impl_in_rule__Or__Group__46190);
            rule__Or__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__5_in_rule__Or__Group__46193);
            rule__Or__Group__5();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3120:1: rule__Or__Group__4__Impl : ( 'rhs' ) ;
    public final void rule__Or__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3124:1: ( ( 'rhs' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3125:1: ( 'rhs' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3125:1: ( 'rhs' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3126:1: 'rhs'
            {
             before(grammarAccess.getOrAccess().getRhsKeyword_4()); 
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Or__Group__4__Impl6221); 
             after(grammarAccess.getOrAccess().getRhsKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Or__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3139:1: rule__Or__Group__5 : rule__Or__Group__5__Impl rule__Or__Group__6 ;
    public final void rule__Or__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3143:1: ( rule__Or__Group__5__Impl rule__Or__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3144:2: rule__Or__Group__5__Impl rule__Or__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__5__Impl_in_rule__Or__Group__56252);
            rule__Or__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__6_in_rule__Or__Group__56255);
            rule__Or__Group__6();

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
    // $ANTLR end "rule__Or__Group__5"


    // $ANTLR start "rule__Or__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3151:1: rule__Or__Group__5__Impl : ( ( rule__Or__RhsAssignment_5 ) ) ;
    public final void rule__Or__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3155:1: ( ( ( rule__Or__RhsAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3156:1: ( ( rule__Or__RhsAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3156:1: ( ( rule__Or__RhsAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3157:1: ( rule__Or__RhsAssignment_5 )
            {
             before(grammarAccess.getOrAccess().getRhsAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3158:1: ( rule__Or__RhsAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3158:2: rule__Or__RhsAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__RhsAssignment_5_in_rule__Or__Group__5__Impl6282);
            rule__Or__RhsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRhsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__5__Impl"


    // $ANTLR start "rule__Or__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3168:1: rule__Or__Group__6 : rule__Or__Group__6__Impl ;
    public final void rule__Or__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3172:1: ( rule__Or__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3173:2: rule__Or__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Or__Group__6__Impl_in_rule__Or__Group__66312);
            rule__Or__Group__6__Impl();

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
    // $ANTLR end "rule__Or__Group__6"


    // $ANTLR start "rule__Or__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3179:1: rule__Or__Group__6__Impl : ( '}' ) ;
    public final void rule__Or__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3183:1: ( ( '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3184:1: ( '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3184:1: ( '}' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3185:1: '}'
            {
             before(grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Or__Group__6__Impl6340); 
             after(grammarAccess.getOrAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__6__Impl"


    // $ANTLR start "rule__AnswerRef__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3212:1: rule__AnswerRef__Group__0 : rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1 ;
    public final void rule__AnswerRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3216:1: ( rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3217:2: rule__AnswerRef__Group__0__Impl rule__AnswerRef__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__0__Impl_in_rule__AnswerRef__Group__06385);
            rule__AnswerRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__1_in_rule__AnswerRef__Group__06388);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3224:1: rule__AnswerRef__Group__0__Impl : ( 'AnswerRef' ) ;
    public final void rule__AnswerRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3228:1: ( ( 'AnswerRef' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3229:1: ( 'AnswerRef' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3229:1: ( 'AnswerRef' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3230:1: 'AnswerRef'
            {
             before(grammarAccess.getAnswerRefAccess().getAnswerRefKeyword_0()); 
            match(input,35,FollowSets000.FOLLOW_35_in_rule__AnswerRef__Group__0__Impl6416); 
             after(grammarAccess.getAnswerRefAccess().getAnswerRefKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3243:1: rule__AnswerRef__Group__1 : rule__AnswerRef__Group__1__Impl rule__AnswerRef__Group__2 ;
    public final void rule__AnswerRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3247:1: ( rule__AnswerRef__Group__1__Impl rule__AnswerRef__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3248:2: rule__AnswerRef__Group__1__Impl rule__AnswerRef__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__1__Impl_in_rule__AnswerRef__Group__16447);
            rule__AnswerRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__2_in_rule__AnswerRef__Group__16450);
            rule__AnswerRef__Group__2();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3255:1: rule__AnswerRef__Group__1__Impl : ( '{' ) ;
    public final void rule__AnswerRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3259:1: ( ( '{' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3260:1: ( '{' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3260:1: ( '{' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3261:1: '{'
            {
             before(grammarAccess.getAnswerRefAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AnswerRef__Group__1__Impl6478); 
             after(grammarAccess.getAnswerRefAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__AnswerRef__Group__2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3274:1: rule__AnswerRef__Group__2 : rule__AnswerRef__Group__2__Impl rule__AnswerRef__Group__3 ;
    public final void rule__AnswerRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3278:1: ( rule__AnswerRef__Group__2__Impl rule__AnswerRef__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3279:2: rule__AnswerRef__Group__2__Impl rule__AnswerRef__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__2__Impl_in_rule__AnswerRef__Group__26509);
            rule__AnswerRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__3_in_rule__AnswerRef__Group__26512);
            rule__AnswerRef__Group__3();

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
    // $ANTLR end "rule__AnswerRef__Group__2"


    // $ANTLR start "rule__AnswerRef__Group__2__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3286:1: rule__AnswerRef__Group__2__Impl : ( 'refers' ) ;
    public final void rule__AnswerRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3290:1: ( ( 'refers' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3291:1: ( 'refers' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3291:1: ( 'refers' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3292:1: 'refers'
            {
             before(grammarAccess.getAnswerRefAccess().getRefersKeyword_2()); 
            match(input,36,FollowSets000.FOLLOW_36_in_rule__AnswerRef__Group__2__Impl6540); 
             after(grammarAccess.getAnswerRefAccess().getRefersKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerRef__Group__2__Impl"


    // $ANTLR start "rule__AnswerRef__Group__3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3305:1: rule__AnswerRef__Group__3 : rule__AnswerRef__Group__3__Impl rule__AnswerRef__Group__4 ;
    public final void rule__AnswerRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3309:1: ( rule__AnswerRef__Group__3__Impl rule__AnswerRef__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3310:2: rule__AnswerRef__Group__3__Impl rule__AnswerRef__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__3__Impl_in_rule__AnswerRef__Group__36571);
            rule__AnswerRef__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__4_in_rule__AnswerRef__Group__36574);
            rule__AnswerRef__Group__4();

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
    // $ANTLR end "rule__AnswerRef__Group__3"


    // $ANTLR start "rule__AnswerRef__Group__3__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3317:1: rule__AnswerRef__Group__3__Impl : ( ( rule__AnswerRef__RefersAssignment_3 ) ) ;
    public final void rule__AnswerRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3321:1: ( ( ( rule__AnswerRef__RefersAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3322:1: ( ( rule__AnswerRef__RefersAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3322:1: ( ( rule__AnswerRef__RefersAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3323:1: ( rule__AnswerRef__RefersAssignment_3 )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3324:1: ( rule__AnswerRef__RefersAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3324:2: rule__AnswerRef__RefersAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__RefersAssignment_3_in_rule__AnswerRef__Group__3__Impl6601);
            rule__AnswerRef__RefersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnswerRefAccess().getRefersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerRef__Group__3__Impl"


    // $ANTLR start "rule__AnswerRef__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3334:1: rule__AnswerRef__Group__4 : rule__AnswerRef__Group__4__Impl ;
    public final void rule__AnswerRef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3338:1: ( rule__AnswerRef__Group__4__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3339:2: rule__AnswerRef__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AnswerRef__Group__4__Impl_in_rule__AnswerRef__Group__46631);
            rule__AnswerRef__Group__4__Impl();

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
    // $ANTLR end "rule__AnswerRef__Group__4"


    // $ANTLR start "rule__AnswerRef__Group__4__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3345:1: rule__AnswerRef__Group__4__Impl : ( '}' ) ;
    public final void rule__AnswerRef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3349:1: ( ( '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3350:1: ( '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3350:1: ( '}' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3351:1: '}'
            {
             before(grammarAccess.getAnswerRefAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__AnswerRef__Group__4__Impl6659); 
             after(grammarAccess.getAnswerRefAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerRef__Group__4__Impl"


    // $ANTLR start "rule__ChoiceAnswer__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3374:1: rule__ChoiceAnswer__Group__0 : rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 ;
    public final void rule__ChoiceAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3378:1: ( rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3379:2: rule__ChoiceAnswer__Group__0__Impl rule__ChoiceAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__06700);
            rule__ChoiceAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__06703);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3386:1: rule__ChoiceAnswer__Group__0__Impl : ( ( rule__ChoiceAnswer__SelectedAssignment_0 ) ) ;
    public final void rule__ChoiceAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3390:1: ( ( ( rule__ChoiceAnswer__SelectedAssignment_0 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3391:1: ( ( rule__ChoiceAnswer__SelectedAssignment_0 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3391:1: ( ( rule__ChoiceAnswer__SelectedAssignment_0 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3392:1: ( rule__ChoiceAnswer__SelectedAssignment_0 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getSelectedAssignment_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3393:1: ( rule__ChoiceAnswer__SelectedAssignment_0 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3393:2: rule__ChoiceAnswer__SelectedAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__SelectedAssignment_0_in_rule__ChoiceAnswer__Group__0__Impl6730);
            rule__ChoiceAnswer__SelectedAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getChoiceAnswerAccess().getSelectedAssignment_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3403:1: rule__ChoiceAnswer__Group__1 : rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 ;
    public final void rule__ChoiceAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3407:1: ( rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3408:2: rule__ChoiceAnswer__Group__1__Impl rule__ChoiceAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__16760);
            rule__ChoiceAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__16763);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3415:1: rule__ChoiceAnswer__Group__1__Impl : ( 'ChoiceAnswer' ) ;
    public final void rule__ChoiceAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3419:1: ( ( 'ChoiceAnswer' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3420:1: ( 'ChoiceAnswer' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3420:1: ( 'ChoiceAnswer' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3421:1: 'ChoiceAnswer'
            {
             before(grammarAccess.getChoiceAnswerAccess().getChoiceAnswerKeyword_1()); 
            match(input,37,FollowSets000.FOLLOW_37_in_rule__ChoiceAnswer__Group__1__Impl6791); 
             after(grammarAccess.getChoiceAnswerAccess().getChoiceAnswerKeyword_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3434:1: rule__ChoiceAnswer__Group__2 : rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 ;
    public final void rule__ChoiceAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3438:1: ( rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3439:2: rule__ChoiceAnswer__Group__2__Impl rule__ChoiceAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__26822);
            rule__ChoiceAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__26825);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3446:1: rule__ChoiceAnswer__Group__2__Impl : ( '{' ) ;
    public final void rule__ChoiceAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3450:1: ( ( '{' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3451:1: ( '{' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3451:1: ( '{' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3452:1: '{'
            {
             before(grammarAccess.getChoiceAnswerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__ChoiceAnswer__Group__2__Impl6853); 
             after(grammarAccess.getChoiceAnswerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3465:1: rule__ChoiceAnswer__Group__3 : rule__ChoiceAnswer__Group__3__Impl rule__ChoiceAnswer__Group__4 ;
    public final void rule__ChoiceAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3469:1: ( rule__ChoiceAnswer__Group__3__Impl rule__ChoiceAnswer__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3470:2: rule__ChoiceAnswer__Group__3__Impl rule__ChoiceAnswer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__36884);
            rule__ChoiceAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__4_in_rule__ChoiceAnswer__Group__36887);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3477:1: rule__ChoiceAnswer__Group__3__Impl : ( 'text' ) ;
    public final void rule__ChoiceAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3481:1: ( ( 'text' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3482:1: ( 'text' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3482:1: ( 'text' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3483:1: 'text'
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextKeyword_3()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__ChoiceAnswer__Group__3__Impl6915); 
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3496:1: rule__ChoiceAnswer__Group__4 : rule__ChoiceAnswer__Group__4__Impl rule__ChoiceAnswer__Group__5 ;
    public final void rule__ChoiceAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3500:1: ( rule__ChoiceAnswer__Group__4__Impl rule__ChoiceAnswer__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3501:2: rule__ChoiceAnswer__Group__4__Impl rule__ChoiceAnswer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__4__Impl_in_rule__ChoiceAnswer__Group__46946);
            rule__ChoiceAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__5_in_rule__ChoiceAnswer__Group__46949);
            rule__ChoiceAnswer__Group__5();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3508:1: rule__ChoiceAnswer__Group__4__Impl : ( ( rule__ChoiceAnswer__TextAssignment_4 ) ) ;
    public final void rule__ChoiceAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3512:1: ( ( ( rule__ChoiceAnswer__TextAssignment_4 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3513:1: ( ( rule__ChoiceAnswer__TextAssignment_4 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3513:1: ( ( rule__ChoiceAnswer__TextAssignment_4 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3514:1: ( rule__ChoiceAnswer__TextAssignment_4 )
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextAssignment_4()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3515:1: ( rule__ChoiceAnswer__TextAssignment_4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3515:2: rule__ChoiceAnswer__TextAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__TextAssignment_4_in_rule__ChoiceAnswer__Group__4__Impl6976);
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


    // $ANTLR start "rule__ChoiceAnswer__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3525:1: rule__ChoiceAnswer__Group__5 : rule__ChoiceAnswer__Group__5__Impl ;
    public final void rule__ChoiceAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3529:1: ( rule__ChoiceAnswer__Group__5__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3530:2: rule__ChoiceAnswer__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__ChoiceAnswer__Group__5__Impl_in_rule__ChoiceAnswer__Group__57006);
            rule__ChoiceAnswer__Group__5__Impl();

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
    // $ANTLR end "rule__ChoiceAnswer__Group__5"


    // $ANTLR start "rule__ChoiceAnswer__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3536:1: rule__ChoiceAnswer__Group__5__Impl : ( '}' ) ;
    public final void rule__ChoiceAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3540:1: ( ( '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3541:1: ( '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3541:1: ( '}' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3542:1: '}'
            {
             before(grammarAccess.getChoiceAnswerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__ChoiceAnswer__Group__5__Impl7034); 
             after(grammarAccess.getChoiceAnswerAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__Group__5__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3567:1: rule__FreetextAnswer__Group__0 : rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 ;
    public final void rule__FreetextAnswer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3571:1: ( rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3572:2: rule__FreetextAnswer__Group__0__Impl rule__FreetextAnswer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__07077);
            rule__FreetextAnswer__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__07080);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3579:1: rule__FreetextAnswer__Group__0__Impl : ( 'FreetextAnswer' ) ;
    public final void rule__FreetextAnswer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3583:1: ( ( 'FreetextAnswer' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3584:1: ( 'FreetextAnswer' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3584:1: ( 'FreetextAnswer' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3585:1: 'FreetextAnswer'
            {
             before(grammarAccess.getFreetextAnswerAccess().getFreetextAnswerKeyword_0()); 
            match(input,39,FollowSets000.FOLLOW_39_in_rule__FreetextAnswer__Group__0__Impl7108); 
             after(grammarAccess.getFreetextAnswerAccess().getFreetextAnswerKeyword_0()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3598:1: rule__FreetextAnswer__Group__1 : rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 ;
    public final void rule__FreetextAnswer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3602:1: ( rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3603:2: rule__FreetextAnswer__Group__1__Impl rule__FreetextAnswer__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__17139);
            rule__FreetextAnswer__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__17142);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3610:1: rule__FreetextAnswer__Group__1__Impl : ( '{' ) ;
    public final void rule__FreetextAnswer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3614:1: ( ( '{' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3615:1: ( '{' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3615:1: ( '{' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3616:1: '{'
            {
             before(grammarAccess.getFreetextAnswerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__FreetextAnswer__Group__1__Impl7170); 
             after(grammarAccess.getFreetextAnswerAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3629:1: rule__FreetextAnswer__Group__2 : rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 ;
    public final void rule__FreetextAnswer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3633:1: ( rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3634:2: rule__FreetextAnswer__Group__2__Impl rule__FreetextAnswer__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__27201);
            rule__FreetextAnswer__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__27204);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3641:1: rule__FreetextAnswer__Group__2__Impl : ( 'text' ) ;
    public final void rule__FreetextAnswer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3645:1: ( ( 'text' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3646:1: ( 'text' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3646:1: ( 'text' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3647:1: 'text'
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextKeyword_2()); 
            match(input,38,FollowSets000.FOLLOW_38_in_rule__FreetextAnswer__Group__2__Impl7232); 
             after(grammarAccess.getFreetextAnswerAccess().getTextKeyword_2()); 

            }


            }

        }
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3660:1: rule__FreetextAnswer__Group__3 : rule__FreetextAnswer__Group__3__Impl rule__FreetextAnswer__Group__4 ;
    public final void rule__FreetextAnswer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3664:1: ( rule__FreetextAnswer__Group__3__Impl rule__FreetextAnswer__Group__4 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3665:2: rule__FreetextAnswer__Group__3__Impl rule__FreetextAnswer__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__37263);
            rule__FreetextAnswer__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__4_in_rule__FreetextAnswer__Group__37266);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3672:1: rule__FreetextAnswer__Group__3__Impl : ( ( rule__FreetextAnswer__TextAssignment_3 ) ) ;
    public final void rule__FreetextAnswer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3676:1: ( ( ( rule__FreetextAnswer__TextAssignment_3 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3677:1: ( ( rule__FreetextAnswer__TextAssignment_3 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3677:1: ( ( rule__FreetextAnswer__TextAssignment_3 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3678:1: ( rule__FreetextAnswer__TextAssignment_3 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextAssignment_3()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3679:1: ( rule__FreetextAnswer__TextAssignment_3 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3679:2: rule__FreetextAnswer__TextAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__TextAssignment_3_in_rule__FreetextAnswer__Group__3__Impl7293);
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


    // $ANTLR start "rule__FreetextAnswer__Group__4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3689:1: rule__FreetextAnswer__Group__4 : rule__FreetextAnswer__Group__4__Impl rule__FreetextAnswer__Group__5 ;
    public final void rule__FreetextAnswer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3693:1: ( rule__FreetextAnswer__Group__4__Impl rule__FreetextAnswer__Group__5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3694:2: rule__FreetextAnswer__Group__4__Impl rule__FreetextAnswer__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__4__Impl_in_rule__FreetextAnswer__Group__47323);
            rule__FreetextAnswer__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__5_in_rule__FreetextAnswer__Group__47326);
            rule__FreetextAnswer__Group__5();

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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3701:1: rule__FreetextAnswer__Group__4__Impl : ( 'input' ) ;
    public final void rule__FreetextAnswer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3705:1: ( ( 'input' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3706:1: ( 'input' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3706:1: ( 'input' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3707:1: 'input'
            {
             before(grammarAccess.getFreetextAnswerAccess().getInputKeyword_4()); 
            match(input,40,FollowSets000.FOLLOW_40_in_rule__FreetextAnswer__Group__4__Impl7354); 
             after(grammarAccess.getFreetextAnswerAccess().getInputKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__FreetextAnswer__Group__5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3720:1: rule__FreetextAnswer__Group__5 : rule__FreetextAnswer__Group__5__Impl rule__FreetextAnswer__Group__6 ;
    public final void rule__FreetextAnswer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3724:1: ( rule__FreetextAnswer__Group__5__Impl rule__FreetextAnswer__Group__6 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3725:2: rule__FreetextAnswer__Group__5__Impl rule__FreetextAnswer__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__5__Impl_in_rule__FreetextAnswer__Group__57385);
            rule__FreetextAnswer__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__6_in_rule__FreetextAnswer__Group__57388);
            rule__FreetextAnswer__Group__6();

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
    // $ANTLR end "rule__FreetextAnswer__Group__5"


    // $ANTLR start "rule__FreetextAnswer__Group__5__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3732:1: rule__FreetextAnswer__Group__5__Impl : ( ( rule__FreetextAnswer__InputAssignment_5 ) ) ;
    public final void rule__FreetextAnswer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3736:1: ( ( ( rule__FreetextAnswer__InputAssignment_5 ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3737:1: ( ( rule__FreetextAnswer__InputAssignment_5 ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3737:1: ( ( rule__FreetextAnswer__InputAssignment_5 ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3738:1: ( rule__FreetextAnswer__InputAssignment_5 )
            {
             before(grammarAccess.getFreetextAnswerAccess().getInputAssignment_5()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3739:1: ( rule__FreetextAnswer__InputAssignment_5 )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3739:2: rule__FreetextAnswer__InputAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__InputAssignment_5_in_rule__FreetextAnswer__Group__5__Impl7415);
            rule__FreetextAnswer__InputAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFreetextAnswerAccess().getInputAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__Group__5__Impl"


    // $ANTLR start "rule__FreetextAnswer__Group__6"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3749:1: rule__FreetextAnswer__Group__6 : rule__FreetextAnswer__Group__6__Impl ;
    public final void rule__FreetextAnswer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3753:1: ( rule__FreetextAnswer__Group__6__Impl )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3754:2: rule__FreetextAnswer__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FreetextAnswer__Group__6__Impl_in_rule__FreetextAnswer__Group__67445);
            rule__FreetextAnswer__Group__6__Impl();

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
    // $ANTLR end "rule__FreetextAnswer__Group__6"


    // $ANTLR start "rule__FreetextAnswer__Group__6__Impl"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3760:1: rule__FreetextAnswer__Group__6__Impl : ( '}' ) ;
    public final void rule__FreetextAnswer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3764:1: ( ( '}' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3765:1: ( '}' )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3765:1: ( '}' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3766:1: '}'
            {
             before(grammarAccess.getFreetextAnswerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FollowSets000.FOLLOW_34_in_rule__FreetextAnswer__Group__6__Impl7473); 
             after(grammarAccess.getFreetextAnswerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__Group__6__Impl"


    // $ANTLR start "rule__Survey__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3794:1: rule__Survey__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__Survey__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3798:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3799:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3799:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3800:1: ruleEString
            {
             before(grammarAccess.getSurveyAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_27523);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3809:1: rule__Survey__PagesAssignment_4 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3813:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3814:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3814:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3815:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_47554);
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


    // $ANTLR start "rule__Survey__PagesAssignment_5_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3824:1: rule__Survey__PagesAssignment_5_1 : ( rulePage ) ;
    public final void rule__Survey__PagesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3828:1: ( ( rulePage ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3829:1: ( rulePage )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3829:1: ( rulePage )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3830:1: rulePage
            {
             before(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Survey__PagesAssignment_5_17585);
            rulePage();

            state._fsp--;

             after(grammarAccess.getSurveyAccess().getPagesPageParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Survey__PagesAssignment_5_1"


    // $ANTLR start "rule__QuestionPage__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3839:1: rule__QuestionPage__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__QuestionPage__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3843:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3844:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3844:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3845:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_27616);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3854:1: rule__QuestionPage__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__QuestionPage__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3858:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3859:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3859:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3860:1: ruleEString
            {
             before(grammarAccess.getQuestionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_3_17647);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3869:1: rule__QuestionPage__QuestionsAssignment_5 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3873:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3874:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3874:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3875:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_57678);
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


    // $ANTLR start "rule__QuestionPage__QuestionsAssignment_6_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3884:1: rule__QuestionPage__QuestionsAssignment_6_1 : ( ruleQuestion ) ;
    public final void rule__QuestionPage__QuestionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3888:1: ( ( ruleQuestion ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3889:1: ( ruleQuestion )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3889:1: ( ruleQuestion )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3890:1: ruleQuestion
            {
             before(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_6_17709);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionPageAccess().getQuestionsQuestionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuestionPage__QuestionsAssignment_6_1"


    // $ANTLR start "rule__DescriptionPage__TitleAssignment_2"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3899:1: rule__DescriptionPage__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3903:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3904:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3904:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3905:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_27740);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3914:1: rule__DescriptionPage__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__DescriptionPage__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3918:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3919:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3919:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3920:1: ruleEString
            {
             before(grammarAccess.getDescriptionPageAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_3_17771);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3929:1: rule__ResultPage__TitleAssignment_2 : ( ruleEString ) ;
    public final void rule__ResultPage__TitleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3933:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3934:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3934:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3935:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTitleEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_27802);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3944:1: rule__ResultPage__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ResultPage__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3948:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3949:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3949:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3950:1: ruleEString
            {
             before(grammarAccess.getResultPageAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_3_17833);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3959:1: rule__FreetextQuestion__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__FreetextQuestion__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3963:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3964:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3964:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3965:1: ( 'optional' )
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3966:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3967:1: 'optional'
            {
             before(grammarAccess.getFreetextQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__FreetextQuestion__OptionalAssignment_17869); 
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


    // $ANTLR start "rule__FreetextQuestion__TextAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3982:1: rule__FreetextQuestion__TextAssignment_4 : ( ruleEString ) ;
    public final void rule__FreetextQuestion__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3986:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3987:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3987:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3988:1: ruleEString
            {
             before(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_47908);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getTextEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__TextAssignment_4"


    // $ANTLR start "rule__FreetextQuestion__RequiresAssignment_5_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:3997:1: rule__FreetextQuestion__RequiresAssignment_5_1 : ( ruleDependency ) ;
    public final void rule__FreetextQuestion__RequiresAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4001:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4002:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4002:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4003:1: ruleDependency
            {
             before(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_5_17939);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__RequiresAssignment_5_1"


    // $ANTLR start "rule__FreetextQuestion__AnswersAssignment_7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4012:1: rule__FreetextQuestion__AnswersAssignment_7 : ( ruleFreetextAnswer ) ;
    public final void rule__FreetextQuestion__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4016:1: ( ( ruleFreetextAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4017:1: ( ruleFreetextAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4017:1: ( ruleFreetextAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4018:1: ruleFreetextAnswer
            {
             before(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_77970);
            ruleFreetextAnswer();

            state._fsp--;

             after(grammarAccess.getFreetextQuestionAccess().getAnswersFreetextAnswerParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextQuestion__AnswersAssignment_7"


    // $ANTLR start "rule__SingleChoiceQuestion__OptionalAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4027:1: rule__SingleChoiceQuestion__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__SingleChoiceQuestion__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4031:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4032:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4032:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4033:1: ( 'optional' )
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4034:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4035:1: 'optional'
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__SingleChoiceQuestion__OptionalAssignment_18006); 
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


    // $ANTLR start "rule__SingleChoiceQuestion__TextAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4050:1: rule__SingleChoiceQuestion__TextAssignment_4 : ( ruleEString ) ;
    public final void rule__SingleChoiceQuestion__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4054:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4055:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4055:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4056:1: ruleEString
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_48045);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getTextEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__TextAssignment_4"


    // $ANTLR start "rule__SingleChoiceQuestion__RequiresAssignment_5_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4065:1: rule__SingleChoiceQuestion__RequiresAssignment_5_1 : ( ruleDependency ) ;
    public final void rule__SingleChoiceQuestion__RequiresAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4069:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4070:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4070:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4071:1: ruleDependency
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_5_18076);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__RequiresAssignment_5_1"


    // $ANTLR start "rule__SingleChoiceQuestion__AnswersAssignment_7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4080:1: rule__SingleChoiceQuestion__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4084:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4085:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4085:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4086:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_78107);
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


    // $ANTLR start "rule__SingleChoiceQuestion__AnswersAssignment_8_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4095:1: rule__SingleChoiceQuestion__AnswersAssignment_8_1 : ( ruleAnswer ) ;
    public final void rule__SingleChoiceQuestion__AnswersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4099:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4100:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4100:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4101:1: ruleAnswer
            {
             before(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_8_18138);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAnswerParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleChoiceQuestion__AnswersAssignment_8_1"


    // $ANTLR start "rule__MultiChoiceQuestion__OptionalAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4110:1: rule__MultiChoiceQuestion__OptionalAssignment_1 : ( ( 'optional' ) ) ;
    public final void rule__MultiChoiceQuestion__OptionalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4114:1: ( ( ( 'optional' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4115:1: ( ( 'optional' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4115:1: ( ( 'optional' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4116:1: ( 'optional' )
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4117:1: ( 'optional' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4118:1: 'optional'
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getOptionalOptionalKeyword_1_0()); 
            match(input,41,FollowSets000.FOLLOW_41_in_rule__MultiChoiceQuestion__OptionalAssignment_18174); 
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


    // $ANTLR start "rule__MultiChoiceQuestion__TextAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4133:1: rule__MultiChoiceQuestion__TextAssignment_4 : ( ruleEString ) ;
    public final void rule__MultiChoiceQuestion__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4137:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4138:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4138:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4139:1: ruleEString
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_48213);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getTextEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__TextAssignment_4"


    // $ANTLR start "rule__MultiChoiceQuestion__RequiresAssignment_5_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4148:1: rule__MultiChoiceQuestion__RequiresAssignment_5_1 : ( ruleDependency ) ;
    public final void rule__MultiChoiceQuestion__RequiresAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4152:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4153:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4153:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4154:1: ruleDependency
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_5_18244);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getRequiresDependencyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__RequiresAssignment_5_1"


    // $ANTLR start "rule__MultiChoiceQuestion__AnswersAssignment_7"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4163:1: rule__MultiChoiceQuestion__AnswersAssignment_7 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4167:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4168:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4168:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4169:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_78275);
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


    // $ANTLR start "rule__MultiChoiceQuestion__AnswersAssignment_8_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4178:1: rule__MultiChoiceQuestion__AnswersAssignment_8_1 : ( ruleAnswer ) ;
    public final void rule__MultiChoiceQuestion__AnswersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4182:1: ( ( ruleAnswer ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4183:1: ( ruleAnswer )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4183:1: ( ruleAnswer )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4184:1: ruleAnswer
            {
             before(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_8_18306);
            ruleAnswer();

            state._fsp--;

             after(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAnswerParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiChoiceQuestion__AnswersAssignment_8_1"


    // $ANTLR start "rule__And__LhsAssignment_1"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4193:1: rule__And__LhsAssignment_1 : ( ruleDependency ) ;
    public final void rule__And__LhsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4197:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4198:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4198:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4199:1: ruleDependency
            {
             before(grammarAccess.getAndAccess().getLhsDependencyParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__And__LhsAssignment_18337);
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
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4208:1: rule__And__RhsAssignment_3 : ( ruleDependency ) ;
    public final void rule__And__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4212:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4213:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4213:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4214:1: ruleDependency
            {
             before(grammarAccess.getAndAccess().getRhsDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__And__RhsAssignment_38368);
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


    // $ANTLR start "rule__Or__LhsAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4223:1: rule__Or__LhsAssignment_3 : ( ruleDependency ) ;
    public final void rule__Or__LhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4227:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4228:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4228:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4229:1: ruleDependency
            {
             before(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Or__LhsAssignment_38399);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getOrAccess().getLhsDependencyParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__LhsAssignment_3"


    // $ANTLR start "rule__Or__RhsAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4238:1: rule__Or__RhsAssignment_5 : ( ruleDependency ) ;
    public final void rule__Or__RhsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4242:1: ( ( ruleDependency ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4243:1: ( ruleDependency )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4243:1: ( ruleDependency )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4244:1: ruleDependency
            {
             before(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleDependency_in_rule__Or__RhsAssignment_58430);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRhsDependencyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RhsAssignment_5"


    // $ANTLR start "rule__AnswerRef__RefersAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4253:1: rule__AnswerRef__RefersAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__AnswerRef__RefersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4257:1: ( ( ( ruleEString ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4258:1: ( ( ruleEString ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4258:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4259:1: ( ruleEString )
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_3_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4260:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4261:1: ruleEString
            {
             before(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment_38465);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAnswerRefAccess().getRefersAnswerCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerRef__RefersAssignment_3"


    // $ANTLR start "rule__ChoiceAnswer__SelectedAssignment_0"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4272:1: rule__ChoiceAnswer__SelectedAssignment_0 : ( ( 'selected' ) ) ;
    public final void rule__ChoiceAnswer__SelectedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4276:1: ( ( ( 'selected' ) ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4277:1: ( ( 'selected' ) )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4277:1: ( ( 'selected' ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4278:1: ( 'selected' )
            {
             before(grammarAccess.getChoiceAnswerAccess().getSelectedSelectedKeyword_0_0()); 
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4279:1: ( 'selected' )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4280:1: 'selected'
            {
             before(grammarAccess.getChoiceAnswerAccess().getSelectedSelectedKeyword_0_0()); 
            match(input,42,FollowSets000.FOLLOW_42_in_rule__ChoiceAnswer__SelectedAssignment_08505); 
             after(grammarAccess.getChoiceAnswerAccess().getSelectedSelectedKeyword_0_0()); 

            }

             after(grammarAccess.getChoiceAnswerAccess().getSelectedSelectedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChoiceAnswer__SelectedAssignment_0"


    // $ANTLR start "rule__ChoiceAnswer__TextAssignment_4"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4295:1: rule__ChoiceAnswer__TextAssignment_4 : ( ruleEString ) ;
    public final void rule__ChoiceAnswer__TextAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4299:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4300:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4300:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4301:1: ruleEString
            {
             before(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_48544);
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


    // $ANTLR start "rule__FreetextAnswer__TextAssignment_3"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4310:1: rule__FreetextAnswer__TextAssignment_3 : ( ruleEString ) ;
    public final void rule__FreetextAnswer__TextAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4314:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4315:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4315:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4316:1: ruleEString
            {
             before(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_38575);
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


    // $ANTLR start "rule__FreetextAnswer__InputAssignment_5"
    // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4325:1: rule__FreetextAnswer__InputAssignment_5 : ( ruleEString ) ;
    public final void rule__FreetextAnswer__InputAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4329:1: ( ( ruleEString ) )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4330:1: ( ruleEString )
            {
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4330:1: ( ruleEString )
            // ../dk.itu.smdp.group19.SurveyDSL.ui/src-gen/dk/itu/smdp/group19/ui/contentassist/antlr/internal/InternalSurveyDSL.g:4331:1: ruleEString
            {
             before(grammarAccess.getFreetextAnswerAccess().getInputEStringParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__FreetextAnswer__InputAssignment_58606);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFreetextAnswerAccess().getInputEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FreetextAnswer__InputAssignment_5"

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
        public static final BitSet FOLLOW_rule__Survey__Group__3__Impl_in_rule__Survey__Group__31571 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rule__Survey__Group__4_in_rule__Survey__Group__31574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__Survey__Group__3__Impl1602 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__4__Impl_in_rule__Survey__Group__41633 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Survey__Group__5_in_rule__Survey__Group__41636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_4_in_rule__Survey__Group__4__Impl1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group__5__Impl_in_rule__Survey__Group__51693 = new BitSet(new long[]{0x000000000000C000L});
        public static final BitSet FOLLOW_rule__Survey__Group__6_in_rule__Survey__Group__51696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__0_in_rule__Survey__Group__5__Impl1723 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__Survey__Group__6__Impl_in_rule__Survey__Group__61754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__Survey__Group__6__Impl1782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__0__Impl_in_rule__Survey__Group_5__01827 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__1_in_rule__Survey__Group_5__01830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Survey__Group_5__0__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__Group_5__1__Impl_in_rule__Survey__Group_5__11889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Survey__PagesAssignment_5_1_in_rule__Survey__Group_5__1__Impl1916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__0__Impl_in_rule__QuestionPage__Group__01950 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1_in_rule__QuestionPage__Group__01953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__QuestionPage__Group__0__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__1__Impl_in_rule__QuestionPage__Group__12012 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2_in_rule__QuestionPage__Group__12015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__QuestionPage__Group__1__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__2__Impl_in_rule__QuestionPage__Group__22074 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3_in_rule__QuestionPage__Group__22077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TitleAssignment_2_in_rule__QuestionPage__Group__2__Impl2104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__3__Impl_in_rule__QuestionPage__Group__32134 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4_in_rule__QuestionPage__Group__32137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__0_in_rule__QuestionPage__Group__3__Impl2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__4__Impl_in_rule__QuestionPage__Group__42195 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5_in_rule__QuestionPage__Group__42198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__QuestionPage__Group__4__Impl2226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__5__Impl_in_rule__QuestionPage__Group__52257 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6_in_rule__QuestionPage__Group__52260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_5_in_rule__QuestionPage__Group__5__Impl2287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group__6__Impl_in_rule__QuestionPage__Group__62317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_6__0_in_rule__QuestionPage__Group__6__Impl2344 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__0__Impl_in_rule__QuestionPage__Group_3__02389 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__1_in_rule__QuestionPage__Group_3__02392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__QuestionPage__Group_3__0__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_3__1__Impl_in_rule__QuestionPage__Group_3__12451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__TextAssignment_3_1_in_rule__QuestionPage__Group_3__1__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_6__0__Impl_in_rule__QuestionPage__Group_6__02512 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_6__1_in_rule__QuestionPage__Group_6__02515 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__QuestionPage__Group_6__0__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__Group_6__1__Impl_in_rule__QuestionPage__Group_6__12574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QuestionPage__QuestionsAssignment_6_1_in_rule__QuestionPage__Group_6__1__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__0__Impl_in_rule__DescriptionPage__Group__02635 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1_in_rule__DescriptionPage__Group__02638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DescriptionPage__Group__0__Impl2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__1__Impl_in_rule__DescriptionPage__Group__12697 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2_in_rule__DescriptionPage__Group__12700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__DescriptionPage__Group__1__Impl2728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__2__Impl_in_rule__DescriptionPage__Group__22759 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3_in_rule__DescriptionPage__Group__22762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TitleAssignment_2_in_rule__DescriptionPage__Group__2__Impl2789 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group__3__Impl_in_rule__DescriptionPage__Group__32819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__0_in_rule__DescriptionPage__Group__3__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__0__Impl_in_rule__DescriptionPage__Group_3__02885 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__1_in_rule__DescriptionPage__Group_3__02888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__DescriptionPage__Group_3__0__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__Group_3__1__Impl_in_rule__DescriptionPage__Group_3__12947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DescriptionPage__TextAssignment_3_1_in_rule__DescriptionPage__Group_3__1__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__0__Impl_in_rule__ResultPage__Group__03008 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1_in_rule__ResultPage__Group__03011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__ResultPage__Group__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__1__Impl_in_rule__ResultPage__Group__13070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2_in_rule__ResultPage__Group__13073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__ResultPage__Group__1__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__2__Impl_in_rule__ResultPage__Group__23132 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3_in_rule__ResultPage__Group__23135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TitleAssignment_2_in_rule__ResultPage__Group__2__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group__3__Impl_in_rule__ResultPage__Group__33192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__0_in_rule__ResultPage__Group__3__Impl3219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__0__Impl_in_rule__ResultPage__Group_3__03258 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__1_in_rule__ResultPage__Group_3__03261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__ResultPage__Group_3__0__Impl3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__Group_3__1__Impl_in_rule__ResultPage__Group_3__13320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ResultPage__TextAssignment_3_1_in_rule__ResultPage__Group_3__1__Impl3347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__0__Impl_in_rule__FreetextQuestion__Group__03381 = new BitSet(new long[]{0x0000020000400000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1_in_rule__FreetextQuestion__Group__03384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__FreetextQuestion__Group__0__Impl3412 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__1__Impl_in_rule__FreetextQuestion__Group__13443 = new BitSet(new long[]{0x0000020000400000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2_in_rule__FreetextQuestion__Group__13446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__OptionalAssignment_1_in_rule__FreetextQuestion__Group__1__Impl3473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__2__Impl_in_rule__FreetextQuestion__Group__23504 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3_in_rule__FreetextQuestion__Group__23507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__FreetextQuestion__Group__2__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__3__Impl_in_rule__FreetextQuestion__Group__33566 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4_in_rule__FreetextQuestion__Group__33569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__FreetextQuestion__Group__3__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__4__Impl_in_rule__FreetextQuestion__Group__43628 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5_in_rule__FreetextQuestion__Group__43631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__TextAssignment_4_in_rule__FreetextQuestion__Group__4__Impl3658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__5__Impl_in_rule__FreetextQuestion__Group__53688 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6_in_rule__FreetextQuestion__Group__53691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_5__0_in_rule__FreetextQuestion__Group__5__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__6__Impl_in_rule__FreetextQuestion__Group__63749 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__7_in_rule__FreetextQuestion__Group__63752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__FreetextQuestion__Group__6__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group__7__Impl_in_rule__FreetextQuestion__Group__73811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__AnswersAssignment_7_in_rule__FreetextQuestion__Group__7__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_5__0__Impl_in_rule__FreetextQuestion__Group_5__03884 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_5__1_in_rule__FreetextQuestion__Group_5__03887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__FreetextQuestion__Group_5__0__Impl3915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__Group_5__1__Impl_in_rule__FreetextQuestion__Group_5__13946 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextQuestion__RequiresAssignment_5_1_in_rule__FreetextQuestion__Group_5__1__Impl3973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__0__Impl_in_rule__SingleChoiceQuestion__Group__04007 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1_in_rule__SingleChoiceQuestion__Group__04010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__SingleChoiceQuestion__Group__0__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__1__Impl_in_rule__SingleChoiceQuestion__Group__14069 = new BitSet(new long[]{0x0000020002000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2_in_rule__SingleChoiceQuestion__Group__14072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__OptionalAssignment_1_in_rule__SingleChoiceQuestion__Group__1__Impl4099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__2__Impl_in_rule__SingleChoiceQuestion__Group__24130 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3_in_rule__SingleChoiceQuestion__Group__24133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__SingleChoiceQuestion__Group__2__Impl4161 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__3__Impl_in_rule__SingleChoiceQuestion__Group__34192 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4_in_rule__SingleChoiceQuestion__Group__34195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__SingleChoiceQuestion__Group__3__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__4__Impl_in_rule__SingleChoiceQuestion__Group__44254 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5_in_rule__SingleChoiceQuestion__Group__44257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__TextAssignment_4_in_rule__SingleChoiceQuestion__Group__4__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__5__Impl_in_rule__SingleChoiceQuestion__Group__54314 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6_in_rule__SingleChoiceQuestion__Group__54317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_5__0_in_rule__SingleChoiceQuestion__Group__5__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__6__Impl_in_rule__SingleChoiceQuestion__Group__64375 = new BitSet(new long[]{0x0000048000000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7_in_rule__SingleChoiceQuestion__Group__64378 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__SingleChoiceQuestion__Group__6__Impl4406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__7__Impl_in_rule__SingleChoiceQuestion__Group__74437 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__8_in_rule__SingleChoiceQuestion__Group__74440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_7_in_rule__SingleChoiceQuestion__Group__7__Impl4467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group__8__Impl_in_rule__SingleChoiceQuestion__Group__84497 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_8__0_in_rule__SingleChoiceQuestion__Group__8__Impl4524 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_5__0__Impl_in_rule__SingleChoiceQuestion__Group_5__04573 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_5__1_in_rule__SingleChoiceQuestion__Group_5__04576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__SingleChoiceQuestion__Group_5__0__Impl4604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_5__1__Impl_in_rule__SingleChoiceQuestion__Group_5__14635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__RequiresAssignment_5_1_in_rule__SingleChoiceQuestion__Group_5__1__Impl4662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_8__0__Impl_in_rule__SingleChoiceQuestion__Group_8__04696 = new BitSet(new long[]{0x0000048000000000L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_8__1_in_rule__SingleChoiceQuestion__Group_8__04699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__SingleChoiceQuestion__Group_8__0__Impl4727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__Group_8__1__Impl_in_rule__SingleChoiceQuestion__Group_8__14758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SingleChoiceQuestion__AnswersAssignment_8_1_in_rule__SingleChoiceQuestion__Group_8__1__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__0__Impl_in_rule__MultiChoiceQuestion__Group__04819 = new BitSet(new long[]{0x0000020004000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1_in_rule__MultiChoiceQuestion__Group__04822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__MultiChoiceQuestion__Group__0__Impl4850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__1__Impl_in_rule__MultiChoiceQuestion__Group__14881 = new BitSet(new long[]{0x0000020004000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2_in_rule__MultiChoiceQuestion__Group__14884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__OptionalAssignment_1_in_rule__MultiChoiceQuestion__Group__1__Impl4911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__2__Impl_in_rule__MultiChoiceQuestion__Group__24942 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3_in_rule__MultiChoiceQuestion__Group__24945 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__MultiChoiceQuestion__Group__2__Impl4973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__3__Impl_in_rule__MultiChoiceQuestion__Group__35004 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4_in_rule__MultiChoiceQuestion__Group__35007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__MultiChoiceQuestion__Group__3__Impl5035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__4__Impl_in_rule__MultiChoiceQuestion__Group__45066 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5_in_rule__MultiChoiceQuestion__Group__45069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__TextAssignment_4_in_rule__MultiChoiceQuestion__Group__4__Impl5096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__5__Impl_in_rule__MultiChoiceQuestion__Group__55126 = new BitSet(new long[]{0x0000000001800000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6_in_rule__MultiChoiceQuestion__Group__55129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_5__0_in_rule__MultiChoiceQuestion__Group__5__Impl5156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__6__Impl_in_rule__MultiChoiceQuestion__Group__65187 = new BitSet(new long[]{0x0000048000000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7_in_rule__MultiChoiceQuestion__Group__65190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__MultiChoiceQuestion__Group__6__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__7__Impl_in_rule__MultiChoiceQuestion__Group__75249 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__8_in_rule__MultiChoiceQuestion__Group__75252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_7_in_rule__MultiChoiceQuestion__Group__7__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group__8__Impl_in_rule__MultiChoiceQuestion__Group__85309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_8__0_in_rule__MultiChoiceQuestion__Group__8__Impl5336 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_5__0__Impl_in_rule__MultiChoiceQuestion__Group_5__05385 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_5__1_in_rule__MultiChoiceQuestion__Group_5__05388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__MultiChoiceQuestion__Group_5__0__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_5__1__Impl_in_rule__MultiChoiceQuestion__Group_5__15447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__RequiresAssignment_5_1_in_rule__MultiChoiceQuestion__Group_5__1__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_8__0__Impl_in_rule__MultiChoiceQuestion__Group_8__05508 = new BitSet(new long[]{0x0000048000000000L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_8__1_in_rule__MultiChoiceQuestion__Group_8__05511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__MultiChoiceQuestion__Group_8__0__Impl5539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__Group_8__1__Impl_in_rule__MultiChoiceQuestion__Group_8__15570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__MultiChoiceQuestion__AnswersAssignment_8_1_in_rule__MultiChoiceQuestion__Group_8__1__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__05631 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__05634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__And__Group__0__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__15693 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__And__Group__2_in_rule__And__Group__15696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__LhsAssignment_1_in_rule__And__Group__1__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__2__Impl_in_rule__And__Group__25753 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__And__Group__3_in_rule__And__Group__25756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__And__Group__2__Impl5784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__3__Impl_in_rule__And__Group__35815 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__And__Group__4_in_rule__And__Group__35818 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__RhsAssignment_3_in_rule__And__Group__3__Impl5845 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__And__Group__4__Impl_in_rule__And__Group__45875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__And__Group__4__Impl5903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__05944 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__05947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Or__Group__0__Impl5975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__16006 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Or__Group__2_in_rule__Or__Group__16009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Or__Group__1__Impl6037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__2__Impl_in_rule__Or__Group__26068 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__Or__Group__3_in_rule__Or__Group__26071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Or__Group__2__Impl6099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__3__Impl_in_rule__Or__Group__36130 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Or__Group__4_in_rule__Or__Group__36133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__LhsAssignment_3_in_rule__Or__Group__3__Impl6160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__4__Impl_in_rule__Or__Group__46190 = new BitSet(new long[]{0x0000000848000000L});
        public static final BitSet FOLLOW_rule__Or__Group__5_in_rule__Or__Group__46193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Or__Group__4__Impl6221 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__5__Impl_in_rule__Or__Group__56252 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__Or__Group__6_in_rule__Or__Group__56255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__RhsAssignment_5_in_rule__Or__Group__5__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Or__Group__6__Impl_in_rule__Or__Group__66312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Or__Group__6__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__0__Impl_in_rule__AnswerRef__Group__06385 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__1_in_rule__AnswerRef__Group__06388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__AnswerRef__Group__0__Impl6416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__1__Impl_in_rule__AnswerRef__Group__16447 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__2_in_rule__AnswerRef__Group__16450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AnswerRef__Group__1__Impl6478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__2__Impl_in_rule__AnswerRef__Group__26509 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__3_in_rule__AnswerRef__Group__26512 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__AnswerRef__Group__2__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__3__Impl_in_rule__AnswerRef__Group__36571 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__4_in_rule__AnswerRef__Group__36574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__RefersAssignment_3_in_rule__AnswerRef__Group__3__Impl6601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AnswerRef__Group__4__Impl_in_rule__AnswerRef__Group__46631 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__AnswerRef__Group__4__Impl6659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__0__Impl_in_rule__ChoiceAnswer__Group__06700 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1_in_rule__ChoiceAnswer__Group__06703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__SelectedAssignment_0_in_rule__ChoiceAnswer__Group__0__Impl6730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__1__Impl_in_rule__ChoiceAnswer__Group__16760 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2_in_rule__ChoiceAnswer__Group__16763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__ChoiceAnswer__Group__1__Impl6791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__2__Impl_in_rule__ChoiceAnswer__Group__26822 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3_in_rule__ChoiceAnswer__Group__26825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__ChoiceAnswer__Group__2__Impl6853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__3__Impl_in_rule__ChoiceAnswer__Group__36884 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__4_in_rule__ChoiceAnswer__Group__36887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__ChoiceAnswer__Group__3__Impl6915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__4__Impl_in_rule__ChoiceAnswer__Group__46946 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__5_in_rule__ChoiceAnswer__Group__46949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__TextAssignment_4_in_rule__ChoiceAnswer__Group__4__Impl6976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ChoiceAnswer__Group__5__Impl_in_rule__ChoiceAnswer__Group__57006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__ChoiceAnswer__Group__5__Impl7034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__0__Impl_in_rule__FreetextAnswer__Group__07077 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1_in_rule__FreetextAnswer__Group__07080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__FreetextAnswer__Group__0__Impl7108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__1__Impl_in_rule__FreetextAnswer__Group__17139 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2_in_rule__FreetextAnswer__Group__17142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__FreetextAnswer__Group__1__Impl7170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__2__Impl_in_rule__FreetextAnswer__Group__27201 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3_in_rule__FreetextAnswer__Group__27204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__FreetextAnswer__Group__2__Impl7232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__3__Impl_in_rule__FreetextAnswer__Group__37263 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__4_in_rule__FreetextAnswer__Group__37266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__TextAssignment_3_in_rule__FreetextAnswer__Group__3__Impl7293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__4__Impl_in_rule__FreetextAnswer__Group__47323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__5_in_rule__FreetextAnswer__Group__47326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__FreetextAnswer__Group__4__Impl7354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__5__Impl_in_rule__FreetextAnswer__Group__57385 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__6_in_rule__FreetextAnswer__Group__57388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__InputAssignment_5_in_rule__FreetextAnswer__Group__5__Impl7415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FreetextAnswer__Group__6__Impl_in_rule__FreetextAnswer__Group__67445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__FreetextAnswer__Group__6__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Survey__TitleAssignment_27523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_47554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Survey__PagesAssignment_5_17585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TitleAssignment_27616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__QuestionPage__TextAssignment_3_17647 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_57678 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQuestion_in_rule__QuestionPage__QuestionsAssignment_6_17709 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TitleAssignment_27740 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DescriptionPage__TextAssignment_3_17771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TitleAssignment_27802 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ResultPage__TextAssignment_3_17833 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__FreetextQuestion__OptionalAssignment_17869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextQuestion__TextAssignment_47908 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__FreetextQuestion__RequiresAssignment_5_17939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFreetextAnswer_in_rule__FreetextQuestion__AnswersAssignment_77970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__SingleChoiceQuestion__OptionalAssignment_18006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SingleChoiceQuestion__TextAssignment_48045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__SingleChoiceQuestion__RequiresAssignment_5_18076 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_78107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__SingleChoiceQuestion__AnswersAssignment_8_18138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__MultiChoiceQuestion__OptionalAssignment_18174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__MultiChoiceQuestion__TextAssignment_48213 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__MultiChoiceQuestion__RequiresAssignment_5_18244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_78275 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnswer_in_rule__MultiChoiceQuestion__AnswersAssignment_8_18306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__And__LhsAssignment_18337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__And__RhsAssignment_38368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Or__LhsAssignment_38399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDependency_in_rule__Or__RhsAssignment_58430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AnswerRef__RefersAssignment_38465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__ChoiceAnswer__SelectedAssignment_08505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__ChoiceAnswer__TextAssignment_48544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextAnswer__TextAssignment_38575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__FreetextAnswer__InputAssignment_58606 = new BitSet(new long[]{0x0000000000000002L});
    }


}