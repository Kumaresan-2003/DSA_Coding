package com.handsOn;

import java.util.Scanner;

public class AddTwoNumbers {
	private static Node head1;
	private static Node head2;

	public static Node createNode(int data) {
		return new Node(data);
	}

	public static void addNode(Node head, int data) {
		Node newNode = createNode(data);
		if (head == null) {
			if (head1 == null) {
				head1 = newNode;
			} else {
				head2 = newNode;
			}
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

	public static Node addTwoNumbers(Node l1, Node l2) {
		Node dummyHead = new Node(0);
		Node p = l1, q = l2, current = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.data : 0;
			int y = (q != null) ? q.data : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			current.next = new Node(sum % 10);
			current = current.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			current.next = new Node(carry);
		}
		return dummyHead.next;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(head1, data);
		}

		while (true) {
			int data = sc.nextInt();
			if (data == -1) {
				break;
			}
			addNode(head2, data);
		}

		Node result = addTwoNumbers(head1, head2);
		traverse(result);

		sc.close();
	}
}
