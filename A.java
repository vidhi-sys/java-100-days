public class A {
    // java program can  contain any no. of classes but atmost 1 public class else
    // java.lang.Error: Unresolved compilation problem: 
    // name of program= public class name
    public static void main(String[] args) {
        System.out.println("main a");  
 
    }
}
// for every main a seprate class file will be genrated A.class,B.class etc...
class B{
public static void main(String[] args) {
  System.out.println("main b");  
}
}

class C {
 public static void main(String[] args) {
    System.out.println("main c");  
} 
 }   

class D {
  public static void main(String[] args) {
    System.out.println("main d");  

  }  
}
