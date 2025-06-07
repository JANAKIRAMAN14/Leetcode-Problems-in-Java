package DynamicProgramming;
public class HouseRobber2 {
    public static void main(String[] args) {
     //   int[] arr = {2, 7, 3, 1 , 4 ,2 , 1,8};
        int arr[] = {1,2,3};
        int res = houseRobber(arr);
        System.out.println(res);
    }

    static int houseRobber(int[] arr) {
        int low = 0;
        int fast = low + 2;
        if(arr.length > 3) return arr[low] + arr[fast];

        int max = 0;
        while (fast < arr.length) {
            int cur = arr[low] + arr[fast];
            max = Math.max(max, cur);
            low++;
            fast = low + 2;
        }
        return max;
    }
}