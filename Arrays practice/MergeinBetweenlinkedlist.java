package com.handsOn;

import java.util.Scanner;

public class MergeinBetweenlinkedlist {
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

	public static Node mergeInBetween(Node list1, int a, int b, Node list2) {
		Node dummy = new Node(0);
		dummy.next = list1;
		Node prevA = dummy;
		for (int i = 0; i < a; i++) {
			prevA = prevA.next;
		}

		Node nodeB = prevA;
		for (int i = 0; i <= (b - a + 1); i++) {
			nodeB = nodeB.next;
		}

		prevA.next = list2;
		Node current = list2;
		while (current.next != null) {
			current = current.next;
		}
		current.next = nodeB;

		return dummy.next;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		head1 = null;
		head2 = null;

		System.out.println("Enter elements of the first list (-1 to end):");
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(head1, data);
		}

		System.out.println("Enter elements of the second list (-1 to end):");
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(head2, data);
		}

		System.out.println("Enter the values of a and b:");
		int a = sc.nextInt();
		int b = sc.nextInt();

		Node result = mergeInBetween(head1, a, b, head2);
		System.out.println("Merged list:");
		traverse(result);

		sc.close();
	}
}
