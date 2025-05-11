package array;
import java.util.*;

public class Sumofrange {
    public static void main(String[] args) {
        int num[] = {4, 8, 3, 2, 7};
        int cache[] = new int[num.length + 1];
        findRange(num, cache);
        for (int c : cache) {
            System.out.print(c + " ");
        }
    }

    static int[] findRange(int[] num, int[] cache) {
        for (int i = 0; i < num.length; i++) {
            cache[i + 1] = cache[i] + num[i];
        }
        return cache;
    }
}
