class jk{
void sum(int c, int d)
   {
     System.out.println(c+d);
	}
	
void sub(int c, int d)
   {
    System.out.println(c - d);
	}

void mult(int c, int d)
  {
   System.out.println(c * d);
   }
   
}

class dk{
 public static void main(String a[])
  {
    jk c = new jk();
	c.sum(12,6);
	c.sub(18, 3);
	c.mult(16, 4);
	}
}