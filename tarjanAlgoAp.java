import java.util.*;

public class tarjanAlgoAp {

    static class Edge {
        int src, dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static boolean ap[]; // articulation points

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par,
                           int dt[], int low[], boolean vis[], int time[]) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0];
        int children = 0;

        for (Edge e : graph[curr]) {
            int neigh = e.dest;

            if (neigh == par) continue;

            if (!vis[neigh]) {
                dfs(graph, neigh, curr, dt, low, vis, time);

                low[curr] = Math.min(low[curr], low[neigh]);

                // articulation point condition
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }

                children++;
            } else {
                // back edge
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }

        // root node condition
        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    public static void getAp(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        boolean vis[] = new boolean[V];
        int time[] = new int[1];

        ap = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time);
            }
        }

        // print articulation points
        System.out.println("Articulation Points:");
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        getAp(graph, V);
    }
}
