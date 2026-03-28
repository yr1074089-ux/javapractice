public class mirrorImagebst {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void mirror(Node root) {
        if (root == null) {
            return;
        }

        // swap left and right
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        // recurse
        mirror(root.left);
        mirror(root.right);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        System.out.println("Preorder of original tree:");
        preorder(root);

        mirror(root);

        System.out.println("\nPreorder of mirror tree:");
        preorder(root);
    }
}
