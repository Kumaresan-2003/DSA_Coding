package Com.handson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Stackusing2queses {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();

	public void push(int x) {
		while (!q1.isEmpty()) {
			int peek = q1.peek();
			q1.remove();
			q2.add(peek);
		}
		q1.add(x);
		while (!q2.isEmpty()) {
			int peek = q2.peek();
			q2.remove();
			q1.add(peek);
		}
	}

	public int pop() {
		while (!q1.isEmpty()) {
			int peek = q1.peek();
			q1.remove();
			return peek;
		}
		return -1;
	}

	public static void main(String[] args) {
		Stackusing2queses stack = new Stackusing2queses();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		do {
			System.out.println("STACK OPERATIONS : ");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.STOP");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter the element : ");
				stack.push(sc.nextInt());
				break;
			case 2:
				System.out.println("Element popped : " + stack.pop());
				break;
			case 3:
				System.out.println("Exiting . . .");
				flag = false;
				break;
			default:
				System.out.println("Invalid choice. Try again.");
				break;
			}
		} while (flag);

	}

}
