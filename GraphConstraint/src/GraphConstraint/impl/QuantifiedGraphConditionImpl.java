/**
 */
package GraphConstraint.impl;

import GraphConstraint.Graph;
import GraphConstraint.GraphConstraintPackage;
import GraphConstraint.Mapping;
import GraphConstraint.NestedGraphCondition;
import GraphConstraint.QuantifiedGraphCondition;
import GraphConstraint.Quantifier;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantified Graph Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link GraphConstraint.impl.QuantifiedGraphConditionImpl#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link GraphConstraint.impl.QuantifiedGraphConditionImpl#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link GraphConstraint.impl.QuantifiedGraphConditionImpl#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link GraphConstraint.impl.QuantifiedGraphConditionImpl#getRestrictionMapping <em>Restriction Mapping</em>}</li>
 *   <li>{@link GraphConstraint.impl.QuantifiedGraphConditionImpl#getCodomainMapping <em>Codomain Mapping</em>}</li>
 *   <li>{@link GraphConstraint.impl.QuantifiedGraphConditionImpl#getNested <em>Nested</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuantifiedGraphConditionImpl extends NestedGraphConditionImpl implements QuantifiedGraphCondition {
	/**
	 * The default value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected static final Quantifier QUANTIFIER_EDEFAULT = Quantifier.EXISTS;

	/**
	 * The cached value of the '{@link #getQuantifier() <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantifier()
	 * @generated
	 * @ordered
	 */
	protected Quantifier quantifier = QUANTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCodomain() <em>Codomain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomain()
	 * @generated
	 * @ordered
	 */
	protected Graph codomain;

	/**
	 * The cached value of the '{@link #getRestriction() <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestriction()
	 * @generated
	 * @ordered
	 */
	protected Graph restriction;

	/**
	 * The cached value of the '{@link #getRestrictionMapping() <em>Restriction Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestrictionMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping restrictionMapping;

	/**
	 * The cached value of the '{@link #getCodomainMapping() <em>Codomain Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodomainMapping()
	 * @generated
	 * @ordered
	 */
	protected Mapping codomainMapping;

	/**
	 * The cached value of the '{@link #getNested() <em>Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNested()
	 * @generated
	 * @ordered
	 */
	protected NestedGraphCondition nested;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantifiedGraphConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphConstraintPackage.Literals.QUANTIFIED_GRAPH_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier getQuantifier() {
		return quantifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantifier(Quantifier newQuantifier) {
		Quantifier oldQuantifier = quantifier;
		quantifier = newQuantifier == null ? QUANTIFIER_EDEFAULT : newQuantifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__QUANTIFIER, oldQuantifier, quantifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getCodomain() {
		return codomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodomain(Graph newCodomain, NotificationChain msgs) {
		Graph oldCodomain = codomain;
		codomain = newCodomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN, oldCodomain, newCodomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodomain(Graph newCodomain) {
		if (newCodomain != codomain) {
			NotificationChain msgs = null;
			if (codomain != null)
				msgs = ((InternalEObject)codomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN, null, msgs);
			if (newCodomain != null)
				msgs = ((InternalEObject)newCodomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN, null, msgs);
			msgs = basicSetCodomain(newCodomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN, newCodomain, newCodomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getRestriction() {
		return restriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestriction(Graph newRestriction, NotificationChain msgs) {
		Graph oldRestriction = restriction;
		restriction = newRestriction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION, oldRestriction, newRestriction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestriction(Graph newRestriction) {
		if (newRestriction != restriction) {
			NotificationChain msgs = null;
			if (restriction != null)
				msgs = ((InternalEObject)restriction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION, null, msgs);
			if (newRestriction != null)
				msgs = ((InternalEObject)newRestriction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION, null, msgs);
			msgs = basicSetRestriction(newRestriction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION, newRestriction, newRestriction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getRestrictionMapping() {
		return restrictionMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRestrictionMapping(Mapping newRestrictionMapping, NotificationChain msgs) {
		Mapping oldRestrictionMapping = restrictionMapping;
		restrictionMapping = newRestrictionMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING, oldRestrictionMapping, newRestrictionMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestrictionMapping(Mapping newRestrictionMapping) {
		if (newRestrictionMapping != restrictionMapping) {
			NotificationChain msgs = null;
			if (restrictionMapping != null)
				msgs = ((InternalEObject)restrictionMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING, null, msgs);
			if (newRestrictionMapping != null)
				msgs = ((InternalEObject)newRestrictionMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING, null, msgs);
			msgs = basicSetRestrictionMapping(newRestrictionMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING, newRestrictionMapping, newRestrictionMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getCodomainMapping() {
		return codomainMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCodomainMapping(Mapping newCodomainMapping, NotificationChain msgs) {
		Mapping oldCodomainMapping = codomainMapping;
		codomainMapping = newCodomainMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING, oldCodomainMapping, newCodomainMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodomainMapping(Mapping newCodomainMapping) {
		if (newCodomainMapping != codomainMapping) {
			NotificationChain msgs = null;
			if (codomainMapping != null)
				msgs = ((InternalEObject)codomainMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING, null, msgs);
			if (newCodomainMapping != null)
				msgs = ((InternalEObject)newCodomainMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING, null, msgs);
			msgs = basicSetCodomainMapping(newCodomainMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING, newCodomainMapping, newCodomainMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedGraphCondition getNested() {
		return nested;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNested(NestedGraphCondition newNested, NotificationChain msgs) {
		NestedGraphCondition oldNested = nested;
		nested = newNested;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED, oldNested, newNested);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNested(NestedGraphCondition newNested) {
		if (newNested != nested) {
			NotificationChain msgs = null;
			if (nested != null)
				msgs = ((InternalEObject)nested).eInverseRemove(this, GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC, NestedGraphCondition.class, msgs);
			if (newNested != null)
				msgs = ((InternalEObject)newNested).eInverseAdd(this, GraphConstraintPackage.NESTED_GRAPH_CONDITION__QGC, NestedGraphCondition.class, msgs);
			msgs = basicSetNested(newNested, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED, newNested, newNested));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED:
				if (nested != null)
					msgs = ((InternalEObject)nested).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED, null, msgs);
				return basicSetNested((NestedGraphCondition)otherEnd, msgs);
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
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN:
				return basicSetCodomain(null, msgs);
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION:
				return basicSetRestriction(null, msgs);
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING:
				return basicSetRestrictionMapping(null, msgs);
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING:
				return basicSetCodomainMapping(null, msgs);
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED:
				return basicSetNested(null, msgs);
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
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__QUANTIFIER:
				return getQuantifier();
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN:
				return getCodomain();
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION:
				return getRestriction();
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING:
				return getRestrictionMapping();
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING:
				return getCodomainMapping();
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED:
				return getNested();
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
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__QUANTIFIER:
				setQuantifier((Quantifier)newValue);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN:
				setCodomain((Graph)newValue);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION:
				setRestriction((Graph)newValue);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING:
				setRestrictionMapping((Mapping)newValue);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING:
				setCodomainMapping((Mapping)newValue);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED:
				setNested((NestedGraphCondition)newValue);
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
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__QUANTIFIER:
				setQuantifier(QUANTIFIER_EDEFAULT);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN:
				setCodomain((Graph)null);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION:
				setRestriction((Graph)null);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING:
				setRestrictionMapping((Mapping)null);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING:
				setCodomainMapping((Mapping)null);
				return;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED:
				setNested((NestedGraphCondition)null);
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
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__QUANTIFIER:
				return quantifier != QUANTIFIER_EDEFAULT;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN:
				return codomain != null;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION:
				return restriction != null;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING:
				return restrictionMapping != null;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING:
				return codomainMapping != null;
			case GraphConstraintPackage.QUANTIFIED_GRAPH_CONDITION__NESTED:
				return nested != null;
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
		result.append(" (quantifier: ");
		result.append(quantifier);
		result.append(')');
		return result.toString();
	}

} //QuantifiedGraphConditionImpl
