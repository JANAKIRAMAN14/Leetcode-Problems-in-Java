package array;
import java.util.*;
public class BestTimeBuyStock {
    public static void main(String[] args) {
        int [] prices = {7,1,3,5,4};
      int res =   findmaxprofit(prices);
        System.out.println(res);
    }
    static int findmaxprofit(int [] arr){
        int current =  arr[0];
        int max = 0 ;
        for(int i = 1 ; i < arr.length ; i++){
             current = Math.min(current,arr[i]);
             int curprofit =  arr[i] - current;
             max = Math.max(max,curprofit);
        }
        return max;
    }
}
