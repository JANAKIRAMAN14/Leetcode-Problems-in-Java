package Stack;
import java.util.*;
public class Stack {
    int [] arr ;
    int capacity ;
    int top ;
    Stack(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.top = -1;
    }
    void push(int data){
        if(isfull()) System.out.println("Stack is Full : ");

        else{
            arr[++top] = data;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack dont have element : ");
        }
      return arr[top--];
    }
    int peek(){
        if(isEmpty()) System.out.println("Stack dont hava the element : ");
        return arr[top];
    }
    boolean isEmpty(){
        if(top == -1) return true;
        return false;
    }
    boolean isfull(){
        if(top == capacity) return true;
        else return false;
    }

    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isfull());
    }
}
