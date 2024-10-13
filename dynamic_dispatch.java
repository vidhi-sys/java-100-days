//WAP to implement run time polymorphism by applying dynamic dispatch method in method overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
}}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }}
public class dynamic_dispatch {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        // Dynamic method dispatch
        myDog.sound(); // Calls Dog's sound()
        myCat.sound(); // Calls Cat's sound()
    }}
