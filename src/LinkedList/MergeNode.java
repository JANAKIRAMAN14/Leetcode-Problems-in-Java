package LinkedList;
import java.util.*;
public class MergeNode {
    static class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.data = data;
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

    static Node mergenode(Node head , Node head1){
        Node returnnode = new Node(Integer.MIN_VALUE); // Dummy node
        Node headnode = returnnode;
        Node li1 = head;
        Node li2 = head1;

        while (li1 != null && li2 != null) {
            if (li1.data < li2.data) {
                returnnode.next = li1;
                li1 = li1.next;
            } else {
                returnnode.next = li2;
                li2 = li2.next;
            }
            returnnode = returnnode.next;
        }

        // Append the remaining nodes
        if (li1 != null) returnnode.next = li1;
        if (li2 != null) returnnode.next = li2;

        return headnode.next; // Skip dummy node and return real head
    }
    static Node rotate (Node head4){
       Node cur = head4;
       Node pre = null;
        while(cur != null){
            Node next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int [] arr = {1,3,5,7};
        int [] arr1 = {2,4,6};
        //int n = sc.nextInt();
//        Node head1 = array2link(arr1);
//        Node head2 = mergenode(head,head1);
//        display(head2);

            Node head = array2link(arr);
            Node list = rotate(head);

            display(list);
        }
    }

