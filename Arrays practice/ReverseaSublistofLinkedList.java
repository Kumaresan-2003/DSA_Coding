package com.handsOn;

import java.util.Scanner;

public class ReverseaSublistofLinkedList {
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

	private static void traverse() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static Node reverseSublist(Node head, int x, int y) {
		if (x == y)
			return head;

		Node temp = new Node(0);
		temp.next = head;
		Node preX = temp;

		for (int i = 1; i < x; i++) {
			preX = preX.next;
		}

		Node curr = preX.next;
		Node prev = null;
		for (int i = x; i <= y; i++) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		preX.next.next = curr;
		preX.next = prev;

		return temp.next;
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

			int x = sc.nextInt();
			int y = sc.nextInt();

			head = reverseSublist(head, x, y);

			traverse();
		}
	}
}
