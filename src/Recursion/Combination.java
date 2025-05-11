package Recursion;
import java.util.*;
public class Combination {
    public static List<List<Integer>> combination_sum(int [] arr,int k){
        List<List<Integer>> li = new ArrayList<>();
        findcombiantion(0,arr,k,li,new ArrayList<>());
        return li;
    }
    public static void findcombiantion(int ind , int []arr,int k,List<List<Integer>>li,List<Integer>ds){
if(ind == arr.length){
    if(k == 0){
        li.add(new ArrayList<>(ds));
    }
    return;
}
if(arr[ind] <= k){
    ds.add(arr[ind]);
    findcombiantion(ind,arr,k-arr[ind],li,ds);
    ds.remove(ds.size()-1);
}
        findcombiantion(ind+1,arr,k,li,ds);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element:");
        int n = sc.nextInt();
        System.out.println("enter the element:");
        int [] can = new int[n];
        for(int i=0;i<n;i++){
            can[i]= sc.nextInt();
        }
        System.out.println("Target value:");
        int target = sc.nextInt();
      System.out.print(" " +combination_sum(can,target));
    }
}
