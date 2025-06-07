package Stack;
import java.util.*;
import java.util.Stack;

public class Infixtoostfix {
    public static void main(String[] args) {
        String s = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(s));
    }
    static String infixToPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        HashMap<Character , Integer> priority = new HashMap<>();
        priority.put('+',1);
        priority.put('-',1);
        priority.put('*',2);
        priority.put('/',2);
        priority.put('^',3);
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {

                while(!st.isEmpty() && !st.peek().equals('(')){
                    str.append(st.pop());
                }
                st.pop();

            }
            else{
                while(!st.isEmpty() && priority.getOrDefault(c , 0) <= priority.getOrDefault(st.peek(),0) ){
                 str.append(st.pop());
                }
                st.push(c);
            }
        }
        while(!st.isEmpty()) {
            str.append(st.pop());
        }
        return str.toString();
    }
}
