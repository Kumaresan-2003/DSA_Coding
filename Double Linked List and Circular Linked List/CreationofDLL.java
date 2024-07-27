package Com.handson;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head;

    public void append(int data) {
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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class CreationofDLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Enter integers:");
        int ct= scanner.nextInt();
        int i=0;
        while (i<ct) {
            int data = scanner.nextInt();
            i++;
            list.append(data);
        }

        System.out.println("Doubly Linked List:");
        list.printList();


        Node head = list.head;
        System.out.println("Head of the list: " + (head != null ? head.data : "List is empty"));
    }
}
