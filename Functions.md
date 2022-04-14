# : Functions in JAVA :

	* Collection of statements that perform a specific task and return the result to the caller.
	* Can also perform task without returning anything.
	* These are like time savers and help us to reuse the code without retyping it.

	Syntax - 	
    
    modifier return_type method_name(parameter_list){

		//body

		return statement;

	}

    Let's see these in detail - 
        MODIFIER - Access type of the method i.e. from where it can be accessed in your application.

                1. Public = Accessible in all the classes of the App
                2. Protected = Accessible within the class in which it is defined and in its sub class/es
                3. Private = Accessible only within the class in which it is defined
                4. Default = It is declared\defined without using any modifier, accessible within the same class and package which the class is defined.

	    RETURN TYPE - Data type of the value returned by the method or VOID if it doesn't return any

	    PARAMETER_LIST - Comma-separated list of parameters with their data type. If none, then () empty paranthesis is used.
 
### : Function Types: 

    1. Predefined  = Methods that are already defined in Java. Also known as, standard library method or built-in method.

  	2. UserDefined = Written by User. Modified according to the requirement.
      
### : Method Signature :     
    Consists of method name and the list of parameters.
		    Syntax -  max(int x,int y)
            
### : Memory Allocation : 
    - These are implemented through STACK
  	- When called, creates a Stack and post that, Arguments & local variables are stored in this.
  	- Post execution, the allocated stack frame is deleted.
      
### : Parameter Passing Techniques : 
  	1. Formal Parameter = Variable and its data type is appeared in the prototype of the method. 
  			Syntax - function_name(datatype var_name)

  	2. Actual Parameter = Variable or Expression corresponding to formal parameter that appears in the function or method call in the calling environment.
  			Syntax - func_name(var(s))

  	Methods of Parameter passing = ONLY PASS BY VALUE in JAVA
  								 = NO PASS BY REF. 

## : Arguments in Functions :  

	These can be passed in two different ways : 
            1. Via Integer
            2. String

	- Pass by Value = Here, when a value is passed by a method, and when the changes/modifications done in the method as per requirements. The actual parameters sticks to the same value when they're passed. This is also called as `Call by Value`.

	* NO pass by Reference in JAVA *
    But can be done in few different ways, Let's see indetail in [here](CallByReference.md)

	- Scoping 
	1. Function Scope
	2. Block Scope
	3. Loop Scope

	* Primitive Types - int, short, char, bye .. 
	- it is passed by value

	* Objects & References 
	- it is passed by value of the reference. 
	- If any changes are made to the object via ref variable, the actual value is also changed


## : Variable length Arguments - VarArgs :
	A method where we dont know how many variables to pass in a function. 
	We can pass any no# of arguments.
	Also, can be passed more than one argument.
	
    NOTE - We can't skip the ordering. (datatype ...v) should be at the end.

	Syntax 
            static void fun(int ...v){
                //body
            }

	
    Error when declared below ways :

		1. Specifying two varArgs in a single function call

			void method(String... gfg, int... q)
			{
			    // Compile time error as there 
			    // are two varargs
			}

		2. Specifying varArgs as a first parameter

			void method(int... gfg, String q)
			{
			    // Compile time error as vararg 
			    // appear before normal argument
			}


## : Function Overloading : 
	Calling the two or more functions with different arguments.
	- with, same name
	- also, same type but different num# of arguments


## : Usage of return Keyword in Functions : 
    It is a Keyword used to exit from a function/method with/without a value. 
    There are two ways to use `retun` in functions - 
    
    1. Return with a value - Here, the retun statement must be followed by the value which we're trying to return.
    
    2. Return without any value - Here, we can simply omit the return statement when used with `void`. But user can intentionally return `void`. 

    Programmatically these can be viewed in the [Repo]() 




