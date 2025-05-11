package string;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        String s = "leetcode";
       String str = findVowels(s);
        System.out.println(str);
    }
    static String findVowels(String t){
        int l = 0;
        int r = t.length()-1;
        char[] arr = t.toCharArray();
        while(l <= r) {
          if(!isVowels(arr[l]))  l++;
            if(!isVowels(arr[r])) r--;
            if(isVowels(arr[l]) && isVowels(arr[r])) {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return new String(arr);
    }
    static boolean isVowels(char d){
        if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
            return true;
        }
        else return false;
    }

}
