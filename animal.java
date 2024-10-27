//Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class
//and implement the sound() method to make a specific sound for each animal.
 abstract class Animal{
    public abstract void sound();
   }
  class lion extends animal{
      public void sound(){
        System.out.println("lion roars");
  }}
  class tiger extends animal{
    public void sound(){
      System.out.println("tiger brawls");
    }}
  public class animal{

    public static void main(String[] args) {
      lion l1= new lion();
      l1.sound();
      tiger t1= new tiger();
      t1.sound();
    }
    }
