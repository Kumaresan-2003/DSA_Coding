package com.handsOn;

import java.util.Scanner;

public class DivideList {
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

	public static Node[] divideList(Node head) {
		if (head == null || head.next == null) {
			return new Node[] { head, null };
		}

		Node firstList = null, secondList = null;
		Node firstTail = null, secondTail = null;
		Node current = head;
		boolean alternate = true;

		while (current != null) {
			if (alternate) {
				if (firstList == null) {
					firstList = current;
					firstTail = current;
				} else {
					firstTail.next = current;
					firstTail = firstTail.next;
				}
			} else {
				if (secondList == null) {
					secondList = current;
					secondTail = current;
				} else {
					secondTail.next = current;
					secondTail = secondTail.next;
				}
			}
			alternate = !alternate;
			current = current.next;
		}

		if (firstTail != null)
			firstTail.next = null;
		if (secondTail != null)
			secondTail.next = null;

		return new Node[] { firstList, secondList };
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

			Node[] result = divideList(head);

			traverse(result[0]);
			traverse(result[1]);
		}
		sc.close();
	}
}
