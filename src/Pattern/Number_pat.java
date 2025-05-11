package Pattern;
import java.util.*;
public class Number_pat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
      //  int [][] arr = new int [n][n];
        for(int i =1;i<n;i++){
            for(int k = n-1;k>=0;k--){
                System.out.print(" ");
            }
            for(int j=1;j<n;j++){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
