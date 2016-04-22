/**
 */
package GraphConstraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Graph Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphConstraint.NestedGraphCondition#getFormula <em>Formula</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphCondition#getQgc <em>Qgc</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphCondition#getGc <em>Gc</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphCondition#getDomain <em>Domain</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphCondition#getVars <em>Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphCondition()
 * @model abstract="true"
 * @generated
 */
public interface NestedGraphCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Formula</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GraphConstraint.Formula#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formula</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formula</em>' container reference.
	 * @see #setFormula(Formula)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphCondition_Formula()
	 * @see GraphConstraint.Formula#getArgs
	 * @model opposite="args" transient="false"
	 * @generated
	 */
	Formula getFormula();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphCondition#getFormula <em>Formula</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formula</em>' container reference.
	 * @see #getFormula()
	 * @generated
	 */
	void setFormula(Formula value);

	/**
	 * Returns the value of the '<em><b>Qgc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GraphConstraint.QuantifiedGraphCondition#getNested <em>Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qgc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qgc</em>' container reference.
	 * @see #setQgc(QuantifiedGraphCondition)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphCondition_Qgc()
	 * @see GraphConstraint.QuantifiedGraphCondition#getNested
	 * @model opposite="nested" transient="false"
	 * @generated
	 */
	QuantifiedGraphCondition getQgc();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphCondition#getQgc <em>Qgc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qgc</em>' container reference.
	 * @see #getQgc()
	 * @generated
	 */
	void setQgc(QuantifiedGraphCondition value);

	/**
	 * Returns the value of the '<em><b>Gc</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link GraphConstraint.NestedGraphConstraint#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gc</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gc</em>' container reference.
	 * @see #setGc(NestedGraphConstraint)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphCondition_Gc()
	 * @see GraphConstraint.NestedGraphConstraint#getCondition
	 * @model opposite="condition" transient="false"
	 * @generated
	 */
	NestedGraphConstraint getGc();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphCondition#getGc <em>Gc</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gc</em>' container reference.
	 * @see #getGc()
	 * @generated
	 */
	void setGc(NestedGraphConstraint value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Graph)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphCondition_Domain()
	 * @model required="true"
	 * @generated
	 */
	Graph getDomain();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphCondition#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Graph value);

	/**
	 * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
	 * The list contents are of type {@link GraphConstraint.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vars</em>' containment reference list.
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphCondition_Vars()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVars();

} // NestedGraphCondition
