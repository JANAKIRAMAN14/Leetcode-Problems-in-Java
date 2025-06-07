package LinkedList;
import java.util.*;
public class RotateList {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = next;
        }
        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k = 3;
        Node head = arrayToList(arr);
        Node List = rotateList(head,k);
        display(List);
    }
    static Node arrayToList(int [] arr){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = move.next;
        }
        return head;
    }
    static Node rotateList(Node head,int k){
        if(head == null || head.next == null || k == 0) return head;
        Node temp = head;
        int len = 1 ;
        while (temp.next != null){
            temp = temp.next;
            len++;
        }
        temp.next = head;
        k = k % len;
        k = len - k;
        while(k > 0){
            temp = temp.next;
            k--;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
    static void display(Node head){
        if(head == null) System.out.println("Empty List: ");
        Node temp = head;
        while (temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
}
