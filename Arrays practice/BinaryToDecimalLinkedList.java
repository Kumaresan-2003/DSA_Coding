package com.handsOn;

import java.util.Scanner;

public class BinaryToDecimalLinkedList {
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

	public static int getDecimalValue(Node head) {
		int decimalValue = 0;
		Node current = head;

		while (current != null) {
			decimalValue = (decimalValue << 1) | current.data;
			current = current.next;
		}

		return decimalValue;
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

		int result = getDecimalValue(head);
		System.out.println(result);

		sc.close();
	}
}
