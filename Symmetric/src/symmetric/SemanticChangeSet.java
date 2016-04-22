/**
 */
package symmetric;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Change Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link symmetric.SemanticChangeSet#getChanges <em>Changes</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getName <em>Name</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getPriority <em>Priority</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getRecognitionRName <em>Recognition RName</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getRefinementLevel <em>Refinement Level</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getEditRName <em>Edit RName</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getPartiallyOverlappings <em>Partially Overlappings</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getSubsets <em>Subsets</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getSupersets <em>Supersets</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getOverlayings <em>Overlayings</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getDescription <em>Description</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getNumberOfACs <em>Number Of ACs</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getNumberOfParams <em>Number Of Params</em>}</li>
 *   <li>{@link symmetric.SemanticChangeSet#getEditRuleMatch <em>Edit Rule Match</em>}</li>
 * </ul>
 * </p>
 *
 * @see symmetric.SymmetricPackage#getSemanticChangeSet()
 * @model
 * @generated
 */
public interface SemanticChangeSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Changes</b></em>' reference list.
	 * The list contents are of type {@link symmetric.Change}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' reference list.
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Changes()
	 * @model
	 * @generated
	 */
	EList<Change> getChanges();

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
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Priority()
	 * @model default="0"
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Recognition RName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recognition RName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recognition RName</em>' attribute.
	 * @see #setRecognitionRName(String)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_RecognitionRName()
	 * @model
	 * @generated
	 */
	String getRecognitionRName();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getRecognitionRName <em>Recognition RName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recognition RName</em>' attribute.
	 * @see #getRecognitionRName()
	 * @generated
	 */
	void setRecognitionRName(String value);

	/**
	 * Returns the value of the '<em><b>Refinement Level</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement Level</em>' attribute.
	 * @see #setRefinementLevel(int)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_RefinementLevel()
	 * @model default="0"
	 * @generated
	 */
	int getRefinementLevel();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getRefinementLevel <em>Refinement Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refinement Level</em>' attribute.
	 * @see #getRefinementLevel()
	 * @generated
	 */
	void setRefinementLevel(int value);

	/**
	 * Returns the value of the '<em><b>Edit RName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit RName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit RName</em>' attribute.
	 * @see #setEditRName(String)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_EditRName()
	 * @model
	 * @generated
	 */
	String getEditRName();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getEditRName <em>Edit RName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit RName</em>' attribute.
	 * @see #getEditRName()
	 * @generated
	 */
	void setEditRName(String value);

	/**
	 * Returns the value of the '<em><b>Partially Overlappings</b></em>' reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partially Overlappings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partially Overlappings</em>' reference list.
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_PartiallyOverlappings()
	 * @model
	 * @generated
	 */
	EList<SemanticChangeSet> getPartiallyOverlappings();

	/**
	 * Returns the value of the '<em><b>Subsets</b></em>' reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * It is bidirectional and its opposite is '{@link symmetric.SemanticChangeSet#getSupersets <em>Supersets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subsets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subsets</em>' reference list.
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Subsets()
	 * @see symmetric.SemanticChangeSet#getSupersets
	 * @model opposite="supersets"
	 * @generated
	 */
	EList<SemanticChangeSet> getSubsets();

	/**
	 * Returns the value of the '<em><b>Supersets</b></em>' reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * It is bidirectional and its opposite is '{@link symmetric.SemanticChangeSet#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supersets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supersets</em>' reference list.
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Supersets()
	 * @see symmetric.SemanticChangeSet#getSubsets
	 * @model opposite="subsets"
	 * @generated
	 */
	EList<SemanticChangeSet> getSupersets();

	/**
	 * Returns the value of the '<em><b>Overlayings</b></em>' reference list.
	 * The list contents are of type {@link symmetric.SemanticChangeSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Overlayings</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Overlayings</em>' reference list.
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Overlayings()
	 * @model
	 * @generated
	 */
	EList<SemanticChangeSet> getOverlayings();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Number Of ACs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of ACs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of ACs</em>' attribute.
	 * @see #setNumberOfACs(int)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_NumberOfACs()
	 * @model
	 * @generated
	 */
	int getNumberOfACs();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getNumberOfACs <em>Number Of ACs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of ACs</em>' attribute.
	 * @see #getNumberOfACs()
	 * @generated
	 */
	void setNumberOfACs(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Params</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Params</em>' attribute.
	 * @see #setNumberOfParams(int)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_NumberOfParams()
	 * @model
	 * @generated
	 */
	int getNumberOfParams();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getNumberOfParams <em>Number Of Params</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Params</em>' attribute.
	 * @see #getNumberOfParams()
	 * @generated
	 */
	void setNumberOfParams(int value);

	/**
	 * Returns the value of the '<em><b>Edit Rule Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Edit Rule Match</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Edit Rule Match</em>' containment reference.
	 * @see #setEditRuleMatch(EditRuleMatch)
	 * @see symmetric.SymmetricPackage#getSemanticChangeSet_EditRuleMatch()
	 * @model containment="true"
	 * @generated
	 */
	EditRuleMatch getEditRuleMatch();

	/**
	 * Sets the value of the '{@link symmetric.SemanticChangeSet#getEditRuleMatch <em>Edit Rule Match</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Edit Rule Match</em>' containment reference.
	 * @see #getEditRuleMatch()
	 * @generated
	 */
	void setEditRuleMatch(EditRuleMatch value);

} // SemanticChangeSet
