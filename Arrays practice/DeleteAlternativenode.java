package com.handsOn;

import java.util.Scanner;


public class DeleteAlternativenode {
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

	public static void deleteAlternateNodes(Node head) {

		Node cur = head;

		while (cur != null && cur.next != null) {

			cur.next = cur.next.next;

			cur = cur.next;

		}
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
		traverse();
		deleteAlternateNodes(head);
		traverse();
		sc.close();
	}
}
