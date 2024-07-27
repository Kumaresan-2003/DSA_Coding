package com.handsOn;

import java.util.Scanner;

public class DetectandRemoveCycle {
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

	public static boolean detectAndRemoveCycle(Node head) {
		if (head == null || head.next == null) {
			return false;
		}

		Node slow = head, fast = head;
		boolean cycleExists = false;

// Detecting cycle using Floyd's Tortoise and Hare algorithm
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				cycleExists = true;
				break;
			}
		}

// If cycle exists, remove it
		if (cycleExists) {
			slow = head;
			Node prev = null;
			while (slow != fast) {
				prev = fast;
				slow = slow.next;
				fast = fast.next;
			}
// prev now points to the last node in the cycle
			prev.next = null;
		}

		return cycleExists;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // Number of test cases

		while (t-- > 0) {
			head = null;
// System.out.println("Enter elements of the list (-1 to end):");
			while (true) {
				int data = sc.nextInt();
				if (data == -1) {
					break;
				}
				addNode(data);
			}

// Optional: Create a cycle for testing
// System.out.println("Enter position to create a cycle (-1 for no cycle):");
			int pos = sc.nextInt();
			if (pos != -1) {
				Node current = head;
				Node cycleNode = null;
				int index = 0;
				while (current.next != null) {
					if (index == pos) {
						cycleNode = current;
					}
					current = current.next;
					index++;
				}
				current.next = cycleNode;
			}

			boolean cycleDetected = detectAndRemoveCycle(head);
			System.out.println(cycleDetected);
// System.out.println("List after removing cycle:");
			traverse(head);
		}

		sc.close();
	}
}
