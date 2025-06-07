package array;
import java.util.*;
public class LeaderProblem {
    public static void main(String[] args) {
        int [] arr = {16,17,4,3,5,2};
        findLeader(arr);
    }
    static void findLeader(int [] arr){
         int n = arr.length;
        int max = arr[n -1];
        System.out.println("Leaders are :" + max);
        for(int i = n - 2 ; i >= 0 ; i--){
            if(arr[i] > max){
                max = arr[i];
                System.out.println(max);
            }
        }
    }
}
