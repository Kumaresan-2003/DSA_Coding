package com.handson;
class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
class Operations1 {
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

    static Node swapPairs(Node head) {
        if (head == null || head.next == null) return head;
        Node dummy = new Node(0);
        dummy.next = head;
        Node current = dummy;
        
        while (current.next != null && current.next.next != null) {
            Node first = current.next;
            Node second = current.next.next;
            
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            current = first;
        }
        
        return dummy.next;
    }
}

public class swapPairs {
    public static void main(String[] args) {
        Operations ob = new Operations();

        int[] input = {1, 2, 3, 4};
        for (int i : input) ob.insertAtEnd(i);
        
        System.out.print("Original list: ");
        Operations.printList(Operations.head);

        Node newHead = Operations.swapPairs(Operations.head);
        
        System.out.print("Swapped list: ");
        Operations.printList(newHead);
    }
}

