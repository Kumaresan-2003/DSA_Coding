package com.handsOn;

import java.util.Scanner;

public class OddEvenLinkedList {
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

	public static Node oddEvenList(Node head) {
		if (head == null)
			return null;

		Node odd = head;
		Node even = head.next;
		Node evenHead = even;

		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;

		return head;
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

		Node result = oddEvenList(head);
		traverse(result);

		sc.close();
	}
}
