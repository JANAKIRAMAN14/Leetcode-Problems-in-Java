package Recursion;
import java.util.*;
public class   Permutation {
    static List<List<Integer>> listper (int [] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean [] fre = new boolean[arr.length];
        listper(arr,ans,ds,fre);
        return ans;
    }
    static void listper(int [] arr, List<List<Integer>> ans , List<Integer>ds, boolean[] fre){
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!fre[i]) {
                fre[i]= true;
                ds.add(arr[i]);
                listper(arr, ans, ds,fre);
                ds.remove(ds.size() - 1);
                fre[i]= false;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
       System.out.println(listper(arr));
    }
}
