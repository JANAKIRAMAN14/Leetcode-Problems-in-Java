package array;
import java.util.*;
public class PrintallDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Divisor Number:");
        int n = sc.nextInt();
        List<Integer> li = divisorFind(n);
        for(int i : li){
            System.out.print(i+",");
        }
    }
    static List<Integer> divisorFind(int n){
        List<Integer> li = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0) li.add(i);
        }
        return li;
    }
}
