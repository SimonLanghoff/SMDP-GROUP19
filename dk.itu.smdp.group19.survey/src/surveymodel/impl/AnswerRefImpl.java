/**
 */
package surveymodel.impl;

import org.eclipse.emf.ecore.EClass;

import surveymodel.Answer;
import surveymodel.AnswerRef;
import surveymodel.SurveymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link surveymodel.impl.AnswerRefImpl#getRefers <em>Refers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerRefImpl extends DependencyImpl implements AnswerRef {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveymodelPackage.Literals.ANSWER_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getRefers() {
		return (Answer)eGet(SurveymodelPackage.Literals.ANSWER_REF__REFERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefers(Answer newRefers) {
		eSet(SurveymodelPackage.Literals.ANSWER_REF__REFERS, newRefers);
	}

} //AnswerRefImpl
