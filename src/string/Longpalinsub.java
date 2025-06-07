package string;
import java.util.*;

public class Longpalinsub {
    public static void main(String[] args) {
        String s = "abade";
        String str = longPalindrome(s);
        System.out.println(str);
    }

    static String longPalindrome(String s) {
        int n = s.length();
        String add = "";
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    if (sub.length() > max) {
                        max = sub.length();
                        add = sub;
                    }
                }
            }
        }
        return add;
    }

    static boolean isPalindrome(String s) {
        String temp = s;
        String add = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            add = add + s.charAt(i);
        }
        return temp.equals(add);
    }
}
