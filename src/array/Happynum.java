package array;
import java.util.*;

public class Happynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = findNum(n);
        System.out.println(res);
    }

    static boolean findNum(int n){
        Set<Integer> s = new HashSet<>();

        while (true) {
            int sum = 0; // Reset sum here
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit; // Accumulate the square
                n = n / 10;
            }

            if (sum == 1) {
                return true;
            }

            if (s.contains(sum)) {
                return false;
            }

            s.add(sum);
            n = sum; // Prepare for next iteration
        }
    }
}
