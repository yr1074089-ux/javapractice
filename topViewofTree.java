import java.util.*;

public class topViewofTree {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        if (root == null) return;

        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;

        q.add(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.remove();

            if (!map.containsKey(curr.hd)) {
                map.put(curr.hd, curr.node);
            }

            if (curr.node.left != null) {
                q.add(new Info(curr.node.left, curr.hd - 1));
                min = Math.min(min, curr.hd - 1);
            }

            if (curr.node.right != null) {
                q.add(new Info(curr.node.right, curr.hd + 1));
                max = Math.max(max, curr.hd + 1);
            }
        }

        for (int i = min; i <= max; i++) {
            if (map.get(i) != null) {
                System.out.print(map.get(i).data + " ");
            }
        }
        System.out.println();
    }

    public static boolean getpath(Node root, int n, ArrayList<Node> path) {
        if (root == null) return false;

        path.add(root);

        if (root.data == n) return true;

        if (getpath(root.left, n, path) || getpath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node Lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        if (!getpath(root, n1, path1) || !getpath(root, n2, path2)) {
            return null;
        }

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Top View
        topView(root);

        // LCA
        int n1 = 4, n2 = 5;
        Node lca = Lca(root, n1, n2);
        if (lca != null) {
            System.out.println("LCA: " + lca.data);
        } else {
            System.out.println("Nodes not found");
        }
    }
}
