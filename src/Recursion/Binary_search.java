package Recursion;
import java.util.*;
public class Binary_search {
   static int search(int [] arr,int low,int high,int target){
       int mid = (low+high)/2;
       if(low <= high){
           if(arr[mid]==target){
               return mid;
           } else if (arr[mid]>target) {
               return search(arr,low,mid-1,target);

           }
           else {
             return  search(arr,mid+1,high,target);
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("It is only applicable for sorted array . Please give me sorted element in array:");
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        System.out.println("enter the array element:");
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the target value:");
        int target = sc.nextInt();
        int low =0;
        int high = n-1;
        System.out.println(search(arr,low,high,target));
    }

}
