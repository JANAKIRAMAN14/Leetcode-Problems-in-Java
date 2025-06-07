package string;
import java.util.*;
public class ConcatnateTwoWords {
    public static void main(String[] args) {
        String[] str  = {"lc","cl","gg"};
     int res =   longestPalindrome(str);
        System.out.println(res);
    }
    static int longestPalindrome(String [] words) {
        int [][]fre = new int[26][26];
        int length = 0;
        for(String s : words){
            int i = s.charAt(0) - 'a' ;
            int j = s.charAt(1) - 'a';
            if(fre[j][i] > 0){
                fre[j][i]--;
                length += 4;
            }
            else{
                fre[i][j]++;
            }
        }
        for(int k = 0 ; k < 26 ; k++){
            if(fre[k][k] > 0) {
                length += 2;
                break;
            }
        }
        return length;
        }
}
