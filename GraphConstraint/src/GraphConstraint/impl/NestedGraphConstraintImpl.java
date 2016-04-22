/**
 */
package GraphConstraint.impl;

import GraphConstraint.Graph;
import GraphConstraint.GraphConstraintPackage;
import GraphConstraint.NestedGraphCondition;
import GraphConstraint.NestedGraphConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Graph Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GraphConstraint.impl.NestedGraphConstraintImpl#getImport <em>Import</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConstraintImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConstraintImpl#getEmptyDomain <em>Empty Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedGraphConstraintImpl extends MinimalEObjectImpl.Container implements NestedGraphConstraint {
	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EPackage import_;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected NestedGraphCondition condition;

	/**
	 * The cached value of the '{@link #getEmptyDomain() <em>Empty Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmptyDomain()
	 * @generated
	 * @ordered
	 */
	protected Graph emptyDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedGraphConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphConstraintPackage.Literals.NESTED_GRAPH_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getImport() {
		if (import_ != null && import_.eIsProxy()) {
			InternalEObject oldImport = (InternalEObject)import_;
			import_ = (EPackage)eResolveProxy(oldImport);
			if (import_ != oldImport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__IMPORT, oldImport, import_));
			}
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage basicGetImport() {
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(EPackage newImport) {
		EPackage oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__IMPORT, oldImport, import_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedGraphCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(NestedGraphCondition newCondition, NotificationChain msgs) {
		NestedGraphCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(NestedGraphCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC, NestedGraphCondition.class, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC, NestedGraphCondition.class, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getEmptyDomain() {
		return emptyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmptyDomain(Graph newEmptyDomain, NotificationChain msgs) {
		Graph oldEmptyDomain = emptyDomain;
		emptyDomain = newEmptyDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN, oldEmptyDomain, newEmptyDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmptyDomain(Graph newEmptyDomain) {
		if (newEmptyDomain != emptyDomain) {
			NotificationChain msgs = null;
			if (emptyDomain != null)
				msgs = ((InternalEObject)emptyDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN, null, msgs);
			if (newEmptyDomain != null)
				msgs = ((InternalEObject)newEmptyDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN, null, msgs);
			msgs = basicSetEmptyDomain(newEmptyDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN, newEmptyDomain, newEmptyDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION:
				if (condition != null)
					msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION, null, msgs);
				return basicSetCondition((NestedGraphCondition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION:
				return basicSetCondition(null, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN:
				return basicSetEmptyDomain(null, msgs);
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
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__NAME:
				return getName();
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION:
				return getCondition();
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN:
				return getEmptyDomain();
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
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__IMPORT:
				setImport((EPackage)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__NAME:
				setName((String)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION:
				setCondition((NestedGraphCondition)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN:
				setEmptyDomain((Graph)newValue);
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
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__IMPORT:
				setImport((EPackage)null);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION:
				setCondition((NestedGraphCondition)null);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN:
				setEmptyDomain((Graph)null);
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
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__IMPORT:
				return import_ != null;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION:
				return condition != null;
			case GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN:
				return emptyDomain != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NestedGraphConstraintImpl
