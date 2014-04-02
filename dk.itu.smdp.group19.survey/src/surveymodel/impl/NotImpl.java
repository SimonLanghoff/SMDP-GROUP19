/**
 */
package surveymodel.impl;

import org.eclipse.emf.ecore.EClass;

import surveymodel.Dependency;
import surveymodel.Not;
import surveymodel.SurveymodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link surveymodel.impl.NotImpl#getDependency <em>Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotImpl extends DependencyImpl implements Not {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveymodelPackage.Literals.NOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getDependency() {
		return (Dependency)eGet(SurveymodelPackage.Literals.NOT__DEPENDENCY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependency(Dependency newDependency) {
		eSet(SurveymodelPackage.Literals.NOT__DEPENDENCY, newDependency);
	}

} //NotImpl
