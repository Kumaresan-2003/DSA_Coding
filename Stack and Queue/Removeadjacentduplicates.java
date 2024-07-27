package Com.handson;

import java.util.Scanner;

class ListNode {
	char data;
	ListNode next;

	public ListNode(char data) {
		this.data = data;
		next = null;
	}
}

class StackChar {
	ListNode top;

	public StackChar() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(char data) {
		ListNode newNode = new ListNode(data);
		if (isEmpty()) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return '\0';
		} else {
			char data = top.data;
			top = top.next;
			return data;
		}
	}

	public char peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return '\0';
		}
		return top.data;
	}
}

public class Removeadjacentduplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		StackChar stack = new StackChar();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}

		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
			result.append(stack.pop());
		}

		System.out.println("Final string: " + result.reverse());
	}
}
