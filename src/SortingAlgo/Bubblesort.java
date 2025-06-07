package SortingAlgo;
import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        int [] arr = {1, 9, 8, 2, 7, 3, 6, 4, 5};
        bubbleSort(arr);
        for (int i : arr){
            System.out.print(" "+i);
        }
    }
    static void bubbleSort(int [] arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
