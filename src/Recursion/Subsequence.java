package Recursion;

import java.util.*;

public class Subsequence {
    static void subSequence(int[] arr, int ind, int n, List<Integer> hs) {
        if (ind == n) {
            System.out.println(hs); // Print the current subsequence
            return;
        }

        hs.add(arr[ind]);
        subSequence(arr, ind + 1, n, hs);


        hs.remove(hs.size() - 1);
        subSequence(arr, ind + 1, n, hs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Subsequences:");
        subSequence(arr, 0, n, new ArrayList<>());
    }
}
