# Benchmark Set for Scalable Model Transformations.

As model transformation specifications grow in size and complexity, several issues related to their scalability arise. The performance and maintainability of a transformation system may be affected by the size of individual rules as well as the  size of the overall rule set. To investigate these challenges, we provide a benchmark set that includes large rule sets and large rules.  Please feel free to [contact Daniel Strüber](https://www.uni-marburg.de/fb12/swt/daniel-strueber) in case you have any questions.

## Contents

The benchmark set comprises five rule sets in total:

* **fmedit**: Feature model edit operation rules.
* **fmregoc**: Feature model edit operation recognition rules.
* **umledit**: UML edit operation rules.
* **umlregoc**: UML  edit operation recognition rules.
* **ocl2ngc**: OCL to Nested Graph Constraint translation rules.

These five rule sets are subject to two different benchmark kinds:

* *Performance benchmark*: The **fmregoc**, **umlregoc** and **ocl2ngc** rule sets are applied in batch mode, that is, each rule is executed as long as one of them can be applied. This execution mode can lead to substantial execution times, which makes these rules suitable as subjects for a performance benchmark. In this benchmark, the total execution time on some representative input models is measured.
* *Maintainability benchmark*: The **fmedit**, **umledit** and **ocl2ngc** are subject to maintainance by developers; the other two rule sets usually not required to be maintained since they are automatically derived. The maintainability benchmark comprises a measurement of the rule set's compactness.

## Use

As a prerequisite, please install the Eclipse Modeling Tools distribution on your system. We tested the benchmark on  [Eclipse Mars 2 MDT](http://www.eclipse.org/downloads/packages/eclipse-modeling-tools/mars2).

* Clone the complete Git repository including all Eclipse projects to your system. Most included projects  contain meta-models required by the transformations.
* To start one of the benchmarks,  
  * use the Package Explorer to browse the *de.bigtrafo.benchmark* project,  
  * select the relevant package in the *src/de.bigtrafo.benchmark* folder, and
  * use the context menu entry *Run As -> Java Application* on the included Java file to start the benchmark. Results will be printed to the console.

## Contribute

To contribute additional benchmark scenarios, issue a pull request featuring
* the rule set itself, within a dedicated folder in the *de.bigtrafo.benchmark* project,
* example models, within a sub-folder of said folder, called *instances*,
* a dedicated package and class in the *src/de.bigtrafo.benchmark* package,
* allany additional dependencies.

## Contributors

* Daniel Strüber
* Timo Kehrer
* Thorsten Arendt
* Christopher Pietsch
* Dennis Reuling
