package Com.handson;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedListDeleteEnd {
    public static void main(String[] args) {
        Node head = null, tail = null;
        
        Node node1 = new Node(1);
        Node node2 = new Node(5);
        Node node3 = new Node(2);
        Node node4 = new Node(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;
        head = node1;
        tail = node4;
        
       
        if (head != null) {
            Node current = head;
            Node prev = null;
            while (current.next != head) {
                prev = current;
                current = current.next;
            }
            if (prev != null) {
                prev.next = head;
            } else {
                head = null; 
            }
            tail = prev;
        }
        
     
        System.out.print("List after deletion: ");
        if (head != null) {
            Node current = head;
            do {
                System.out.print(current.data + " -> ");
                current = current.next;
            } while (current != head);
        }
        System.out.println("null");
    }
}
