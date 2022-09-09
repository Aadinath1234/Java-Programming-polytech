class statementnestedifelse {
    public static void main(String a[]){
        int b = 15;
        int d = 18;
        if (b >9){
            System.out.println("b is greater than 9");
            if (d > b){
                System.out.println("the value of d is greater than b");
            }
            else{
                System.out.println("this cannot be happened");
            }

        }
        else{
            System.out.println("your output is not greater than 9");
        }
    }
}
