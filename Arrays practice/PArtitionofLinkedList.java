package com.handsOn;

import java.util.Scanner;


public class PArtitionofLinkedList {
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

	public static Node partition(Node head, int x) {
		Node lessHead = new Node(0); // Dummy head for less than x list
		Node greaterHead = new Node(0); // Dummy head for greater than or equal to x list
		Node less = lessHead;
		Node greater = greaterHead;

		while (head != null) {
			if (head.data < x) {
				less.next = head;
				less = less.next;
			} else {
				greater.next = head;
				greater = greater.next;
			}
			head = head.next;
		}

		greater.next = null; // End the greater list
		less.next = greaterHead.next; // Combine the two lists

		return lessHead.next;
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

		System.out.println("Enter the partition value x:");
		int x = sc.nextInt();

		head = partition(head, x);
		System.out.println("List after partitioning:");
		traverse(head);

		sc.close();
	}
}
