package Recursion;
import java.util.*;

public class Graphcoloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes and edges
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        // Create adjacency list
        List<Integer>[] G = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            G[i] = new ArrayList<>();
        }

        // Input edges
        System.out.println("Enter each edge (u v):");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            G[u].add(v);
            G[v].add(u); // Because it's an undirected graph
        }

        int[] color = new int[n];
        int m = 3; // Number of colors

        // Attempt to color the graph
        if (graphColoring(G, color, m, 0)) {
            System.out.println("Graph successfully colored using " + m + " colors:");
            for (int i = 0; i < color.length; i++) {
                System.out.println("Node " + i + " --> Color " + color[i]);
            }
        } else {
            System.out.println("Graph cannot be colored using " + m + " colors.");
        }

        sc.close();
    }

    static boolean graphColoring(List<Integer>[] G, int[] color, int m, int i) {
        return isSolve(G.length, color, G, i, m);
    }

    static boolean isSolve(int n, int[] color, List<Integer>[] G, int node, int m) {
        if (node == n) return true;

        for (int i = 1; i <= m; i++) {
            if (isSafe(node, G, color, i)) {
                color[node] = i;
                if (isSolve(n, color, G, node + 1, m)) return true;
                color[node] = 0; // backtrack
            }
        }
        return false;
    }

    static boolean isSafe(int node, List<Integer>[] G, int[] color, int col) {
        for (int neighbor : G[node]) {
            if (color[neighbor] == col) return false;
        }
        return true;
    }
}
