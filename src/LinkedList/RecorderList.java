package LinkedList;
public class RecorderList {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data , Node next){
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        Node head = arrayToList(arr);
        Node head1 = recorderList(head);
        display(head1);
    }

    static Node recorderList(Node head){
        if (head == null || head.next == null) return head;

        Node slow = head;
        Node fast = head;

        // Find middle
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split and reverse second half
        Node second = reverse(slow.next);
        slow.next = null;
        Node first = head;

        Node dummy = new Node(-1);
        Node curr = dummy;

        // Merge alternately
        while(first != null && second != null){
            curr.next = first;
            curr = curr.next;
            first = first.next;

            curr.next = second;
            curr = curr.next;
            second = second.next;
        }

        // Attach any remaining nodes
        if (first != null) curr.next = first;
        if (second != null) curr.next = second;

        return dummy.next;
    }

    static Node reverse(Node head){
        Node prev = null;
        while(head != null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static Node arrayToList(int [] arr){
        Node head = new Node(arr[0]);
        Node move = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            move.next = temp;
            move = move.next;
        }
        return head;
    }

    static void display(Node head){
        if(head == null) {
            System.out.println("Empty List");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
