package array;
import java.util.*;
public class Noofones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
       int res = numberOfones(num);
        System.out.println(res);
    }
    static int numberOfones(int num){
        int counter = 0;
        while(num > 0) {
            num = num & num - 1;
            counter++;
        }
        return counter;
    }
}
