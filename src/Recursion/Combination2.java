package Recursion;

import java.util.*;

class Combination2 {
    public static List<List<Integer>> combinationSum2(int[] arr, int k) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(arr); // Sorting helps in skipping duplicates
        findCombinations(0, arr, k, li, new ArrayList<>());
        return li;
    }

    private static void findCombinations(int ind, int[] arr, int k, List<List<Integer>> ans, List<Integer> ds) {
        if (k == 0) { // If sum is achieved, add the combination
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) continue; // Skip duplicates

            if (arr[i] > k) break; // Stop if element exceeds the target sum

            ds.add(arr[i]);
            findCombinations(i + 1, arr, k - arr[i], ans, ds); // Move to the next index
            ds.remove(ds.size() - 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = combinationSum2(arr, target);
        System.out.println(result);
    }
}
