import java.sql.Array;
import java.util.*;
import java.util.Collections;
public class collections_01{
    public static void main(String[] args) {
        /*
        1.need of collection framework
        2.limitation of Array intro to collection
        3. fixed,homogenous and no chance of modification once created
        4.arrays are memory waste
        ------------
        EXAMPLE
        ------------
       int arr[] = new int [5];
       Student[]s=new Student[1000];
       s[0]=new Student();
       s[1]=new Customer(); 
       incompatible types
       
       ---------------
       5.solved using object class  but complexity of programming increases:
       --------------
       
       Object []o =new Object[21];
       o[0]=new Student();
     
       6. collections like these are growable :
       HashMap <Integer,String>mp=new  HashMap<>();
       7. growable nature decreases performance
       8.arrays hold both prim &objects but collections only hold objects(Integer[])
       */
    ArrayList l=new ArrayList<>();
    l.add(31);
    l.add(11);
    String s =new String("hello");
    Boolean b= new Boolean("True");
    l.add(b);
    l.add(s);
    System.out.println(l.size());
    System.out.println(l.get(2));
    System.out.println(b.TYPE);
   /* -------
    Interfaces {9 key interfaces}
    --------
    */


  
  

}
}