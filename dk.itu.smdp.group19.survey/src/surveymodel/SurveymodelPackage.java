/**
 */
package surveymodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see surveymodel.SurveymodelFactory
 * @model kind="package"
 * @generated
 */
public interface SurveymodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "surveymodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/dk.itu.smdp.group19.survey/model/Survey.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "surveymodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveymodelPackage eINSTANCE = surveymodel.impl.SurveymodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link surveymodel.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.SurveyImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__PAGES = 1;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.PageImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.QuestionPageImpl <em>Question Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.QuestionPageImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getQuestionPage()
	 * @generated
	 */
	int QUESTION_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__TEXT = PAGE__TEXT;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE__QUESTIONS = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Question Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Question Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.DescriptionPageImpl <em>Description Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.DescriptionPageImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getDescriptionPage()
	 * @generated
	 */
	int DESCRIPTION_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PAGE__TEXT = PAGE__TEXT;

	/**
	 * The number of structural features of the '<em>Description Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Description Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.ResultPageImpl <em>Result Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.ResultPageImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getResultPage()
	 * @generated
	 */
	int RESULT_PAGE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__TITLE = PAGE__TITLE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE__TEXT = PAGE__TEXT;

	/**
	 * The number of structural features of the '<em>Result Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Result Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESULT_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.QuestionImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTIONAL = 1;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REQUIRES = 2;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.FreetextQuestionImpl <em>Freetext Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.FreetextQuestionImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getFreetextQuestion()
	 * @generated
	 */
	int FREETEXT_QUESTION = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_QUESTION__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_QUESTION__REQUIRES = QUESTION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_QUESTION__ANSWERS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Freetext Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Freetext Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.SingleChoiceQuestionImpl <em>Single Choice Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.SingleChoiceQuestionImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getSingleChoiceQuestion()
	 * @generated
	 */
	int SINGLE_CHOICE_QUESTION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__REQUIRES = QUESTION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION__ANSWERS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CHOICE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.MultiChoiceQuestionImpl <em>Multi Choice Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.MultiChoiceQuestionImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getMultiChoiceQuestion()
	 * @generated
	 */
	int MULTI_CHOICE_QUESTION = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_QUESTION__TEXT = QUESTION__TEXT;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_QUESTION__OPTIONAL = QUESTION__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_QUESTION__REQUIRES = QUESTION__REQUIRES;

	/**
	 * The feature id for the '<em><b>Answers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_QUESTION__ANSWERS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi Choice Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CHOICE_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.AnswerImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 11;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.ChoiceAnswerImpl <em>Choice Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.ChoiceAnswerImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getChoiceAnswer()
	 * @generated
	 */
	int CHOICE_ANSWER = 9;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_ANSWER__TEXT = ANSWER__TEXT;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_ANSWER__SELECTED = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Choice Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.FreetextAnswerImpl <em>Freetext Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.FreetextAnswerImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getFreetextAnswer()
	 * @generated
	 */
	int FREETEXT_ANSWER = 10;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_ANSWER__TEXT = ANSWER__TEXT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_ANSWER__INPUT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Freetext Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Freetext Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREETEXT_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.DependencyImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 15;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.ExpressionImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LHS = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__RHS = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.AndImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getAnd()
	 * @generated
	 */
	int AND = 12;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__LHS = EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__RHS = EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.OrImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getOr()
	 * @generated
	 */
	int OR = 13;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__LHS = EXPRESSION__LHS;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__RHS = EXPRESSION__RHS;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link surveymodel.impl.AnswerRefImpl <em>Answer Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see surveymodel.impl.AnswerRefImpl
	 * @see surveymodel.impl.SurveymodelPackageImpl#getAnswerRef()
	 * @generated
	 */
	int ANSWER_REF = 16;

	/**
	 * The feature id for the '<em><b>Refers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF__REFERS = DEPENDENCY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Answer Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Answer Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_REF_OPERATION_COUNT = DEPENDENCY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link surveymodel.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see surveymodel.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.Survey#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see surveymodel.Survey#getTitle()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link surveymodel.Survey#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see surveymodel.Survey#getPages()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Pages();

	/**
	 * Returns the meta object for class '{@link surveymodel.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see surveymodel.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see surveymodel.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.Page#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see surveymodel.Page#getText()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Text();

	/**
	 * Returns the meta object for class '{@link surveymodel.QuestionPage <em>Question Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question Page</em>'.
	 * @see surveymodel.QuestionPage
	 * @generated
	 */
	EClass getQuestionPage();

	/**
	 * Returns the meta object for the containment reference list '{@link surveymodel.QuestionPage#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see surveymodel.QuestionPage#getQuestions()
	 * @see #getQuestionPage()
	 * @generated
	 */
	EReference getQuestionPage_Questions();

	/**
	 * Returns the meta object for class '{@link surveymodel.DescriptionPage <em>Description Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description Page</em>'.
	 * @see surveymodel.DescriptionPage
	 * @generated
	 */
	EClass getDescriptionPage();

	/**
	 * Returns the meta object for class '{@link surveymodel.ResultPage <em>Result Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Result Page</em>'.
	 * @see surveymodel.ResultPage
	 * @generated
	 */
	EClass getResultPage();

	/**
	 * Returns the meta object for class '{@link surveymodel.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see surveymodel.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.Question#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see surveymodel.Question#getText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Text();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.Question#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see surveymodel.Question#isOptional()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Optional();

	/**
	 * Returns the meta object for the containment reference '{@link surveymodel.Question#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requires</em>'.
	 * @see surveymodel.Question#getRequires()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Requires();

	/**
	 * Returns the meta object for class '{@link surveymodel.FreetextQuestion <em>Freetext Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freetext Question</em>'.
	 * @see surveymodel.FreetextQuestion
	 * @generated
	 */
	EClass getFreetextQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link surveymodel.FreetextQuestion#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answers</em>'.
	 * @see surveymodel.FreetextQuestion#getAnswers()
	 * @see #getFreetextQuestion()
	 * @generated
	 */
	EReference getFreetextQuestion_Answers();

	/**
	 * Returns the meta object for class '{@link surveymodel.SingleChoiceQuestion <em>Single Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Choice Question</em>'.
	 * @see surveymodel.SingleChoiceQuestion
	 * @generated
	 */
	EClass getSingleChoiceQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link surveymodel.SingleChoiceQuestion#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see surveymodel.SingleChoiceQuestion#getAnswers()
	 * @see #getSingleChoiceQuestion()
	 * @generated
	 */
	EReference getSingleChoiceQuestion_Answers();

	/**
	 * Returns the meta object for class '{@link surveymodel.MultiChoiceQuestion <em>Multi Choice Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Choice Question</em>'.
	 * @see surveymodel.MultiChoiceQuestion
	 * @generated
	 */
	EClass getMultiChoiceQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link surveymodel.MultiChoiceQuestion#getAnswers <em>Answers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answers</em>'.
	 * @see surveymodel.MultiChoiceQuestion#getAnswers()
	 * @see #getMultiChoiceQuestion()
	 * @generated
	 */
	EReference getMultiChoiceQuestion_Answers();

	/**
	 * Returns the meta object for class '{@link surveymodel.ChoiceAnswer <em>Choice Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice Answer</em>'.
	 * @see surveymodel.ChoiceAnswer
	 * @generated
	 */
	EClass getChoiceAnswer();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.ChoiceAnswer#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see surveymodel.ChoiceAnswer#isSelected()
	 * @see #getChoiceAnswer()
	 * @generated
	 */
	EAttribute getChoiceAnswer_Selected();

	/**
	 * Returns the meta object for class '{@link surveymodel.FreetextAnswer <em>Freetext Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Freetext Answer</em>'.
	 * @see surveymodel.FreetextAnswer
	 * @generated
	 */
	EClass getFreetextAnswer();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.FreetextAnswer#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see surveymodel.FreetextAnswer#getInput()
	 * @see #getFreetextAnswer()
	 * @generated
	 */
	EAttribute getFreetextAnswer_Input();

	/**
	 * Returns the meta object for class '{@link surveymodel.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see surveymodel.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link surveymodel.Answer#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see surveymodel.Answer#getText()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Text();

	/**
	 * Returns the meta object for class '{@link surveymodel.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see surveymodel.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for class '{@link surveymodel.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see surveymodel.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for class '{@link surveymodel.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see surveymodel.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the containment reference '{@link surveymodel.Expression#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see surveymodel.Expression#getLhs()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link surveymodel.Expression#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see surveymodel.Expression#getRhs()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Rhs();

	/**
	 * Returns the meta object for class '{@link surveymodel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see surveymodel.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link surveymodel.AnswerRef <em>Answer Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer Ref</em>'.
	 * @see surveymodel.AnswerRef
	 * @generated
	 */
	EClass getAnswerRef();

	/**
	 * Returns the meta object for the reference '{@link surveymodel.AnswerRef#getRefers <em>Refers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Refers</em>'.
	 * @see surveymodel.AnswerRef#getRefers()
	 * @see #getAnswerRef()
	 * @generated
	 */
	EReference getAnswerRef_Refers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveymodelFactory getSurveymodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link surveymodel.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.SurveyImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__TITLE = eINSTANCE.getSurvey_Title();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__PAGES = eINSTANCE.getSurvey_Pages();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.PageImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TEXT = eINSTANCE.getPage_Text();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.QuestionPageImpl <em>Question Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.QuestionPageImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getQuestionPage()
		 * @generated
		 */
		EClass QUESTION_PAGE = eINSTANCE.getQuestionPage();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION_PAGE__QUESTIONS = eINSTANCE.getQuestionPage_Questions();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.DescriptionPageImpl <em>Description Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.DescriptionPageImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getDescriptionPage()
		 * @generated
		 */
		EClass DESCRIPTION_PAGE = eINSTANCE.getDescriptionPage();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.ResultPageImpl <em>Result Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.ResultPageImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getResultPage()
		 * @generated
		 */
		EClass RESULT_PAGE = eINSTANCE.getResultPage();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.QuestionImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__OPTIONAL = eINSTANCE.getQuestion_Optional();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__REQUIRES = eINSTANCE.getQuestion_Requires();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.FreetextQuestionImpl <em>Freetext Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.FreetextQuestionImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getFreetextQuestion()
		 * @generated
		 */
		EClass FREETEXT_QUESTION = eINSTANCE.getFreetextQuestion();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREETEXT_QUESTION__ANSWERS = eINSTANCE.getFreetextQuestion_Answers();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.SingleChoiceQuestionImpl <em>Single Choice Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.SingleChoiceQuestionImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getSingleChoiceQuestion()
		 * @generated
		 */
		EClass SINGLE_CHOICE_QUESTION = eINSTANCE.getSingleChoiceQuestion();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_CHOICE_QUESTION__ANSWERS = eINSTANCE.getSingleChoiceQuestion_Answers();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.MultiChoiceQuestionImpl <em>Multi Choice Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.MultiChoiceQuestionImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getMultiChoiceQuestion()
		 * @generated
		 */
		EClass MULTI_CHOICE_QUESTION = eINSTANCE.getMultiChoiceQuestion();

		/**
		 * The meta object literal for the '<em><b>Answers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CHOICE_QUESTION__ANSWERS = eINSTANCE.getMultiChoiceQuestion_Answers();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.ChoiceAnswerImpl <em>Choice Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.ChoiceAnswerImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getChoiceAnswer()
		 * @generated
		 */
		EClass CHOICE_ANSWER = eINSTANCE.getChoiceAnswer();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE_ANSWER__SELECTED = eINSTANCE.getChoiceAnswer_Selected();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.FreetextAnswerImpl <em>Freetext Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.FreetextAnswerImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getFreetextAnswer()
		 * @generated
		 */
		EClass FREETEXT_ANSWER = eINSTANCE.getFreetextAnswer();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FREETEXT_ANSWER__INPUT = eINSTANCE.getFreetextAnswer_Input();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.AnswerImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__TEXT = eINSTANCE.getAnswer_Text();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.AndImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.OrImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.ExpressionImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LHS = eINSTANCE.getExpression_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__RHS = eINSTANCE.getExpression_Rhs();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.DependencyImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link surveymodel.impl.AnswerRefImpl <em>Answer Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see surveymodel.impl.AnswerRefImpl
		 * @see surveymodel.impl.SurveymodelPackageImpl#getAnswerRef()
		 * @generated
		 */
		EClass ANSWER_REF = eINSTANCE.getAnswerRef();

		/**
		 * The meta object literal for the '<em><b>Refers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANSWER_REF__REFERS = eINSTANCE.getAnswerRef_Refers();

	}

} //SurveymodelPackage
