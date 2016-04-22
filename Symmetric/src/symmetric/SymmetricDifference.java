/**
 */
package symmetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Difference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link symmetric.SymmetricDifference#getChanges <em>Changes</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getCorrespondences <em>Correspondences</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getModelA <em>Model A</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getModelB <em>Model B</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getUriModelA <em>Uri Model A</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getUriModelB <em>Uri Model B</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getNotOverlappings <em>Not Overlappings</em>}</li>
 *   <li>{@link symmetric.SymmetricDifference#getUnusedChangeSets <em>Unused Change Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see symmetric.SymmetricPackage#getSymmetricDifference()
 * @model
 * @generated
 */
public interface SymmetricDifference extends EObject {
	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
	 * The list contents are of type {@link symmetric.Change}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference list.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_Changes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Change> getChanges();

	/**
	 * Returns the value of the '<em><b>Change Sets</b></em>' containment reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Sets</em>' containment reference list.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_ChangeSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticChangeSet> getChangeSets();

	/**
	 * Returns the value of the '<em><b>Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link symmetric.Correspondence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correspondences</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondences</em>' containment reference list.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_Correspondences()
	 * @model containment="true" changeable="false"
	 * @generated
	 */
	EList<Correspondence> getCorrespondences();

	/**
	 * Returns the value of the '<em><b>Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model A</em>' attribute.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_ModelA()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Resource getModelA();

	/**
	 * Returns the value of the '<em><b>Model B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model B</em>' attribute.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_ModelB()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Resource getModelB();

	/**
	 * Returns the value of the '<em><b>Uri Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Model A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Model A</em>' attribute.
	 * @see #setUriModelA(String)
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_UriModelA()
	 * @model
	 * @generated
	 */
	String getUriModelA();

	/**
	 * Sets the value of the '{@link symmetric.SymmetricDifference#getUriModelA <em>Uri Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Model A</em>' attribute.
	 * @see #getUriModelA()
	 * @generated
	 */
	void setUriModelA(String value);

	/**
	 * Returns the value of the '<em><b>Uri Model B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri Model B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri Model B</em>' attribute.
	 * @see #setUriModelB(String)
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_UriModelB()
	 * @model
	 * @generated
	 */
	String getUriModelB();

	/**
	 * Sets the value of the '{@link symmetric.SymmetricDifference#getUriModelB <em>Uri Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Model B</em>' attribute.
	 * @see #getUriModelB()
	 * @generated
	 */
	void setUriModelB(String value);

	/**
	 * Returns the value of the '<em><b>Not Overlappings</b></em>' reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Overlappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Overlappings</em>' reference list.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_NotOverlappings()
	 * @model
	 * @generated
	 */
	EList<SemanticChangeSet> getNotOverlappings();

	/**
	 * Returns the value of the '<em><b>Unused Change Sets</b></em>' containment reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unused Change Sets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unused Change Sets</em>' containment reference list.
	 * @see symmetric.SymmetricPackage#getSymmetricDifference_UnusedChangeSets()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemanticChangeSet> getUnusedChangeSets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject getCorrespondingObjectInA(EObject objectInB);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EObject getCorrespondingObjectInB(EObject objectInA);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCorrespondence(EObject objectA, EObject objectB);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCorrespondence(Correspondence correspondence);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCorrespondence(Correspondence correspondence);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCorrespondence(EObject objectA, EObject objectB, float reliability);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	float getReliability(EObject objectA, EObject objectB);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCorrespondenceA(EObject objectInA);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeCorrespondenceB(EObject objectInB);

} // SymmetricDifference
