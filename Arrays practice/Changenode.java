package com.handsOn;

import java.util.Scanner;

public class Changenode {
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
		System.out.print("Head->");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static Node changeStartNodeFromEnd(Node head, int k) {
		Node temp = new Node(0);
		temp.next = head;
		Node first = temp;
		Node second = temp;

		for (int i = 0; i <= k; i++) {
			first = first.next;
		}

		while (first != null) {
			first = first.next;
			second = second.next;
		}

		Node newHead = second.next;
		second.next = null;

		Node current = newHead;
		while (current.next != null) {
			current = current.next;
		}
		current.next = temp.next;

		return newHead;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(data);
		}
		int n = sc.nextInt();

		head = changeStartNodeFromEnd(head, n);

		traverse();
		sc.close();
	}
}
