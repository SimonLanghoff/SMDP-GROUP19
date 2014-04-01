/*
* generated by Xtext
*/
package dk.itu.smdp.group19.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.itu.smdp.group19.services.SurveyDSLGrammarAccess;

public class SurveyDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private SurveyDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.itu.smdp.group19.ui.contentassist.antlr.internal.InternalSurveyDSLParser createParser() {
		dk.itu.smdp.group19.ui.contentassist.antlr.internal.InternalSurveyDSLParser result = new dk.itu.smdp.group19.ui.contentassist.antlr.internal.InternalSurveyDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPageAccess().getAlternatives(), "rule__Page__Alternatives");
					put(grammarAccess.getQuestionAccess().getAlternatives(), "rule__Question__Alternatives");
					put(grammarAccess.getDependencyAccess().getAlternatives(), "rule__Dependency__Alternatives");
					put(grammarAccess.getAnswerAccess().getAlternatives(), "rule__Answer__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getSurveyAccess().getGroup(), "rule__Survey__Group__0");
					put(grammarAccess.getSurveyAccess().getGroup_5(), "rule__Survey__Group_5__0");
					put(grammarAccess.getQuestionPageAccess().getGroup(), "rule__QuestionPage__Group__0");
					put(grammarAccess.getQuestionPageAccess().getGroup_3(), "rule__QuestionPage__Group_3__0");
					put(grammarAccess.getQuestionPageAccess().getGroup_6(), "rule__QuestionPage__Group_6__0");
					put(grammarAccess.getDescriptionPageAccess().getGroup(), "rule__DescriptionPage__Group__0");
					put(grammarAccess.getDescriptionPageAccess().getGroup_3(), "rule__DescriptionPage__Group_3__0");
					put(grammarAccess.getResultPageAccess().getGroup(), "rule__ResultPage__Group__0");
					put(grammarAccess.getResultPageAccess().getGroup_3(), "rule__ResultPage__Group_3__0");
					put(grammarAccess.getFreetextQuestionAccess().getGroup(), "rule__FreetextQuestion__Group__0");
					put(grammarAccess.getFreetextQuestionAccess().getGroup_5(), "rule__FreetextQuestion__Group_5__0");
					put(grammarAccess.getSingleChoiceQuestionAccess().getGroup(), "rule__SingleChoiceQuestion__Group__0");
					put(grammarAccess.getSingleChoiceQuestionAccess().getGroup_5(), "rule__SingleChoiceQuestion__Group_5__0");
					put(grammarAccess.getSingleChoiceQuestionAccess().getGroup_8(), "rule__SingleChoiceQuestion__Group_8__0");
					put(grammarAccess.getMultiChoiceQuestionAccess().getGroup(), "rule__MultiChoiceQuestion__Group__0");
					put(grammarAccess.getMultiChoiceQuestionAccess().getGroup_5(), "rule__MultiChoiceQuestion__Group_5__0");
					put(grammarAccess.getMultiChoiceQuestionAccess().getGroup_8(), "rule__MultiChoiceQuestion__Group_8__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getAnswerRefAccess().getGroup(), "rule__AnswerRef__Group__0");
					put(grammarAccess.getChoiceAnswerAccess().getGroup(), "rule__ChoiceAnswer__Group__0");
					put(grammarAccess.getFreetextAnswerAccess().getGroup(), "rule__FreetextAnswer__Group__0");
					put(grammarAccess.getSurveyAccess().getTitleAssignment_2(), "rule__Survey__TitleAssignment_2");
					put(grammarAccess.getSurveyAccess().getPagesAssignment_4(), "rule__Survey__PagesAssignment_4");
					put(grammarAccess.getSurveyAccess().getPagesAssignment_5_1(), "rule__Survey__PagesAssignment_5_1");
					put(grammarAccess.getQuestionPageAccess().getTitleAssignment_2(), "rule__QuestionPage__TitleAssignment_2");
					put(grammarAccess.getQuestionPageAccess().getTextAssignment_3_1(), "rule__QuestionPage__TextAssignment_3_1");
					put(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_5(), "rule__QuestionPage__QuestionsAssignment_5");
					put(grammarAccess.getQuestionPageAccess().getQuestionsAssignment_6_1(), "rule__QuestionPage__QuestionsAssignment_6_1");
					put(grammarAccess.getDescriptionPageAccess().getTitleAssignment_2(), "rule__DescriptionPage__TitleAssignment_2");
					put(grammarAccess.getDescriptionPageAccess().getTextAssignment_3_1(), "rule__DescriptionPage__TextAssignment_3_1");
					put(grammarAccess.getResultPageAccess().getTitleAssignment_2(), "rule__ResultPage__TitleAssignment_2");
					put(grammarAccess.getResultPageAccess().getTextAssignment_3_1(), "rule__ResultPage__TextAssignment_3_1");
					put(grammarAccess.getFreetextQuestionAccess().getOptionalAssignment_1(), "rule__FreetextQuestion__OptionalAssignment_1");
					put(grammarAccess.getFreetextQuestionAccess().getTextAssignment_4(), "rule__FreetextQuestion__TextAssignment_4");
					put(grammarAccess.getFreetextQuestionAccess().getRequiresAssignment_5_1(), "rule__FreetextQuestion__RequiresAssignment_5_1");
					put(grammarAccess.getFreetextQuestionAccess().getAnswersAssignment_7(), "rule__FreetextQuestion__AnswersAssignment_7");
					put(grammarAccess.getSingleChoiceQuestionAccess().getOptionalAssignment_1(), "rule__SingleChoiceQuestion__OptionalAssignment_1");
					put(grammarAccess.getSingleChoiceQuestionAccess().getTextAssignment_4(), "rule__SingleChoiceQuestion__TextAssignment_4");
					put(grammarAccess.getSingleChoiceQuestionAccess().getRequiresAssignment_5_1(), "rule__SingleChoiceQuestion__RequiresAssignment_5_1");
					put(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_7(), "rule__SingleChoiceQuestion__AnswersAssignment_7");
					put(grammarAccess.getSingleChoiceQuestionAccess().getAnswersAssignment_8_1(), "rule__SingleChoiceQuestion__AnswersAssignment_8_1");
					put(grammarAccess.getMultiChoiceQuestionAccess().getOptionalAssignment_1(), "rule__MultiChoiceQuestion__OptionalAssignment_1");
					put(grammarAccess.getMultiChoiceQuestionAccess().getTextAssignment_4(), "rule__MultiChoiceQuestion__TextAssignment_4");
					put(grammarAccess.getMultiChoiceQuestionAccess().getRequiresAssignment_5_1(), "rule__MultiChoiceQuestion__RequiresAssignment_5_1");
					put(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_7(), "rule__MultiChoiceQuestion__AnswersAssignment_7");
					put(grammarAccess.getMultiChoiceQuestionAccess().getAnswersAssignment_8_1(), "rule__MultiChoiceQuestion__AnswersAssignment_8_1");
					put(grammarAccess.getAndAccess().getLhsAssignment_1(), "rule__And__LhsAssignment_1");
					put(grammarAccess.getAndAccess().getRhsAssignment_3(), "rule__And__RhsAssignment_3");
					put(grammarAccess.getOrAccess().getLhsAssignment_3(), "rule__Or__LhsAssignment_3");
					put(grammarAccess.getOrAccess().getRhsAssignment_5(), "rule__Or__RhsAssignment_5");
					put(grammarAccess.getAnswerRefAccess().getRefersAssignment_3(), "rule__AnswerRef__RefersAssignment_3");
					put(grammarAccess.getChoiceAnswerAccess().getSelectedAssignment_0(), "rule__ChoiceAnswer__SelectedAssignment_0");
					put(grammarAccess.getChoiceAnswerAccess().getTextAssignment_4(), "rule__ChoiceAnswer__TextAssignment_4");
					put(grammarAccess.getFreetextAnswerAccess().getTextAssignment_3(), "rule__FreetextAnswer__TextAssignment_3");
					put(grammarAccess.getFreetextAnswerAccess().getInputAssignment_5(), "rule__FreetextAnswer__InputAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.itu.smdp.group19.ui.contentassist.antlr.internal.InternalSurveyDSLParser typedParser = (dk.itu.smdp.group19.ui.contentassist.antlr.internal.InternalSurveyDSLParser) parser;
			typedParser.entryRuleSurvey();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SurveyDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SurveyDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
