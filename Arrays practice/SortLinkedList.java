package com.handsOn;

import java.util.Scanner;

public class SortLinkedList {
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
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static Node sortLinkedList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node middle = getMiddle(head);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = sortLinkedList(head);
		Node right = sortLinkedList(nextOfMiddle);

		return merge(left, right);
	}

	public static Node getMiddle(Node head) {
		if (head == null) {
			return head;
		}

		Node slow = head, fast = head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node merge(Node left, Node right) {
		Node result = null;

		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}

		if (left.data <= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();
		sc.nextLine();

		for (int t = 0; t < numTests; t++) {
			head = null;
			while (true) {
				int data = sc.nextInt();
				if (data == -1) {
					break;
				}
				addNode(data);
			}

			head = sortLinkedList(head);

			traverse(head);
		}
		sc.close();
	}
}
