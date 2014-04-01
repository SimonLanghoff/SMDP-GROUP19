/**
 */
package surveymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freetext Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link surveymodel.FreetextQuestion#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @see surveymodel.SurveymodelPackage#getFreetextQuestion()
 * @model
 * @generated
 */
public interface FreetextQuestion extends Question {
	/**
	 * Returns the value of the '<em><b>Answers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answers</em>' containment reference.
	 * @see #setAnswers(FreetextAnswer)
	 * @see surveymodel.SurveymodelPackage#getFreetextQuestion_Answers()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FreetextAnswer getAnswers();

	/**
	 * Sets the value of the '{@link surveymodel.FreetextQuestion#getAnswers <em>Answers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answers</em>' containment reference.
	 * @see #getAnswers()
	 * @generated
	 */
	void setAnswers(FreetextAnswer value);

} // FreetextQuestion
