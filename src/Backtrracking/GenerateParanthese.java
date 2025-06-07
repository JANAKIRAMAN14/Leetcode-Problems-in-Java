package Backtrracking;
import java.util.*;
public class GenerateParanthese {
    public static void main(String[] args) {
        int n = 3;
        int open = 0;
        int close = 0;
        String s = "";
        ArrayList <String> para = new ArrayList<>();
        parathese(s,para,open,close ,n);
        System.out.println(para.toString());
    }
    static void parathese(String s , ArrayList<String> para , int open , int close ,int n){
        if(s.length() == n *2){
            para.add(s);
            return;
        }
      if(open < n)
        parathese(s+'(',para,open + 1 , close , n);
      if(close < open)
          parathese(s+')' , para , open , close + 1 , n);


    }

}
