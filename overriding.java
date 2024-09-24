class base 
{
    public void greet(){
        System.out.println("hello students ");
    }
}
class derived extends base {
    public void greet(){
        System.out.println("hello bachho");
    }
}
public class overriding {
 public static void main(String[] args) {
    //multiple classes with same method followed by inheritence
    //writing one method twice
derived d1= new derived();// create obj at runtime
base b= new base();
b.greet();
d1.greet();

 }   
}
