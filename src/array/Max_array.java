package array;
import java.util.*;
public class Max_array {
    public static void main(String[] args) {
        int arr[] = {4,2,6,4,1,1};
      int res =  max(arr);
        System.out.println("maximum element in the array:"+res);
    }
    static int max(int [] arr){
        int max = Integer.MIN_VALUE;
        int cnt =0;
        for(int i : arr){
            max = Math.max(max,i);
        }
        for(int j : arr){
            if(max == j)  cnt++;
        }
        return cnt;

    }
}
