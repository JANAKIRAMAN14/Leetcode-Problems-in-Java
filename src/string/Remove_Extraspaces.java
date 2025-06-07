package string;
import java.util.*;
public class Remove_Extraspaces {
    public static void main(String[] args) {
        String s1 = "ps-r----tra-ining";
       String s = removeHint(s1);
        System.out.println(s);
    }
    static String removeHint(String s){
        StringBuilder hifent = new StringBuilder();
        StringBuilder letter = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '-'){
                hifent.append(s.charAt(i));
            }
            else{
                letter.append(s.charAt(i));
            }
        }
        return hifent.append(letter).toString();
    }
}