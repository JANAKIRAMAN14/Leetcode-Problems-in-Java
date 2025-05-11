package Sliding_window;
import java.util.*;
public class Zeros_Ones {
    public static void main(String[] args) {
        int nums[] = {0,1,0,1,0,0,1,1};
        int k = 2;
     int res  =  maxFlips(nums , k);
        System.out.println(res);
    }
    static int maxFlips(int [] nums , int  k ){
        int count = 0;
        int max = Integer.MIN_VALUE;
        int r = 0 , l = 0 ;
        while(r < nums.length){
            if(nums[r] == 0) count++;
            while (count > k){
                if(nums[l] == 0) count--;
                l++;
            }
            max = Math.max(max , r - l + 1);
            r++;
        }
        return max;
    }
}
