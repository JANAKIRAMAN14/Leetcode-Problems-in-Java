package LinkedList.Doubly;
import java.util.*;
public class DoublyCreation {
    Node head;
    static class Node {
        int data;
        Node next;
        Node pre;

        Node (int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }
    }
    public void add(int data){
        Node newnode = new Node(data);
        if(head == null) {
            head = newnode;
            return ;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.pre = temp;
    }
    public void insertBegin(int data){
        Node insert = new Node(data);
        if(head == null){
            head = insert;
        }
        head.pre = insert;
        insert.next = head;
        head = insert;
    }
    public void display(){
        if(head == null) System.out.println("The Node is null : ");
        Node temp = head;
        System.out.println("The forward Traversal : ");
        while(temp != null){
            System.out.print(" " +temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    public void reverseTravesal(){
        if(head == null) System.out.println("The Node is null:");
        System.out.println("The reverse Traversal :");
        Node temp = head ;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println();
        while(temp != null){
            System.out.print(" " +temp.data);
            temp = temp.pre;
        }
    }

    public static void main(String[] args) {
        DoublyCreation doublyCreation = new DoublyCreation();

        doublyCreation.add(2);
        doublyCreation.add(2);
        doublyCreation.add(3);
        doublyCreation.add(4);

        doublyCreation.insertBegin(1);

        doublyCreation.display();
        doublyCreation.reverseTravesal();
    }
}
