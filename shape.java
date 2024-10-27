//Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter().
// Create subclasses Circle and Triangle that extend the Shape class and implement the
// respective methods to calculate the area and perimeter of each shape

abstract class Shape{
    public abstract void area();
    public abstract void perimeter();
}
class circle extends Shape{
    public void area(){
        int r=10;
        System.out.println("area of circle  is: " + 3.14*r*r);
    };
    public void perimeter(){
        int r=10;
        System.out.println("perimeter of circle is: "+ 2*3.14*r);
       
    };

}
class triangle extends Shape{
    public  void area(){
        int b=10;
        int h=10;
        System.out.println("area of triangle is: " + 1/2*b*h);
    };
    public void perimeter(){
        int b=10;
        int h=10;
        System.out.println("perimeter of triangle is: " + 2*(b+h));
    };

}
public class shape {
    public static void main(String[] args) {
        
        circle c1= new circle();
        c1.area();
        c1.perimeter();
        triangle t1= new triangle();
        t1.area();
        t1.perimeter();

    }
}
