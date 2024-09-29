public class main_method {
// whether class contained main method its ok[no compile time error] but doesnt run "no such main method"

final synchronized strictfp public static  void   main(String... vidhi)
// eventhough name of array, order of modifiers, change of array to var-args is allowed
 {
    /* suggested prototype for main method{STRICTLLY} p s v m (String[] args)
     public- to  call by jvm from everywhere
     static- without existing obj. jvm has to call method
     void- doesnt return anything to jvm
     String[] args- command line arguments*/ 
    System.out.println(" valid");
    main_method m= new main_method();
    m.main(5);
    System.out.println("parent main");
    no_main n= new no_main(); 
}
public static void main(int... args) {
    // overloading possible but we need to create an obj of this method
    System.out.println("overloaded called explictly");
}

}
// without having main method in child class can the code be executed
class no_main{
    // no main method
    // what if both has main{same args}? can it be ovveriden yes? - METHOD HIDING
    
final synchronized strictfp public static  void   main(String... vidhi){
    System.out.println("child main");
    //JVM ASKS WHICH MAIN TO BE RUNNED....
}
}

