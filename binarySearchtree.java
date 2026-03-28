public class binarySearchtree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }
    public static Node delete(Node root, int val) {
        if (root.data> val){
            root.right = delete(root.right, val);
        } else if (root.data < val){
            root.left = delete(root.left, val);
        } else {
            if (root.left == null || root.right == null){
                return null;
            }
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            }
            Node is = inorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);

        }       
        return root;
    }
    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();
        root = delete(root, 5);
        System.out.println("");
        inorder(root);
    }
}

