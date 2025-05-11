package BinarySearch;
import java.util.*;
public class Peak_element {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
      int sol = solve(nums);
        System.out.println(sol);

    }
    static int solve(int nums[]){
        int l =0 ;
        int r = nums.length - 1 ;
        while(l < r){
            int mid = (l + r) /  2;
            if(nums[mid] > nums[mid+1] ) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}
