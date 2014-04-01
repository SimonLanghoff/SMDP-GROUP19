/**
 */
package surveymodel.impl;

import org.eclipse.emf.ecore.EClass;

import surveymodel.ChoiceAnswer;
import surveymodel.SurveymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link surveymodel.impl.ChoiceAnswerImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceAnswerImpl extends AnswerImpl implements ChoiceAnswer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveymodelPackage.Literals.CHOICE_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return (Boolean)eGet(SurveymodelPackage.Literals.CHOICE_ANSWER__SELECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		eSet(SurveymodelPackage.Literals.CHOICE_ANSWER__SELECTED, newSelected);
	}

} //ChoiceAnswerImpl
