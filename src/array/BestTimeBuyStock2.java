package array;
import java.util.*;
public class BestTimeBuyStock2 {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(buyStock2(arr));
    }
    static int buyStock2(int [] arr){
        int left = 0 ;
        int right = left + 1;
        int max = 0;
        int profit = 0 ;
        while (right < arr.length){
            max = arr[right] - arr[left];
            if(max < 0 ) max = 0 ;
            profit += max ;
            left++;
            right = left + 1;
        }
       return profit;
    }
}
