package Sliding_window;
import java.util.*;
public class Subarray_size {
    public static void main(String[] args) {
        int nums[] = {-1, 2, 3, 1, -3, 2};
        int size = 2;
       int res = maximumSum(nums, size);
        System.out.println(res);
    }
    static int maximumSum(int [] nums , int k ){
        int sum = 0 ;
        int max = Integer.MIN_VALUE;
        int r ;
        for(int l = 0 ; l < nums.length ; l++){
            r = l + 1 ;
            if(r == nums.length) return max;
            sum = nums[l] + nums[r];
            max = Math.max(max , sum);
        }
        return 0;
    }
}