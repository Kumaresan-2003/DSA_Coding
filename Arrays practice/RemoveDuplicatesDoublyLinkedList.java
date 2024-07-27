package com.handsOn;

import java.util.Scanner;

public class RemoveDuplicatesDoublyLinkedList {
	private static Node head;

	public static Node createNode(int data) {
		return new Node(data);
	}

	public static void addNode(int data) {
		Node newNode = createNode(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
	}

	private static void traverse(Node head) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static Node removeDuplicates(Node head) {
		if (head == null)
			return null;

		Node current = head;
		while (current != null) {
			Node nextNode = current.next;
			while (nextNode != null && nextNode.data == current.data) {
				nextNode = nextNode.next;
			}
			current.next = nextNode;
			if (nextNode != null) {
				nextNode.prev = current;
			}
			current = nextNode;
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		head = null;

		System.out.println("Enter the number of elements in the list:");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the list:");
		for (int i = 0; i < n; i++) {
			int data = sc.nextInt();
			addNode(data);
		}

		System.out.println("Original list:");
		traverse(head);

		head = removeDuplicates(head);

		System.out.println("List after removing duplicates:");
		traverse(head);

		sc.close();
	}
}
