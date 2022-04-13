# : First Java Program :

	- Every file that ends with .java is a CLASS
	- Coding Convention = Always start class name with CAPS
	- public (access modifier) = Can be accessed anywhere
	- static (keyword) = Written to avoid the creation of class object
	- void (return type) = Return Type of a function 
	- main (String[] args) = Entry point of the program | Array and Arguments - Command line Argument - String[]
  
  We can change the location of the Byte code via -
		
		javac -d . Demo.java
		
			-d = flag asking with the file location
			.  = current directory
			.. = Previous directory

# : Location of javac and java :

	- /user/bin

	*Note: Path and Environment variables helps computer to check whether the command written (eg. javac) is present or not.

# : Path and Environment Variables : 
	- Windows
		=> Advanced System Settings
		=> Environmental Variables
		=> Path copy and Save

	- Mac
		=> Open up Terminal.
		=> Run the following command:	
        sudo nano /etc/paths
		=> Enter your password, when prompted.
		=> Go to the bottom of the file, and enter the path you wish to add.
		=> Hit control-x to quit.
		=> Enter “Y” to save the modified buffer. That’s it!  
    To test this up - in new terminal window, type: echo $PATH
