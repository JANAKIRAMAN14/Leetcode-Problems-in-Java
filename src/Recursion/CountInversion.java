package Recursion;
import java.util.*;
public class CountInversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n = sc.nextInt();
        System.out.println("enter the array elements:");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
       int res = merge(arr,0,n-1);
        System.out.println("count of inversion is these array:"+res);
    }
    static int merge (int [] arr , int low , int high){
        int cnt =0;
        if(low >= high) return cnt;
        int mid = (low + high) / 2;
        cnt += merge(arr,low,mid);
        cnt += merge(arr,mid+1,high);
        cnt += mergesort(arr,low,mid,high);
        return cnt;
    }
    static int mergesort(int [] arr, int low,int mid, int high){
        List<Integer> li = new ArrayList<>();
        int cnt = 0;
        int left = low;
        int right = mid+1;
        while(left <= mid & right <= high){
            if(arr[left] < arr[right]){
                li.add(arr[left]);
                left++;
            }
            else{
                li.add(arr[right]);
                cnt += (mid-left + 2);
                right++;
            }
            while(left <= mid){
                li.add(arr[left]);
                left++;
            }
               while( right <= high){
                    li.add(arr[right]);
                   cnt += (mid-left + 2);
                    right++;

  }
        }
        return cnt;
    }
}
