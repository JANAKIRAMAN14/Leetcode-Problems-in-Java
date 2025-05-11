package string;
import java.util.*;
public class JewelsandStones {
    public static void main(String[] args) {
        String jewels = "aC";
        String stones = "aCabbb";
      int res =  findit(jewels,stones);
        System.out.println(res);
     // Set<Character> hs =  findit(jewels,stones);
     // for(char c : hs){
     //     System.out.print(c);
      }
    static int findit(String jewels, String stones){
        Set<Character> st =  new HashSet<>();
        int count = 0;
        for(char c : jewels.toCharArray()){
            st.add(c);
        }
        for(char d : stones.toCharArray()){
            if(st.contains(d)) count++;
        }
        return count;
    }
}
