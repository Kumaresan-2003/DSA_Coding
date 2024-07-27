package Com.handson;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert a new node at a specific position
    public void insertAtPosition(int pos, int val) {
        Node newNode = new Node(val);
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr != null && --pos > 1) {
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Invalid position");
        } else {
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class InsertionMiddle {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtPosition(1, 1);
        list.insertAtPosition(1, 2);
        list.insertAtPosition(2, 3);
        list.insertAtPosition(1, 4);
        list.printList(); 

        list.insertAtPosition(3, 5);
        list.printList(); 
    }
}
