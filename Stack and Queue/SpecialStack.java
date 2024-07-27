package Com.handson;

import java.util.Scanner;

public class SpecialStack {
	private int top;
	private int capacity;
	private int[] stack;
	int min = Integer.MAX_VALUE;

	public SpecialStack(int size) {
		this.capacity = size;
		this.top = -1;
		this.stack = new int[capacity];
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top == capacity - 1) {
			return true;
		}
		return false;
	}

	public void push(int data) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			if (data < min)
				min = data;
			stack[++top] = data;
			System.out.println("Pushed: " + data);
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Popped: " + stack[top--]);
		}
	}

	public void peek() {
		if (isEmpty())
			System.out.println("Stack is empty");
		else {
			System.out.println("Peeked: " + stack[top]);
		}
	}

	public void display() {
		if (isEmpty())
			System.out.println("Stack is empty");
		else {
			System.out.print("Stack elements are: ");
			for (int i = top; i >= 0; i--) {
				System.out.print(stack[i] + " ");
			}
			System.out.println();
		}
	}

	public void getmin() {
		if (isEmpty())
			System.out.println("Stack is empty");
		else {
			System.out.println("Minimum element is: " + min);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the stack: ");
		int s = sc.nextInt();
		SpecialStack specialStack = new SpecialStack(s);
		boolean flag = true;
		do {
			System.out.println("STACK OPERATIONS : ");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Get Minimum");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the element to be pushed: ");
				specialStack.push(sc.nextInt());
				break;
			case 2:
				specialStack.pop();
				break;
			case 3:
				specialStack.peek();
				break;
			case 4:
				specialStack.display();
				break;
			case 5:
				specialStack.getmin();
				break;
			case 6:
				flag = false;
				System.out.println("Exiting . . .");
				break;
			default:
				System.out.println("Enter the valid choice");
			}
		} while (flag);
	}
}
