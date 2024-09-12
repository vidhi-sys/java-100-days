public class array_1 {
    public static void main(String[] args) {
        // indexed collection of fixed no. of homogenous data elements[representing huge data]
        int []x;// array declaration
        // int[3] x// error because cannot specify size on declaration{C.T.E}
        int [][]x_2;
        int [][][]x_3;// 3d array declaration
        // similar to creation of objects can create arrays by using new keyword
        int[] a= new int[2];// so is  every array an object in java ? yes... 
        System.out.println(a.getClass().getName());// so there should be corresponding classes also
        // there are corresponding classes but these are not visible at programmer level{[I}
        int[][] b= new  int [3][2];// array creation{specify size compulsory}
        System.out.println(b.getClass().getName());//[[I 
        // double [d, short [s, boolean [z, byte[B etc...
        //int[] x_4=new int[-3];
        // array indexes 0 and negative are valid but runtime error, not compile time error

        }
}
