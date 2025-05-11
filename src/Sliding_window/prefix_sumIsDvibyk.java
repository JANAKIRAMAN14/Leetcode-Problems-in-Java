package Sliding_window;
import java.util.*;
public class prefix_sumIsDvibyk {
    public static void main(String[] args) {
        int nums[] = {4,5,0,-2,-3,1};
        int k = 5;
       int res = diviByK(nums , k);
        System.out.println("No.of Times of array:"+res);
    }
    static int diviByK(int [] nums , int k){
        if(nums.length == 0) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0 , 1);
        int sum = 0 ;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++) {
            sum += nums[i];
            int rem = sum % k;
            if(rem < 0) rem += k;
            if(map.containsKey(rem)) count += map.get(rem);
            map.put(rem , map.getOrDefault(rem , 0) + 1);
        }
        return count;
    }
}
