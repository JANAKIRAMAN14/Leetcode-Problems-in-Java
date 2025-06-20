package DynamicProgramming;
import java.util.*;
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 7 ;
        int dp [] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3 ; i <= n ; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
    }
}
