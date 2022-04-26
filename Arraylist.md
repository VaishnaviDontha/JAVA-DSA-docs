## : ARRAYLIST : 

		Why? - When length/size of the array is NOT known.

		Part of Collection Framework, Util Package.

### Syntax:
			ArrayList<datatype> var_name = new ArrayList<datatype>(size);
			OR
			ArrayList<datatype> var_name = new ArrayList<>(); //Datatype mayn't be required 

			Example - 
			ArrayList<Integer> list = new ArrayList<Integer>(10); 

			Here, no Primitives are added instead wrapped classes are mentioned. 

### Usage:
			Adding a value
				.add(value);
			
			Modifying an index
				.set(index,value);

			Removing a index
				.remove(index);

			INPUT = Can also be used to input values via FOR loop - 
				.add(in.nextInt());

			OUTPUT = Can also be used to output values via FOR loop - 
				list.get(index);
			here, list[index] isn't applicable

### Working:
			1. Size is fixed Internally
			2. Say, if ArrayList if filled by half
				It will create a new ArrayList of say, double the size
				Old Elements are copied to new one
				And, the old one is deleted.

### MultiDimensional ArrayList: 
			ArrayList<ArrayList<datatype>> var_name = new ArrayList<>();