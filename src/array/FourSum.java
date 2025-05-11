package array;
import java.util.*;
public class FourSum {
    public static void main(String[] args) {
        int nums[] = {4, 3, 3, 4, 4, 1, 2, 1, 2, 2};
        int target = 9;
        Arrays.sort(nums);
      List<List<Integer>> li = new ArrayList<>();
        System.out.println(listnum(nums, target,li));
    }
    static  Set<List<List<Integer>>> listnum (int nums[] , int target ,List<List<Integer>> li){
        Set<List<List<Integer>>> res = new HashSet<>();
        if(nums.length == 0 )  return res;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                int left = j + 1;
                int right = nums.length - 1;
                int target2 =  target - nums[i] + nums[j];
                while(left < right){
                    int l = nums[left] + nums[right];
                    if(l < target2) right--;
                    if(l > target2)  left++;
                    else{
                        li.add(Arrays.asList(nums[i], nums[j] , nums[left] , nums[right]));
                        res.add(li);
                    }
                }
            }
        }
        return res;
    }

}
