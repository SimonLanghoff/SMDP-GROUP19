/**
 */
package surveymodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link surveymodel.Not#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see surveymodel.SurveymodelPackage#getNot()
 * @model
 * @generated
 */
public interface Not extends Dependency {

	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference.
	 * @see #setDependency(Dependency)
	 * @see surveymodel.SurveymodelPackage#getNot_Dependency()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link surveymodel.Not#getDependency <em>Dependency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' containment reference.
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);
} // Not
