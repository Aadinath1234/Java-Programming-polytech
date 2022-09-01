/* Types of constructor:
 // #1. Default constructor:
             default constructor do not take any parameters and any
			 arguments.
			 
		     example:
			  */
	
			  
	// here Sample is a constructor , it is like method but it is not a method.
    // in main method in place of parameter we write String and [] this brackets can be placed anywhere in parameter of the main method.	
class Sample
  {
    int a = 2, b = 4;
    Sample()
       {
         System.out.println("Value of a : " +a);
		 System.out.println("Value of b : " +b);
		 
        }
public static void main(String a[])
  {
    Sample s = new Sample(); //this is the object how many times you create this object that times it will give you the output.
	Sample s1 = new Sample(); // this is also a object and we are calling second time Sample with the help of object and the output will shown two times.
  }
  
  }
  
		

	
