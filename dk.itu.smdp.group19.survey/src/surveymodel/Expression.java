/**
 */
package surveymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link surveymodel.Expression#getLhs <em>Lhs</em>}</li>
 *   <li>{@link surveymodel.Expression#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see surveymodel.SurveymodelPackage#getExpression()
 * @model abstract="true"
 * @generated
 */
public interface Expression extends Dependency {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Dependency)
	 * @see surveymodel.SurveymodelPackage#getExpression_Lhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dependency getLhs();

	/**
	 * Sets the value of the '{@link surveymodel.Expression#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Dependency value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Dependency)
	 * @see surveymodel.SurveymodelPackage#getExpression_Rhs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dependency getRhs();

	/**
	 * Sets the value of the '{@link surveymodel.Expression#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Dependency value);

} // Expression
