package com.handsOn;

import java.util.Scanner;

public class RemoveDuplicateNodesfromSortedLinkedList {
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
		}
	}

	private static void traverse(Node head) {
		if (head == null) {
			System.out.print("null");
		} else {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}
		System.out.println();
	}

	public static Node removeDuplicates(Node head) {
		if (head == null) {
			return null;
		}

		Node current = head;
		while (current != null && current.next != null) {
			if (current.data == current.next.data) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		head = null;

		System.out.println("Enter elements of the sorted list (-1 to end):");
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(data);
		}

		head = removeDuplicates(head);
		System.out.println("List after removing duplicates:");
		traverse(head);

		sc.close();
	}
}
