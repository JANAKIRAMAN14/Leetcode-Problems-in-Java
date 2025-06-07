package array;
import java.util.*;
public class Digit {
    public static void main(String[] args) {
        int n = 18 ;
     int res = singleDigit(n);
     System.out.println(res);
    }
    static int singleDigit(int n){
        if(n == 0) return 0;
        while(n >= 10) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            n = sum;
        }
          return n;
    }
}
