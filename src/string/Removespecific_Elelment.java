package string;
import java.util.*;
public class Removespecific_Elelment {
    public static void main(String[] args) {
        String s = "AEFG2134";
       String str = removeElement(s);
        System.out.println(str);
    }
    static String removeElement(String s){
        String result = "";
        for(int i = 0 ; i < s.length();){
            if(i+1 < s.length() &&  s.charAt(i) == 'E' && s.charAt(i+1) == 'F')
                i=+2;
             else if (s.charAt(i) == 'G') {
                i+=1;
            }
            else {
                result += s.charAt(i);
                i+=1;
            }
        }
        return result;
    }
}
