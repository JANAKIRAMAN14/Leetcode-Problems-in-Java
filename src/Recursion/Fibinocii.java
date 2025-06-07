package Recursion;
import java.util.*;
public class Fibinocii {
    public static void main(String[] args) {
        int fibo = 5;
        System.out.println(fibonacci(fibo));
    }
    static int fibonacci(int n){
      if(n == 0 || n == 1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
