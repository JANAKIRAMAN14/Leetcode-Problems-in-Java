package Recursion;
import java.util.*;

 class Permutation23 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3,1};
        System.out.println(permuteUnique(arr));
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums); // Sort to handle duplicates
            boolean[] used = new boolean[nums.length];
            backtrack(nums, ans, new ArrayList<>(), used);
            return ans;
        }

        static void backtrack(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] used) {
            if (temp.size() == nums.length) {
                ans.add(new ArrayList<>(temp));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue; // Skip duplicates

                used[i] = true;
                temp.add(nums[i]);
                backtrack(nums, ans, temp, used);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }



