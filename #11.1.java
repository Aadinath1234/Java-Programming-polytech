class Name
 {
  int dj;
  String like;
  Name(int j, String d)
  {
    dj = j;
    like = d;
  }

void rm(){
  System.out.println(dj+ "  " + like);
}

public static void main(String [] a)
 {
  Name v = new Name(1, "Sushant");
  Name v1 = new Name(2, "Akshat");
  v.rm();
  v1.rm();
  }
 }
 
 
  