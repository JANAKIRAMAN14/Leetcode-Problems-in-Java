package DynamicProgramming;
import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, -5, 6, 1, -1, 4};
        System.out.println(maximumSubarray(arr));
    }

    static int maximumSubarray(int[] arr) {

        int n = arr.length;
        int left = 1;
        int right = 1;
        int maxsofar = 1;
        for (int i = 0; i < n; i++) {

            left = left == 0 ? 1 : left;
            right = right == 0 ? 1 : right;

            left *= arr[i];
            right *= arr[n - i - 1];

            maxsofar = Math.max(left , Math.max(right ,  maxsofar));

        }
       return  maxsofar;
    }

}