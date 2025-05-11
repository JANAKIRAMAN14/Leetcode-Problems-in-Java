import java.util.*;
class Main{
    static int maximum_Value(int[] arr, int k){
        int r=0,l=0;
        int sum=0,max=0;
        while(r < arr.length){
            sum+=arr[r];
            if(r-l+1>k){
                sum=-arr[l];
                l++;
            }
            if(r-l+1 == k){
                max = Math.max(sum,max);
        }
            r++;
    }
    return max;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] arr = {2,3,-1,5,-4};
        int k = sc.nextInt();
       int res = maximum_Value(arr,k);
        System.out.println(" "+res);

    }
}