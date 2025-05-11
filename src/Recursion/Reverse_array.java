package Recursion;
import java.util.*;
public class Reverse_array {
    static int[] reverse(int [] arr,int l , int r){
     if(l >= r)  return arr;
     int temp = arr[l];
     arr[l]=arr[r];
     arr[r]=temp;
     reverse(arr,l+1,r-1);
    return new int[]{0,0};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element:");
        int n = sc.nextInt();
        System.out.println("enter the array element:");
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0;
        int r=n-1;
        reverse(arr,l,r);
        System.out.println("Reverse Array:");
        for(int ar : arr){
            System.out.print(" "+ar);
        }

    }
}