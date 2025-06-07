package Sliding_window;
import java.util.*;
public class Nonrepeating_char {
    public static void main(String[] args) {
        String str = "pwwkew";
        int res = nonRepeat(str);
        System.out.println(res);
    }
    static int nonRepeat(String str){
        int left = 0;
        int max = 0;
        Map<Character,Integer>map = new HashMap<>();
         if(str.length() < 2) return str.length();
        for(int right = 0 ; right < str.length(); right++){
            char cur = str.charAt(right);
            map.put(cur,map.getOrDefault(cur , 0) + 1);
          while(map.size() != right - left + 1){
              char stat = str.charAt(left);
                map.put(stat, map.get(stat) - 1);
                if(map.get(stat) == 0) map.remove(stat);
                left++;
            }
             max =Math.max(max,right - left + 1);
        }
          return max;
    }
}
