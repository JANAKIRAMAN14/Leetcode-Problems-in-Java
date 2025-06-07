package Backtrracking;
import java.util.*;
public class Combination {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int k = 2;
        List<Integer> li = new ArrayList<>();
        List<List<Integer>> ds = new ArrayList<>();
        Set<Integer> vis = new HashSet<>();
        combination(arr,li , ds , vis , k);
        System.out.println(ds.toString());
    }
    static void combination(int[]arr , List<Integer> li , List<List<Integer>> ds , Set<Integer> vis , int k){
        if(li.size() == k){
            ds.add(new ArrayList<>(li));
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(!vis.contains(i)){
                vis.add(i);
                li.add(arr[i]);
                combination(arr , li , ds , vis , k);
                li.remove(li.size() - 1);
                vis.remove(i);
            }

        }
    }
}
