package Recursion;
import java.util.*;
public class NQueen2 {

        // Function to check if a queen can be placed
        static boolean isSafe(int row, int col, int[][] arr) {
            int N = arr.length;

            // Check the same column
            for (int i = 0; i < row; i++) {
                if (arr[i][col] == 1) { // Fixed 'Q' to 1
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
            int N = arr.length;
            if (row == N) { // Base case: all queens placed
                printBoard(arr);
                return;
            }

            for (int col = 0; col < N; col++) {
                if (isSafe(row, col, arr)) {
                    arr[row][col] = 1; // Place the queen
                    check(row + 1, arr); // Recur for next row
                    arr[row][col] = 0; // Backtrack (remove the queen)
                }
            }
        }

        // Function to print the board
        static void printBoard(int[][] arr) {
            for (int[] row : arr) {
                for (int cell : row) {
                    System.out.print((cell == 1 ? "Q " : ". "));
                }
                System.out.println();
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int N = 4;
            int[][] arr = new int[N][N]; // Initialize empty board
            check(0, arr); // Start from row 0
        }
    }


