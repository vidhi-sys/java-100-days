public class array_2 {
    public static void main(String[] args) {
        // char , short ,byte can be converted to int 
        int [] x= new int ['a'];// valid
        byte b =20;
        int[] x_2= new int[b];// valid
        short s= 10;
        int[] x_3= new int[s];// valid
        // not possible for long , float, double
        // int []x_4= new int[10l]; possible loss of precision 
        // maximum  allowed array size in java is
        //int[]x_4=new int[2147483647];// greater than this integer no.[compile time] too large
        // or memory error not avavilable [error by jvm runtime error]
        //System.out.println(x_4); heap memory not sufficient 
// 2-D ARRAY CREATION array of arrays approach [less memory wastage better utilisation]
        int[][] two_D =new int [2][];// base size must be specified
        two_D [0]= new int [2];
        two_D [1]= new int [3];
        System.out.println(two_D);
// 3-D ARRAY        
        int [][][] three_D= new int[2][][];
        three_D [0]= new int[3][];
        three_D[0][0]= new int[1];
        three_D[0][1]= new int[2];
        three_D[0][2]= new int[3];
        three_D[1]= new int[2][2];
// ARRAY INITIALISATION
        int [] y= new int[2];
        System.out.println(y);// internally two string method called class name@hashcode returned
        System.out.println(y[0]);// default values 0 printed
        int [][] y_2 = new int [2][2];
        System.out.println(y_2);// refrence variable(y_2) to 2D array[[I@....
        System.out.println(y_2[0]);// refrence variabley(y_2[0]) to 1D array[I@.....
        System.out.println(y_2[0][0]);
        //if int[][]y_2=new int[2][] null error if not specified {refrence to object default value}
        //System.out.println(y_2[0][0]) null pointer exception
        //[runtime error on performing any operation on null]
// array index OUT OF BOUND EXCEPTION
        int[] z= new int[2];
        z[3]=20;

    }

}
