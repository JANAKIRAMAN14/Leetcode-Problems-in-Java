package LinkedList;
import java.util.*;
public class Removeduplicatess {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,5};
        Node head = arrayToList(arr);
      Node head1 =  removeDuplicates(head);
      display(head1);
    }
    static class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
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
    static Node removeDuplicates(Node head){
        Node merge = new Node(Integer.MIN_VALUE);
        Node cur = head;
        Node pre = null;
        while(cur != null && cur != null){
            if(cur.data == cur.next.data){
               cur = cur.next.next;
            }
            else{
                pre = cur ;
                cur = cur.next;
                merge.next = pre;
            }
        }
        return merge.next;
    }
    static void display (Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
