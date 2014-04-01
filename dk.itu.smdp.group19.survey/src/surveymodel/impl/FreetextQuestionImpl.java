/**
 */
package surveymodel.impl;

import org.eclipse.emf.ecore.EClass;

import surveymodel.FreetextAnswer;
import surveymodel.FreetextQuestion;
import surveymodel.SurveymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Freetext Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link surveymodel.impl.FreetextQuestionImpl#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreetextQuestionImpl extends QuestionImpl implements FreetextQuestion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreetextQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveymodelPackage.Literals.FREETEXT_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreetextAnswer getAnswers() {
		return (FreetextAnswer)eGet(SurveymodelPackage.Literals.FREETEXT_QUESTION__ANSWERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnswers(FreetextAnswer newAnswers) {
		eSet(SurveymodelPackage.Literals.FREETEXT_QUESTION__ANSWERS, newAnswers);
	}

} //FreetextQuestionImpl
