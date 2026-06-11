import java.util.*;
public class heapp{
    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(30);
        pq.add(15);
        pq.add(10);
        pq.peek();
        System.out.println(pq.peek());

    }
}