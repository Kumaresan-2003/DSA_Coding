package com.handson;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Operations {
    public static Node head;

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node reverseSublist(Node head, int X, int Y) {
        if (X == Y) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node beforeX = dummy;
        for (int i = 1; i < X; i++) beforeX = beforeX.next;
        Node curr = beforeX.next, prev = null;
        for (int i = X; i <= Y; i++) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        beforeX.next.next = curr;
        beforeX.next = prev;
        return dummy.next;
    }
}

public class Sublist {
    public static void main(String[] args) {
        Operations ob = new Operations();

        int[] input = {10, 20, 30, 40, 50, 60};
        for (int i : input) ob.insertAtEnd(i);
        
        ob.head = Operations.reverseSublist(ob.head, 2, 5);
        Operations.printList(ob.head); // Output: 10 50 40 30 20 60
    }
}
