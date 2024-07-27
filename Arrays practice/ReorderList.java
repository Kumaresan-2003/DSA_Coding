package com.handsOn;

import java.util.Scanner;

public class ReorderList {
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

	public static void reorderList(Node head) {
		if (head == null || head.next == null)
			return;

// Step 1: Find the middle of the linked list
		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

// Step 2: Reverse the second half of the linked list
		Node prev = null, curr = slow, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

// Step 3: Merge the two halves
		Node first = head, second = prev;
		while (second.next != null) {
			Node temp1 = first.next;
			Node temp2 = second.next;
			first.next = second;
			second.next = temp1;
			first = temp1;
			second = temp2;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		head = null;
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(data);
		}

		reorderList(head);
		traverse(head);

		sc.close();
	}
}
