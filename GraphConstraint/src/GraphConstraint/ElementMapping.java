/**
 */
package GraphConstraint;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphConstraint.ElementMapping#getOrigin <em>Origin</em>}</li>
 *   <li>{@link GraphConstraint.ElementMapping#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphConstraint.GraphConstraintPackage#getElementMapping()
 * @model
 * @generated
 */
public interface ElementMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(GraphElement)
	 * @see GraphConstraint.GraphConstraintPackage#getElementMapping_Origin()
	 * @model required="true"
	 * @generated
	 */
	GraphElement getOrigin();

	/**
	 * Sets the value of the '{@link GraphConstraint.ElementMapping#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(GraphElement value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' reference.
	 * @see #setImage(GraphElement)
	 * @see GraphConstraint.GraphConstraintPackage#getElementMapping_Image()
	 * @model required="true"
	 * @generated
	 */
	GraphElement getImage();

	/**
	 * Sets the value of the '{@link GraphConstraint.ElementMapping#getImage <em>Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' reference.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(GraphElement value);

} // ElementMapping
