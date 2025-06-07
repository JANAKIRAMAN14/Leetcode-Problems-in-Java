import java.util.*;

public class Mergesort {
    static void mS(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        List<Integer> li = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                li.add(arr[left]);
                left++;
            } else {
                li.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            li.add(arr[left]);
            left++;
        }
        while (right <= high) {
            li.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = li.get(i - low);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mS(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
