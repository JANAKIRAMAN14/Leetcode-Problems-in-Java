package string;
import java.util.*;
public class Wordbreak {
    public static void main(String[] args) {
        String s = "applepenapple";
        String[] dict = {"apple","pen"};
        System.out.print(checkIt(s,dict));
    }
    static boolean checkIt(String s , String [] dict) {
        Set<String> word = new HashSet<>(Arrays.asList(dict));

        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true ;
        for(int i = 1 ; i < s.length() ; i++){
            for(int j = 0 ; j < i ; j++){
                if(dp[j] && word.contains(s.substring(j,i))){
                    dp[i] = true ;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
