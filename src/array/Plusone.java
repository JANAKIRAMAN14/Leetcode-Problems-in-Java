package array;
import java.util.*;
public class Plusone {
    public static void main(String[] args) {
        int arr[] = {9, 9, 9};
        int n = arr.length - 1;
      int nums[] =  onePlus(arr);
        for(int num : nums){
            System.out.print(num);
        }
    }
    static int[] onePlus(int[] arr){
      for(int i = arr.length - 1 ; i >= 0 ; i--){
          if(arr[i] == 9) arr[i] = 0 ;
          else{
              arr[i]++;
              return arr;
          }
      }
      arr = new int[arr.length + 1];
      arr[0] = 1;
      return arr;
    }
}
