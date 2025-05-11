package StackQueue;

import java.util.Stack;

public class Paranthesis {
    public static void main(String[] args) {
        String str = "(){[]}";
        Stack<Character> st = new Stack<>();
        System.out.print(solve(str, st));
    }

    static boolean solve(String str, Stack<Character> st) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '[' || ch == '{' || ch == '(') {
                st.push(ch);
            } else {
                if (st.empty()) {
                    return false;
                }

                char top = st.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.empty();
    }
}
