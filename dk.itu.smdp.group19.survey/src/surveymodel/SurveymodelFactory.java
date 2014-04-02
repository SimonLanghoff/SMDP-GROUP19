/**
 */
package surveymodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see surveymodel.SurveymodelPackage
 * @generated
 */
public interface SurveymodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveymodelFactory eINSTANCE = surveymodel.impl.SurveymodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey</em>'.
	 * @generated
	 */
	Survey createSurvey();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Question Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question Page</em>'.
	 * @generated
	 */
	QuestionPage createQuestionPage();

	/**
	 * Returns a new object of class '<em>Description Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Page</em>'.
	 * @generated
	 */
	DescriptionPage createDescriptionPage();

	/**
	 * Returns a new object of class '<em>Result Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Page</em>'.
	 * @generated
	 */
	ResultPage createResultPage();

	/**
	 * Returns a new object of class '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Question</em>'.
	 * @generated
	 */
	Question createQuestion();

	/**
	 * Returns a new object of class '<em>Freetext Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Freetext Question</em>'.
	 * @generated
	 */
	FreetextQuestion createFreetextQuestion();

	/**
	 * Returns a new object of class '<em>Single Choice Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Choice Question</em>'.
	 * @generated
	 */
	SingleChoiceQuestion createSingleChoiceQuestion();

	/**
	 * Returns a new object of class '<em>Multi Choice Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Choice Question</em>'.
	 * @generated
	 */
	MultiChoiceQuestion createMultiChoiceQuestion();

	/**
	 * Returns a new object of class '<em>Choice Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Choice Answer</em>'.
	 * @generated
	 */
	ChoiceAnswer createChoiceAnswer();

	/**
	 * Returns a new object of class '<em>Freetext Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Freetext Answer</em>'.
	 * @generated
	 */
	FreetextAnswer createFreetextAnswer();

	/**
	 * Returns a new object of class '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And</em>'.
	 * @generated
	 */
	And createAnd();

	/**
	 * Returns a new object of class '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or</em>'.
	 * @generated
	 */
	Or createOr();

	/**
	 * Returns a new object of class '<em>Answer Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer Ref</em>'.
	 * @generated
	 */
	AnswerRef createAnswerRef();

	/**
	 * Returns a new object of class '<em>Not</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not</em>'.
	 * @generated
	 */
	Not createNot();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurveymodelPackage getSurveymodelPackage();

} //SurveymodelFactory
