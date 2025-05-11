package array;
import java.util.*;
public class Counting_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      for( int it : conversation(n)){
          System.out.println(" "+ it);
      }

    }
    static int[] conversation(int n){
        int [] dp = new int [n+1];
        for(int i=1; i<=n ; i++){
            // right is used to -1;

            dp[i] = dp[i >> 1] + (n & 1);
        }
        return dp;
    }
}
