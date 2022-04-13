# : Input and Output Stream : 

	- An I/O Stream represents an input source or an output destination. 
	- A stream can represent many different kinds of sources and destinations, including disk files, devices, other programs, and memory arrays.
	- These support many different kinds of data, including simple bytes, primitive data types, localized characters, and objects. Some streams simply pass on data; others manipulate and transform the data in useful ways.
	- No matter how they work internally, all streams present the same simple model to programs that use them.
	- It is also referred as, a sequence of data. 
  
  A program uses an input/output stream to read/write data from a source/destination, one item at a time

	It has - 
		1. Byte Streams = FileInputStream, FileOutputStream
		2. Character Streams = FileReader, File Writer
		3. Buffered Streams = BufferedInputStream, BufferedOutputStream
		4. Scanning and Formatting = Scanner | PrintWriter or PrintStream
		5. Command Line
		6. Data Stream - DataInputStream, DataOutputStream
		7. File I/O 
