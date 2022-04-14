---
title: Introduction To Java
slug: Java
tags: JavaDSA
domain: vaishnavidontha.hashnode.dev
---



# : Introduction to Java :

	.java file = human readable {This is Source Code}
			|
			| (Compiler)	
			|  Entire File
		       \|/
	.class = byte code 			{This will not execute directly on a System, JVM is required because JAVA is platform independent }
			|
			| (Interpreter)
			| Line by Line 	
		       \|/
	Machine code (0 and 1)


# : How/Why Java is Platform Independent ? :

	- After compiling C/C++ we get .exe file while is platform dependent
	Whereas, in Java we get bytecode, where in which ; JVM again converts this to machine code and respective task is done. (The byte code post compilation can be executed on any OS)

	* Java is platform independent but JVM is platform dependent.

## : Architecture of Java : 

<pre>
	JDK vs JRE vs JVM vs JIT
	
    ---------------------------------------------
    |	Java Development Kit = JRE + Dev Tools	|	
    |	-------------------------------------   |
    |   | JRE = JVM + Lib classes            |  |
    |   |   -----------------------------    |  |
    |   |  | Java Virtual Machine	|    |  |
    |   |  |      ( J V M )  		|    |	|
    |   |  |    -----------------	|    |  |
    |   |  |   |		 |      |    |  |	
    |   |  |   |  J I T	         |	|    |	|
    |   |  |   |  (Just in Time) |	|    |	|
    |   |  |   |		 |      |    |	|	
    |   |  |    -----------------	|    |  |
    |   |  | 			 	|    |	|
    |   |  -----------------------------     |	|
    |   |				     |  |
    |   --------------------------------------	|
    |		   				|
    --------------------------------------------
</pre>


### : JDK :

    	- A set of files
    	- Provides env to develop and run Java programs
    	- Package that includes
    		1. dev tools = Env to develop your program
    		2. JRE = To execute program
    		3. Compiler = javac
    		4. Archiver = jar
    		5. Docs generator = javadoc
    		6. Interpreter/loader


### : JRE :

    	- It is an Installation package that provides Env to only run the program
    	- It consists 
    		1. Deployment technologies
    		2. UI interface toolkits
    		3. Integration libraries
    		4. Base libraries
    		5. JVM
    	- After .class file; 
    		1. class loader loads all the classes needed to execute the program
    		2. JVM sends code to byte code verifier to check the format of code


## : Compile Time v/s Run Time : 

<pre>
   :: Compile Time ::									:: Run Time ::
      JVM Execution 									   Class Loader
    	Interpreter										- Loading
    		- Line by Line Execution							    - Reads .class file and generate binary data
    		- When a method is called many times it will interpret again and again.		    - Object of this class is created in HEAP memory
    	JIT 										        - Linking
    		- the methods which are repeated, JIT provides direct machine code                      - JVM verifies .class file generated
    		  to avoid re-interpretation 								- allocates memory for class variables and default values
    		- Makes execution faster 								 - Replaces symbolic references from the type to direct references
    		- Garbage Collector									  - Initialization
    													  - All the static variables are assigned with their values defined in the code and static block

    [.java file] --- javac --> [.class file]						[class   --> [Byte code --> [Interpreter] --> [Runtime] --> [Hardware]
    		(compilation) 								 loader]      verifier]

</pre>

# : Working Architecture of JAVA :

		Java Source Code --> JDK --> Bytecode --> JVM --> JRE
