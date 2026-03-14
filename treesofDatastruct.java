public class TreesOfDataStruct {
    public static void main(String[] args) {
        int nodes[] = {50, 30, 70, 40, 60, 80};
        BinaryTree tree = new BinaryTree();

        Node root = null;
        for (int val : nodes) {
            root = tree.insert(root, val);
        }

        System.out.println("Root node: " + root.data);
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    public Node insert(Node root, int val) {
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
}
