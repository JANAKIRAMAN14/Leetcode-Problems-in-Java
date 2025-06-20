package DynamicProgramming;
import java.util.*;
public class FibonaciiSeries {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        int [] arr = new int[n + 1];
        arr[0] = 0 ;
        arr[1] = 1 ;
        for(int i = 2 ; i <= n ; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
      return arr[n];
    }
}
