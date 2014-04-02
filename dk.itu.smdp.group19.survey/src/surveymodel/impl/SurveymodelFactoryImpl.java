/**
 */
package surveymodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import surveymodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveymodelFactoryImpl extends EFactoryImpl implements SurveymodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurveymodelFactory init() {
		try {
			SurveymodelFactory theSurveymodelFactory = (SurveymodelFactory)EPackage.Registry.INSTANCE.getEFactory(SurveymodelPackage.eNS_URI);
			if (theSurveymodelFactory != null) {
				return theSurveymodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurveymodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveymodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurveymodelPackage.SURVEY: return (EObject)createSurvey();
			case SurveymodelPackage.PAGE: return (EObject)createPage();
			case SurveymodelPackage.QUESTION_PAGE: return (EObject)createQuestionPage();
			case SurveymodelPackage.DESCRIPTION_PAGE: return (EObject)createDescriptionPage();
			case SurveymodelPackage.RESULT_PAGE: return (EObject)createResultPage();
			case SurveymodelPackage.QUESTION: return (EObject)createQuestion();
			case SurveymodelPackage.FREETEXT_QUESTION: return (EObject)createFreetextQuestion();
			case SurveymodelPackage.SINGLE_CHOICE_QUESTION: return (EObject)createSingleChoiceQuestion();
			case SurveymodelPackage.MULTI_CHOICE_QUESTION: return (EObject)createMultiChoiceQuestion();
			case SurveymodelPackage.CHOICE_ANSWER: return (EObject)createChoiceAnswer();
			case SurveymodelPackage.FREETEXT_ANSWER: return (EObject)createFreetextAnswer();
			case SurveymodelPackage.AND: return (EObject)createAnd();
			case SurveymodelPackage.OR: return (EObject)createOr();
			case SurveymodelPackage.ANSWER_REF: return (EObject)createAnswerRef();
			case SurveymodelPackage.NOT: return (EObject)createNot();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionPage createQuestionPage() {
		QuestionPageImpl questionPage = new QuestionPageImpl();
		return questionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionPage createDescriptionPage() {
		DescriptionPageImpl descriptionPage = new DescriptionPageImpl();
		return descriptionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultPage createResultPage() {
		ResultPageImpl resultPage = new ResultPageImpl();
		return resultPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreetextQuestion createFreetextQuestion() {
		FreetextQuestionImpl freetextQuestion = new FreetextQuestionImpl();
		return freetextQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleChoiceQuestion createSingleChoiceQuestion() {
		SingleChoiceQuestionImpl singleChoiceQuestion = new SingleChoiceQuestionImpl();
		return singleChoiceQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiChoiceQuestion createMultiChoiceQuestion() {
		MultiChoiceQuestionImpl multiChoiceQuestion = new MultiChoiceQuestionImpl();
		return multiChoiceQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChoiceAnswer createChoiceAnswer() {
		ChoiceAnswerImpl choiceAnswer = new ChoiceAnswerImpl();
		return choiceAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreetextAnswer createFreetextAnswer() {
		FreetextAnswerImpl freetextAnswer = new FreetextAnswerImpl();
		return freetextAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerRef createAnswerRef() {
		AnswerRefImpl answerRef = new AnswerRefImpl();
		return answerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Not createNot() {
		NotImpl not = new NotImpl();
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveymodelPackage getSurveymodelPackage() {
		return (SurveymodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurveymodelPackage getPackage() {
		return SurveymodelPackage.eINSTANCE;
	}

} //SurveymodelFactoryImpl
