/**
 */
package surveymodel.impl;

import org.eclipse.emf.ecore.EClass;

import surveymodel.Dependency;
import surveymodel.Expression;
import surveymodel.SurveymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link surveymodel.impl.ExpressionImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link surveymodel.impl.ExpressionImpl#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExpressionImpl extends DependencyImpl implements Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveymodelPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getLhs() {
		return (Dependency)eGet(SurveymodelPackage.Literals.EXPRESSION__LHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Dependency newLhs) {
		eSet(SurveymodelPackage.Literals.EXPRESSION__LHS, newLhs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getRhs() {
		return (Dependency)eGet(SurveymodelPackage.Literals.EXPRESSION__RHS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Dependency newRhs) {
		eSet(SurveymodelPackage.Literals.EXPRESSION__RHS, newRhs);
	}

} //ExpressionImpl
