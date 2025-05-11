package array;
import java.util.*;
public class FilledwithZeros {
    public static void main(String[] args) {
        int nums[] = {0,0,5,2,0,0};
     int result=solve(nums);
        System.out.println(" "+result);
    }
    static int solve(int nums[]){
        int count = 0;
        int total =0;
        for(int i =0 ; i<nums.length;i++){
            if( nums[i] == 0){
                count++;
            }
            else{
                if(count > 0){
                    total = total + count * (count + 1) / 2 ;
                    count =0;
                }
            }
        }
        if(count > 0){
            total = total + count * (count + 1) / 2;
        }
        return total;
    }
}
