package Com.handson;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionofCLL {
    public static void main(String[] args) {
        Node head = null, tail = null;
        
        // Example 1: Creating circular linked list with nodes 1, 2, 3
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // Circular linking
        head = node1;
        tail = node3;
        
        // Deleting the first node
        if (head != null) {
            head = head.next;
            tail.next = head; // Update tail to point to the new head for circular linkage
        }
        
        // Printing the modified circular linked list
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
