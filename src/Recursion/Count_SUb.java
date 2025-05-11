package Recursion;
import java.sql.SQLOutput;
import java.util.*;
public class Count_SUb {
    static int count_sequence(int ind , int s , int[] arr,int sum,int n){
        if(ind == n){
            if(s == sum){
                return 1;
            }
            else return 0;
        }
        s= s+arr[ind];
       int l = count_sequence(ind+1,s,arr,sum,n);
        s = s-arr[ind];
        int r = count_sequence(ind+1,s,arr,sum,n);
        return l+r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element:");
        int n = sc.nextInt();
        System.out.println("enter the element:");
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the positive sum only consider:");
        int sum = sc.nextInt();
      System.out.print("Count the subsequence in these array: "+count_sequence(0,0,arr,sum,n));
    }
}
