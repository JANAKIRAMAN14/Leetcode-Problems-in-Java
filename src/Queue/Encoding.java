package Queue;

import java.util.*;

public class Encoding {

    public static void main(String[] args) {
        System.out.println(decode("a(bc)d"));
        System.out.println(decode("a(bc{de}f)g"));
    }

    public static String decode(String s) {
        Stack<String> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                String temp = "";
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    temp = stack.pop() + temp;
                }
                stack.pop(); // pop '('
                String reversed = new StringBuilder(temp).reverse().toString();
                stack.push(reversed);
            } else if (ch == '}') {
                String temp = "";
                while (!stack.isEmpty() && !stack.peek().equals("{")) {
                    temp = stack.pop() + temp;
                }
                stack.pop(); // pop '{'
                String reversed = new StringBuilder(temp).reverse().toString();
                stack.push(reversed + reversed); // reverse and duplicate
            } else {
                stack.push(String.valueOf(ch));
            }
        }

        // Build final result
        StringBuilder result = new StringBuilder();
        for (String str : stack) {
            result.append(str);
        }

        return result.toString();
    }
}
