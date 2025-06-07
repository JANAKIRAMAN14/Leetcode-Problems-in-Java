package BinarySearch;
import java.util.*;
public class SearchInsertpos {
    public static void main(String[] args) {
        int [] arr = {1,3,5,6};
        int target = 2;
       System.out.println(searchInsert(arr, target));
    }

        static  int searchInsert(int[] arr, int target) {
            int l = 0;
            int r = arr.length - 1;

            while (l <= r) {
                int mid = l + (r - l) / 2; // avoid overflow
                if (arr[mid] == target) return mid;
                if (arr[mid] < target) l = mid + 1;
                else r = mid - 1;
            }

            return l;
        }
    }

