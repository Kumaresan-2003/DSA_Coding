package Com.handson;

class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head, tail;

    // Method to insert a node at a specific position
    public void insertAtPosition(int pos, int val) {
        Node newNode = new Node(val);
        if (pos < 0) {
            System.out.println("Invalid position");
            return;
        }
        if (pos == 0) {
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }
        Node curr = head;
        int count = 0;
        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }
        if (curr == null) {
            System.out.println("Invalid position");
        } else {
            newNode.next = curr.next;
            newNode.prev = curr;
            if (curr.next != null) {
                curr.next.prev = newNode;
            }
            curr.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
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

public class InsertioninDLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

      
        list.insertAtPosition(0, 0);
        list.insertAtPosition(1, 2);
        list.insertAtPosition(2, 3);
        list.insertAtPosition(3, 4);
        list.printList();

       
        list.insertAtPosition(5, 5);
        list.printList(); 
    }
}
