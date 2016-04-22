/**
 */
package symmetric.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import symmetric.Correspondence;
import symmetric.SymmetricPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link symmetric.impl.CorrespondenceImpl#getObjA <em>Obj A</em>}</li>
 *   <li>{@link symmetric.impl.CorrespondenceImpl#getObjB <em>Obj B</em>}</li>
 *   <li>{@link symmetric.impl.CorrespondenceImpl#getReliability <em>Reliability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrespondenceImpl extends MinimalEObjectImpl.Container implements Correspondence {
	/**
	 * The cached value of the '{@link #getObjA() <em>Obj A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjA()
	 * @generated
	 * @ordered
	 */
	protected EObject objA;

	/**
	 * The cached value of the '{@link #getObjB() <em>Obj B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjB()
	 * @generated
	 * @ordered
	 */
	protected EObject objB;

	/**
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final float RELIABILITY_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected float reliability = RELIABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymmetricPackage.Literals.CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObjA() {
		if (objA != null && objA.eIsProxy()) {
			InternalEObject oldObjA = (InternalEObject)objA;
			objA = eResolveProxy(oldObjA);
			if (objA != oldObjA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymmetricPackage.CORRESPONDENCE__OBJ_A, oldObjA, objA));
			}
		}
		return objA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObjA() {
		return objA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjA(EObject newObjA) {
		EObject oldObjA = objA;
		objA = newObjA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymmetricPackage.CORRESPONDENCE__OBJ_A, oldObjA, objA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getObjB() {
		if (objB != null && objB.eIsProxy()) {
			InternalEObject oldObjB = (InternalEObject)objB;
			objB = eResolveProxy(oldObjB);
			if (objB != oldObjB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymmetricPackage.CORRESPONDENCE__OBJ_B, oldObjB, objB));
			}
		}
		return objB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetObjB() {
		return objB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjB(EObject newObjB) {
		EObject oldObjB = objB;
		objB = newObjB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymmetricPackage.CORRESPONDENCE__OBJ_B, oldObjB, objB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(float newReliability) {
		float oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymmetricPackage.CORRESPONDENCE__RELIABILITY, oldReliability, reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymmetricPackage.CORRESPONDENCE__OBJ_A:
				if (resolve) return getObjA();
				return basicGetObjA();
			case SymmetricPackage.CORRESPONDENCE__OBJ_B:
				if (resolve) return getObjB();
				return basicGetObjB();
			case SymmetricPackage.CORRESPONDENCE__RELIABILITY:
				return getReliability();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymmetricPackage.CORRESPONDENCE__OBJ_A:
				setObjA((EObject)newValue);
				return;
			case SymmetricPackage.CORRESPONDENCE__OBJ_B:
				setObjB((EObject)newValue);
				return;
			case SymmetricPackage.CORRESPONDENCE__RELIABILITY:
				setReliability((Float)newValue);
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
			case SymmetricPackage.CORRESPONDENCE__OBJ_A:
				setObjA((EObject)null);
				return;
			case SymmetricPackage.CORRESPONDENCE__OBJ_B:
				setObjB((EObject)null);
				return;
			case SymmetricPackage.CORRESPONDENCE__RELIABILITY:
				setReliability(RELIABILITY_EDEFAULT);
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
			case SymmetricPackage.CORRESPONDENCE__OBJ_A:
				return objA != null;
			case SymmetricPackage.CORRESPONDENCE__OBJ_B:
				return objB != null;
			case SymmetricPackage.CORRESPONDENCE__RELIABILITY:
				return reliability != RELIABILITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (reliability: ");
		result.append(reliability);
		result.append(')');
		return result.toString();
	}

} //CorrespondenceImpl
