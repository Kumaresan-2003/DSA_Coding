package Com.handson;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LengthofCLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null, tail = null;
        
        // Input handling
        System.out.print("Enter integers separated by space (end with -1): ");
        while (true) {
            int num = scanner.nextInt();
            if (num == -1)
                break;
            Node newNode = new Node(num);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        scanner.close();
        
        if (head != null) {
            tail.next = head;
        }
      
        int length = 0;
        Node current = head;
        do {
            length++;
            current = current.next;
        } while (current != head);
        
        // Printing the length
        System.out.println("Length of the circular linked list: " + length);
    }
}
