package Sliding_window;
import java.util.*;
public class Max_consec1 {
    public static void main(String[] args) {
        System.out.println("Thats array are filled with 1's and 0's");
        int nums[] = {1,1,0,1,1,1};
      int res =  consecutive1(nums);
        System.out.println("Total no.of 1's:"+res);
    }
    static int consecutive1(int [] nums){
        int count = 0;
        for(int i =0 ; i < nums.length ; i++ ){
            if(nums[i] == 0)  count=0;
            else count++;
        }
        return count;
    }
}
