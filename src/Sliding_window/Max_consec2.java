package Sliding_window;
import java.util.*;
public class Max_consec2 {
    public static void main(String[] args) {
        int nums[] = {1, 0, 1, 1, 0};
       int res = consecutive2(nums);
        System.out.println(res);
    }
    static int consecutive2(int [] nums){
        int count = 0;
        int l = 0 , r = 0 ;
        int max = Integer.MIN_VALUE;
        while(r < nums.length) {
            if (nums[r] == 0) count++;

            while (count > 1) {
                if (nums[l] == 0) count--;
                l++;
            }
            max = Math.max(max, r - l + 1);
            r++;
        }
        return max;
    }
}