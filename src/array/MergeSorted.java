package array;
import java.util.*;
public class MergeSorted {
    public static void main(String[] args) {
        int num[] = {1,2,3,0,0,0};
        int num1[] = {2,5,6};
        int m = 3;
        int n = 3;
        merge(num,num1,m,n);

        for(int i : num){
            System.out.print(i+",");
        }
    }
    static int[] merge(int [] num, int []num1,int n , int m){
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
        while(p2 >= 0){
            if(p1 >= 0 && num[p1] > num1[p2]){
                num[i--] = num[p1--];

            }
            else{
                num[i--] = num1[p2--];

            }
        }
     return num;
    }
}
