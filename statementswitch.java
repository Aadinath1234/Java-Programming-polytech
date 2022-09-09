class statementswitch {
 public static void main(String a[]){
     int i = 20;
     String dam;
     switch(i){
         case 19:
             dam = "ninteen";
             break;
         case 4:
             dam = "four";
             break;
         case 20:
             dam="this is twenty twenty";
             break;
         default:
             dam = "Unknown";
                     break;
     }
     System.out.println("output: " +dam);
 }
}
