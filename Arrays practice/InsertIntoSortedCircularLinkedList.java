package com.handsOn;

public class InsertIntoSortedCircularLinkedList {

	public static Node insert(Node head, int insertVal) {
		Node newNode = new Node(insertVal);
		if (head == null) {
			newNode.next = newNode;
			return newNode;
		}

		Node current = head;
		while (true) {
// Case 1: Node should be placed between two nodes
			if (current.data <= insertVal && insertVal <= current.next.data) {
				break;
			}

// Case 2: Node should be placed at the end of the list
			if (current.data > current.next.data && (insertVal >= current.data || insertVal <= current.next.data)) {
				break;
			}

// Move to the next node
			current = current.next;

// Case 3: Completed a full circle
			if (current == head) {
				break;
			}
		}

		newNode.next = current.next;
		current.next = newNode;
		return head;
	}

	private static void traverse(Node head) {
		if (head == null) {
			System.out.print("null");
			return;
		}
		Node current = head;
		do {
			System.out.print(current.data + " ");
			current = current.next;
		} while (current != head);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Node head = null;
		System.out.println("Enter elements of the circular linked list (-1 to end):");
		int data;
		while ((data = sc.nextInt()) != -1) {
			if (head == null) {
				head = new Node(data);
				head.next = head;
			} else {
				Node newNode = new Node(data);
				Node current = head;
				while (current.next != head) {
					current = current.next;
				}
				newNode.next = head;
				current.next = newNode;
			}
		}

		System.out.println("Enter the value to insert:");
		int insertVal = sc.nextInt();

		head = insert(head, insertVal);
		System.out.println("List after insertion:");
		traverse(head);

		sc.close();
	}
}
