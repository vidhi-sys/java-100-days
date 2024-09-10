// count the number of identifiers -name in java is called identifier used for identification
public class one{
    public static void main(String[] args) {
        int var=10;
        System.out.println(var);
        //total identifers =5(one,main,string,args,var)

// java identifiers are CASE SENSITIVE  language         
        int number=10;
        int Number=10;
        int NUMBER=10;
//all different
// java reserved keywords CAN BE USED as identifier names BUT not recommended 
        int string=888;
        System.out.println(string);

//DATA TYPE- BOOLEAN
        boolean b=true;
        boolean c=10;//compile time error 
        boolean d=True;// error
// incompatible types error in java 0,1 isnt true or false
        int x=0;// valid in c language not in java
        if (x){
        System.out.println("valid"); 
        }
        else{
        System.out.println("invalid");
        } 
// infinite while loop is compile time error here
         while(1){
                System.out.println("true");
         }  
         // incompatile null type{null is default for non primitive object refrence only} 
         //not for primitves it shows compile time error
        char ch= null;
        int num=10;//valid
        int num2=0786;//invalid octal , shows out of range
        int num3=0777;
        System.out.println(num3); // converts ouput by default to decimal value
        int num4=0Xface;
        int x_2=10;
        int y_2=010;// octal to decimal
        int z_2= 0X10;// hexa to decimal
        System.out.println(x_2+y_2+z_2);// output is in decimal by default 
        }}