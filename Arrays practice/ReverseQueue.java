import java.util.*;

public class ReverseQueue {
	static Queue<Integer> queue;

	// function to print the queue

	public static void Print() {
		while (!queue.isEmpty()) {
			System.out.print(queue.peek() + " ");
			queue.remove();
		}
	}

	// Function to reverse the queue
	public static void reversequeue() {
		Stack<Integer> stack = new Stack<>();
		List<Integer> revList = new ArrayList<>();
		while (!queue.isEmpty()) {
			stack.add(queue.peek());
			queue.remove();
		}
		while (!stack.isEmpty()) {
			//queue.add(stack.peek());
			revList.add(stack.pop());
		}
		System.out.println(revList);
	}

	public static void main(String args[]) {
		queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.add(6);
		queue.add(7);
		queue.add(8);
		queue.add(9);
		queue.add(10);
		// Print();
		System.out.println(queue);
		reversequeue();
		Print();

	}
}