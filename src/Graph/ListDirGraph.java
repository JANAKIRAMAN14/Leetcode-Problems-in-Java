package Graph;
import java.util.*;

public class ListDirGraph {

    static void printGraph(List<Integer>[] adj) {
        for (int i = 0; i < adj.length; i++) {
            System.out.println(i + " -> " + adj[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();

        // adjacency list as an ArrayList of ArrayLists
       List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();   // create list for each node
        }

        System.out.println("Enter each edge (u v):");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
        }

    printGraph(adj);

    }
}
