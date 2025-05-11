package array;
import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int n2 = sc.nextInt();
        int gcd = findGcd(n1,n2);
        System.out.println("GCD Value:"+ gcd);
    }
    static int findGcd(int a , int b){
        int gcd = 1;
        for(int i = 1 ;  i < Math.min(a,b) ; i++){
            if(i > gcd) gcd = i;
        }
        return gcd;
    }
}
