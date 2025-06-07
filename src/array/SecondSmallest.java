package array;

public class SecondSmallest {
    public static void main(String[] args) {
        int [] arr = {3,4,1,6,3,89,2,0};
        int s = arr[0];
        int ss = 0;
        for(int i  = 1 ; i < arr.length ; i++){
            if(s > arr[i]){
                ss = s;
                s =arr[i];
            } else if (s != arr[i] && ss < arr[i]) {
                ss = arr[i];
            }
        }
        System.out.println(ss);
    }
}
