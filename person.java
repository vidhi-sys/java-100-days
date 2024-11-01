//Write a Java program to create an abstract class Person with abstract methods eat() and exercise().
// Create subclasses Athlete and LazyPerson 
//that extend the Person class and implement the respective methods to describe how each person eats and exercises
abstract class Person{
    abstract void eat();
    public void sleep(){
        //abstract methods can have both abstract and concrete methods
    }
    abstract void exercise();

}
class Athelete extends Person{
    void eat(){
        System.out.println("an athelete eats healthy food");
    };
    void exercise(){
        System.out.println("an athelete exercises daily" );
    };

}
class Lazyperson extends Person{
    void eat(){
        System.out.println("a lazy person eats junk food");
    };
    void exercise(){
        System.out.println("a lazy person rarely exercises");
    };
    
}
public class person {
    public static void main(String[] args) {
        Athelete a = new  Athelete();
        Lazyperson l = new Lazyperson();
        a.eat();
        l.eat();
        a.exercise();
        l.exercise();
        
    }
}
