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
public class employee {
    public static void main(String[] args) {
        Programmer p= new Programmer();
        Manager m = new Manager();
        m.caclulateSalary();
        m.display_info();
        p.caclulateSalary();
        p.display_info();


        
    }
}
