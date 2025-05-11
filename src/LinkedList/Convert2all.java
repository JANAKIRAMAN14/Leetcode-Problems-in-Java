package LinkedList;

public class Convert2all {
    static class Node1 {
        int data;
        Node1 next;

        Node1(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node head = convert(arr);
        traverse(head);
    }
    static Node convert(int [] arr){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i = 1 ; i < n ; i++) {
            Node temp = new Node(arr[i]);
            move.next = temp;
        }
        return head;
    }
    static void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
