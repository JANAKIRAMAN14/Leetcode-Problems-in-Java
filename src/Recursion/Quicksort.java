package Recursion;
import java.util.*;
public class Quicksort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int [] arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        qS(arr,0,n-1);
        System.out.print("sorted array:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int partition(int [] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
          while(arr[i] <= pivot && i < high) {
              i++;
          }
          while(arr[j] > pivot && j > low){
              j--;
          }
          if(i < j){
              swap(arr,i,j);
          }
        }
        swap(arr,low,j);
        return j;
    }
    static void swap(int [] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void qS(int [] arr , int low , int high){
        if(low < high){
            int pIndex = partition(arr,low,high);
            qS(arr,low,pIndex-1);
            qS(arr,pIndex+1,high);
        }

    }

}
