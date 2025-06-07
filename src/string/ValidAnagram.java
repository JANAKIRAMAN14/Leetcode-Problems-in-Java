package string;
import java.util.*;
public class ValidAnagram {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
      System.out.print(anagramValided(s1,s2));
    }
    static boolean anagramValided(String s1 , String s2){
        int fre[] = new int[26];
        for(int i = 0 ; i < s1.length() ; i++){
            fre[s1.charAt(i) - 'a']++;
        }
        for(int j = 0 ; j < s2.length() ; j++){
            fre[s2.charAt(j) - 'a']--;
        }
        for(int i : fre){
            if( i != 0) return false;
        }
        return true;
    }
}
