package string;
import java.util.*;
public class StobogrammaticNum {
    public static void main(String[] args) {
        String stobo = "619";
    if(checkStobo(stobo)){
        System.out.println("It is a Stobogramatic number :");
    }
    else
        System.out.println("It not Stobogrammatic NUmber :");
    }
    static boolean checkStobo(String s){
        if(s.length() < 2)
            return false;

        HashMap<Character , Character> map = new HashMap<>();
        map.put('0','0');
        map.put('1','1');
        map.put('8','8');
        map.put('9','6');
        map.put('6','9');
        int start = 0 ;
        int end = s.length() - 1;
      while(start <= end){
          if(map.containsKey(s.charAt(start)) && map.get(s.charAt(start)) == s.charAt(end)){
              start++;
              end--;
          }
          else
              return false;
      }

        return true;
    }
}
