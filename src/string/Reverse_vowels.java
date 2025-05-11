package string;
import java.util.*;
public class Reverse_vowels {
    public static void main(String[] args) {
        String str = "abciou";
      String res =  vowels_find(str);
        System.out.println(res);
    }
    static String vowels_find(String s){
        StringBuilder f = new StringBuilder();
        char[] c = s.toCharArray();
        for(char d : c){
            if(isVowels(d))  f.append(d) ;
        }
       String e = f.toString();
        String a = isReverse(e);
        return a;
    }
    static boolean isVowels(char d){
        if(d == 'a' || d == 'e' || d == 'i' || d == 'o' || d == 'u'){
            return true;
        }
        else return false;
    }
    static String isReverse(String e) {
        StringBuilder reversed = new StringBuilder();
        for (int i = e.length() - 1; i >= 0; i--) {
            reversed.append(e.charAt(i));
        }
        return reversed.toString();
    }

}
