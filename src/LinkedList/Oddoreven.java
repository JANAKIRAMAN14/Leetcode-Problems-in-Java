package LinkedList;
import java.util.Scanner;

public class Oddoreven {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to create a linked list from an array
    private static Node insert(int[] arr) {
        if (arr.length == 0) return null;  // Handle empty input case

        Node head = new Node(arr[0]);
        Node move = head;
        for (int i = 1; i < arr.length; i++) {  // Start from index 1 to avoid duplicate head
            move.next = new Node(arr[i]);
            move = move.next;
        }
        return head;
    }

    // Method to rearrange linked list by odd and even positions
    private static Node oddOrEven(Node head) {
        if(head == null || head.next == null ){
            return head;
        }
       Node odd = head;
       Node even = head.next;
       Node evenhead = head.next;
       while(odd.next != null){
           odd.next=odd.next.next;
           even.next = even.next.next;

           odd = odd.next;
           even = even.next;

       }
       odd.next = evenhead;
       return head;
    }

    // Method to display the linked list
    private static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = insert(arr);

        System.out.println("\nOriginal Linked List:");
        display(head);

        head = oddOrEven(head);

        System.out.println("\nRearranged Linked List:");
        display(head);

        sc.close();
    }
}
