package LinkedList;
import java.util.*;
public class LinkedCycleFloyd {
    static class Node{
        Node single = null;
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    static Node array2link (int [] arr){
       Node head = new Node(arr[0]);
       Node move = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = move.next;
        }
        return head;
    }
    static void display(Node head){
         Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
   static Node mergeNode(Node head , Node head1){
        Node returnNode = new Node(Integer.MIN_VALUE);
        Node headNode = returnNode;
        Node  li1 = head;
        Node li2 = head1;
        while(li1 != null && li2 != null){
            if(li1.data < li2.data){
                returnNode.next =  li1;
                returnNode = returnNode.next;
                li1 = li1.next;
            }
            else{
                returnNode.next = li2;
                returnNode = returnNode.next;
                li2 = li2.next;
            }
        }
        if(li1 !=  null ) returnNode.next = li1;
        if(li2 != null) returnNode.next = li2;
        return headNode.next;
   }
    static boolean floyds(Node head){
        if(head == null) return false;
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arr1 = {1,4,5,6,7,9};

        Node head = array2link(arr);
        Node head1 = array2link(arr1);

        Node res = mergeNode(head,head1);

        display(res);
    }
}
