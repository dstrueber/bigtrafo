/**
 */
package GraphConstraint;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formula</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphConstraint.Formula#getOp <em>Op</em>}</li>
 *   <li>{@link GraphConstraint.Formula#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphConstraint.GraphConstraintPackage#getFormula()
 * @model
 * @generated
 */
public interface Formula extends NestedGraphCondition {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link GraphConstraint.Operator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see GraphConstraint.Operator
	 * @see #setOp(Operator)
	 * @see GraphConstraint.GraphConstraintPackage#getFormula_Op()
	 * @model required="true"
	 * @generated
	 */
	Operator getOp();

	/**
	 * Sets the value of the '{@link GraphConstraint.Formula#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see GraphConstraint.Operator
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operator value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link GraphConstraint.NestedGraphCondition}.
	 * It is bidirectional and its opposite is '{@link GraphConstraint.NestedGraphCondition#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see GraphConstraint.GraphConstraintPackage#getFormula_Args()
	 * @see GraphConstraint.NestedGraphCondition#getFormula
	 * @model opposite="formula" containment="true" required="true"
	 * @generated
	 */
	EList<NestedGraphCondition> getArgs();

} // Formula
