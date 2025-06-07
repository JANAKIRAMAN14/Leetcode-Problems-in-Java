package array;

import java.util.Stack;

public class Celibrity {
    public static void main(String[] args) {
        int n = 3;
        int [][] arr = {{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(findCelebrity(arr,n));
    }
    static int findCelebrity(int[][]arr , int n){
        Stack <Integer>  st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            st.push(i);
        }
        while(st.size() >= 2){
            int a = st.pop();
            int b = st.pop();
            if(arr[a][b] == 1) st.push(b);
            else st.push(a);
        }
        int pc = st.pop();
        for(int i = 0 ; i < n ; i++){
            if(pc != i)
            if(arr[pc][i] == 1 || arr[i][pc] == 0 ){
                return -1;
            }
        }
       return pc;
    }
}
