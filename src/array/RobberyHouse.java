package array;
import java.util.*;
public class RobberyHouse {
    public static void main(String[] args) {
        int arr[] = {2,7,3,1,4,2,1,8};
        int res = robberHouse(arr);
        System.out.println(res);
    }
    static int robberHouse(int [] arr){
        if(arr.length < 2) return arr[0];
         int dp[] = new int[arr.length];
         dp[0] = arr[0];
         dp[1] = Math.max(arr[0],arr[1]);

         for(int i = 2 ; i < arr.length ; i++){
             dp[i] = Math.max(dp[i-2] + arr[i] , dp[i - 1]);

         }
         return dp[arr.length - 1];
    }
}
