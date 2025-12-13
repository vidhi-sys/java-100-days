public class doubly_LL01 {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val=val;
        }
    }
    public static void display (Node head){
        Node temp=head;
        while(temp!=null){
             System.out.print(temp.val+" <->");
             temp=temp.next;
            
            
        }
         System.out.println();
    }
        public static void display_reverse (Node tail){
        Node temp=tail;
        while(temp!=null){
             System.out.print(temp.val+" <->");
             temp=temp.prev;
            
            
        }
         System.out.println();
    }
      public static void display_head(Node x){
        Node temp=x;
        while(temp.prev!=null){
             temp=temp.prev;
            
            
        }
         while(temp!=null){
             System.out.print(temp.val+" <->");
             temp=temp.next;
            
            
        }
         System.out.println();
    }
    public static void main(String[] args) {
        // 1 2 3 4
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        a.next=b;
        a.prev=null;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.next=null;
        d.prev=c;
        display(a);
        display_reverse(d);
        //move to head from random node and print full list
        display_head(c);
        
    }
}