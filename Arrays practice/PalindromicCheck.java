package com.handsOn;

import java.util.Scanner;

public class PalindromicCheck {
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
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static boolean isPalindrome(Node head) {
		if (head == null || head.next == null) {
			return true;
		}

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		Node secondHalf = reverseList(slow);
		Node firstHalf = head;

		while (secondHalf != null) {
			if (firstHalf.data != secondHalf.data) {
				return false;
			}
			firstHalf = firstHalf.next;
			secondHalf = secondHalf.next;
		}

		return true;
	}

	private static Node reverseList(Node head) {
		Node prev = null;
		Node current = head;

		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			head = null;
			while (true) {
				int data = sc.nextInt();
				if (data == -1) {
					break;
				}
				addNode(data);
			}

			boolean result = isPalindrome(head);
			System.out.println(result ? "True" : "False");
			if (!sc.hasNext()) {
				break;
			}
		}
		sc.close();
	}
}