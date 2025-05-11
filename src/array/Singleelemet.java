package array;
import java.util.*;
public class Singleelemet {
    public static void main(String[] args) {
       int nums[] = {1,1,2,3,3,4,4,8,8};
      int res = sin_element(nums);
        System.out.println(res);
    }
    static int sin_element(int [] nums){
        int count = 0;
        Map <Integer,Integer> map = new HashMap<>();
        for(int c : nums){
            if(map.containsKey(c))  map.put(c,map.get(c)+1);
            map.put(c,0);
        }
        for(int d :  nums){
            if(map.getOrDefault(d,0) == 1 ) {
                count = map.get(d);
            }

        }
        return count;
    }
}
