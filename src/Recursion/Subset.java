package Recursion;
import java.util.*;
public class Subset {
    static void sub(int ind, int [] arr, int sum, List<Integer>ds){
        if(ind == arr.length){
            ds.add(sum);
            return;
        }

        sub(ind+1,arr,sum+arr[ind],ds);
      sub(ind+1,arr,sum,ds);


    }
    public static void main(String[] args) {
  int arr[] = {3,2,1};
         List<Integer> ds = new ArrayList<>();
         sub(0, arr, 0, ds);
         Collections.sort(ds);
        System.out.println(ds);
    }
}
