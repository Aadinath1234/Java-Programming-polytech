public class createobject {
    void display(){
        System.out.println("aur bhai kaisa ... ");
    }

}

class First {
public static void main(String a[]){
    createobject h = new createobject();
    h.display();
}
}
//output: aur bhai kaisa ...
// new keyword is used to assign memory to object.
/*
Hello h = new Hello(); , this also can be written as
Hello h;
h= new Hello();
# class will be saved by the name of the class in which main() method is present inside it.
 */