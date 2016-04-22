/**
 */
package symmetric;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see symmetric.SymmetricFactory
 * @model kind="package"
 * @generated
 */
public interface SymmetricPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "symmetric";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sidiff.org/difference/symmetric/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "symmetric";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SymmetricPackage eINSTANCE = symmetric.impl.SymmetricPackageImpl.init();

	/**
	 * The meta object id for the '{@link symmetric.impl.SymmetricDifferenceImpl <em>Difference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.SymmetricDifferenceImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getSymmetricDifference()
	 * @generated
	 */
	int SYMMETRIC_DIFFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__CHANGES = 0;

	/**
	 * The feature id for the '<em><b>Change Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__CHANGE_SETS = 1;

	/**
	 * The feature id for the '<em><b>Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__CORRESPONDENCES = 2;

	/**
	 * The feature id for the '<em><b>Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__MODEL_A = 3;

	/**
	 * The feature id for the '<em><b>Model B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__MODEL_B = 4;

	/**
	 * The feature id for the '<em><b>Uri Model A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__URI_MODEL_A = 5;

	/**
	 * The feature id for the '<em><b>Uri Model B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__URI_MODEL_B = 6;

	/**
	 * The feature id for the '<em><b>Not Overlappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS = 7;

	/**
	 * The feature id for the '<em><b>Unused Change Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS = 8;

	/**
	 * The number of structural features of the '<em>Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Get Corresponding Object In A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___GET_CORRESPONDING_OBJECT_IN_A__EOBJECT = 0;

	/**
	 * The operation id for the '<em>Get Corresponding Object In B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___GET_CORRESPONDING_OBJECT_IN_B__EOBJECT = 1;

	/**
	 * The operation id for the '<em>Add Correspondence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__EOBJECT_EOBJECT = 2;

	/**
	 * The operation id for the '<em>Remove Correspondence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE__CORRESPONDENCE = 3;

	/**
	 * The operation id for the '<em>Add Correspondence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__CORRESPONDENCE = 4;

	/**
	 * The operation id for the '<em>Add Correspondence</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__EOBJECT_EOBJECT_FLOAT = 5;

	/**
	 * The operation id for the '<em>Get Reliability</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___GET_RELIABILITY__EOBJECT_EOBJECT = 6;

	/**
	 * The operation id for the '<em>Remove Correspondence A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE_A__EOBJECT = 7;

	/**
	 * The operation id for the '<em>Remove Correspondence B</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE_B__EOBJECT = 8;

	/**
	 * The number of operations of the '<em>Difference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMMETRIC_DIFFERENCE_OPERATION_COUNT = 9;

	/**
	 * The meta object id for the '{@link symmetric.impl.ChangeImpl <em>Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.ChangeImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getChange()
	 * @generated
	 */
	int CHANGE = 5;

	/**
	 * The number of structural features of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.AddObjectImpl <em>Add Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.AddObjectImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getAddObject()
	 * @generated
	 */
	int ADD_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OBJECT__OBJ = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OBJECT_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Add Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OBJECT_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.RemoveObjectImpl <em>Remove Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.RemoveObjectImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getRemoveObject()
	 * @generated
	 */
	int REMOVE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Obj</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECT__OBJ = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECT_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Remove Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OBJECT_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.AddReferenceImpl <em>Add Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.AddReferenceImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getAddReference()
	 * @generated
	 */
	int ADD_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE__SRC = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE__TGT = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE__TYPE = CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Add Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_REFERENCE_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.RemoveReferenceImpl <em>Remove Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.RemoveReferenceImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getRemoveReference()
	 * @generated
	 */
	int REMOVE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__SRC = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__TGT = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE__TYPE = CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Remove Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Remove Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_REFERENCE_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.SemanticChangeSetImpl <em>Semantic Change Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.SemanticChangeSetImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getSemanticChangeSet()
	 * @generated
	 */
	int SEMANTIC_CHANGE_SET = 6;

	/**
	 * The feature id for the '<em><b>Changes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__CHANGES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Recognition RName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__RECOGNITION_RNAME = 3;

	/**
	 * The feature id for the '<em><b>Refinement Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__REFINEMENT_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Edit RName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__EDIT_RNAME = 5;

	/**
	 * The feature id for the '<em><b>Partially Overlappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__PARTIALLY_OVERLAPPINGS = 6;

	/**
	 * The feature id for the '<em><b>Subsets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__SUBSETS = 7;

	/**
	 * The feature id for the '<em><b>Supersets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__SUPERSETS = 8;

	/**
	 * The feature id for the '<em><b>Overlayings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__OVERLAYINGS = 9;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Number Of ACs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__NUMBER_OF_ACS = 11;

	/**
	 * The feature id for the '<em><b>Number Of Params</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__NUMBER_OF_PARAMS = 12;

	/**
	 * The feature id for the '<em><b>Edit Rule Match</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET__EDIT_RULE_MATCH = 13;

	/**
	 * The number of structural features of the '<em>Semantic Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Semantic Change Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_CHANGE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.CorrespondenceImpl <em>Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.CorrespondenceImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getCorrespondence()
	 * @generated
	 */
	int CORRESPONDENCE = 7;

	/**
	 * The feature id for the '<em><b>Obj A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE__OBJ_A = 0;

	/**
	 * The feature id for the '<em><b>Obj B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE__OBJ_B = 1;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE__RELIABILITY = 2;

	/**
	 * The number of structural features of the '<em>Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.AttributeValueChangeImpl <em>Attribute Value Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.AttributeValueChangeImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getAttributeValueChange()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_CHANGE = 8;

	/**
	 * The feature id for the '<em><b>Obj A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CHANGE__OBJ_A = CHANGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Obj B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CHANGE__OBJ_B = CHANGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CHANGE__TYPE = CHANGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute Value Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CHANGE_FEATURE_COUNT = CHANGE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute Value Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CHANGE_OPERATION_COUNT = CHANGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.EString2EObjectSetMapImpl <em>EString2 EObject Set Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.EString2EObjectSetMapImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getEString2EObjectSetMap()
	 * @generated
	 */
	int ESTRING2_EOBJECT_SET_MAP = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING2_EOBJECT_SET_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING2_EOBJECT_SET_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString2 EObject Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING2_EOBJECT_SET_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString2 EObject Set Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING2_EOBJECT_SET_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.EditRuleMatchImpl <em>Edit Rule Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.EditRuleMatchImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getEditRuleMatch()
	 * @generated
	 */
	int EDIT_RULE_MATCH = 10;

	/**
	 * The feature id for the '<em><b>Node Occurrences A</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_RULE_MATCH__NODE_OCCURRENCES_A = 0;

	/**
	 * The feature id for the '<em><b>Node Occurrences B</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_RULE_MATCH__NODE_OCCURRENCES_B = 1;

	/**
	 * The number of structural features of the '<em>Edit Rule Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_RULE_MATCH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Edit Rule Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDIT_RULE_MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link symmetric.impl.EObjectSetImpl <em>EObject Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see symmetric.impl.EObjectSetImpl
	 * @see symmetric.impl.SymmetricPackageImpl#getEObjectSet()
	 * @generated
	 */
	int EOBJECT_SET = 11;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_SET__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>EObject Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EObject Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EOBJECT_SET_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link symmetric.SymmetricDifference <em>Difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Difference</em>'.
	 * @see symmetric.SymmetricDifference
	 * @generated
	 */
	EClass getSymmetricDifference();

	/**
	 * Returns the meta object for the containment reference list '{@link symmetric.SymmetricDifference#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Changes</em>'.
	 * @see symmetric.SymmetricDifference#getChanges()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EReference getSymmetricDifference_Changes();

	/**
	 * Returns the meta object for the containment reference list '{@link symmetric.SymmetricDifference#getChangeSets <em>Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Change Sets</em>'.
	 * @see symmetric.SymmetricDifference#getChangeSets()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EReference getSymmetricDifference_ChangeSets();

	/**
	 * Returns the meta object for the containment reference list '{@link symmetric.SymmetricDifference#getCorrespondences <em>Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correspondences</em>'.
	 * @see symmetric.SymmetricDifference#getCorrespondences()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EReference getSymmetricDifference_Correspondences();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SymmetricDifference#getModelA <em>Model A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model A</em>'.
	 * @see symmetric.SymmetricDifference#getModelA()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EAttribute getSymmetricDifference_ModelA();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SymmetricDifference#getModelB <em>Model B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model B</em>'.
	 * @see symmetric.SymmetricDifference#getModelB()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EAttribute getSymmetricDifference_ModelB();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SymmetricDifference#getUriModelA <em>Uri Model A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Model A</em>'.
	 * @see symmetric.SymmetricDifference#getUriModelA()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EAttribute getSymmetricDifference_UriModelA();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SymmetricDifference#getUriModelB <em>Uri Model B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri Model B</em>'.
	 * @see symmetric.SymmetricDifference#getUriModelB()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EAttribute getSymmetricDifference_UriModelB();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.SymmetricDifference#getNotOverlappings <em>Not Overlappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Not Overlappings</em>'.
	 * @see symmetric.SymmetricDifference#getNotOverlappings()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EReference getSymmetricDifference_NotOverlappings();

	/**
	 * Returns the meta object for the containment reference list '{@link symmetric.SymmetricDifference#getUnusedChangeSets <em>Unused Change Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unused Change Sets</em>'.
	 * @see symmetric.SymmetricDifference#getUnusedChangeSets()
	 * @see #getSymmetricDifference()
	 * @generated
	 */
	EReference getSymmetricDifference_UnusedChangeSets();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#getCorrespondingObjectInA(org.eclipse.emf.ecore.EObject) <em>Get Corresponding Object In A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Corresponding Object In A</em>' operation.
	 * @see symmetric.SymmetricDifference#getCorrespondingObjectInA(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricDifference__GetCorrespondingObjectInA__EObject();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#getCorrespondingObjectInB(org.eclipse.emf.ecore.EObject) <em>Get Corresponding Object In B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Corresponding Object In B</em>' operation.
	 * @see symmetric.SymmetricDifference#getCorrespondingObjectInB(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricDifference__GetCorrespondingObjectInB__EObject();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#addCorrespondence(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Add Correspondence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Correspondence</em>' operation.
	 * @see symmetric.SymmetricDifference#addCorrespondence(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricDifference__AddCorrespondence__EObject_EObject();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#removeCorrespondence(symmetric.Correspondence) <em>Remove Correspondence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Correspondence</em>' operation.
	 * @see symmetric.SymmetricDifference#removeCorrespondence(symmetric.Correspondence)
	 * @generated
	 */
	EOperation getSymmetricDifference__RemoveCorrespondence__Correspondence();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#addCorrespondence(symmetric.Correspondence) <em>Add Correspondence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Correspondence</em>' operation.
	 * @see symmetric.SymmetricDifference#addCorrespondence(symmetric.Correspondence)
	 * @generated
	 */
	EOperation getSymmetricDifference__AddCorrespondence__Correspondence();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#addCorrespondence(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, float) <em>Add Correspondence</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Correspondence</em>' operation.
	 * @see symmetric.SymmetricDifference#addCorrespondence(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, float)
	 * @generated
	 */
	EOperation getSymmetricDifference__AddCorrespondence__EObject_EObject_float();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#getReliability(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject) <em>Get Reliability</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reliability</em>' operation.
	 * @see symmetric.SymmetricDifference#getReliability(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricDifference__GetReliability__EObject_EObject();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#removeCorrespondenceA(org.eclipse.emf.ecore.EObject) <em>Remove Correspondence A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Correspondence A</em>' operation.
	 * @see symmetric.SymmetricDifference#removeCorrespondenceA(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricDifference__RemoveCorrespondenceA__EObject();

	/**
	 * Returns the meta object for the '{@link symmetric.SymmetricDifference#removeCorrespondenceB(org.eclipse.emf.ecore.EObject) <em>Remove Correspondence B</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Correspondence B</em>' operation.
	 * @see symmetric.SymmetricDifference#removeCorrespondenceB(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	EOperation getSymmetricDifference__RemoveCorrespondenceB__EObject();

	/**
	 * Returns the meta object for class '{@link symmetric.AddObject <em>Add Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Object</em>'.
	 * @see symmetric.AddObject
	 * @generated
	 */
	EClass getAddObject();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AddObject#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj</em>'.
	 * @see symmetric.AddObject#getObj()
	 * @see #getAddObject()
	 * @generated
	 */
	EReference getAddObject_Obj();

	/**
	 * Returns the meta object for class '{@link symmetric.RemoveObject <em>Remove Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Object</em>'.
	 * @see symmetric.RemoveObject
	 * @generated
	 */
	EClass getRemoveObject();

	/**
	 * Returns the meta object for the reference '{@link symmetric.RemoveObject#getObj <em>Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj</em>'.
	 * @see symmetric.RemoveObject#getObj()
	 * @see #getRemoveObject()
	 * @generated
	 */
	EReference getRemoveObject_Obj();

	/**
	 * Returns the meta object for class '{@link symmetric.AddReference <em>Add Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Reference</em>'.
	 * @see symmetric.AddReference
	 * @generated
	 */
	EClass getAddReference();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AddReference#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see symmetric.AddReference#getSrc()
	 * @see #getAddReference()
	 * @generated
	 */
	EReference getAddReference_Src();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AddReference#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see symmetric.AddReference#getTgt()
	 * @see #getAddReference()
	 * @generated
	 */
	EReference getAddReference_Tgt();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AddReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see symmetric.AddReference#getType()
	 * @see #getAddReference()
	 * @generated
	 */
	EReference getAddReference_Type();

	/**
	 * Returns the meta object for class '{@link symmetric.RemoveReference <em>Remove Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Reference</em>'.
	 * @see symmetric.RemoveReference
	 * @generated
	 */
	EClass getRemoveReference();

	/**
	 * Returns the meta object for the reference '{@link symmetric.RemoveReference#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see symmetric.RemoveReference#getSrc()
	 * @see #getRemoveReference()
	 * @generated
	 */
	EReference getRemoveReference_Src();

	/**
	 * Returns the meta object for the reference '{@link symmetric.RemoveReference#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see symmetric.RemoveReference#getTgt()
	 * @see #getRemoveReference()
	 * @generated
	 */
	EReference getRemoveReference_Tgt();

	/**
	 * Returns the meta object for the reference '{@link symmetric.RemoveReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see symmetric.RemoveReference#getType()
	 * @see #getRemoveReference()
	 * @generated
	 */
	EReference getRemoveReference_Type();

	/**
	 * Returns the meta object for class '{@link symmetric.Change <em>Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change</em>'.
	 * @see symmetric.Change
	 * @generated
	 */
	EClass getChange();

	/**
	 * Returns the meta object for class '{@link symmetric.SemanticChangeSet <em>Semantic Change Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Change Set</em>'.
	 * @see symmetric.SemanticChangeSet
	 * @generated
	 */
	EClass getSemanticChangeSet();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.SemanticChangeSet#getChanges <em>Changes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Changes</em>'.
	 * @see symmetric.SemanticChangeSet#getChanges()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EReference getSemanticChangeSet_Changes();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see symmetric.SemanticChangeSet#getName()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_Name();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see symmetric.SemanticChangeSet#getPriority()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_Priority();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getRecognitionRName <em>Recognition RName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recognition RName</em>'.
	 * @see symmetric.SemanticChangeSet#getRecognitionRName()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_RecognitionRName();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getRefinementLevel <em>Refinement Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refinement Level</em>'.
	 * @see symmetric.SemanticChangeSet#getRefinementLevel()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_RefinementLevel();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getEditRName <em>Edit RName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Edit RName</em>'.
	 * @see symmetric.SemanticChangeSet#getEditRName()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_EditRName();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.SemanticChangeSet#getPartiallyOverlappings <em>Partially Overlappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partially Overlappings</em>'.
	 * @see symmetric.SemanticChangeSet#getPartiallyOverlappings()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EReference getSemanticChangeSet_PartiallyOverlappings();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.SemanticChangeSet#getSubsets <em>Subsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subsets</em>'.
	 * @see symmetric.SemanticChangeSet#getSubsets()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EReference getSemanticChangeSet_Subsets();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.SemanticChangeSet#getSupersets <em>Supersets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supersets</em>'.
	 * @see symmetric.SemanticChangeSet#getSupersets()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EReference getSemanticChangeSet_Supersets();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.SemanticChangeSet#getOverlayings <em>Overlayings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Overlayings</em>'.
	 * @see symmetric.SemanticChangeSet#getOverlayings()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EReference getSemanticChangeSet_Overlayings();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see symmetric.SemanticChangeSet#getDescription()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_Description();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getNumberOfACs <em>Number Of ACs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of ACs</em>'.
	 * @see symmetric.SemanticChangeSet#getNumberOfACs()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_NumberOfACs();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.SemanticChangeSet#getNumberOfParams <em>Number Of Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Params</em>'.
	 * @see symmetric.SemanticChangeSet#getNumberOfParams()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EAttribute getSemanticChangeSet_NumberOfParams();

	/**
	 * Returns the meta object for the containment reference '{@link symmetric.SemanticChangeSet#getEditRuleMatch <em>Edit Rule Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edit Rule Match</em>'.
	 * @see symmetric.SemanticChangeSet#getEditRuleMatch()
	 * @see #getSemanticChangeSet()
	 * @generated
	 */
	EReference getSemanticChangeSet_EditRuleMatch();

	/**
	 * Returns the meta object for class '{@link symmetric.Correspondence <em>Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondence</em>'.
	 * @see symmetric.Correspondence
	 * @generated
	 */
	EClass getCorrespondence();

	/**
	 * Returns the meta object for the reference '{@link symmetric.Correspondence#getObjA <em>Obj A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj A</em>'.
	 * @see symmetric.Correspondence#getObjA()
	 * @see #getCorrespondence()
	 * @generated
	 */
	EReference getCorrespondence_ObjA();

	/**
	 * Returns the meta object for the reference '{@link symmetric.Correspondence#getObjB <em>Obj B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj B</em>'.
	 * @see symmetric.Correspondence#getObjB()
	 * @see #getCorrespondence()
	 * @generated
	 */
	EReference getCorrespondence_ObjB();

	/**
	 * Returns the meta object for the attribute '{@link symmetric.Correspondence#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see symmetric.Correspondence#getReliability()
	 * @see #getCorrespondence()
	 * @generated
	 */
	EAttribute getCorrespondence_Reliability();

	/**
	 * Returns the meta object for class '{@link symmetric.AttributeValueChange <em>Attribute Value Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Change</em>'.
	 * @see symmetric.AttributeValueChange
	 * @generated
	 */
	EClass getAttributeValueChange();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AttributeValueChange#getObjA <em>Obj A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj A</em>'.
	 * @see symmetric.AttributeValueChange#getObjA()
	 * @see #getAttributeValueChange()
	 * @generated
	 */
	EReference getAttributeValueChange_ObjA();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AttributeValueChange#getObjB <em>Obj B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Obj B</em>'.
	 * @see symmetric.AttributeValueChange#getObjB()
	 * @see #getAttributeValueChange()
	 * @generated
	 */
	EReference getAttributeValueChange_ObjB();

	/**
	 * Returns the meta object for the reference '{@link symmetric.AttributeValueChange#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see symmetric.AttributeValueChange#getType()
	 * @see #getAttributeValueChange()
	 * @generated
	 */
	EReference getAttributeValueChange_Type();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString2 EObject Set Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString2 EObject Set Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="symmetric.EObjectSet" valueContainment="true"
	 * @generated
	 */
	EClass getEString2EObjectSetMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEString2EObjectSetMap()
	 * @generated
	 */
	EAttribute getEString2EObjectSetMap_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEString2EObjectSetMap()
	 * @generated
	 */
	EReference getEString2EObjectSetMap_Value();

	/**
	 * Returns the meta object for class '{@link symmetric.EditRuleMatch <em>Edit Rule Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Rule Match</em>'.
	 * @see symmetric.EditRuleMatch
	 * @generated
	 */
	EClass getEditRuleMatch();

	/**
	 * Returns the meta object for the map '{@link symmetric.EditRuleMatch#getNodeOccurrencesA <em>Node Occurrences A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Node Occurrences A</em>'.
	 * @see symmetric.EditRuleMatch#getNodeOccurrencesA()
	 * @see #getEditRuleMatch()
	 * @generated
	 */
	EReference getEditRuleMatch_NodeOccurrencesA();

	/**
	 * Returns the meta object for the map '{@link symmetric.EditRuleMatch#getNodeOccurrencesB <em>Node Occurrences B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Node Occurrences B</em>'.
	 * @see symmetric.EditRuleMatch#getNodeOccurrencesB()
	 * @see #getEditRuleMatch()
	 * @generated
	 */
	EReference getEditRuleMatch_NodeOccurrencesB();

	/**
	 * Returns the meta object for class '{@link symmetric.EObjectSet <em>EObject Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EObject Set</em>'.
	 * @see symmetric.EObjectSet
	 * @generated
	 */
	EClass getEObjectSet();

	/**
	 * Returns the meta object for the reference list '{@link symmetric.EObjectSet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see symmetric.EObjectSet#getElements()
	 * @see #getEObjectSet()
	 * @generated
	 */
	EReference getEObjectSet_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SymmetricFactory getSymmetricFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link symmetric.impl.SymmetricDifferenceImpl <em>Difference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.SymmetricDifferenceImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getSymmetricDifference()
		 * @generated
		 */
		EClass SYMMETRIC_DIFFERENCE = eINSTANCE.getSymmetricDifference();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMMETRIC_DIFFERENCE__CHANGES = eINSTANCE.getSymmetricDifference_Changes();

		/**
		 * The meta object literal for the '<em><b>Change Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMMETRIC_DIFFERENCE__CHANGE_SETS = eINSTANCE.getSymmetricDifference_ChangeSets();

		/**
		 * The meta object literal for the '<em><b>Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMMETRIC_DIFFERENCE__CORRESPONDENCES = eINSTANCE.getSymmetricDifference_Correspondences();

		/**
		 * The meta object literal for the '<em><b>Model A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_DIFFERENCE__MODEL_A = eINSTANCE.getSymmetricDifference_ModelA();

		/**
		 * The meta object literal for the '<em><b>Model B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_DIFFERENCE__MODEL_B = eINSTANCE.getSymmetricDifference_ModelB();

		/**
		 * The meta object literal for the '<em><b>Uri Model A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_DIFFERENCE__URI_MODEL_A = eINSTANCE.getSymmetricDifference_UriModelA();

		/**
		 * The meta object literal for the '<em><b>Uri Model B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMMETRIC_DIFFERENCE__URI_MODEL_B = eINSTANCE.getSymmetricDifference_UriModelB();

		/**
		 * The meta object literal for the '<em><b>Not Overlappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS = eINSTANCE.getSymmetricDifference_NotOverlappings();

		/**
		 * The meta object literal for the '<em><b>Unused Change Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS = eINSTANCE.getSymmetricDifference_UnusedChangeSets();

		/**
		 * The meta object literal for the '<em><b>Get Corresponding Object In A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___GET_CORRESPONDING_OBJECT_IN_A__EOBJECT = eINSTANCE.getSymmetricDifference__GetCorrespondingObjectInA__EObject();

		/**
		 * The meta object literal for the '<em><b>Get Corresponding Object In B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___GET_CORRESPONDING_OBJECT_IN_B__EOBJECT = eINSTANCE.getSymmetricDifference__GetCorrespondingObjectInB__EObject();

		/**
		 * The meta object literal for the '<em><b>Add Correspondence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__EOBJECT_EOBJECT = eINSTANCE.getSymmetricDifference__AddCorrespondence__EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Remove Correspondence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE__CORRESPONDENCE = eINSTANCE.getSymmetricDifference__RemoveCorrespondence__Correspondence();

		/**
		 * The meta object literal for the '<em><b>Add Correspondence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__CORRESPONDENCE = eINSTANCE.getSymmetricDifference__AddCorrespondence__Correspondence();

		/**
		 * The meta object literal for the '<em><b>Add Correspondence</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__EOBJECT_EOBJECT_FLOAT = eINSTANCE.getSymmetricDifference__AddCorrespondence__EObject_EObject_float();

		/**
		 * The meta object literal for the '<em><b>Get Reliability</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___GET_RELIABILITY__EOBJECT_EOBJECT = eINSTANCE.getSymmetricDifference__GetReliability__EObject_EObject();

		/**
		 * The meta object literal for the '<em><b>Remove Correspondence A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE_A__EOBJECT = eINSTANCE.getSymmetricDifference__RemoveCorrespondenceA__EObject();

		/**
		 * The meta object literal for the '<em><b>Remove Correspondence B</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE_B__EOBJECT = eINSTANCE.getSymmetricDifference__RemoveCorrespondenceB__EObject();

		/**
		 * The meta object literal for the '{@link symmetric.impl.AddObjectImpl <em>Add Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.AddObjectImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getAddObject()
		 * @generated
		 */
		EClass ADD_OBJECT = eINSTANCE.getAddObject();

		/**
		 * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_OBJECT__OBJ = eINSTANCE.getAddObject_Obj();

		/**
		 * The meta object literal for the '{@link symmetric.impl.RemoveObjectImpl <em>Remove Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.RemoveObjectImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getRemoveObject()
		 * @generated
		 */
		EClass REMOVE_OBJECT = eINSTANCE.getRemoveObject();

		/**
		 * The meta object literal for the '<em><b>Obj</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_OBJECT__OBJ = eINSTANCE.getRemoveObject_Obj();

		/**
		 * The meta object literal for the '{@link symmetric.impl.AddReferenceImpl <em>Add Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.AddReferenceImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getAddReference()
		 * @generated
		 */
		EClass ADD_REFERENCE = eINSTANCE.getAddReference();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_REFERENCE__SRC = eINSTANCE.getAddReference_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_REFERENCE__TGT = eINSTANCE.getAddReference_Tgt();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_REFERENCE__TYPE = eINSTANCE.getAddReference_Type();

		/**
		 * The meta object literal for the '{@link symmetric.impl.RemoveReferenceImpl <em>Remove Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.RemoveReferenceImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getRemoveReference()
		 * @generated
		 */
		EClass REMOVE_REFERENCE = eINSTANCE.getRemoveReference();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_REFERENCE__SRC = eINSTANCE.getRemoveReference_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_REFERENCE__TGT = eINSTANCE.getRemoveReference_Tgt();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REMOVE_REFERENCE__TYPE = eINSTANCE.getRemoveReference_Type();

		/**
		 * The meta object literal for the '{@link symmetric.impl.ChangeImpl <em>Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.ChangeImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getChange()
		 * @generated
		 */
		EClass CHANGE = eINSTANCE.getChange();

		/**
		 * The meta object literal for the '{@link symmetric.impl.SemanticChangeSetImpl <em>Semantic Change Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.SemanticChangeSetImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getSemanticChangeSet()
		 * @generated
		 */
		EClass SEMANTIC_CHANGE_SET = eINSTANCE.getSemanticChangeSet();

		/**
		 * The meta object literal for the '<em><b>Changes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CHANGE_SET__CHANGES = eINSTANCE.getSemanticChangeSet_Changes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__NAME = eINSTANCE.getSemanticChangeSet_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__PRIORITY = eINSTANCE.getSemanticChangeSet_Priority();

		/**
		 * The meta object literal for the '<em><b>Recognition RName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__RECOGNITION_RNAME = eINSTANCE.getSemanticChangeSet_RecognitionRName();

		/**
		 * The meta object literal for the '<em><b>Refinement Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__REFINEMENT_LEVEL = eINSTANCE.getSemanticChangeSet_RefinementLevel();

		/**
		 * The meta object literal for the '<em><b>Edit RName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__EDIT_RNAME = eINSTANCE.getSemanticChangeSet_EditRName();

		/**
		 * The meta object literal for the '<em><b>Partially Overlappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CHANGE_SET__PARTIALLY_OVERLAPPINGS = eINSTANCE.getSemanticChangeSet_PartiallyOverlappings();

		/**
		 * The meta object literal for the '<em><b>Subsets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CHANGE_SET__SUBSETS = eINSTANCE.getSemanticChangeSet_Subsets();

		/**
		 * The meta object literal for the '<em><b>Supersets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CHANGE_SET__SUPERSETS = eINSTANCE.getSemanticChangeSet_Supersets();

		/**
		 * The meta object literal for the '<em><b>Overlayings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CHANGE_SET__OVERLAYINGS = eINSTANCE.getSemanticChangeSet_Overlayings();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__DESCRIPTION = eINSTANCE.getSemanticChangeSet_Description();

		/**
		 * The meta object literal for the '<em><b>Number Of ACs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__NUMBER_OF_ACS = eINSTANCE.getSemanticChangeSet_NumberOfACs();

		/**
		 * The meta object literal for the '<em><b>Number Of Params</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_CHANGE_SET__NUMBER_OF_PARAMS = eINSTANCE.getSemanticChangeSet_NumberOfParams();

		/**
		 * The meta object literal for the '<em><b>Edit Rule Match</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_CHANGE_SET__EDIT_RULE_MATCH = eINSTANCE.getSemanticChangeSet_EditRuleMatch();

		/**
		 * The meta object literal for the '{@link symmetric.impl.CorrespondenceImpl <em>Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.CorrespondenceImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getCorrespondence()
		 * @generated
		 */
		EClass CORRESPONDENCE = eINSTANCE.getCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Obj A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCE__OBJ_A = eINSTANCE.getCorrespondence_ObjA();

		/**
		 * The meta object literal for the '<em><b>Obj B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCE__OBJ_B = eINSTANCE.getCorrespondence_ObjB();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORRESPONDENCE__RELIABILITY = eINSTANCE.getCorrespondence_Reliability();

		/**
		 * The meta object literal for the '{@link symmetric.impl.AttributeValueChangeImpl <em>Attribute Value Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.AttributeValueChangeImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getAttributeValueChange()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_CHANGE = eINSTANCE.getAttributeValueChange();

		/**
		 * The meta object literal for the '<em><b>Obj A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CHANGE__OBJ_A = eINSTANCE.getAttributeValueChange_ObjA();

		/**
		 * The meta object literal for the '<em><b>Obj B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CHANGE__OBJ_B = eINSTANCE.getAttributeValueChange_ObjB();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CHANGE__TYPE = eINSTANCE.getAttributeValueChange_Type();

		/**
		 * The meta object literal for the '{@link symmetric.impl.EString2EObjectSetMapImpl <em>EString2 EObject Set Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.EString2EObjectSetMapImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getEString2EObjectSetMap()
		 * @generated
		 */
		EClass ESTRING2_EOBJECT_SET_MAP = eINSTANCE.getEString2EObjectSetMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING2_EOBJECT_SET_MAP__KEY = eINSTANCE.getEString2EObjectSetMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING2_EOBJECT_SET_MAP__VALUE = eINSTANCE.getEString2EObjectSetMap_Value();

		/**
		 * The meta object literal for the '{@link symmetric.impl.EditRuleMatchImpl <em>Edit Rule Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.EditRuleMatchImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getEditRuleMatch()
		 * @generated
		 */
		EClass EDIT_RULE_MATCH = eINSTANCE.getEditRuleMatch();

		/**
		 * The meta object literal for the '<em><b>Node Occurrences A</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_RULE_MATCH__NODE_OCCURRENCES_A = eINSTANCE.getEditRuleMatch_NodeOccurrencesA();

		/**
		 * The meta object literal for the '<em><b>Node Occurrences B</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDIT_RULE_MATCH__NODE_OCCURRENCES_B = eINSTANCE.getEditRuleMatch_NodeOccurrencesB();

		/**
		 * The meta object literal for the '{@link symmetric.impl.EObjectSetImpl <em>EObject Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see symmetric.impl.EObjectSetImpl
		 * @see symmetric.impl.SymmetricPackageImpl#getEObjectSet()
		 * @generated
		 */
		EClass EOBJECT_SET = eINSTANCE.getEObjectSet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EOBJECT_SET__ELEMENTS = eINSTANCE.getEObjectSet_Elements();

	}

} //SymmetricPackage
