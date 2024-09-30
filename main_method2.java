public class main_method2 {
/*static{
        System.out.println("static block"); in 1.6 runs properly but in 1.7 version not
        }
        Error: Main method not found in class main_method2, please define the main method as:
   public static void main(String[] args)*/
   static{
    System.out.println("static");
    //System.exit(0);// jvm shuts down , normal termination
   }
   public static void main(String[] args) {
    // order doesnt matter just check for main method else error 
    // static method was earlier misused nd main method was avoided so changes were made in 1.7 v  
    }

}
