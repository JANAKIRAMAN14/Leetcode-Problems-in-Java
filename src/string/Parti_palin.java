package string;

import java.util.*;

public class Parti_palin {

    public static void main(String[] args) {
        String str = "aabb";
        List<List<String>> li = new ArrayList<>();
        List<String> ans = new ArrayList<>();

        List<List<String>> result = partition(0, str, li, ans);
        System.out.println(result);
    }

    static List<List<String>> partition(int index, String str, List<List<String>> li, List<String> ans) {
        if (index == str.length()) {
            li.add(new ArrayList<>(ans));
            return li;
        }

        for (int end = index; end < str.length(); end++) {
            if (isPalindrome(index, end, str)) {
                ans.add(str.substring(index, end + 1));
                partition(end + 1, str, li, ans);
                ans.remove(ans.size() - 1); // backtrack
            }
        }

        return li;
    }

    static boolean isPalindrome(int left, int right, String str) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
