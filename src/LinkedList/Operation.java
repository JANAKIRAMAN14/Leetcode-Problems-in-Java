package LinkedList;
import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;
import java.util.*;
public class Operation {
    Node head = null;
    static class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public Node(int data){
            this.data =data;
        }
    }
    void insert(int data){
        Node newnode = new Node(data);
        if(head ==  null){
            head = newnode;
            return;
        }
        Node ptr = head;
        while(ptr.next != null){
            ptr = ptr.next;
        }
        ptr.next = newnode;

    }
    void insertBegin(int data){
        Node begin = new Node(data);
        begin.next = head;
        head = begin;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp =temp.next;
        }
    }
    public static void main(String[] args) {
        Operation operation = new Operation();
        operation.insert(1);
        operation.insert(2);
        operation.insert(3);
        operation.insertBegin(6);

        operation.display();
    }
}
