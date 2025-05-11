package string;
import java.util.*;
public class Randomsome {
    public static void main(String[] args) {
        String ran = "aaaaaaa";
        String mag = "aab";
     if  (solve(ran , mag)){
         System.out.println("Magazine have the random some notes:");
     }
     else{
         System.out.println("it not have the notes:");
     }
     }
     static boolean solve(String ran , String mag){
        if(ran.length() > mag.length()) return false;
        int[] fre = new int [26];
        for(char c : mag.toCharArray()){
            fre[c - 'a']++;
        }
        for(char d : ran.toCharArray()){
            fre[d - 'a']--;
        }
        for(int i : fre){
            if(i < 0) return false;
        }
        return true;
     }
}
