package array;
import java.util.*;
public class Largest_subArray {
    public static void main(String[] args) {
        int nums[] = {1,-1,3,2,-2,-8,1,7,10,23};
        int res = withSumZero(nums);
        System.out.println("Maximum of sum of zero:"+res);
    }
    static int withSumZero(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++ ){
            sum += nums[i];
            if(sum == 0)  max = Math.max(max , i+1);
            if(map.containsKey(sum))  max = i - max;
            map.put(sum , i);
        }
        return max;
    }
}
