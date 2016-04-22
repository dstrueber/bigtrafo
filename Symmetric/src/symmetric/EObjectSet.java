/**
 */
package symmetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EObject Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link symmetric.EObjectSet#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see symmetric.SymmetricPackage#getEObjectSet()
 * @model
 * @generated
 */
public interface EObjectSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see symmetric.SymmetricPackage#getEObjectSet_Elements()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	EList<EObject> getElements();

} // EObjectSet
