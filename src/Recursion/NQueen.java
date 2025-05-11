package Recursion;
import java.util.*;

public class NQueen {
    // Function to check if a queen can be placed
    static boolean isSafe(int row, int col, int[][] arr) {
        int N = arr.length;

        // Check the same column for any queen
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 1) { // Fixed '1' instead of 'Q'
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
            if (arr[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void check(int row, int[][] arr) {
        if (row == arr.length) {
            return;
        }

        for (int col = 0; col < arr.length; col++) {
            if (isSafe(row, col, arr)) {
                arr[row][col] = 1; // Fixed indexing: changed arr[col][row] to arr[row][col]

                check(row + 1, arr);  // Recur to place the next queen

                arr[row][col] = 0;  // Backtrack (remove the queen) (Fixed indexing here as well)
            }
        }

        return;
    }

    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};

        check(0, arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
