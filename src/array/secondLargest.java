package array;
import java.util.*;
public class secondLargest {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the Given Number;");
//        int n = sc.nextInt();
//        int [] arr =  new int[n];
        int [] arr = {3,4,1,6,3,89,2,0};
        int l = arr[0];
        int s = 0;
        for(int i  = 1 ; i < arr.length ; i++){
            if(l < arr[i]){
                    s = l;
                    l =arr[i];
            } else if (l != arr[i] && s < arr[i]) {
                s = arr[i];
            }
        }
        System.out.println(s);
    }
}
