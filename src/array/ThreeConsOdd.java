package array;
import java.util.*;
public class ThreeConsOdd {
    public static void main(String[] args) {
        int [] arr = {1,2,3,32,14,5,7,9,24,2};
       System.out.print(threeConsecutiveOdds(arr));
    }

        static boolean threeConsecutiveOdds(int[] arr) {
           int count = 0;
           for(int num : arr){
               if(num % 2 != 0) {
                   count++;
                   if (count == 3) return true;
               }
                       else{
                           count = 0;
                       }
           }
           return false;
        }
    }

