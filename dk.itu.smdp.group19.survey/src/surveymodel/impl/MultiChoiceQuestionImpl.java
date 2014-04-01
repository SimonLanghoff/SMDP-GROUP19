/**
 */
package surveymodel.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import surveymodel.Answer;
import surveymodel.MultiChoiceQuestion;
import surveymodel.SurveymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Choice Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link surveymodel.impl.MultiChoiceQuestionImpl#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiChoiceQuestionImpl extends QuestionImpl implements MultiChoiceQuestion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiChoiceQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveymodelPackage.Literals.MULTI_CHOICE_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Answer> getAnswers() {
		return (EList<Answer>)eGet(SurveymodelPackage.Literals.MULTI_CHOICE_QUESTION__ANSWERS, true);
	}

} //MultiChoiceQuestionImpl
