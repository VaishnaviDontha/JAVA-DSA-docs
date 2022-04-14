# : Decision Making : 
	
	- Selection Statements
    
    1. if() - (true\false | condition)
	2. if-else
	3. nested-if
	4. if-else-if
	5. switch-case


	- Jump Statements

	1. break = Used to Terminate, Exit a loop
	2. continue = Used to force an early iteration of a loop
	3. return  = Used to explicitly return return from a method. It causes a program control to transfer back to the caller of the method.


	- Loops 

	1. while() - (true\false | condition)
	2. for() - (initialisation, condition, inc\dec)
	3. for(T Element:Collection obj/arr) { statement(s) } - enhanced for loop 
	4. do { }while() 

	- When to use 'while' , 'for' loop ?
		= when we've loop count use - FOR else WHILE
		= keeping taking input from user till user enters 'x' = Use WHILE here


	Syntax : 

    -- IF condition --

	if(boolean expression T or F){
		//body
	}else {
		// do this
	}


	-- Conditional IF -- 
    
    var = (condition) ? true : false;

    -- FOR loop --

	for(initialisation; condition; inc\dec){
		//body
	}

    -- Enhanced FOR loop --

	for(int num : arr){ // for every elememt in arr, body statements are executed.
		//body
	}

    -- WHILE condition --

	while(condition){
		//body
	}

    -- DO-WHILE condition --

	do{
		//body
	}while(condition);

    -- SWITCH case --

	switch(expression){
        case 1 : //body;
                break;
        case 2 : //body;
                break;

        default : //body;
	}
    
    -- Nested switch -- 
    
    switch(expression){
		case 1 : switch(expression){
				    case i : 

				};
				break;
		case 2 : //body;
				break;

		default : //body;
	}