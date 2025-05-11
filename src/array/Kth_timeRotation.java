package array;
import java.util.*;
public class Kth_timeRotation {

        public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                int temp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = temp;
            }
        }

        public static void rotateLeft(int[] arr, int k) {
            int n = arr.length;
            k %= n;

            // Step 1: Reverse first k elements
            reverse(arr, 0, k - 1);
            // Step 2: Reverse remaining n-k elements
            reverse(arr, k, n - 1);
            // Step 3: Reverse whole array
            reverse(arr, 0, n - 1);

            System.out.println("Rotated Array: " + Arrays.toString(arr));
        }

        public static void main(String[] args) {
            rotateLeft(new int[]{1, 2, 3, 4, 5}, 2);
        }
    }
