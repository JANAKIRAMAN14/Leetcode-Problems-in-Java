package array;
import java.util.*;
public class Clelebrity {
    public static void main(String[] args) {
        int [][] arr = {{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(findCelebrity(arr));
    }
    static int findCelebrity(int [][] arr){
        int a = 0;
        int  b = arr.length - 1;
        while(a < b){
            if(arr[a][b] == 1) a++;
            else b--;
        }
        int can = a;
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(i != a){
                if( arr[can][i] == 1 || arr[i][can] == 0){
                    return -1;
                }
            }
        }
        return can;
    }
}
