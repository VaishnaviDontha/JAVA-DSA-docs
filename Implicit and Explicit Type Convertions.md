 # :Type Conversion : 

	When one type of data is assigned to another type of Variable then automatic type conversion is done when below things are accomplished - 

		1. Two types should be compatible
		2. Destination type should be greater than source type.

	Widening Casting (automatically) - converting a smaller type to a larger type size
		byte -> short -> char -> int -> long -> float -> double

# : Type Casting :

	1. Also called as 'Narowing Conversion'
	2. When trying to Explicitly change the data type.
	3. Compressing the bigger type to the smaller one explicity

	Narrowing Casting (manually) - converting a larger type to a smaller size type
		double -> float -> long -> int -> char -> short -> byte
    
    Syntax - 
	    destination_datatype = (target_datatype)variable;

# : Automatic Type promotion in Expressions : 

	1. All the Byte\Short\Char values are promoted to INT
	2. If the value is LONG -> Evaluated to long
	3. If the value is Float -> Evaluated to Float
	4. If the value is Double -> Evaluated to Double

# : Explicit Type Casting in Expressions : 

	  While evaluation, result maybe automatically promoted to the larger datatype of the operand. But, when stored to a smaller type the compiler may throw an Error.
	  To avoid this we need to explicitly type cast the result. 
