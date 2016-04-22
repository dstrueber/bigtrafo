/**
 */
package symmetric.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import symmetric.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SymmetricFactoryImpl extends EFactoryImpl implements SymmetricFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SymmetricFactory init() {
		try {
			SymmetricFactory theSymmetricFactory = (SymmetricFactory)EPackage.Registry.INSTANCE.getEFactory(SymmetricPackage.eNS_URI);
			if (theSymmetricFactory != null) {
				return theSymmetricFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SymmetricFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE: return createSymmetricDifference();
			case SymmetricPackage.ADD_OBJECT: return createAddObject();
			case SymmetricPackage.REMOVE_OBJECT: return createRemoveObject();
			case SymmetricPackage.ADD_REFERENCE: return createAddReference();
			case SymmetricPackage.REMOVE_REFERENCE: return createRemoveReference();
			case SymmetricPackage.SEMANTIC_CHANGE_SET: return createSemanticChangeSet();
			case SymmetricPackage.CORRESPONDENCE: return createCorrespondence();
			case SymmetricPackage.ATTRIBUTE_VALUE_CHANGE: return createAttributeValueChange();
			case SymmetricPackage.ESTRING2_EOBJECT_SET_MAP: return (EObject)createEString2EObjectSetMap();
			case SymmetricPackage.EDIT_RULE_MATCH: return createEditRuleMatch();
			case SymmetricPackage.EOBJECT_SET: return createEObjectSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricDifference createSymmetricDifference() {
		SymmetricDifferenceImpl symmetricDifference = new SymmetricDifferenceImpl();
		return symmetricDifference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddObject createAddObject() {
		AddObjectImpl addObject = new AddObjectImpl();
		return addObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveObject createRemoveObject() {
		RemoveObjectImpl removeObject = new RemoveObjectImpl();
		return removeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddReference createAddReference() {
		AddReferenceImpl addReference = new AddReferenceImpl();
		return addReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveReference createRemoveReference() {
		RemoveReferenceImpl removeReference = new RemoveReferenceImpl();
		return removeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticChangeSet createSemanticChangeSet() {
		SemanticChangeSetImpl semanticChangeSet = new SemanticChangeSetImpl();
		return semanticChangeSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondence createCorrespondence() {
		CorrespondenceImpl correspondence = new CorrespondenceImpl();
		return correspondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueChange createAttributeValueChange() {
		AttributeValueChangeImpl attributeValueChange = new AttributeValueChangeImpl();
		return attributeValueChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EObjectSet> createEString2EObjectSetMap() {
		EString2EObjectSetMapImpl eString2EObjectSetMap = new EString2EObjectSetMapImpl();
		return eString2EObjectSetMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditRuleMatch createEditRuleMatch() {
		EditRuleMatchImpl editRuleMatch = new EditRuleMatchImpl();
		return editRuleMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObjectSet createEObjectSet() {
		EObjectSetImpl eObjectSet = new EObjectSetImpl();
		return eObjectSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymmetricPackage getSymmetricPackage() {
		return (SymmetricPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SymmetricPackage getPackage() {
		return SymmetricPackage.eINSTANCE;
	}

} //SymmetricFactoryImpl
