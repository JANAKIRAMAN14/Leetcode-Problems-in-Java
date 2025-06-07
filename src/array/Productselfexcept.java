package array;
import java.util.*;
public class Productselfexcept {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
         int n = arr.length;
        int nums [] = new int[n];
        for(int i = 0 ; i < n ; i++){
            nums[i] = 1 ;
        }
        productSelfExcept(arr,nums);
        for(int num : nums){
            System.out.print(num + ",");
        }
        }
    static int[] productSelfExcept (int[] arr, int[] nums){
        int pre = 1 ;
        int pos = 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            nums[i] *= pre;
            pre *= arr[i];
        }
       for(int j = arr.length - 1 ; j >= 0 ; j--){
          nums[j] *= pos;
          pos *= arr[j];
       }
       return nums;
    }
    }
