OCL2NGC benchmark scenario
==========================

The rule set for this benchmark scenario is contained in the "OCL2NGC.henshin" file.

The rule set references three meta-models:

	* Source meta-model: Pivot.ecore - OCL Pivot Meta-Model, as obtained from https://wiki.eclipse.org/OCL/Pivot_Model
	* Target meta-model: GraphConstraint.ecore - Graph Constraint meta-model, as obtained from the original OCN2NGC project.
	* Trace meta-model: Henshin's custom Trace Meta-Model, an auxiliary meta-model supporting exogenous transformations in Henshin. https://wiki.eclipse.org/Henshin_Trace_Model
	
Pivot.ecore and GraphConstraint.ecore have been cloned from their original projects to this directory.

In Pivot.ecore, three minor adjustments have been made to support the correct loading of instances:
	* Removed special UTF-8 characters
	* Changed the data type of Precedence.order from "Integer" to "EInt"
	* Changed the data type of UnlimitedNaturalLiteralExp.unlimitedNaturalSymbol from "UnlimitedNatural" to "ELong"