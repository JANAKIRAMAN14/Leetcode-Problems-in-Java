package Recursion;
import java.util.*;

public class Fibonacci {
    static int fibo(int n) {
        if (n == 0) return 0;  // Base case for n = 0
        if (n == 1) return 1;  // Base case for n = 1
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + fibo(n));

    }
}
