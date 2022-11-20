											java Notes 
		
	JAVA :java is a object oriented programing language.Every thing in java is an object,object consist of STATES & BEHAVOIUR.
		>  java is a platform independent.
		> java consist of JDK,JRE,JVM.
		
		--> JDK : java development kit, In this programer write programe/source code,
					It consists of all library tools to develop programe. It consist of JRE,JVM.
		
		--> JRE : java RunTime Environment, It is consist of JVM, In JRE source code is converted into byteCode.
		
		--> JVM : java Virtual Machine, which does'nt exist physically but it's responsibility is to excute the programe.
		
		--> BYTE CODE : It is an intermediate compiled code, which is excuted by JVM,it is platform independent.
		
		--> CLASS :	It is a bluePrint from which objects are created,Class is a group of objects which have common properties.
						> Class is not a real world entity.
						>  Class does not occupy memory.
					In java Class consists of :
						> Properties.
						> Methods.
						> Constructors.
						> Blocks.
						> Nested class.
		
		FEATURES OF JAVA :
						1.it is object oriented.
						2. simple.
						3. secured,platform independent,portable,High performance,Multithreaded,Dynamic.
		APPLICTIONS of java :
						1. it is used in Desktop applications such as mediaPlayer,Antivirus etc
						2. Web applications.
						3.Enterprise application such as banking application.
						4. it is used in mobile applications,gaming application,Embedded system.
					
	CONCEPTS/PRINCIPLES OF JAVA : 
					1. Abstraction
					2. Encapsulation
					3. Polymorphism
					4. Inheritance
					
	VARIABLES : Variables are containers which stores the data values during program execution.
				 Variables are 3 types;
				    1.Local Variables
				    2.Instance Variables
				    3.Static Variables
					4. Parameter.
				   
		--> Local Variables : A Variable is defined within a block or method or constructor is called Local Variable.
							       > Initialization of the local variable is mandatory before using them.
							       > we can't initialization.
			
		--> Instance Variable : Instance variables are those which are defined at the class level. 
			                                          or 
						: Instance variables are non-static variables and are declared in a class outside the method, 
								constructor, or block. 					  
							> Instance Variables are declared in a class.
							> Initialization of Instance variable is not mandatory before using them, it gives default value 0.
										
		--> Static variables : Static Variables are also known as Class Variables.
							> This Variables are declared same as instance variables.
							> The difference is that static variables are declared using the static keyword 
							within a class outside of any method, constructor or block.
							> We can create a single copy of the static variable.
		
		--> Parameter : Initialize within the parenthisis.
		
	DATA TYPES : 
			Types of data Types :
			1. Primitive DataType.
			2. Non-Primitive DataType.
			
		--> Primitive DataType : Primitive DataTypes are pre defined datatype.
		                        > In Primitive datatype letters starts with lower case.
								> The size depends on datatype.
								> Primitive has always values.
							    > It consists of [byte,short,int,float,double,long,char,boolean,].
		--> Non-Primitive DataType : Non-Primitive datatypes are not pre defined datatype.
								> Non-Primitive datatype letters starts with upper Case.
								> The size will be same.
								> Non-Primitive has no values Null values.
								> It consist of [String,Array,Classes].
							
	ARRAY : Array is a container which collects all types of elements.or Array is used to store multiple values in a single variable.
				> Each item in array is called Element,and each element is accessed by its numerical index. 
				> To declare an array,the variable should be within the brackets = { }.
				> We can access an array element by referring to the index number.
				> We can change an array element by referring to the index number.
				Eg : String[] args = {1,2,3};
							
	String : 	It is a variable contains a colletion of characters surrounded by double quotes(" ").					
	
	METHOD : Method is a block of code which runs only when it is called.
			> Methods are used to reuse the code,define the code once use it many times.
			> Methods are  types ;
			1. static Method.
			2. Instance Method/Non-static method.
			
	-->	Static Method : static method that has static keyword known as static method.
					> The main advantage of static method is we can call/invoke without creating an object.
					> Static methods can access only static members.
					> It is invoked by a class Name.
					> The best example is main() method.
		
	--> Instance Method : 	The Method of the class is known as instance method/non-static method.
					> Before call/invoking the method it is necessary to creat an object.
					
	--> Pre-defined Method : pre-defined methods are the methods that is already defined it knowna as Pre-defined method.
							> This Pre-defined Method is also known as Standard library method or built in method.
							> We can use this methods just by invoking them in a program at any point.
							
	--> User-defined Method : 	The method written by the user or programmer is known as a user-defined method.
								> These methods are modified according to the requirement.					
			
	---> Access Modifiers : The access modifiers in Java specifies the accessibility or scope of a 
									field, method, constructor, or class.	
				> We can change the access level of fields, constructors, methods, and class by applying the access modifier on it. 		
				> Access Modifiers are four types ;
				1.Public. 
				2.Private.
				3.Default.
				4.Protected.
	==> Public Access Modifiers : The public access modifier is accessible everywhere. 
				>  It can be accessed from within the class, outside the class, within the package and outside the package.
				
	==> Private Access Modifiers : The private access modifier is accessible only within the class.It cannot be accessed from outside the class.

	==> Default Access Modifiers : If you don't use any modifier, it is treated as default.
					> The default modifier is accessible only within package. 
					>  It provides more accessibility than private. But, it is more restrictive than protected, and public. 
					
	==> Protected Access Modifiers : The protected modifier is accessible within package and outside the package but through inheritance only. 
						> The protected access modifier can be applied on the data member, method and constructor. 
						> It can't be applied on the class. 
						
			-----> Difference B/W Overloadig & Overriding :

		Overriding																	Overloadig			
	1.Implements “runtime polymorphism”                              1.Implements “compile time polymorphism”.
	2.The method call is determined at runtime						 2.The method call is determined at compile time.
	     based on the object type
	3.Same Method Name in both parent & child Class.		         3.Same Method Name but diffrent in parameters.
	4.overloading is used to increase the readability				 4.overriding is used to provide the specific implementation 
		readability of the program.									    of the method that is already provided by its super class.
													