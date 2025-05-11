package Sliding_window;
import java.util.*;
public class Prefix_sum {
    public static void main(String[] args) {
        int nums[] = {1,1,1};
        int k = 2;
        int res = subarraySum(nums,k);
        System.out.println("count of subarray for given kth value:"+res);
    }
    static int subarraySum (int [] nums , int k){
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum+=nums[i];
            if(sum == k) count++;
            int rem = sum - k;
            if (map.containsKey(rem)) count+=map.get(rem);
            map.put(sum,map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
