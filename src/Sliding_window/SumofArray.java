package Sliding_window;
import java.util.*;

public class SumofArray {
    public static void main(String[] args) {
        int nums[] = {1, 7, 4, 3, 1, 2, 1, 5, 1};
        int k = 7;
        int res = givennum(nums, k);
        System.out.println(res);
    }

    static int givennum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > k && left <= right) {
                sum -= nums[left];
                left++;
            }

            if (sum == k) {
                count++;
            }
        }
        return count;
    }
}
