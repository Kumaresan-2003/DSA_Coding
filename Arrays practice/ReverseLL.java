package com.array;

class Node03 {
	int data;
	Node next;

	Node03(int data) {
		this.data = data;
		this.next = null;
	}
}

public class ReverseLL {
	Node head;

	// Method to reverse the linked list
	public Node reverseList() {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		head = prev;
		return head;
	}

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

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		ReverseLL list = new ReverseLL();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);

		System.out.print("Original List: ");
		list.printList();

		list.reverseList();

		System.out.print("Reversed List: ");
		list.printList();
	}
}
