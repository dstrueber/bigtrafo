/**
 */
package GraphConstraint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see GraphConstraint.GraphConstraintFactory
 * @model kind="package"
 * @generated
 */
public interface GraphConstraintPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GraphConstraint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/GraphConstraint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphConstraintPackage eINSTANCE = GraphConstraint.impl.GraphConstraintPackageImpl.init();

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.GraphImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = 0;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.GraphElementImpl <em>Graph Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.GraphElementImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.NestedGraphConstraintImpl <em>Nested Graph Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.NestedGraphConstraintImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getNestedGraphConstraint()
	 * @generated
	 */
	int NESTED_GRAPH_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONSTRAINT__IMPORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONSTRAINT__CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Empty Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN = 3;

	/**
	 * The number of structural features of the '<em>Nested Graph Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONSTRAINT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Nested Graph Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.NodeImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ATTRIBUTES = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.EdgeImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__SRC = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tgt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TGT = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TYPE = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.AttributeImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__OP = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.MappingImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__TO = 1;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPINGS = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.ElementMappingImpl <em>Element Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.ElementMappingImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getElementMapping()
	 * @generated
	 */
	int ELEMENT_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING__IMAGE = 1;

	/**
	 * The number of structural features of the '<em>Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.NestedGraphConditionImpl <em>Nested Graph Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.NestedGraphConditionImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getNestedGraphCondition()
	 * @generated
	 */
	int NESTED_GRAPH_CONDITION = 12;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION__FORMULA = 0;

	/**
	 * The feature id for the '<em><b>Qgc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION__QGC = 1;

	/**
	 * The feature id for the '<em><b>Gc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION__GC = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION__DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION__VARS = 4;

	/**
	 * The number of structural features of the '<em>Nested Graph Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Nested Graph Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_GRAPH_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.QuantifiedGraphConditionImpl <em>Quantified Graph Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.QuantifiedGraphConditionImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getQuantifiedGraphCondition()
	 * @generated
	 */
	int QUANTIFIED_GRAPH_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__FORMULA = NESTED_GRAPH_CONDITION__FORMULA;

	/**
	 * The feature id for the '<em><b>Qgc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__QGC = NESTED_GRAPH_CONDITION__QGC;

	/**
	 * The feature id for the '<em><b>Gc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__GC = NESTED_GRAPH_CONDITION__GC;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__DOMAIN = NESTED_GRAPH_CONDITION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__VARS = NESTED_GRAPH_CONDITION__VARS;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__QUANTIFIER = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Codomain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__CODOMAIN = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Restriction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__RESTRICTION = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Restriction Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Codomain Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION__NESTED = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Quantified Graph Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION_FEATURE_COUNT = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Quantified Graph Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_GRAPH_CONDITION_OPERATION_COUNT = NESTED_GRAPH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.TrueImpl <em>True</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.TrueImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getTrue()
	 * @generated
	 */
	int TRUE = 9;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__FORMULA = NESTED_GRAPH_CONDITION__FORMULA;

	/**
	 * The feature id for the '<em><b>Qgc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__QGC = NESTED_GRAPH_CONDITION__QGC;

	/**
	 * The feature id for the '<em><b>Gc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__GC = NESTED_GRAPH_CONDITION__GC;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__DOMAIN = NESTED_GRAPH_CONDITION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE__VARS = NESTED_GRAPH_CONDITION__VARS;

	/**
	 * The number of structural features of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_FEATURE_COUNT = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>True</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUE_OPERATION_COUNT = NESTED_GRAPH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.FormulaImpl <em>Formula</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.FormulaImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getFormula()
	 * @generated
	 */
	int FORMULA = 10;

	/**
	 * The feature id for the '<em><b>Formula</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__FORMULA = NESTED_GRAPH_CONDITION__FORMULA;

	/**
	 * The feature id for the '<em><b>Qgc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__QGC = NESTED_GRAPH_CONDITION__QGC;

	/**
	 * The feature id for the '<em><b>Gc</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__GC = NESTED_GRAPH_CONDITION__GC;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__DOMAIN = NESTED_GRAPH_CONDITION__DOMAIN;

	/**
	 * The feature id for the '<em><b>Vars</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__VARS = NESTED_GRAPH_CONDITION__VARS;

	/**
	 * The feature id for the '<em><b>Op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__OP = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA__ARGS = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_FEATURE_COUNT = NESTED_GRAPH_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Formula</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMULA_OPERATION_COUNT = NESTED_GRAPH_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.impl.VariableImpl
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link GraphConstraint.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.Quantifier
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 13;

	/**
	 * The meta object id for the '{@link GraphConstraint.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see GraphConstraint.Operator
	 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 14;


	/**
	 * Returns the meta object for class '{@link GraphConstraint.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see GraphConstraint.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphConstraint.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see GraphConstraint.Graph#getEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Edges();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphConstraint.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see GraphConstraint.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.GraphElement <em>Graph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph Element</em>'.
	 * @see GraphConstraint.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.GraphElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphConstraint.GraphElement#getName()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Name();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.NestedGraphConstraint <em>Nested Graph Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Graph Constraint</em>'.
	 * @see GraphConstraint.NestedGraphConstraint
	 * @generated
	 */
	EClass getNestedGraphConstraint();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.NestedGraphConstraint#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see GraphConstraint.NestedGraphConstraint#getImport()
	 * @see #getNestedGraphConstraint()
	 * @generated
	 */
	EReference getNestedGraphConstraint_Import();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.NestedGraphConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphConstraint.NestedGraphConstraint#getName()
	 * @see #getNestedGraphConstraint()
	 * @generated
	 */
	EAttribute getNestedGraphConstraint_Name();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.NestedGraphConstraint#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see GraphConstraint.NestedGraphConstraint#getCondition()
	 * @see #getNestedGraphConstraint()
	 * @generated
	 */
	EReference getNestedGraphConstraint_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.NestedGraphConstraint#getEmptyDomain <em>Empty Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Empty Domain</em>'.
	 * @see GraphConstraint.NestedGraphConstraint#getEmptyDomain()
	 * @see #getNestedGraphConstraint()
	 * @generated
	 */
	EReference getNestedGraphConstraint_EmptyDomain();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see GraphConstraint.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphConstraint.Node#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see GraphConstraint.Node#getAttributes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Attributes();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see GraphConstraint.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Type();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see GraphConstraint.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Edge#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see GraphConstraint.Edge#getSrc()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Src();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Edge#getTgt <em>Tgt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tgt</em>'.
	 * @see GraphConstraint.Edge#getTgt()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Tgt();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Edge#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see GraphConstraint.Edge#getType()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Type();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see GraphConstraint.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.Attribute#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see GraphConstraint.Attribute#getOp()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Op();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see GraphConstraint.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see GraphConstraint.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see GraphConstraint.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Mapping#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see GraphConstraint.Mapping#getFrom()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_From();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Mapping#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see GraphConstraint.Mapping#getTo()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_To();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphConstraint.Mapping#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see GraphConstraint.Mapping#getMappings()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_Mappings();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.ElementMapping <em>Element Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Mapping</em>'.
	 * @see GraphConstraint.ElementMapping
	 * @generated
	 */
	EClass getElementMapping();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.ElementMapping#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see GraphConstraint.ElementMapping#getOrigin()
	 * @see #getElementMapping()
	 * @generated
	 */
	EReference getElementMapping_Origin();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.ElementMapping#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see GraphConstraint.ElementMapping#getImage()
	 * @see #getElementMapping()
	 * @generated
	 */
	EReference getElementMapping_Image();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.QuantifiedGraphCondition <em>Quantified Graph Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Graph Condition</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition
	 * @generated
	 */
	EClass getQuantifiedGraphCondition();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.QuantifiedGraphCondition#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition#getQuantifier()
	 * @see #getQuantifiedGraphCondition()
	 * @generated
	 */
	EAttribute getQuantifiedGraphCondition_Quantifier();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.QuantifiedGraphCondition#getCodomain <em>Codomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codomain</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition#getCodomain()
	 * @see #getQuantifiedGraphCondition()
	 * @generated
	 */
	EReference getQuantifiedGraphCondition_Codomain();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.QuantifiedGraphCondition#getRestriction <em>Restriction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition#getRestriction()
	 * @see #getQuantifiedGraphCondition()
	 * @generated
	 */
	EReference getQuantifiedGraphCondition_Restriction();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.QuantifiedGraphCondition#getRestrictionMapping <em>Restriction Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Restriction Mapping</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition#getRestrictionMapping()
	 * @see #getQuantifiedGraphCondition()
	 * @generated
	 */
	EReference getQuantifiedGraphCondition_RestrictionMapping();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.QuantifiedGraphCondition#getCodomainMapping <em>Codomain Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Codomain Mapping</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition#getCodomainMapping()
	 * @see #getQuantifiedGraphCondition()
	 * @generated
	 */
	EReference getQuantifiedGraphCondition_CodomainMapping();

	/**
	 * Returns the meta object for the containment reference '{@link GraphConstraint.QuantifiedGraphCondition#getNested <em>Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nested</em>'.
	 * @see GraphConstraint.QuantifiedGraphCondition#getNested()
	 * @see #getQuantifiedGraphCondition()
	 * @generated
	 */
	EReference getQuantifiedGraphCondition_Nested();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.True <em>True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>True</em>'.
	 * @see GraphConstraint.True
	 * @generated
	 */
	EClass getTrue();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.Formula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formula</em>'.
	 * @see GraphConstraint.Formula
	 * @generated
	 */
	EClass getFormula();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.Formula#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Op</em>'.
	 * @see GraphConstraint.Formula#getOp()
	 * @see #getFormula()
	 * @generated
	 */
	EAttribute getFormula_Op();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphConstraint.Formula#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see GraphConstraint.Formula#getArgs()
	 * @see #getFormula()
	 * @generated
	 */
	EReference getFormula_Args();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see GraphConstraint.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see GraphConstraint.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link GraphConstraint.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see GraphConstraint.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link GraphConstraint.NestedGraphCondition <em>Nested Graph Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Graph Condition</em>'.
	 * @see GraphConstraint.NestedGraphCondition
	 * @generated
	 */
	EClass getNestedGraphCondition();

	/**
	 * Returns the meta object for the container reference '{@link GraphConstraint.NestedGraphCondition#getFormula <em>Formula</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Formula</em>'.
	 * @see GraphConstraint.NestedGraphCondition#getFormula()
	 * @see #getNestedGraphCondition()
	 * @generated
	 */
	EReference getNestedGraphCondition_Formula();

	/**
	 * Returns the meta object for the container reference '{@link GraphConstraint.NestedGraphCondition#getQgc <em>Qgc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Qgc</em>'.
	 * @see GraphConstraint.NestedGraphCondition#getQgc()
	 * @see #getNestedGraphCondition()
	 * @generated
	 */
	EReference getNestedGraphCondition_Qgc();

	/**
	 * Returns the meta object for the container reference '{@link GraphConstraint.NestedGraphCondition#getGc <em>Gc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gc</em>'.
	 * @see GraphConstraint.NestedGraphCondition#getGc()
	 * @see #getNestedGraphCondition()
	 * @generated
	 */
	EReference getNestedGraphCondition_Gc();

	/**
	 * Returns the meta object for the reference '{@link GraphConstraint.NestedGraphCondition#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see GraphConstraint.NestedGraphCondition#getDomain()
	 * @see #getNestedGraphCondition()
	 * @generated
	 */
	EReference getNestedGraphCondition_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link GraphConstraint.NestedGraphCondition#getVars <em>Vars</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vars</em>'.
	 * @see GraphConstraint.NestedGraphCondition#getVars()
	 * @see #getNestedGraphCondition()
	 * @generated
	 */
	EReference getNestedGraphCondition_Vars();

	/**
	 * Returns the meta object for enum '{@link GraphConstraint.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see GraphConstraint.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link GraphConstraint.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see GraphConstraint.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphConstraintFactory getGraphConstraintFactory();

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
		 * The meta object literal for the '{@link GraphConstraint.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.GraphImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EDGES = eINSTANCE.getGraph_Edges();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.GraphElementImpl <em>Graph Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.GraphElementImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__NAME = eINSTANCE.getGraphElement_Name();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.NestedGraphConstraintImpl <em>Nested Graph Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.NestedGraphConstraintImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getNestedGraphConstraint()
		 * @generated
		 */
		EClass NESTED_GRAPH_CONSTRAINT = eINSTANCE.getNestedGraphConstraint();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONSTRAINT__IMPORT = eINSTANCE.getNestedGraphConstraint_Import();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_GRAPH_CONSTRAINT__NAME = eINSTANCE.getNestedGraphConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONSTRAINT__CONDITION = eINSTANCE.getNestedGraphConstraint_Condition();

		/**
		 * The meta object literal for the '<em><b>Empty Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONSTRAINT__EMPTY_DOMAIN = eINSTANCE.getNestedGraphConstraint_EmptyDomain();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.NodeImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ATTRIBUTES = eINSTANCE.getNode_Attributes();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.EdgeImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__SRC = eINSTANCE.getEdge_Src();

		/**
		 * The meta object literal for the '<em><b>Tgt</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TGT = eINSTANCE.getEdge_Tgt();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TYPE = eINSTANCE.getEdge_Type();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.AttributeImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__OP = eINSTANCE.getAttribute_Op();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.MappingImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__FROM = eINSTANCE.getMapping_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__TO = eINSTANCE.getMapping_To();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MAPPINGS = eINSTANCE.getMapping_Mappings();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.ElementMappingImpl <em>Element Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.ElementMappingImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getElementMapping()
		 * @generated
		 */
		EClass ELEMENT_MAPPING = eINSTANCE.getElementMapping();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MAPPING__ORIGIN = eINSTANCE.getElementMapping_Origin();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_MAPPING__IMAGE = eINSTANCE.getElementMapping_Image();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.QuantifiedGraphConditionImpl <em>Quantified Graph Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.QuantifiedGraphConditionImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getQuantifiedGraphCondition()
		 * @generated
		 */
		EClass QUANTIFIED_GRAPH_CONDITION = eINSTANCE.getQuantifiedGraphCondition();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFIED_GRAPH_CONDITION__QUANTIFIER = eINSTANCE.getQuantifiedGraphCondition_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Codomain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_GRAPH_CONDITION__CODOMAIN = eINSTANCE.getQuantifiedGraphCondition_Codomain();

		/**
		 * The meta object literal for the '<em><b>Restriction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_GRAPH_CONDITION__RESTRICTION = eINSTANCE.getQuantifiedGraphCondition_Restriction();

		/**
		 * The meta object literal for the '<em><b>Restriction Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_GRAPH_CONDITION__RESTRICTION_MAPPING = eINSTANCE.getQuantifiedGraphCondition_RestrictionMapping();

		/**
		 * The meta object literal for the '<em><b>Codomain Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_GRAPH_CONDITION__CODOMAIN_MAPPING = eINSTANCE.getQuantifiedGraphCondition_CodomainMapping();

		/**
		 * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_GRAPH_CONDITION__NESTED = eINSTANCE.getQuantifiedGraphCondition_Nested();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.TrueImpl <em>True</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.TrueImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getTrue()
		 * @generated
		 */
		EClass TRUE = eINSTANCE.getTrue();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.FormulaImpl <em>Formula</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.FormulaImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getFormula()
		 * @generated
		 */
		EClass FORMULA = eINSTANCE.getFormula();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMULA__OP = eINSTANCE.getFormula_Op();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMULA__ARGS = eINSTANCE.getFormula_Args();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.VariableImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link GraphConstraint.impl.NestedGraphConditionImpl <em>Nested Graph Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.impl.NestedGraphConditionImpl
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getNestedGraphCondition()
		 * @generated
		 */
		EClass NESTED_GRAPH_CONDITION = eINSTANCE.getNestedGraphCondition();

		/**
		 * The meta object literal for the '<em><b>Formula</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONDITION__FORMULA = eINSTANCE.getNestedGraphCondition_Formula();

		/**
		 * The meta object literal for the '<em><b>Qgc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONDITION__QGC = eINSTANCE.getNestedGraphCondition_Qgc();

		/**
		 * The meta object literal for the '<em><b>Gc</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONDITION__GC = eINSTANCE.getNestedGraphCondition_Gc();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONDITION__DOMAIN = eINSTANCE.getNestedGraphCondition_Domain();

		/**
		 * The meta object literal for the '<em><b>Vars</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_GRAPH_CONDITION__VARS = eINSTANCE.getNestedGraphCondition_Vars();

		/**
		 * The meta object literal for the '{@link GraphConstraint.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.Quantifier
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link GraphConstraint.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see GraphConstraint.Operator
		 * @see GraphConstraint.impl.GraphConstraintPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //GraphConstraintPackage
