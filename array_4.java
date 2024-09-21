public class array_4 {
    public static void main(String[] args){
//ARRAY ASSIGNMENTS       
        int[]a={1,2,3,4};
        char[]ch={'a','b'};
        int[]b=a;// assigning one int array to another int array valid
        // element level promotions are not applicable at array level like:- char element can be 
        //promoted to int type whereas char array cannot be promoted to int array 
        // int []x=ch; ERROR
    // assigning one array to another array internal elements wont be codied just ref. var reasigned 
        int[]c={1,4,78};
        a=c;
        c=a;
    // assigning one array to another internal elements dimensions must be matched 
    // in place of 1D array 1D array should only be provided if we try to provide any other dimension
    // we may get compile time error
    int[][]x= new int [4][3];
    x[0]=new int [4];
    x[1]= new int [2];
    x= new int [3][2];
    // perfectly valid code
    // in total 12 objects created due to this,8 can be for garbage collection


}
}
