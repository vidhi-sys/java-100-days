public class anonymous_arr {
    public static void main(String[] args) {
        // we can create anonymous array like following
          // anonymous array
          sum(new int[]{ 1, 2, 3 });}
        // no need to specify the size while creating array otheriwse we get compile time error 
        public static void sum(int[] a)
    {
        int total = 0;
 
        // using for-each loop
        for (int i : a) 
            total = total + i;
         
        System.out.println("The sum is: " + total);
    

        
    
}
}