package DynamicProgramming;

public class Coinchange {
    public static void main(String[] args) {
        int [] coin = {1,1,1,1,1,2,1,1};
        int amount = 4;
       int res = coinChange(coin,amount);
        System.out.println(res);
    }
    static int coinChange(int[] coin , int amount){
       if(amount < 2) return 0;
       int mincoin[] = new int[amount + 1];
        for(int i = 1 ; i <= amount  ; i++){
            mincoin[i] = Integer.MAX_VALUE;
            for(int coins : coin){
                if(coins <= i && mincoin[i - coins] != Integer.MAX_VALUE){
                    mincoin[i] = Math.min(mincoin[i] , 1 + mincoin[i - coins]);
                }
            }
        }
        if(mincoin[amount] == Integer.MAX_VALUE) return -1;
        return mincoin[amount];
    }
}
