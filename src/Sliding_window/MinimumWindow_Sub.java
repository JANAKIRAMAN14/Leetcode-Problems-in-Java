package Sliding_window;
import java.util.*;
public class MinimumWindow_Sub {
    public static void main(String[] args) {
        String s = "adobecodebanc";
        String t = "abc";
       String res = subString(s , t);
        System.out.println("Minimum window Substring:"+res);
    }
    static String subString(String s , String t){
        if(s.length() < 2) return t;
        int [] arr = new int[26];
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        int l = 0 , r = 0 ;
        int count = 0;
        String ans = "";
        int min = Integer.MAX_VALUE;
        for( char c : t_arr ){
            arr[c - 'a']++;
        }
        while (r < s_arr.length){
            char cur = s.charAt(r);
            if(-- arr[cur - 'a'] >= 0) count++;
            //shrink window
            while(count == t_arr.length){
                int cursize = r - l + 1;
                if(cursize < min) {
                    min = cursize;
                    ans = s.substring(l , r+1);
                }
                char start = s.charAt(l);
                if(++arr[start - 'a'] > 0) count--;
                l++;
            }
            r++;
        }
        return ans;
    }
}
