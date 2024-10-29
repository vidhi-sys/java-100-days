//. Write a Java program to create an interface Flyable with a method called fly_obj().
// Create three classes Spacecraft, Airplane and Helicopter 
// that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.
interface Flyable{
    public void fly_obj();}
class Spacecraft implements Flyable{
     public void fly_obj(){
    System.out.println("space craft flies in space");   
    };

}
class airplane implements Flyable {
    public void fly_obj(){
        System.out.println("airplane flies in air");   
        };

}
class helicopter implements Flyable {
    public void fly_obj(){
        System.out.println("helicopter also flies in air ");   
        };

}
public class fly {
   public static void main(String[] args) {
    helicopter h= new helicopter();
    Spacecraft s= new Spacecraft();
    airplane a= new airplane();
    s.fly_obj();
    a.fly_obj();
    h.fly_obj();
    
   } 
}
