/**
 */
package symmetric.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import symmetric.Change;
import symmetric.Correspondence;
import symmetric.SemanticChangeSet;
import symmetric.SymmetricDifference;
import symmetric.SymmetricPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Difference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getChangeSets <em>Change Sets</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getCorrespondences <em>Correspondences</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getModelA <em>Model A</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getModelB <em>Model B</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getUriModelA <em>Uri Model A</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getUriModelB <em>Uri Model B</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getNotOverlappings <em>Not Overlappings</em>}</li>
 *   <li>{@link symmetric.impl.SymmetricDifferenceImpl#getUnusedChangeSets <em>Unused Change Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymmetricDifferenceImpl extends MinimalEObjectImpl.Container implements SymmetricDifference {
	/**
	 * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<Change> changes;

	/**
	 * The cached value of the '{@link #getChangeSets() <em>Change Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticChangeSet> changeSets;

	/**
	 * The cached value of the '{@link #getCorrespondences() <em>Correspondences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondences()
	 * @generated
	 * @ordered
	 */
	protected EList<Correspondence> correspondences;

	/**
	 * The default value of the '{@link #getModelA() <em>Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelA()
	 * @generated
	 * @ordered
	 */
	protected static final Resource MODEL_A_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getModelB() <em>Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelB()
	 * @generated
	 * @ordered
	 */
	protected static final Resource MODEL_B_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getUriModelA() <em>Uri Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriModelA()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_MODEL_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriModelA() <em>Uri Model A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriModelA()
	 * @generated
	 * @ordered
	 */
	protected String uriModelA = URI_MODEL_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getUriModelB() <em>Uri Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriModelB()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_MODEL_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriModelB() <em>Uri Model B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriModelB()
	 * @generated
	 * @ordered
	 */
	protected String uriModelB = URI_MODEL_B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotOverlappings() <em>Not Overlappings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotOverlappings()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticChangeSet> notOverlappings;

	/**
	 * The cached value of the '{@link #getUnusedChangeSets() <em>Unused Change Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnusedChangeSets()
	 * @generated
	 * @ordered
	 */
	protected EList<SemanticChangeSet> unusedChangeSets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymmetricDifferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymmetricPackage.Literals.SYMMETRIC_DIFFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Change> getChanges() {
		if (changes == null) {
			changes = new EObjectContainmentEList<Change>(Change.class, this, SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGES);
		}
		return changes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticChangeSet> getChangeSets() {
		if (changeSets == null) {
			changeSets = new EObjectContainmentEList<SemanticChangeSet>(SemanticChangeSet.class, this, SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGE_SETS);
		}
		return changeSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Correspondence> getCorrespondences() {
		if (correspondences == null) {
			correspondences = new EObjectContainmentEList<Correspondence>(Correspondence.class, this, SymmetricPackage.SYMMETRIC_DIFFERENCE__CORRESPONDENCES);
		}
		return correspondences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getModelA() {
		// TODO: implement this method to return the 'Model A' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource getModelB() {
		// TODO: implement this method to return the 'Model B' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriModelA() {
		return uriModelA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriModelA(String newUriModelA) {
		String oldUriModelA = uriModelA;
		uriModelA = newUriModelA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_A, oldUriModelA, uriModelA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUriModelB() {
		return uriModelB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUriModelB(String newUriModelB) {
		String oldUriModelB = uriModelB;
		uriModelB = newUriModelB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_B, oldUriModelB, uriModelB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticChangeSet> getNotOverlappings() {
		if (notOverlappings == null) {
			notOverlappings = new EObjectResolvingEList<SemanticChangeSet>(SemanticChangeSet.class, this, SymmetricPackage.SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS);
		}
		return notOverlappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SemanticChangeSet> getUnusedChangeSets() {
		if (unusedChangeSets == null) {
			unusedChangeSets = new EObjectContainmentEList<SemanticChangeSet>(SemanticChangeSet.class, this, SymmetricPackage.SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS);
		}
		return unusedChangeSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCorrespondingObjectInA(EObject objectInB) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCorrespondingObjectInB(EObject objectInA) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCorrespondence(EObject objectA, EObject objectB) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCorrespondence(Correspondence correspondence) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCorrespondence(Correspondence correspondence) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCorrespondence(EObject objectA, EObject objectB, float reliability) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReliability(EObject objectA, EObject objectB) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCorrespondenceA(EObject objectInA) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCorrespondenceB(EObject objectInB) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGES:
				return ((InternalEList<?>)getChanges()).basicRemove(otherEnd, msgs);
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGE_SETS:
				return ((InternalEList<?>)getChangeSets()).basicRemove(otherEnd, msgs);
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CORRESPONDENCES:
				return ((InternalEList<?>)getCorrespondences()).basicRemove(otherEnd, msgs);
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS:
				return ((InternalEList<?>)getUnusedChangeSets()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGES:
				return getChanges();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGE_SETS:
				return getChangeSets();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CORRESPONDENCES:
				return getCorrespondences();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__MODEL_A:
				return getModelA();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__MODEL_B:
				return getModelB();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_A:
				return getUriModelA();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_B:
				return getUriModelB();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS:
				return getNotOverlappings();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS:
				return getUnusedChangeSets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGES:
				getChanges().clear();
				getChanges().addAll((Collection<? extends Change>)newValue);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGE_SETS:
				getChangeSets().clear();
				getChangeSets().addAll((Collection<? extends SemanticChangeSet>)newValue);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_A:
				setUriModelA((String)newValue);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_B:
				setUriModelB((String)newValue);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS:
				getNotOverlappings().clear();
				getNotOverlappings().addAll((Collection<? extends SemanticChangeSet>)newValue);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS:
				getUnusedChangeSets().clear();
				getUnusedChangeSets().addAll((Collection<? extends SemanticChangeSet>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGES:
				getChanges().clear();
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGE_SETS:
				getChangeSets().clear();
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_A:
				setUriModelA(URI_MODEL_A_EDEFAULT);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_B:
				setUriModelB(URI_MODEL_B_EDEFAULT);
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS:
				getNotOverlappings().clear();
				return;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS:
				getUnusedChangeSets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGES:
				return changes != null && !changes.isEmpty();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CHANGE_SETS:
				return changeSets != null && !changeSets.isEmpty();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__CORRESPONDENCES:
				return correspondences != null && !correspondences.isEmpty();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__MODEL_A:
				return MODEL_A_EDEFAULT == null ? getModelA() != null : !MODEL_A_EDEFAULT.equals(getModelA());
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__MODEL_B:
				return MODEL_B_EDEFAULT == null ? getModelB() != null : !MODEL_B_EDEFAULT.equals(getModelB());
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_A:
				return URI_MODEL_A_EDEFAULT == null ? uriModelA != null : !URI_MODEL_A_EDEFAULT.equals(uriModelA);
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__URI_MODEL_B:
				return URI_MODEL_B_EDEFAULT == null ? uriModelB != null : !URI_MODEL_B_EDEFAULT.equals(uriModelB);
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__NOT_OVERLAPPINGS:
				return notOverlappings != null && !notOverlappings.isEmpty();
			case SymmetricPackage.SYMMETRIC_DIFFERENCE__UNUSED_CHANGE_SETS:
				return unusedChangeSets != null && !unusedChangeSets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___GET_CORRESPONDING_OBJECT_IN_A__EOBJECT:
				return getCorrespondingObjectInA((EObject)arguments.get(0));
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___GET_CORRESPONDING_OBJECT_IN_B__EOBJECT:
				return getCorrespondingObjectInB((EObject)arguments.get(0));
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__EOBJECT_EOBJECT:
				addCorrespondence((EObject)arguments.get(0), (EObject)arguments.get(1));
				return null;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE__CORRESPONDENCE:
				removeCorrespondence((Correspondence)arguments.get(0));
				return null;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__CORRESPONDENCE:
				addCorrespondence((Correspondence)arguments.get(0));
				return null;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___ADD_CORRESPONDENCE__EOBJECT_EOBJECT_FLOAT:
				addCorrespondence((EObject)arguments.get(0), (EObject)arguments.get(1), (Float)arguments.get(2));
				return null;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___GET_RELIABILITY__EOBJECT_EOBJECT:
				return getReliability((EObject)arguments.get(0), (EObject)arguments.get(1));
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE_A__EOBJECT:
				removeCorrespondenceA((EObject)arguments.get(0));
				return null;
			case SymmetricPackage.SYMMETRIC_DIFFERENCE___REMOVE_CORRESPONDENCE_B__EOBJECT:
				removeCorrespondenceB((EObject)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (uriModelA: ");
		result.append(uriModelA);
		result.append(", uriModelB: ");
		result.append(uriModelB);
		result.append(')');
		return result.toString();
	}

} //SymmetricDifferenceImpl
