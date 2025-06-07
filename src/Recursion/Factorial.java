package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int sum = 1;
        System.out.println("Factorial :"+fact(n));
    }
    static int fact(int n){
        if(n == 0 || n == 1) return 1;
        else
            return n * fact(n - 1);
    }
}
