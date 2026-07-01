class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int data) {
        this.data = data;
    }

    public static void display(Tree root) {
        if (root == null) {
            return;
        }

        display(root.left);
        System.out.println(root.data);
        display(root.right);
    }

    public static void main(String[] args) {

        Tree root = new Tree(10);
        Tree n1 = new Tree(20);
        Tree n2 = new Tree(30);
        Tree n3 = new Tree(5);
        Tree n4 = new Tree(2);

        root.left = n1;
        root.right = n2;
        n1.left = n3;
        n1.right = n4;

        display(root);
    }
}
