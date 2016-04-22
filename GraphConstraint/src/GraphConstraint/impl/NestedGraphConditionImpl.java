/**
 */
package GraphConstraint.impl;

import GraphConstraint.Formula;
import GraphConstraint.Graph;
import GraphConstraint.GraphConstraintPackage;
import GraphConstraint.NestedGraphCondition;
import GraphConstraint.NestedGraphConstraint;
import GraphConstraint.QuantifiedGraphCondition;
import GraphConstraint.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Graph Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GraphConstraint.impl.NestedGraphConditionImpl#getFormula <em>Formula</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConditionImpl#getQgc <em>Qgc</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConditionImpl#getGc <em>Gc</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConditionImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link GraphConstraint.impl.NestedGraphConditionImpl#getVars <em>Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NestedGraphConditionImpl extends MinimalEObjectImpl.Container implements NestedGraphCondition {
	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Graph domain;

	/**
	 * The cached value of the '{@link #getVars() <em>Vars</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVars()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> vars;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NestedGraphConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphConstraintPackage.Literals.NESTED_GRAPH_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Formula getFormula() {
		if (eContainerFeatureID() != GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA) return null;
		return (Formula)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFormula(Formula newFormula, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFormula, GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormula(Formula newFormula) {
		if (newFormula != eInternalContainer() || (eContainerFeatureID() != GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA && newFormula != null)) {
			if (EcoreUtil.isAncestor(this, newFormula))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFormula != null)
				msgs = ((InternalEObject)newFormula).eInverseAdd(this, GraphConstraintPackage.FORMULA__ARGS, Formula.class, msgs);
			msgs = basicSetFormula(newFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA, newFormula, newFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantifiedGraphCondition getQgc() {
		if (eContainerFeatureID() != GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC) return null;
		return (QuantifiedGraphCondition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQgc(QuantifiedGraphCondition newQgc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newQgc, GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQgc(QuantifiedGraphCondition newQgc) {
		if (newQgc != eInternalContainer() || (eContainerFeatureID() != GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC && newQgc != null)) {
			if (EcoreUtil.isAncestor(this, newQgc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newQgc != null)
				msgs = ((InternalEObject)newQgc).eInverseAdd(this, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED, QuantifiedGraphCondition.class, msgs);
			msgs = basicSetQgc(newQgc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC, newQgc, newQgc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedGraphConstraint getGc() {
		if (eContainerFeatureID() != GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC) return null;
		return (NestedGraphConstraint)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGc(NestedGraphConstraint newGc, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGc, GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGc(NestedGraphConstraint newGc) {
		if (newGc != eInternalContainer() || (eContainerFeatureID() != GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC && newGc != null)) {
			if (EcoreUtil.isAncestor(this, newGc))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGc != null)
				msgs = ((InternalEObject)newGc).eInverseAdd(this, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION, NestedGraphConstraint.class, msgs);
			msgs = basicSetGc(newGc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC, newGc, newGc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getDomain() {
		if (domain != null && domain.eIsProxy()) {
			InternalEObject oldDomain = (InternalEObject)domain;
			domain = (Graph)eResolveProxy(oldDomain);
			if (domain != oldDomain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphConstraintPackage.NESTED_GRAPH_CONDITION__DOMAIN, oldDomain, domain));
			}
		}
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Graph newDomain) {
		Graph oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.NESTED_GRAPH_CONDITION__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVars() {
		if (vars == null) {
			vars = new EObjectContainmentEList<Variable>(Variable.class, this, GraphConstraintPackage.NESTED_GRAPH_CONDITION__VARS);
		}
		return vars;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFormula((Formula)otherEnd, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetQgc((QuantifiedGraphCondition)otherEnd, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGc((NestedGraphConstraint)otherEnd, msgs);
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
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				return basicSetFormula(null, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				return basicSetQgc(null, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				return basicSetGc(null, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__VARS:
				return ((InternalEList<?>)getVars()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				return eInternalContainer().eInverseRemove(this, GraphConstraintPackage.FORMULA__ARGS, Formula.class, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				return eInternalContainer().eInverseRemove(this, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED, QuantifiedGraphCondition.class, msgs);
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				return eInternalContainer().eInverseRemove(this, GraphConstraintPackage.NESTED_GRAPH_CONSTRAINT__CONDITION, NestedGraphConstraint.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				return getFormula();
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				return getQgc();
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				return getGc();
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__DOMAIN:
				if (resolve) return getDomain();
				return basicGetDomain();
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__VARS:
				return getVars();
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
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				setFormula((Formula)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				setQgc((QuantifiedGraphCondition)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				setGc((NestedGraphConstraint)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__DOMAIN:
				setDomain((Graph)newValue);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__VARS:
				getVars().clear();
				getVars().addAll((Collection<? extends Variable>)newValue);
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
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				setFormula((Formula)null);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				setQgc((QuantifiedGraphCondition)null);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				setGc((NestedGraphConstraint)null);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__DOMAIN:
				setDomain((Graph)null);
				return;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__VARS:
				getVars().clear();
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
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__FORMULA:
				return getFormula() != null;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC:
				return getQgc() != null;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__GC:
				return getGc() != null;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__DOMAIN:
				return domain != null;
			case GraphConstraintPackage.NESTED_GRAPH_CONDITION__VARS:
				return vars != null && !vars.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NestedGraphConditionImpl
