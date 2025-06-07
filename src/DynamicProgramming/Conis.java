package DynamicProgramming;
import java.util.*;
public class Conis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the data:");
        int s = sc.nextInt();
        int res =  arrangingCoins(s);
        System.out.println(res);
    }
static int arrangingCoins(int s){
        int l = 1 ;
        int r = s ;
        int res = 0;
        while(l <= r){
            int mid = (l + r) / 2;
            int coins = mid * (mid + 1) / 2;
            if(coins > s) r = mid - 1 ;
            else {
                l = mid + 1;
                res = Math.max(mid,res);
            }
        }
        return res;
}

}
