package Com.handson;

import java.util.Scanner;
import java.util.Stack;

public class QueueReversal {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public QueueReversal(int size) {
        this.capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return (front == -1 && rear == -1);
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }
        queue[++rear] = data;
        System.out.println("Enqueuing : " + data);
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int data = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return data;
    }

    public void reverseQueue() {
        Stack<Integer> stack = new Stack<>();

        while (!isEmpty()) {
            stack.push(dequeue());
        }

        while (!stack.isEmpty()) {
            enqueue(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the queue: ");
        int n = sc.nextInt();
        QueueReversal queue = new QueueReversal(n);
        System.out.print("Enter the elements to be enqueued : ");
        for (int i = 0; i < n; i++) {
            queue.enqueue(sc.nextInt());
        }

        queue.reverseQueue();

        System.out.print("Reversed Queue : ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
