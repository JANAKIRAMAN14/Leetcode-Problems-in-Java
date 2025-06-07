package Sliding_window;
import java.util.*;
public class NoOfSubstring {
    public static void main(String[] args) {
        String s = "abcabc";
        Map<Character,Integer> map = new HashMap<>();
        int count =0;
      int start  = 0 ;
      int end = 0;
      int n = s.length();
      while ( end < n){
          map.put(s.charAt(end) , map.getOrDefault(s.charAt(end), 0) + 1);
          while(map.getOrDefault('a',0) > 0 && map.getOrDefault('b',0) > 0
                  && map.getOrDefault('c' , 0) > 0){
              count += n - end;
              map.put(s.charAt(start) , map.get(s.charAt(start)) - 1);
              start++;
          }
        end++;
           }
        }
    }

