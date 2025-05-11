package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Order_duplicates {
    Node head;

    // Remove duplicates from sorted linked list
    void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // Skip duplicate
            } else {
                current = current.next;
            }
        }
    }

    // Corrected insert method
    void insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) { // FIX: Traverse correctly
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    void display() {
        Node temp = head;
        if (head == null) {
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order_duplicates od = new Order_duplicates();

        System.out.println("Enter numbers (-1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            od.insert(num);
        }

        System.out.println("Original List:");
        od.display();

        od.removeDuplicates();

        System.out.println("List after removing duplicates:");
        od.display();

        sc.close();
    }
}
