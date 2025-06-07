package array;
import java.util.*;
public class PushZerotoend {
    public static void main(String[] args) {
        int [] arr = {4,5,0,1,9,0,5,0};
       int[] dup =  nonZero(arr);
       for(int n : dup){
           System.out.print(" "+ n);
       }
    }
    static int[] nonZero(int [] zero){
        int [] dummy = new int[zero.length];
        int len = 0;
        for(int i = 0 ; i < zero.length ; i++){
           if(zero[i] != 0){
               dummy[len] = zero[i];
               len++;
           }
        }
        return dummy;
    }
}
