package array;
import java.util.*;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int [3];
        for(int i = 0 ; i < 3 ; i++){
            num[i] = sc.nextInt();
        }
        System.out.println( triangle(num));
     //   System.out.println(str);

    }
    static String triangle(int [] num){

        if(num == null || num.length != 3) return "invalid";

        int a = num[0];
        int b = num[1];
        int c = num[2];

        if(a+b <= c) return "none";

        if(a == b && b == c) return "equilateral";
        if(a == b || b == c) return "isolateral";
        return "scalene";
    }
}
