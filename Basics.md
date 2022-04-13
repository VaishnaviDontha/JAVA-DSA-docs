# : Types of Languages :

### Procedural  <br>
	- Series of well-structured steps and procedures to complete a program
	- A systematic order of statements,functionals and commands to complete a task.

### Functional <br>
	- A program in pure functions i.e., never modify variables (To reuse) 
	- Used in situations where we've to perform lots of differents operations on the same set of data.
	- First class functions (Reasigning as a form of variables)
		= That means that you can create an "instance" of a function, as have a variable reference that function instance, just like a reference to a String, Map or any other object. Functions can also be passed as parameters to other functions.In Java, methods are not first class objects.

### Object-Oriented <br>
	- Revolves around objects
	- Code + Data = Object
	- Developed to make it easier to develop,debug,reuse and maintain software.
	- Instance of class (template) is object.

## : Static vs Dynamic languages :

### Static                                         
	- Perform Type checking at Compile(Conversion of human understandable code to computer language) time.
	- Errors will be  shown  at compile time
	- Declaring datatype before using
	- Moree control

### Dynamic 
	- Perform Type checking at Run(Durimg the execution of code after compilation) time.
	- Errors aren't shown until program is executed.
	- No need to declare datatype of variables
	- Savees time in writting code but errors are shown at runtime.

## : Stack and Heap Memory :

	- Reference Variables are stored in Stack memory
	- The respective Object (Value of variable) are in Heap Memory.

	Stack -----> Heap (S is pointed to H)

	- All the primitive datatypes are stored in STACK memory ONLY.
	- Rest of the things like Arrays, objects, hashmaps etc are stored in HEAP memory.

	** More than One ref. variables can be pointed to one Object.
	** If any one of the ref variables are changed; the change is visible to the rest of variables.

## : Garbage Collection :

	- Object with no ref. is removed from the memory.
