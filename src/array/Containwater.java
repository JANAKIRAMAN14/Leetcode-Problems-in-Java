package array;
import java.util.*;
public class Containwater {
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
       int res = max_valu(nums);
        System.out.println(res);
    }
    static int max_valu(int nums[]){
        int l = 0;
        int r = nums.length - 1;
        int max = 0;
        while(l < r){
            int width = r - l ;
            int height = Math.min(nums[l],nums[r]);
            int water = height * width;
            max = Math.max(max , water);
            if(nums[l] < nums[r]) l++;
            else r--;
        }
        return max;
    }
}
