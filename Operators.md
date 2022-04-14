# : Operators : 

	
	1. Arithemetic Operators = Simple Operations
							 = *, /, %, +, -

	2. Unary 				 = Needs only one Operand
							 = Used to Increment or Decrement
							 = - (Unary Minus), +(Unary Plus), ++, --, ! (Logical NOT)

	3. Assignment			 = Assign value to any Variable
							 = It has a right to left associativity, i.e. value given on the right-hand side of the operator is assigned to the variable on the left, and therefore right-hand side value must be declared before using it or should be a constant. 
							 = = 

		* In many cases, the assignment operator can be combined with other operators to build a shorter version of the statement called a Compound Statement. For example, instead of a = a+5, we can write a += 5. 
							 = += adding to left operand to right and then assigning to the left variable
							 = -= substracting to left operand to right and then assigning to the left variable
							 = *= multiplying to left operand to right and then assigning to the left variable
							 = /= dividing to left operand to right and then assigning to the left variable
							 = %= assigning modulo to left operand to right and then assigning to the left variable

	4. Relational Operators  = Used to check relations like, equality, greater than, less than
							 = They return boolean values after comparision and are extensively used in LOOPs
							 = == Equal To 
							 = != NOT Equal To
							 = < Less than
							 = <= Less than equal to 
							 = > Greater than
							 = >= Greater than equal to

	5. Logical Operators     = Used to perform Logical AND, Logical OR
							 = Note: Seecond condition is NOT evaluated when the first one is false.
							 = && - returns true when both conditions are true.
							 = || - returns true if at least one condition is true.
							 = Ternary Operator - Also a shorthand version of If-Else - conditon ? true : false
	
	6. Bitwise Operators 	 = Used to perform the manipulation of individual bits of a number. 
							 = They can be used with any of the integer types. 
							 = "They are used when performing update and query operations of the Binary indexed trees. "
							 = &, Bitwise AND operator: returns bit by bit AND of input values.
							 = |, Bitwise OR operator: returns bit by bit OR of input values.
							 = ^, Bitwise XOR operator: returns bit by bit XOR of input values.
							 = ~, Bitwise Complement Operator: This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.
	
	7. Shift Operators		 = Used to shift the bits of a number from Left to Right, therby multiplying or dividing the number by two
							 = Syntax : number operator num_places_to_shift;
							 = <<  - Left shift  - Shifts the bits of number to the left and fills 0 on voids 
							 					 - Similar effect as multiplying the number with some power of two
							 = >>  - Right shift - Shifts the bits of number to the right and fills 0 on voids 
							 					 - Similar effect as dividing the number with some power of two
							 = >>> - Unsigned Right shift - shifts the bits of the number to right and fills 0 on voids
							 							  - Leftmost bit is set to 0
	
	8. instance of operator  = Used for type Checking
							 = Used to check if an Object is an Instance of a Class, a subclass, or an Interface.
							 = Syntax - object instanceof Class/Subclass/interface 