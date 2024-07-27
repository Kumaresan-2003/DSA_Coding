package com.array;

class Node02 {
    int data;
    Node next;

    Node02(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteAtEnd {
    Node head;
    public Node deleteAtEnd() {
        if (head == null) {
            // List is empty
            return null;
        } else if (head.next == null) {
            head = null;
            return head;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            return head;
        }
    }

    // Helper method to add a node at the end of the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Helper method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAtEnd list = new DeleteAtEnd();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);

        System.out.print("Original List: ");
        list.printList();

        list.deleteAtEnd();

        System.out.print("Updated List: ");
        list.printList();
    }
}
