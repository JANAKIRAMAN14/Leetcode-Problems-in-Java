package LinkedList;
import java.util.*;
public class AddTwoNumber {
    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node arrayToNode( int []arr ){
        if (arr.length == 0) return null; // Handle empty array case

        Node head = new Node(arr[0]);
            Node move = head;
        for (int i = 1; i < arr.length; i++) {
           Node temp = new Node(arr[i]);
            move.next = temp;
            move = temp;
        }
        return head;
    }
    static Node addTwoNumber(Node li1 , Node li2) {
        Node head = new Node(0);
        Node cur = head;
        Node temp1 = li1;
        Node temp2 = li2;
        int carry = 0;
        while (temp1 != null || temp2 != null || carry > 0) {
            int sum = carry;
            if (temp1 != null) {
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if (temp2 != null) {
                sum += temp2.data;
                temp2 = temp2.next;
            }
            Node newnode = new Node(sum % 10);
            carry = sum / 10;
            cur.next = newnode;
            cur = cur.next;

        }
        return head.next;
    }
    static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(" "+temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
     int[] arr = {1,2,3,4};
     int[] arr1 = {1,2,3,4};

     Node head = arrayToNode(arr);
     Node head1 = arrayToNode(arr1);
     Node res = addTwoNumber(head,head1);
     display(res);

    }
}
