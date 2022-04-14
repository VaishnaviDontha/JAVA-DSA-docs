# : Inner Classes :

	It generally refers to the class that is declared inside a class or interface.
	These are introduced because
		- to maintain clean and readable code
		- Optimization of Code
		- Private methods of the outer class can be accessed (new Feature)

	Types - 
		Nested Inner Classes 		= It can Access any private instance Variable of the outer class
		Method Local Inner Classes  = Here, Method local inner classes can't use a local variable of the outer class until it is defined as FINAL.
		Static Nested Classes 		= It is Static member of a Outer class
		Anonymous Inner Classes 	= They don't have any name. Declared in two ways : 
										1. As a subclass of the specified type
										2. As an implementer of the specified interface. 