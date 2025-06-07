package array;
import java.util.*;

public class ContingousArray {
    public static void main(String[] args) {
        int num[] = {0, 0, 0, 0, 1, 1};
        int res = contingousArray(num);
        System.out.println(res);
    }

    static int contingousArray(int[] num) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        map.put(0, -1);

        for (int i = 0; i < num.length; i++) {
           
            if (num[i] == 0) num[i] = -1;

            sum += num[i];

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
