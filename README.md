# Welcome to the PolyverseJava Project

PolyverseJava is a system for transpiling a Java program into a Java program using the Polyverse paradigm.  The paradigm was developed to compute with data annotated with metadata. In order to correctly account for the semantics of metadata, in the Polyverse paradigm computation on the data is carried out in each metadata universe.

For example, suppose that the value 3 is annotated with temporal metadata indicating that the data is "alive" from time 1 to time 4.  Suppose further that a second value 4 is annotated with a lifetime of time 3 to 5.   Then for the operation "3 + 4", the two values are only alive together from time 3 to 4, so the result would be "7 with a lifetime of 3 to 4". 

We have partially implemented the Polyverse paradigm for Java 1.5.   The polyverse compiler uses an ANTLR grammar to parse a Java program and transpile the program into one that supports computing with semantically meaningful metadata.

PolyverseJava is set up as a Netbeans v.22 project.  The project is implemented in Java. To run the project, use the ANT target "compile test program",  The target is in the file `runCompiler.xml`. An ANT target can be run from the command-line as follows 

    ant -f  *path to file*/runCompiler.xml "compile test program"

Or in Netbeans right-click on the `runCompiler.xml` file and choose the target from the drop-down list.
The target transpiles the Java program in  `test/Test1.java` .  Edit this file to transpile a different program. 

For developers, the project also has a `run.xml` to regenerate the ANTLR parser after changes to the `Java.g` grammar.

The project is still in development   Here are our goals over the next few months.

 - [ ] The project is set up currently with only one metadata domain: *sequenced* semantics for time metadata.  The domain is located in the directory `src/edu/usu/metadata`.  We plan to implement other domains in the near future.
 - [ ] We have implemented Polyverse classes for scalar values, but not for other kinds of objects, such as Strings or Arrays.  
 - [ ] Standard classes, such as System.out are also not yet rewritten to implement Polyverse semantics (basically streaming to each universe).
 - [ ] Breaks and gotos are not yet implemented.


