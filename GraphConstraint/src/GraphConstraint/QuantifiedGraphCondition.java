/**
 */
package GraphConstraint;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantified Graph Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link GraphConstraint.QuantifiedGraphCondition#getQuantifier <em>Quantifier</em>}</li>
 *   <li>{@link GraphConstraint.QuantifiedGraphCondition#getCodomain <em>Codomain</em>}</li>
 *   <li>{@link GraphConstraint.QuantifiedGraphCondition#getRestriction <em>Restriction</em>}</li>
 *   <li>{@link GraphConstraint.QuantifiedGraphCondition#getRestrictionMapping <em>Restriction Mapping</em>}</li>
 *   <li>{@link GraphConstraint.QuantifiedGraphCondition#getCodomainMapping <em>Codomain Mapping</em>}</li>
 *   <li>{@link GraphConstraint.QuantifiedGraphCondition#getNested <em>Nested</em>}</li>
 * </ul>
 * </p>
 *
 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition()
 * @model
 * @generated
 */
public interface QuantifiedGraphCondition extends NestedGraphCondition {
	/**
	 * Returns the value of the '<em><b>Quantifier</b></em>' attribute.
	 * The literals are from the enumeration {@link GraphConstraint.Quantifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantifier</em>' attribute.
	 * @see GraphConstraint.Quantifier
	 * @see #setQuantifier(Quantifier)
	 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition_Quantifier()
	 * @model required="true"
	 * @generated
	 */
	Quantifier getQuantifier();

	/**
	 * Sets the value of the '{@link GraphConstraint.QuantifiedGraphCondition#getQuantifier <em>Quantifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantifier</em>' attribute.
	 * @see GraphConstraint.Quantifier
	 * @see #getQuantifier()
	 * @generated
	 */
	void setQuantifier(Quantifier value);

	/**
	 * Returns the value of the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codomain</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain</em>' containment reference.
	 * @see #setCodomain(Graph)
	 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition_Codomain()
	 * @model containment="true"
	 * @generated
	 */
	Graph getCodomain();

	/**
	 * Sets the value of the '{@link GraphConstraint.QuantifiedGraphCondition#getCodomain <em>Codomain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain</em>' containment reference.
	 * @see #getCodomain()
	 * @generated
	 */
	void setCodomain(Graph value);

	/**
	 * Returns the value of the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction</em>' containment reference.
	 * @see #setRestriction(Graph)
	 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition_Restriction()
	 * @model containment="true"
	 * @generated
	 */
	Graph getRestriction();

	/**
	 * Sets the value of the '{@link GraphConstraint.QuantifiedGraphCondition#getRestriction <em>Restriction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction</em>' containment reference.
	 * @see #getRestriction()
	 * @generated
	 */
	void setRestriction(Graph value);

	/**
	 * Returns the value of the '<em><b>Restriction Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restriction Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restriction Mapping</em>' containment reference.
	 * @see #setRestrictionMapping(Mapping)
	 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition_RestrictionMapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getRestrictionMapping();

	/**
	 * Sets the value of the '{@link GraphConstraint.QuantifiedGraphCondition#getRestrictionMapping <em>Restriction Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restriction Mapping</em>' containment reference.
	 * @see #getRestrictionMapping()
	 * @generated
	 */
	void setRestrictionMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Codomain Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Codomain Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codomain Mapping</em>' containment reference.
	 * @see #setCodomainMapping(Mapping)
	 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition_CodomainMapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getCodomainMapping();

	/**
	 * Sets the value of the '{@link GraphConstraint.QuantifiedGraphCondition#getCodomainMapping <em>Codomain Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Codomain Mapping</em>' containment reference.
	 * @see #getCodomainMapping()
	 * @generated
	 */
	void setCodomainMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Nested</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link GraphConstraint.NestedGraphCondition#getQgc <em>Qgc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested</em>' containment reference.
	 * @see #setNested(NestedGraphCondition)
	 * @see GraphConstraint.GraphConstraintPackage#getQuantifiedGraphCondition_Nested()
	 * @see GraphConstraint.NestedGraphCondition#getQgc
	 * @model opposite="qgc" containment="true" required="true"
	 * @generated
	 */
	NestedGraphCondition getNested();

	/**
	 * Sets the value of the '{@link GraphConstraint.QuantifiedGraphCondition#getNested <em>Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested</em>' containment reference.
	 * @see #getNested()
	 * @generated
	 */
	void setNested(NestedGraphCondition value);

} // QuantifiedGraphCondition
