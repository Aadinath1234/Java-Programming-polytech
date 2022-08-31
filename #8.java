// creating a method:

/*
public static int methodName(int a, int b){
   // body of method
   }
   */ 
   
   // public static - modifier
   // int - return type
   // method name - name of the method 
   // a, b - formal parameters
   // int a , int b - list of parameters
   
   
   // in method we have :
          // # method declaration : this happens only one time
		  // # method definition : this happens only one time
		   
		  // # method calling  : this can happen multiple times.
		
  // method declaration: int sum(int,int);
 /* method definition: int sum(int a, int b){
                            return a + b;
							}
							
	method calling :  int sum(int, int);
	                  int sum(int a, int b){
					    return a+b;
						}
					  int c = sum(5, 10);
						here int a, int b is the formal parameter.
	
                        if : 
                            int sum(int a , int b)
                              {
                                 System.out.println(" here you are printing not returning the output");
                              }
							sum(5, 10);

           # when definition and declaration will be simulataneously: 
                   int sum(int a, int b){
                      System.out.println(" output ");
                     }
*/

class Calculate
  {
  void sum(int a, int b)
        {
        System.out.println(a+b);
}
    
  void sub(int a , int b)
     {
        System.out.println(a-b);
      }
  
  void Mult(int a , int b)
     {
       System.out.println(a*b);
    }
  }
  
  

class Demo 
  {
    public static void main(String a[])
     {
       Calculate c = new Calculate();
       c.sum(10, 5);
       c.sub(10, 5);
       c.Mult(10, 5);
       c.sum(100, 125);
       c.sub(100, 125);	   
	   c.Mult(100, 125);
	   }
	  }
	  
		
		   
		   