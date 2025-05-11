package Sliding_window;
import java.util.*;
public class Max_consec3 {
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
       int res = consecutive3(nums, k);
        System.out.println(res);
    }
    static int consecutive3(int [] nums , int k ){
        int count = 0;
        int max = Integer.MIN_VALUE;
        int l = 0 , r = 0 ;
        while(r < nums.length){
            if(nums[r] == 0) count++;
            while(count > k ){
                if(nums[l] == 0) count--;
                l++;
            }
            max =  Math.max(max , r - l + 1);
            r++;
        }
        return max;
    }
}
