package com.handsOn;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	public Node prev;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class MiddleofLL {
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
		Node middle = getMiddle();
// System.out.println(getMiddle());
		printFromCurrentNode(middle);
		sc.close();
	}

	private static int getLength() {
		int length = 0;
		Node current = head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	private static Node getMiddle() {
		int len = getLength();
		Node current = head;
		for (int i = 0; i < len / 2; i++) {
			current = current.next;
		}
		return current;
	}

	private static void printFromCurrentNode(Node node) {
		Node current = node;
		System.out.print("Head->");
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
}
