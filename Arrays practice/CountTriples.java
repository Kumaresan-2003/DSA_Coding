package com.handsOn;

import java.util.Scanner;

public class CountTriples {
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
			newNode.prev = current;
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

	public static int countTriplets(Node head, int x) {
		if (head == null) {
			return 0;
		}

		int count = 0;

		Node current = head;
		while (current != null) {
			Node left = current.next;
			Node right = getTail(current);

			while (left != null && right != null && left != right && left.prev != right) {
				int sum = current.data + left.data + right.data;
				if (sum == x) {
					count++;
					left = left.next;
					right = right.prev;
				} else if (sum < x) {
					left = left.next;
				} else {
					right = right.prev;
				}
			}

			current = current.next;
		}

		return count;
	}

	private static Node getTail(Node head) {
		while (head.next != null) {
			head = head.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numTests = sc.nextInt();
		for (int t = 0; t < numTests; t++) {
			head = null;
			int x = sc.nextInt();
			while (true) {
				int data = sc.nextInt();
				if (data == -1) {
					break;
				}
				addNode(data);
			}

			int result = countTriplets(head, x);
			System.out.println(result);
		}
		sc.close();
	}
}
