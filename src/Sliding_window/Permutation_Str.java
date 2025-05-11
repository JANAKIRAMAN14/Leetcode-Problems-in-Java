package Sliding_window;
import java.util.HashMap;
import java.util.Map;

public class Permutation_Str {

    public static boolean solve(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> have = new HashMap<>();
        int s1len = s1.length();
        int s2len = s2.length();

        if (s1len > s2len) return false;

        for (char c : s1.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        for (int right = 0; right < s2len; right++) {
            char c = s2.charAt(right);
            have.put(c, have.getOrDefault(c, 0) + 1);

            while (have.getOrDefault(c, 0) > need.getOrDefault(c, 0)) {
                char leftChar = s2.charAt(left);
                have.put(leftChar, have.get(leftChar) - 1);
                if (have.get(leftChar) == 0) {
                    have.remove(leftChar);
                }
                left++;
            }

            if (right - left + 1 == s1len && have.equals(need)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = solve(s1, s2);
        System.out.println(result);  // Output: true
    }
}
