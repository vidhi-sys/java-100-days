class test{
public void sum(int a , int b){
    System.out.println(a+b);
// but what if sum of 3 no., 5 no, etcccc  new method so several increasing arguments decreasing readabilty
// so calling sum method by variable no. of arguments VAR-ARGS METHOD
}
public void sum_new(int... a)// only 3 dots any no. of args (inclding no(0) value also)
{   System.out.println(a.length);// no of args passes
    System.out.println("var args method ");
}
public void totally(int ... b){
    int total=0;
    for (int x1:b){
        System.out.println("the sum is :"+total+x1);
    }
}
public void is_it_valid(int w, int... q){
    System.out.println("totally valid");
    // mixing var-arg with normal parameter
}
public void sum(String s, double...r){
    System.out.println("this is also perfectly valid");
}
/*public void m1(int...m){
    System.out.println("int..."); interally an integer array
}
public void m1(int[]m){
    System.out.println("int[]"); two methods with same name
}*/
public void m1(int...m){
    System.out.println("int..."); 
}
//if m1 is  called  with one argument then which one gets called?
public void m1(int m){
    System.out.println("general method"); 
}
//public void sum(String...s, double...d) only 1 var- arg parameter allowed
//public void sum( double...d,String S) last parameter must be var -agrs parameter
/*public void validd(int. .. x){ 3 dots cannot be seprated INVALID}*/
// imp-VAR-ARGS HAS LEAST PRIORITY IN JAVA IF NO METHOD WORKS THEN THIS IS CALLED
//equivalence b/w var-args method and 1D array replacement is always valid  but vice-versa not 
}
public class var_args {
    public static void main(String[] args) {
      test a= new test();
      a.sum_new(1,2,3,4,5);
      // this internally becomes an  1-D array
      a.totally(10);
      a.totally(10,20);
      a.totally(10,20,30);
      a.sum("hey",34.56);
      //System.out.println(type(a)); not a data type its an  array 
      a.is_it_valid(2,45,67);
      a.m1(21);// if both are simultaneously called normal method wins the race OLD IS GOLD
      
}}
