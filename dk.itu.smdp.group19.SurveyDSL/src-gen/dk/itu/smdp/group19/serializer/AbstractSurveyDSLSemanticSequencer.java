package dk.itu.smdp.group19.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.group19.services.SurveyDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import surveymodel.And;
import surveymodel.AnswerRef;
import surveymodel.ChoiceAnswer;
import surveymodel.DescriptionPage;
import surveymodel.FreetextAnswer;
import surveymodel.FreetextQuestion;
import surveymodel.MultiChoiceQuestion;
import surveymodel.Not;
import surveymodel.Or;
import surveymodel.QuestionPage;
import surveymodel.ResultPage;
import surveymodel.SingleChoiceQuestion;
import surveymodel.Survey;
import surveymodel.SurveymodelPackage;

@SuppressWarnings("all")
public abstract class AbstractSurveyDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SurveyDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveymodelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveymodelPackage.AND:
				if(context == grammarAccess.getBottomRule() ||
				   context == grammarAccess.getCheckAndRule() ||
				   context == grammarAccess.getCheckAndAccess().getAndLhsAction_1_0() ||
				   context == grammarAccess.getCheckNotRule() ||
				   context == grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2() ||
				   context == grammarAccess.getCheckOrRule() ||
				   context == grammarAccess.getCheckOrAccess().getOrLhsAction_1_0() ||
				   context == grammarAccess.getDependencyRule()) {
					sequence_CheckAnd(context, (And) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.ANSWER_REF:
				if(context == grammarAccess.getAnswerRefRule() ||
				   context == grammarAccess.getBottomRule() ||
				   context == grammarAccess.getCheckAndRule() ||
				   context == grammarAccess.getCheckAndAccess().getAndLhsAction_1_0() ||
				   context == grammarAccess.getCheckNotRule() ||
				   context == grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2() ||
				   context == grammarAccess.getCheckOrRule() ||
				   context == grammarAccess.getCheckOrAccess().getOrLhsAction_1_0() ||
				   context == grammarAccess.getDependencyRule()) {
					sequence_AnswerRef(context, (AnswerRef) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.CHOICE_ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getChoiceAnswerRule()) {
					sequence_ChoiceAnswer(context, (ChoiceAnswer) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.DESCRIPTION_PAGE:
				if(context == grammarAccess.getDescriptionPageRule() ||
				   context == grammarAccess.getPageRule()) {
					sequence_DescriptionPage(context, (DescriptionPage) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.FREETEXT_ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getFreetextAnswerRule()) {
					sequence_FreetextAnswer(context, (FreetextAnswer) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.FREETEXT_QUESTION:
				if(context == grammarAccess.getFreetextQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_FreetextQuestion(context, (FreetextQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.MULTI_CHOICE_QUESTION:
				if(context == grammarAccess.getMultiChoiceQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultiChoiceQuestion(context, (MultiChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.NOT:
				if(context == grammarAccess.getBottomRule() ||
				   context == grammarAccess.getCheckAndRule() ||
				   context == grammarAccess.getCheckAndAccess().getAndLhsAction_1_0() ||
				   context == grammarAccess.getCheckNotRule() ||
				   context == grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2() ||
				   context == grammarAccess.getCheckOrRule() ||
				   context == grammarAccess.getCheckOrAccess().getOrLhsAction_1_0() ||
				   context == grammarAccess.getDependencyRule()) {
					sequence_CheckNot(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.OR:
				if(context == grammarAccess.getBottomRule() ||
				   context == grammarAccess.getCheckAndRule() ||
				   context == grammarAccess.getCheckAndAccess().getAndLhsAction_1_0() ||
				   context == grammarAccess.getCheckNotRule() ||
				   context == grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2() ||
				   context == grammarAccess.getCheckOrRule() ||
				   context == grammarAccess.getCheckOrAccess().getOrLhsAction_1_0() ||
				   context == grammarAccess.getDependencyRule()) {
					sequence_CheckOr(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.QUESTION_PAGE:
				if(context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getQuestionPageRule()) {
					sequence_QuestionPage(context, (QuestionPage) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.RESULT_PAGE:
				if(context == grammarAccess.getPageRule() ||
				   context == grammarAccess.getResultPageRule()) {
					sequence_ResultPage(context, (ResultPage) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.SINGLE_CHOICE_QUESTION:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSingleChoiceQuestionRule()) {
					sequence_SingleChoiceQuestion(context, (SingleChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case SurveymodelPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     refers=[Answer|EString]
	 */
	protected void sequence_AnswerRef(EObject context, AnswerRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER_REF__REFERS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER_REF__REFERS));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getAnswerRefAccess().getRefersAnswerEStringParserRuleCall_0_1(), semanticObject.getRefers());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=CheckAnd_And_1_0 rhs=CheckNot)
	 */
	protected void sequence_CheckAnd(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__LHS));
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckAndAccess().getAndLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCheckAndAccess().getRhsCheckNotParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     dependency=CheckNot_Not_0_2
	 */
	protected void sequence_CheckNot(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.NOT__DEPENDENCY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.NOT__DEPENDENCY));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckNotAccess().getNotDependencyAction_0_2(), semanticObject.getDependency());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=CheckOr_Or_1_0 rhs=CheckAnd)
	 */
	protected void sequence_CheckOr(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__LHS));
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.EXPRESSION__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getCheckOrAccess().getOrLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getCheckOrAccess().getRhsCheckAndParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=EString)
	 */
	protected void sequence_ChoiceAnswer(EObject context, ChoiceAnswer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__TEXT));
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getChoiceAnswerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getChoiceAnswerAccess().getTextEStringParserRuleCall_3_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString text=EString?)
	 */
	protected void sequence_DescriptionPage(EObject context, DescriptionPage semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=EString)
	 */
	protected void sequence_FreetextAnswer(EObject context, FreetextAnswer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__TEXT));
			if(transientValues.isValueTransient((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, SurveymodelPackage.Literals.ANSWER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getFreetextAnswerAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFreetextAnswerAccess().getTextEStringParserRuleCall_3_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (optional?='optional'? text=EString requires=Dependency? answers=FreetextAnswer)
	 */
	protected void sequence_FreetextQuestion(EObject context, FreetextQuestion semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optional?='optional'? text=EString requires=Dependency? answers+=Answer answers+=Answer*)
	 */
	protected void sequence_MultiChoiceQuestion(EObject context, MultiChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString text=EString? questions+=Question questions+=Question*)
	 */
	protected void sequence_QuestionPage(EObject context, QuestionPage semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString text=EString?)
	 */
	protected void sequence_ResultPage(EObject context, ResultPage semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optional?='optional'? text=EString requires=Dependency? answers+=Answer answers+=Answer*)
	 */
	protected void sequence_SingleChoiceQuestion(EObject context, SingleChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString pages+=Page pages+=Page*)
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
}
