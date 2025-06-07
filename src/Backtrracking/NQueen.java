package Backtrracking;
import java.util.*;
public class NQueen {
    public static void main(String[] args) {
        int  n = 4;
       int [][]arr = new int[n][n];
       nQueen(arr,0 ,0);
       for(int i = 0 ; i < arr.length ; i++){
           for(int j = 0 ; j < arr.length; j++){
               System.out.printf("%2d" , arr[i][j]);
           }
           System.out.println();
       }
    }
    static void nQueen(int [][]arr,int row, int col){
        if(row == arr.length){
            return;
        }
        if(isSafe(arr,row, col)){
            arr[row][col] = 1;
            nQueen(arr,row , col);
        }
         arr[row][col] = 0;
    }
    static boolean isSafe(int [][]arr , int row , int col){

    }
}
