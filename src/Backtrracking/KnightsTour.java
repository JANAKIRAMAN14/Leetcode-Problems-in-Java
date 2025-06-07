package Backtrracking;
import java.util.*;

public class KnightsTour {

    // All 8 possible moves of a knight
    static int[] ro = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] co = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Knight Tour :");
        int n = sc.nextInt();
        int[][] chess = new int[n][n];
        System.out.println("Enter the Knight Tour Row for Starting : ");
        int start  = sc.nextInt();
        System.out.println("Enter the Knight Tour column for Starting : ");
        int end = sc.nextInt();

        if(start <  0 || start >= n || end < 0 || end >= n){
            System.out.println("Invalid starting Point :");
        }
        chess[start][end] = 1;

        if (tour(chess, 1, start, end, n)) {
            print(chess, n);
        } else {
            System.out.println("No Solution");
        }
    }

    // Prints the board
    static void print(int[][] chess, int n) {
        for (int[] row : chess) {
            for (int cell : row) {
                System.out.println("The Chess Board Like : ");
                System.out.printf("%3d ", cell);
            }
            System.out.println();
        }
    }

    // Recursive backtracking function
    static boolean tour(int[][] chess, int count, int row, int col, int n) {
        // Base case: if all squares are visited
        if (count == n * n) return true;

        for (int i = 0; i < 8; i++) {
            int r = row + ro[i];
            int c = col + co[i];

            if (r >= 0 && r < n && c >= 0 && c < n && chess[r][c] == 0) {
                chess[r][c] = count + 1;  // Mark next step
                if (tour(chess, count + 1, r, c, n)) {
                    return true;
                }
                chess[r][c] = 0;  // Backtrack
            }
        }
        return false;
    }
}
