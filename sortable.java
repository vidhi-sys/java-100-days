//Write a Java program to create an interface Sortable with a method sort (int[] array) that sorts an array of integers
// in descending order. Create two classes QuickSort and MergeSort that implement the Sortable interface
// and provide their own implementations of the sort() method.
import java.util.Arrays;
interface Sortable{
    public void sort(int[] array);
}
class Quicksort implements Sortable{
    public void sort(int[] array){
        Arrays.sort( array );
        for(int i =0;i<array.length;i++){
         System.out.print(array[i]); }
}}
class mergesort implements Sortable{
    public void sort(int[] array){
        Arrays.sort( array );
        for(int i =0;i<array.length;i++){
         System.out.print(array[i]); }
}

    }
public class sortable {
    public static void main(String[] args) {
        Quicksort q= new Quicksort();
        mergesort m= new mergesort();
        int[]arr={1,45,2,4,6,8543,12};
        int[] arr2={1234,76,234,9,234};
        q.sort(arr);
         System.out.print(" ");
        m.sort(arr2);
        
    }}