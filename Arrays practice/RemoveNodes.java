package com.array;

class Node01 {
	int data;
	Node next;

	Node01(int data) {
		this.data = data;
		this.next = null;
	}
}

public class RemoveNodes {
	Node head;

	public void removeElements(int val) {
		Node temp = new Node(0);
		temp.next = head;
		Node current = temp;

		while (current.next != null) {
			if (current.next.data == val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		head = temp.next;
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
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		RemoveNodes list = new RemoveNodes();
		list.addNode(1);
		list.addNode(2);
		list.addNode(6);
		list.addNode(3);
		list.addNode(4);
		list.addNode(5);
		list.addNode(6);

		System.out.print("Original List: ");
		list.printList();

		list.removeElements(6);

		System.out.print("Updated List: ");
		list.printList();
	}
}
