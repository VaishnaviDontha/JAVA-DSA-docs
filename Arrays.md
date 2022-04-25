## : ARRAYS : 

	It is a collection of the datatypes (primitives/objects/etc)

		Syntax:
		datatype[] var_name = new datatype[size];
				or
		datatype[] var_name = {};
				or
		datatype[] var_name; 			// Declaration of Array and the var_nmae is defined in the STACK
		var_name = new datatype[size]; // Initialisation. Here, the object is being created and stored in HEAP


	All the type of the data must be the same. We can't mismatch the datatype in it.
	In Java, as array objects are in HEAP (objects in heap are NOT continuous). So, the objects may not be continous (Depends on JVM)
	
	INDEXs are also referred as position of the object in ARRAYs, starting from 0.

	NEW Keyword - Used to create an OBJECT.

	For an 
			INT array by default its going to be "0" 		(when no value is added)
			STRING array by default its going to be "null"  (when no value is added)


	* To initialise and print data from Arrays - 
			Type 1 : To initialise array objects when we've larger size, FOR loop helps us up
			Type 2 : Arrays.toString(arr); (DO CHECK)
			Type 3 : Enhanced FOR Loop

	* Declaring Array of Objects -	
	
			String[] str = new String[4];       	//Declaring a String Object
			for(int i = 0 ; i<= str.length; i++){
				str[i] = sc.next();
			}									//Objects are stored in HEAP and references are NOT allocated in a cont. format


		- Can also be modified by 
			str[index] = " ";

	* Memory Management in Arrays - (DO CHECK)

	* Multi Dimensional Array - 2D

			1. Initialised as 
					datatype var_name[][] = new datatype[size][size]; // Adding number of cols is NOT mandatory
			2. Can also be stored data into this as 
					
					int[][] arr = {
									1, 2, 3,   //0th Index
									4, 5, 6,   //1st Index
									7, 8, 9    //2nd Index
								  }

			3. It is stored ( Array of Arrays in HEAP memory ) each  are holding 
			4. Input/Output(Print) values into 2D - Can be done via FOR loop
					
					for(int row = 0 ; row <= arr.length; row++){ 
							//gives no. of rows

						for(int col =0 ; col<= arr[row].length; col++){
								//for each col in every row

							arr[row][col] = sc.nextInt();

						}

					}
							or

					for(int row = 0; row< arr.length; row++){

						System.out.println(Arrays.toString(arr[row]));    

					}

							or

					//Enchanced FOR Loop

					for(String element : arr){

						System.out.println(Arrays.toString(arr[row]));
					}

	* Jagged Arrays - It is an Array of Arrays where the variable number of counts in each coloumn can be of different sizes.

			Declaration = int jagged_arr[] = new int[4][]; 

			Initialisation = int arr_name[][] = new int[][]  {
                                  new int[] {10, 20, 30 ,40},
                                  new int[] {50, 60, 70, 80, 90, 100},
                                  new int[] {110, 120}
                                      };
                                      
                              			OR                                     
                                                         
		                    int[][] arr_name = {
		                          new int[] {10, 20, 30 ,40},
		                          new int[] {50, 60, 70, 80, 90, 100},
		                          new int[] {110, 120}
		                              };
                              
                              			OR                                     
                                                         
		                    int[][] arr_name = {
		                           {10, 20, 30 ,40},
		                           {50, 60, 70, 80, 90, 100},
		                           {110, 120}
		                              };

	* Dynamic Arrays - When col count is different


					for(int row = 0 ; row <= arr.length; row++){ 
							//gives no. of rows

						for(int col =0 ; col<= arr[row].length; col++){ //Verifying the respective row length 
								//for each col in every row

							sysout(arr[row][col]);

						}

					}

	* Passing Arrays to Methods - As variables, we can pass arrays to methods as, - method(int[] sum){ ... }

	* Returning Arrays from Methods - As variables, we can also return arrays as, - return int[]{... } or return a[]{ ... }

	* Class Objects for Array - Every Array has a class object, shared with all other arrays with the same component type

			byte byteArray[];
			short shortsArray[];
			boolean booleanArray[];
			long longArray[];
			float floatArray[];
			double doubleArray[];
			char charArray[];

			String[] strArray[]; //Array of Strings

			Can be called via byteArray.getClass();


		System.out.println(intArray.getClass());
        System.out.println(intArray.getClass().getSuperclass()); // prints the path of the object
        System.out.println(byteArray.getClass());
        System.out.println(shortsArray.getClass());
        System.out.println(strArray.getClass());

        ** These print the run-time signature of the object