
//Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
// Create subclasses Manager and Programmer that extend the Employee class and implement the
// respective methods to calculate salary and display information for each role.
import java.util.Scanner;
abstract class Employee{
    abstract  public void caclulateSalary();
    abstract  public void  display_info();}
class Manager extends Employee{
    int salary ;
    Scanner s= new Scanner(System.in);
    public void caclulateSalary(){
        salary=s.nextInt();
       };
    public void  display_info(){
        System.out.println("my salary is: " + salary  );
    };}
class Programmer extends Employee{
    int salary ;
    Scanner s= new Scanner(System.in);
    public void caclulateSalary(){
        salary=s.nextInt();
    };
    public void  display_info(){
        System.out.println("my salary is: " + salary );
    };}
public class employeee {
    public static void main(String[] args) {
        Programmer p= new Programmer();
        Manager m = new Manager();
        m.caclulateSalary();
        m.display_info();
        p.caclulateSalary();
        p.display_info();


        
    }
}
