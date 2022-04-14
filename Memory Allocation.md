# : Static Memory Allocation : 

    When a variable is declared, compiler automatically allocates memory for it. This is known as Compile or Static Memory Allocation.
	We call it because, as soon as a function call is executed, the respective variables are allocated in the stack Memory.
	And, when the function call is completed, the variables are automatically de-allocated.
	This is also, called as Temporary Memory Allocation or STACK Memory.

# : Dynamic Memory Allocation : 

    This memory also can be allocated for data variables after the program begins execution.
	This is known as Dynamic Memory Allocation or HEAP Memory.
							  
	It is further divided into three types : 
			i. Young Generation - New data(objects) are made to allocate the space. And, whenever this memory is completely filled then the rest of the data is stored in Garbage collection.

			ii. Old or Tenured Generation - Older data objects that are not in frequent use or not in use at all are placed.
			
            iii. Permanent Generation - Containns JVM’s metadata for the runtime classes and application methods.
							  
							  

##  : Stack Memory v/s Heap Memory : 

											Stack Memory						Heap Memory

		1. Memory structure					Continous block 					Random Order
		2. Allocation/de-Allocation			Automatic by Compiler				Manual by the Programmer			
		3. When Memory is full by JVM 		Java. lang. StackOverFlowError		java. lang.OutOfMemoryError
		4. Cost 							Less 								More
		5. Main Issue 						Shortage of Memory 					Memory Fragmentation
		6. Safety							Thread Safe - Data can be stored 	Not a Thread Safe - Data stored is
														  by Owner									visibile by all threads
		7. Access time 						Faster								Slower
		8. Data Type Structure 				Linear								Hierarchical