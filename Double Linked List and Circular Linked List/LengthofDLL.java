package Com.handson;
class Node {
    int data;
    Node next, prev;
    Node(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class DoublyLinkedList11 {
    Node head;
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public int length() {
        Node temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
}

public class LengthofDLL {
    public static void main(String[] args) {
        DoublyLinkedList11 dll = new DoublyLinkedList11();
        int[] nodesData = {3, 4, 5, 2, 6, 1, 9};
        for (int data : nodesData) {
            dll.insertAtEnd(data);
        }
        System.out.println("Length of the doubly linked list: " + dll.length());
    }
}
