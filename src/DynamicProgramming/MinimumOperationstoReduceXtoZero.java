package DynamicProgramming;
import javax.sound.midi.Soundbank;
import java.util.*;
public class MinimumOperationstoReduceXtoZero {
    public static void main(String[] args) {
        int [] arr = {1,1,4,2,3};
        int k = 5;
        if(minimumOperation(arr,k) == 0) System.out.println(-1);
        else System.out.println(minimumOperation(arr,k));

    }
    static int minimumOperation(int [] arr , int k){
       int l = 0 ;
      int r = arr.length - 1;
      int temp = k;
       int start = 0;
       int end = 0;
       while( l < arr.length -1){
           k -= arr[l];
           start++;
           if(k == 0)
               break;
           l++;
       }
       k = temp;
       while(r > 0){
           k -= arr[r];
           end++;
           if(k == 0) break;
           r--;
       }
       return Math.min(start,end);
    }
}
