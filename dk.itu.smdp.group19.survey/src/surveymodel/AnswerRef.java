/**
 */
package surveymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link surveymodel.AnswerRef#getRefers <em>Refers</em>}</li>
 * </ul>
 * </p>
 *
 * @see surveymodel.SurveymodelPackage#getAnswerRef()
 * @model
 * @generated
 */
public interface AnswerRef extends Dependency {
	/**
	 * Returns the value of the '<em><b>Refers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refers</em>' reference.
	 * @see #setRefers(Answer)
	 * @see surveymodel.SurveymodelPackage#getAnswerRef_Refers()
	 * @model required="true"
	 * @generated
	 */
	Answer getRefers();

	/**
	 * Sets the value of the '{@link surveymodel.AnswerRef#getRefers <em>Refers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refers</em>' reference.
	 * @see #getRefers()
	 * @generated
	 */
	void setRefers(Answer value);

} // AnswerRef
