package string;
import java.util.*;
public class Break2 {
    public static void main(String[] args) {
        String s = "studyalgorithm";
        String[] dict = {"study","algorithm"};
        System.out.print(checkIt(s,dict));
    }
    static boolean checkIt(String s , String [] dict){
        int fre[] = new int[26];
        for(char c : s.toCharArray()){
            fre[c - 'a']++;
        }
        for(int i = 0 ; i < dict.length ; i++){
            String cur = dict[i];
            for(char d : cur.toCharArray()){
                fre[d-'a']--;
            }
        }
        for(int j : fre){
            if(j==1) return false;
        }
        return true;
    }
}
