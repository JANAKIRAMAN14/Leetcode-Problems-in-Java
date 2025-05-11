package Sliding_window;
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        String s = "fa4chba4c";
        String t = "abc";
       String str = shortSubstring(s,t);
        System.out.println(str);
    }
    static String shortSubstring(String s , String t){
        if (s.length() < t.length()) return "";
        int r = 0 , l = 0 ;
        int min = Integer.MAX_VALUE;
        int count = 0;
        String ans = "";
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int [] arr = new int[128];
        for(char c : t_arr){
            ++arr[c];
        }
        while(r < s_arr.length){
            char curt = s_arr[r];
            if(--arr[curt] >= 0) count++;
            while(count ==  t_arr.length){
                char cur = s_arr[l];
                if(++arr[cur] > 0 ) count--;
                int currentsize = r - l + 1 ;
                if(currentsize < min){
                    min = currentsize;
                    ans = s.substring(l , r+1);
                }
                l++;
            }
            r++;
        }
        return ans;
    }
}