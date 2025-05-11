package string;
//import javax.swing.plaf.IconUIResource;
import java.util.*;
public class ZigzagConversion {
    public static void main(String[] args) {
        String str = "paypalishiring";
        int nor = 3;
       String st = solve(str,nor);
        System.out.println(st);
    }
    static  String solve(String str , int no){
        StringBuilder [] ans = new StringBuilder[no];
        for(int i = 0; i < no; i++) {
            ans[i] = new StringBuilder();
        }

        int currentrow =0;
        boolean down = false;
        for(char c : str.toCharArray()){
            ans[currentrow].append(c);
            if (currentrow == 0 || currentrow == no - 1) down = !down;
            currentrow += down ? 1 : -1;

        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : ans){
            result.append(sb);
        }
        return result.toString();
    }
}
