/**
 */
package GraphConstraint;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphConstraint.Mapping#getFrom <em>From</em>}</li>
 *   <li>{@link GraphConstraint.Mapping#getTo <em>To</em>}</li>
 *   <li>{@link GraphConstraint.Mapping#getMappings <em>Mappings</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphConstraint.GraphConstraintPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Graph)
	 * @see GraphConstraint.GraphConstraintPackage#getMapping_From()
	 * @model required="true"
	 * @generated
	 */
	Graph getFrom();

	/**
	 * Sets the value of the '{@link GraphConstraint.Mapping#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Graph value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Graph)
	 * @see GraphConstraint.GraphConstraintPackage#getMapping_To()
	 * @model required="true"
	 * @generated
	 */
	Graph getTo();

	/**
	 * Sets the value of the '{@link GraphConstraint.Mapping#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Graph value);

	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link GraphConstraint.ElementMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see GraphConstraint.GraphConstraintPackage#getMapping_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementMapping> getMappings();

} // Mapping
