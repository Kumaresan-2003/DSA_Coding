package com.array;

class Node01 {
    int data;
    Node next;

    Node01(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SearchArray {
    Node head;

    // Method to search for a value in the linked list
    public int search(int K) {
        Node current = head;
        while (current != null) {
            if (current.data == K) {
                return 1;  // Node found
            }
            current = current.next;
        }
        return 0;  // Node not found
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
        SearchArray list = new SearchArray();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(7);
        list.addNode(9);

        System.out.print("Linked List: ");
        list.printList();

        int K = 5;
        int result = list.search(K);
        System.out.println("Search for " + K + ": " + result);

        K = 4;
        result = list.search(K);
        System.out.println("Search for " + K + ": " + result);
    }
}
