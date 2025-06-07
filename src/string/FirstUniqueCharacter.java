package string;
import java.util.*;
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "LOVELEETCODE";
        System.out.println( firstUnique(str));
    }
    static char firstUnique(String s){
       char first_char = s.charAt(0);
       int count = 0 ;
       for(int  i = 0 ; i < s.length() ; i++) {
           int place = i + 1;
           for (int j = i + 1; j < s.length(); j++) {
               if (place < s.length() && s.charAt(j) == first_char) {
                   first_char = s.charAt(place);
                   count++;
                   break;
               }
           }
       }
       return count ==  0 ? '#' : first_char;
    }
}
