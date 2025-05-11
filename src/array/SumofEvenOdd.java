package array;
import java.util.*;
public class SumofEvenOdd {
    public static void main(String[] args) {
        int n = 123456;
        int even = 0;
        int odd = 0;
       int result[] = sumOfEvnod(n,even,odd);
        System.out.println("Even Numbers are:"+result[0]);
        System.out.println("Odd Numbers are :" + result[1]);
    }
    static int[] sumOfEvnod(int n , int even , int odd){
        int[] result =  new int[2];
        int num = 0;
        if(n == 0) return result;
         while(n > 0){
             num = n % 10;
             if(num % 2 == 0) even += num;
             else odd += num;
             n = n / 10;
         }
         result[0] = even;
         result[1] = odd;
         return result;
    }
}
