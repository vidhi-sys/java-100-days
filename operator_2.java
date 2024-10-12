public class operator_2 {
//STRING CONCATENATION OPERATOR{only overloading operator in java although java doesnt support operator overloading}
public static void main(String[] args) {
 int a=10;
int c=30;
int b=20;
int d= a+b+c;// addition operator
String s="hey"+"hello";// string concatenation operator  
    System.out.println(a+b+c+d+s);//evaluated left to right
    System.out.println(s+a+b+c+d);
    System.out.println(b+a+c+d+s);
    System.out.println(b+c+d+a+s);
    System.out.println(b+a+d+s+c);
    // if atleast 1 arg is string type then + acts as concatenation operator if both are integer then acts as addition 
//RELATIONAL OPERATORS
System.out.println(10<20); 
System.out.println('a'<20);    //ascii value of a
//System.out.println(true<false); NOT APPLICABLE FOR BOOLEAN,BOOLEAN
//System.out.println("one"<"three");  NOT APPLICABLE FOR OBJECTS TYPE TOO (string,string)
//System.out.println(10>20<30); NESTING NOT ALLOWED
//EQUALITY OPERATORS !=,==
System.out.println('a'==20);
System.out.println(10==20);
System.out.println('a'<'b');
System.out.println(false==false);
// we can apply equality operators for object types also object refrences r1,r2  
//returns true if and only if both refrences point to the same object{refrence or adress}
Thread t1= new Thread();
Thread t2= new Thread();
Thread t3=t2;
System.out.println(t3==t2);// both pointing to the same objects
//TOTAL 2 OBJECTS  CREATED AND 3 REFRENCES
String S= new String("vidhi");
//System.out.println(S==t1); NO RELATION NO COMPARISON - INCOMPARABLE  COMPILE TIME ERROR 
String S2= new String("vidhi");
if(S.equals(S2)){
    System.out.println(".equals() compares values whereas == does for refrence");
}
}
}
