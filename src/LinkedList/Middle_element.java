package LinkedList;
import java.util.*;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

public class Middle_element {

    // Function to insert elements into the linked list
    static ListNode insert(int[] arr) {
        if (arr.length == 0) return null; // Handle empty array case
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // Function to find and print the middle element of the linked list
    static void middle(ListNode head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.data);
    }

    // Function to traverse and print the linked list
    static void traverse(ListNode head) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Number of elements should be greater than 0.");
            sc.close();
            return;
        }

        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ListNode head = insert(arr);

        System.out.println("Linked List:");
        traverse(head);

        System.out.println("Finding middle node:");
        middle(head);

        sc.close(); // Closing the scanner to avoid memory leak
    }
}
