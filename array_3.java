public class array_3 {
    public static void main(String[] args) {
        // array declaration, creation and initialization in one line
        int[] x;
        x= new int[3];
        x[0]=1;
        x[1]=2;
        x[2]=3;
        // instead do this to reduce space complexity,increases convienency
        int[]x_2 ={1,2,3};//only valid for one line
        //int [] z;
        //z={1,2,3,4};compile time error illegal start of expression
        System.out.println(x_2);
        // similarly for 2-D and 3-D arrays
        int[][]y={{1,2,3,4},{2,5,6,9}};
        int[][][]z ={{{2,4},{24,67}},{{1,2,3},{2,5,6,9}}};
//LENGTH VS LENGTH {variable and method}
        String s="vidhi";
        System.out.println(s.length());// valid for string not array{final method- cant overwrite}
        //length() return number of char present in string objects{string objsnot arrays}
        int[]s_2 ={1,2,3};
        System.out.println(s_2.length); // valid for  array only not for string obj.{length variable}
        String s_3[]={"hey","hie","hellow","howww_r_you"};
        System.out.println(s_3.length);//length of array
        System.out.println(s_3[0].length());
// for 2-D arrays{ no direct way for full length of multi dimesional array}
        int[][] a=new int[7][1];  
        System.out.println(a.length);
        // going by the array of arrays concept{only base size printed}
        System.out.println(a[0].length+a[1].length+a[2].length+a[3].length+a[4].length+
        a[5].length+a[6].length);//indirect way O/P=7

        
        
    }



    
}
