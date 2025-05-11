package array;
import java.util.*;
public class Twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
     int[] in= (twosum(arr,target));
     for(int it : in){
         System.out.println(it);
     }
        }
    static int[] twosum(int [] arr,int k){
        int left = 0;
        int right = arr.length-1;
        int sum =0;
        while(left<right){
            sum = arr[left] + arr[right];
            if(sum == k ){
                return new int[]{left+1,right+1};
            }
            else if(sum < k){
                right--;
            }
            else left++;
        }
        return new int[]{};
    }
}
