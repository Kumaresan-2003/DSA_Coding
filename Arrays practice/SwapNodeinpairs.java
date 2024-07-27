package com.handsOn;

import java.util.Scanner;

public class SwapNodeinpairs {
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

	public static Node swapPairs(Node head) {
		if (head == null || head.next == null) {
			return head;
		}

		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;

		while (head != null && head.next != null) {
			Node firstNode = head;
			Node secondNode = head.next;

			firstNode.next = secondNode.next;
			secondNode.next = firstNode;
			prev.next = secondNode;

			prev = firstNode;
			head = firstNode.next;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		head = null;

		System.out.println("Enter elements of the list (-1 to end):");
		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(data);
		}

		head = swapPairs(head);
		System.out.println("List after swapping pairs:");
		traverse(head);

		sc.close();
	}
}
