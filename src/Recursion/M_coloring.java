package Recursion;

import java.util.*;

public class M_coloring {

    public static void main(String[] args) {
        // Example graph as adjacency matrix (4 nodes)
        int[][] graph = {
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 0},
                {0, 1, 0, 0}
        };

        int n = graph.length;
        int m = 3; // Number of colors

        List<List<Integer>> solutions = new ArrayList<>();
        int[] col = new int[n]; // Color assignments

        solve(0, graph, m, col, solutions);

        if (solutions.isEmpty()) {
            System.out.println("No valid coloring.");
        } else {
            for (List<Integer> sol : solutions) {
                System.out.println(sol);
            }
        }
    }

    static void solve(int node, int[][] graph, int m, int[] col, List<List<Integer>> solutions) {
        if (node == graph.length) {
            List<Integer> current = new ArrayList<>();
            for (int c : col) current.add(c);
            solutions.add(current);
            return;
        }

        for (int c = 1; c <= m; c++) {
            if (isSafe(node, graph, col, c)) {
                col[node] = c;
                solve(node + 1, graph, m, col, solutions);
                col[node] = 0; // Backtrack
            }
        }
    }

    static boolean isSafe(int node, int[][] graph, int[] col, int c) {
        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && col[i] == c)
                return false;
        }
        return true;
    }
}
