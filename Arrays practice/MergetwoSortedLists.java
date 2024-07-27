package com.handsOn;

import java.util.Scanner;

public class MergetwoSortedLists {
	private static Node head1;
	private static Node head2;

	public static Node createNode(int data) {
		return new Node(data);
	}

	public static void addNode(Node head, int data) {
		Node newNode = createNode(data);
		if (head == null) {
			if (head1 == null) {
				head1 = newNode;
			} else {
				head2 = newNode;
			}
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

	public static Node mergeTwoLists(Node list1, Node list2) {
		Node dummy = new Node(0);
		Node tail = dummy;

		while (list1 != null && list2 != null) {
			if (list1.data <= list2.data) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}
			tail = tail.next;
		}

		if (list1 != null) {
			tail.next = list1;
		} else {
			tail.next = list2;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		head1 = null;
		head2 = null;

		System.out.println("Enter elements of the first sorted list (-1 to end):");
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(head1, data);
		}

		System.out.println("Enter elements of the second sorted list (-1 to end):");
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(head2, data);
		}

		Node result = mergeTwoLists(head1, head2);
		System.out.println("Merged sorted list:");
		traverse(result);

		sc.close();
	}
}
