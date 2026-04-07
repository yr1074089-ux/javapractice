import java.util.*;

public class PrimsAlgo {

    static class Edge {
        int dest;
        int wt;

        public Edge(int d, int w) {
            this.dest = d;
            this.wt = w;
        }
    }

    static class Pair implements Comparable<Pair> {
        int node;
        int cost;
        int parent;

        public Pair(int n, int c, int p) {
            this.node = n;
            this.cost = c;
            this.parent = p;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost; // min heap
        }
    }

    public static void prims(ArrayList<Edge>[] graph, int V) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[V];

        pq.add(new Pair(0, 0, -1)); // start from node 0

        int totalCost = 0;

        System.out.println("Edges in MST:");

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (visited[curr.node]) continue;

            visited[curr.node] = true;
            totalCost += curr.cost;

            // Print edge (skip first dummy)
            if (curr.parent != -1) {
                System.out.println(curr.parent + " - " + curr.node + " @ " + curr.cost);
            }

            // Add neighbors
            for (Edge e : graph[curr.node]) {
                if (!visited[e.dest]) {
                    pq.add(new Pair(e.dest, e.wt, curr.node));
                }
            }
        }

        System.out.println("Total Cost of MST = " + totalCost);
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected graph
        graph[0].add(new Edge(1, 10));
        graph[0].add(new Edge(2, 15));
        graph[0].add(new Edge(3, 30));

        graph[1].add(new Edge(0, 10));
        graph[1].add(new Edge(3, 40));

        graph[2].add(new Edge(0, 15));
        graph[2].add(new Edge(3, 50));

        graph[3].add(new Edge(1, 40));
        graph[3].add(new Edge(2, 50));
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);
        prims(graph, V);
    }
}
