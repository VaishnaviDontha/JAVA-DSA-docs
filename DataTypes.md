# : Primitive Data Types : 

	Primitve - Any value which cannot be divided into any other datatype.

	boolean - T or F | 1 bit | default - F

	byte 	- 8-bit signed two's complement integer | 1 byte = 8 bits | -128 to 127 | default = 0
	short 	- 16-bit signed two's complement integer | 2 bytes = 16 bits | -32768 to 32767 | default = 0
	integer - 32-bit signed two's complement integer | 4 bytes = 32 bits | -2147483648 to 2147483647 | default = 0
	long 	- 64-bit signed two's complement integer | 8 bytes = 64 bits | -9223372036854775808 to 9223372036854775807 | default = 0
	
	float	- 32-bit single precision | 4 bytes = 32 bits | upto 7 decimal digits | default = 0.0
	double 	- 64-bit single precision | 8 bytes = 64 bits | upto 16 decimal digits | default = 0.0

	char 	- 16-bit Unicode character | 2 bytes = 16 bits | '\u0000' (0) to '\uffff' (65535) | default = '\u0000'

  * We do've a class w.r.t to the Primitive Type (Wrapper Classes)

# : Non-Primitive Data Types : 

	Strings, Objects, Arrays, etc.

	Strings - Its is defined as an array of characters. diff b/w char and string is, string is designed to hold sequence of characters. Whereas, char array is collection of 		   separate char type entities.

  * Literals - These are syntactical representation of data typa

  * Identifier - Names of local variables, instance and class variables, labels, but also the names for classes, packages, modules and methods

  * Access Modifiers - control the scope of class and methods = default, public, protected, private
	 - Non-access Modifiers: final, abstract, strictfp

# : User-Input via Scanner class : 

		Method				Description
	nextBoolean()		Reads a boolean value from the user
	nextByte()			Reads a byte value from the user
	nextDouble()		Reads a double value from the user
	nextFloat()			Reads a float value from the user
	nextInt()			Reads a int value from the user
	nextLine()			Reads a String value from the user
	next() 					for Word
	nextLong()			Reads a long value from the user
	nextShort()			Reads a short value from the user
	next().charAt(0) 	Reads a char value at 0 from the user
	or
	next().trim().charAt(0)
