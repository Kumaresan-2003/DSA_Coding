package Com.handson;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Deletenode {
    public static void main(String[] args) {
        Node head = null, tail = null;
        
        Node node1 = new Node(1);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node1;
        head = node1;
        tail = node3;
        
    
        int x = 3; 
        if (head != null) {
            Node prev = null;
            Node current = head;
            int count = 1;
            while (count < x) {
                prev = current;
                current = current.next;
                count++;
            }
            if (current == head) {
                head = head.next;
                tail.next = head;
            } else {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev; 
                }
            }
        }
        
       //Printing the modified circular linked list
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
