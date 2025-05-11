package array;
import java.util.*;
public class PerfectNum {
    public static void main(String[] args) {
        int n = 8;
       System.out.print(perfectNum(n));
    }
    static boolean perfectNum(int n){
       int  sum = 0;
        for(int i = 1 ; i < n ; i++ ){
            if(n % i == 0) sum += i ;
        }
        return sum == n;
    }
}
