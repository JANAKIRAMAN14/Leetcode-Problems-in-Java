package DynamicProgramming;

public class Houserobbery2 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 1, 4, 2, 1, 8};
       int res = robbery2(arr);
        System.out.println(res);
    }
 static int robbery2(int[] arr){
        int [] first_house = new int[arr.length -1];
        int [] last_house = new int [arr.length - 1];
        for(int i = 0 ; i < arr.length - 1 ; i++){
            first_house[i] = arr[i];
            last_house[i] = arr[i + 1];
        }
        int first_rob = robbery(first_house);
        int last_rob  = robbery(last_house);

        return Math.max(first_rob , last_rob);
 }
 static int robbery(int[] arr){
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];

        for(int i = 2 ; i < arr.length ; i++){
            dp[i] = Math.max(dp[i - 2] + arr[i] , dp[i - 1]);
        }
        return dp[arr.length - 1];
 }
}