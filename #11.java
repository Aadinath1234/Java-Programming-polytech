// Parameterized constructors:
   // here inside the constructor we pass different-different arguments .
   // this arguments do not have any limit.
   
class Student
  {  
    int id;
	String name;
	Student(int i, String n)
	 {
	   id = i;
	   name = n;
	   }
	   
void display()
  {
    System.out.println(id +"   "+ name);
	
  }

public static void main(String [] a)
  {
    Student s = new Student(1,"Yashwardhan");
	Student s1 = new Student(2, "Rishabh");
	s.display();
	s1.display();
	s.display();
	s1.display();
	}
}

// inside this program we have 1 constructor Student() and it is not a method.
// in this program we have 2 methods : void display() and public static void main();
// constructor is like method but it is not a method.




// type casting :
   // # automatic  when small box has to fit inside the large box.
    /*
	int a = 10;
	long b = a;
	*/
	
   // # manual  when we have to fit a large box inside the small box then we have to cut some part of the large box.
   /*
   long a = 10;
   int b = (int)a;
   */
   
   
                                       