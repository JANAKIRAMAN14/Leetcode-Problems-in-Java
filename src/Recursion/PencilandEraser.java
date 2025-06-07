package Recursion;
import java.util.*;
public class PencilandEraser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int m = sc.nextInt();;
        int e = sc.nextInt();
        System.out.println(findCombination(n,p,m,e));

    }
    static int findCombination(int n , int p , int m , int e){
        int total_ways_pencils = fact(n) / (fact(p) * fact(n - p));
        int total_ways_erasers = fact(m) / (fact(e) * fact(m -e));
        return total_ways_erasers* total_ways_pencils;
    }
    static int fact(int n){
        if(n == 0 || n == 1) return n;

        return n * fact(n - 1);
    }
}
