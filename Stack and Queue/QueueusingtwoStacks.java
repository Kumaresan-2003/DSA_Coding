package Com.handson;

import java.util.Scanner;
import java.util.Stack;

public class QueueusingtwoStacks {
	private static Stack<Integer> stack1 = new Stack<>();
	private static Stack<Integer> stack2 = new Stack<>();

	public static void enqueue(int x) {
		stack1.push(x);
	}

	public static int dequeue() {
		if (stack1.isEmpty() && stack2.isEmpty()) {
			return -1;
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.pop();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		do {
			System.out.println("QUEUE OPERATIONS:");
			System.out.println("1. ENQUEUE");
			System.out.println("2. DEQUEUE");
			System.out.println("3. STOP");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter the element: ");
				enqueue(sc.nextInt());
				break;
			case 2:
				int dequeuedElement = dequeue();
				if (dequeuedElement == -1) {
					System.out.println("Queue is empty.");
				} else {
					System.out.println("Dequeued element: " + dequeuedElement);
				}
				break;
			case 3:
				System.out.println("Exiting...");
				flag = false;
				break;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		} while (flag);
	}
}
