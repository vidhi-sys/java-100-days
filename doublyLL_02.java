class doublyLL_02 {

    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node insert_at_head(Node head, int val) {
        Node new_node = new Node(val);

        if (head != null) {
            new_node.next = head;
            head.prev = new_node;
        }

        new_node.prev = null;
        return new_node;
    }
     public static Node insert_at_tail(Node tail, int val) {
        Node new_node = new Node(val);

       tail.next=new_node;
        new_node.prev=tail;

       tail=new_node;
        return tail;
    }

    public static void display_head(Node node) {
        // move to head from any random node
        while (node.prev != null) {
            node = node.prev;
        }
        display(node);
    }

    public static void main(String[] args) {
        // 1 <-> 2 <-> 3 <-> 4
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.prev = a;

        b.next = c;
        c.prev = b;

        c.next = d;
        d.prev = c;

        Node new_head = insert_at_head(a, 34);
        Node new_tail = insert_at_tail(d, 74);
        display(new_head);

        // move to head from random node and print full list
        display_head(c);
    }
}
