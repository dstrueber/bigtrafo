/**
 */
package GraphConstraint;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Graph Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphConstraint.NestedGraphConstraint#getImport <em>Import</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphConstraint#getName <em>Name</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphConstraint#getCondition <em>Condition</em>}</li>
 *   <li>{@link GraphConstraint.NestedGraphConstraint#getEmptyDomain <em>Empty Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphConstraint()
 * @model
 * @generated
 */
public interface NestedGraphConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(EPackage)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphConstraint_Import()
	 * @model required="true"
	 * @generated
	 */
	EPackage getImport();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphConstraint#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(EPackage value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link GraphConstraint.NestedGraphCondition#getGc <em>Gc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(NestedGraphCondition)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphConstraint_Condition()
	 * @see GraphConstraint.NestedGraphCondition#getGc
	 * @model opposite="gc" containment="true" required="true"
	 * @generated
	 */
	NestedGraphCondition getCondition();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphConstraint#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(NestedGraphCondition value);

	/**
	 * Returns the value of the '<em><b>Empty Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Empty Domain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Empty Domain</em>' containment reference.
	 * @see #setEmptyDomain(Graph)
	 * @see GraphConstraint.GraphConstraintPackage#getNestedGraphConstraint_EmptyDomain()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Graph getEmptyDomain();

	/**
	 * Sets the value of the '{@link GraphConstraint.NestedGraphConstraint#getEmptyDomain <em>Empty Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Empty Domain</em>' containment reference.
	 * @see #getEmptyDomain()
	 * @generated
	 */
	void setEmptyDomain(Graph value);

} // NestedGraphConstraint
