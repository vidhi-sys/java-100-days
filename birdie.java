//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). 
//Create subclasses Eagle and  hawk that  extend the Bird class and implement the respective methods to describe
// how each bird flies and makes a sound
abstract class Bird{
    abstract void fly();
    abstract void makeSound();
}
class Eagle extends Bird{
    void fly(){
        System.out.println("an eagle can fly");};
    void makeSound(){
        System.out.println("an eagle makes high pitched sound");
    };}
class Hawk extends Bird{
    void fly(){
        System.out.println("a hawk can fly");};
    void makeSound(){
        System.out.println("an eagle makes low pitched sound");
    };

}

public class birdie {
    public static void main(String[] args) {
        Hawk h= new Hawk();
        Eagle e = new Eagle();
        h.fly();
        h.makeSound();
        e.fly();
        e.makeSound();
        
    }
}
