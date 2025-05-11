package LinkedList;
import java.util.*;

public class Array2list {
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

    // Corrected inserttail method
    private static Node inserttail(int k, Node head) {
        Node newnode = new Node(k);  // Create new node without linking it prematurely

        if (head == null) {  // If the list is empty, new node becomes the head
            return newnode;
        }

        Node temp = head;
        while (temp.next != null) {  // Traverse until last node
            temp = temp.next;
        }

        temp.next = newnode;  // Attach new node at the end
        return head;
    }

    private static Node inserthead(int k, Node head) {
        return new Node(k, head); // Directly return the new head
    }

    private static Node convert2all(int[] arr) {
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

    private static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // Read size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // Read array elements
        }

        int k = sc.nextInt();  // Read new tail element

        Node head = convert2all(arr);  // Convert array to linked list
        head = inserttail(k, head);  // Insert new node at the tail
        display(head);  // Display updated linked list

        sc.close();
    }
}
