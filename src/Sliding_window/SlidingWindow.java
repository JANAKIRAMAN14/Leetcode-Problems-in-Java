package Sliding_window;
import java.util.*;
public class SlidingWindow {
        static int[] maxSlidingWindow(int[] nums, int k) {
            if (nums == null || k <= 0) return new int[0];

            int n = nums.length;
            int[] result = new int[n - k + 1];
            Deque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < n; i++) {
                // 1. Remove indices that are out of the current window
                while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                    deque.pollFirst();
                }

                // 2. Remove indices whose values are less than nums[i]
                while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                    deque.pollLast();
                }

                // 3. Add current index to the deque
                deque.offerLast(i);

                // 4. Add the max value of the current window to the result
                if (i >= k - 1) {
                    result[i - k + 1] = nums[deque.peekFirst()];
                }
            }

            return result;
        }
    public static void main(String[] args) {
     int [] k = {1,3,4,5,6,7};
     int t = 2;
      int[] res =  maxSlidingWindow(k , t);
        System.out.println(res.toString());
    }

}


