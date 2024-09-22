public class var_1 {
    int x=30;
    int z;
    String s;
    static int k = 76;// declared within class directly
    public static void main(String[] args) {
        //primitive variables int x=10;
        //pointing to object refrence variables student s= new student();
//DIVISION OF VARIABLE 
// based on POSITION OF DECLARATION-{INSTANCE{attributes in cpp},STATIC,LOCAL} 
//instance  variables - value of var changes from obj to obj
// for every obj a seprate copy of instance variables will be created
// instance variable stored in heap memory as part of object
// instance variable created at time of obj creation and destroyed at time of destruction(SAME SCOPE)
        int y=20;// inside class directly  but outside method/block/ constructor INSTANCE
       // System.out.println(x); cannot make static refrence directly from static area
    var_1 v = new var_1();
    System.out.println(v.x);
    System.out.println(v.z);// default value for int 0
    System.out.println(v.s);;// default value for string{null}, not required explicit initalisation
//STATIC VARIABLES {not varied from objects to objects }
// incase of static only 1 copy created at class level and shared by every obj of class
        System.out.println(k);


    }
}
