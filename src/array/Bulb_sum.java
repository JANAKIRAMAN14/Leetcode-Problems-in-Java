package array;
import java.util.*;
public class Bulb_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
       boolean [] bulb = new boolean[n];
       int cnt = 0;
       for(int i = 1 ; i <= n ; i++){
           for(int j = 0 ; j < n ; j++){
               if((j+1) % i == 0){
                   if(bulb[j] == false) bulb[j] = true;
                   else bulb[j] = false;
               }

           }
       }
         for(boolean b : bulb){
             if(b == true) cnt++;
         }
        System.out.println(cnt);
    }
}
