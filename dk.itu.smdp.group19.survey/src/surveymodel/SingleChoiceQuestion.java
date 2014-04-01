/**
 */
package surveymodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link surveymodel.SingleChoiceQuestion#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @see surveymodel.SurveymodelPackage#getSingleChoiceQuestion()
 * @model
 * @generated
 */
public interface SingleChoiceQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference list.
	 * The list contents are of type {@link surveymodel.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference list.
	 * @see surveymodel.SurveymodelPackage#getSingleChoiceQuestion_Answers()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<Answer> getAnswers();

} // SingleChoiceQuestion
