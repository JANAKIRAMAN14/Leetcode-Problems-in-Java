package Stack;
// leetode 150
import java.util.*;
import java.util.Stack;

public class EvalutePoninter {
    public static void main(String[] args) {
        String[] s ={"2","1","+","3","*"} ;
        System.out.println(evalutePointer(s));
    }
    static int evalutePointer(String[] s){
        Stack <Integer> st = new Stack<>();
        int result = 1;
        for(String token : s){
            if(isOperator(token)){
                int a = st.pop();
                int b = st.pop();
                if(token == "+"){
                    result = a + b;

                } else if (token == "*") {
                    result = a * b;

                }
                   else if(token == "-"){

                        result = a - b;

                    }
                else if(token == "/"){

                    result = a / b;

                }
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(token));
            }
        }
      return st.pop();
    }
    static boolean isOperator(String token){
        if(token == "+" || token == "-" || token == "*" ) return true;

      return false;
    }
}
