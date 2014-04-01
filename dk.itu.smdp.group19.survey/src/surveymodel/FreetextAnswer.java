/**
 */
package surveymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Freetext Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link surveymodel.FreetextAnswer#getInput <em>Input</em>}</li>
 * </ul>
 * </p>
 *
 * @see surveymodel.SurveymodelPackage#getFreetextAnswer()
 * @model
 * @generated
 */
public interface FreetextAnswer extends Answer {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' attribute.
	 * @see #setInput(String)
	 * @see surveymodel.SurveymodelPackage#getFreetextAnswer_Input()
	 * @model required="true"
	 * @generated
	 */
	String getInput();

	/**
	 * Sets the value of the '{@link surveymodel.FreetextAnswer#getInput <em>Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input</em>' attribute.
	 * @see #getInput()
	 * @generated
	 */
	void setInput(String value);

} // FreetextAnswer
