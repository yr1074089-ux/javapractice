import java.util.*;

public class binarySearchtree2 {
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

    public static void printpath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.data);

        if (root.left == null && root.right == null) {
            printpath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);

        path.remove(path.size() - 1);
    }
    public static boolean isBst(Node root, Node min, Node max){
        if (root == null){
            return true;
        }  
        if (min != null && root.data <= min.data){
            return false;
        } else if (max != null && root.data >= max.data){
            return false;
        }
        return isBst(root.left, min, root) && isBst(root.right, root, max);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        if (isBst(root, null, null)){
            System.out.println("This is a BST");
        } else {
            System.out.println("This is not a BST");
        }
    }
}
