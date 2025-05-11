package Graph;
import java.util.*;
public class DirectedGra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of nodes:");
        int n = sc.nextInt();
        System.out.println("Enter the no of edges:");
        int m = sc.nextInt();
        int[][] adj = new int[n+1][n+1];
        matrix2(adj,n,m);
        for(int i = 0 ;i < m ; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(""+adj[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] matrix2(int [][] adj , int n , int m){
        Scanner s = new Scanner(System.in);
        for(int i = 0 ; i < m ; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            adj[u][v] = 1;
          //  adj[v][u] = 1;
        }
        return adj;
    }
    }

