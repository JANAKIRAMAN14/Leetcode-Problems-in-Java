package Graph;
import java.util.*;

public class NoofProvinces {

    // Depth-First Search to mark visited nodes
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[node] = 1;
        for (Integer neighbor : adj.get(node)) {
            if (vis[neighbor] == 0) {
                dfs(neighbor, adj, vis);
            }
        }
    }

    // Count number of provinces (connected components)
    public static void noOfProvinces(ArrayList<ArrayList<Integer>> matrix, int v) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) adjList.add(new ArrayList<>());

        // Convert adjacency matrix to adjacency list
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (matrix.get(i).get(j) == 1 && i != j) {
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);  // undirected graph
                }
            }
        }

        int[] vis = new int[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0) {
                count++;
                dfs(i, adjList, vis);
            }
        }

        System.out.println("Number of Provinces: " + count);
    }

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> adjMatrix = new ArrayList<>();
        adjMatrix.add(new ArrayList<>(Arrays.asList(1, 0, 0, 1)));
        adjMatrix.add(new ArrayList<>(Arrays.asList(0, 1, 1, 0)));
        adjMatrix.add(new ArrayList<>(Arrays.asList(0, 1, 1, 1)));
        adjMatrix.add(new ArrayList<>(Arrays.asList(1, 0, 1, 1)));

        noOfProvinces(adjMatrix, 4);
    }
}
