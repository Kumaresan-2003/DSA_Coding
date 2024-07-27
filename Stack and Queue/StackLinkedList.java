package Com.handson;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class StackLinkedList {
	public Node top = null;
   //1
	public void peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			System.out.println(top.data);
		}
	}
//2
	public void push(int val) {
		Node newnode = new Node(val);
		if (top == null) {
			top = newnode;
			System.out.print("Pushed In");
			return;
		} else {
			newnode.next = top;
			top = newnode;
		}
	}
//3
	public void pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			top = top.next;
			System.out.println("Popped out");
		}

	}
//4
	public boolean isEmpty() {
		if (top == null) {
			return true;
		} else {
			return false;
		}
	}
//6
	public void display() {
		Node temp = top;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
//7
	public void size() {
		if (isEmpty()) {
			System.out.println("Stack is Empty");
		} else {
			int ct = 0;
			Node temp = top;
			while (temp.next != null) {
				ct++;
				temp = temp.next;
			}
			System.out.println(ct + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(1);
		a.next = new Node(2);
		a.next.next = new Node(3);
		a.next.next.next = new Node(4);
		while(a!=null) {
			System.out.print(a.data+" ");
			a=a.next;
		}

		StackLinkedList ob = new StackLinkedList();
		ob.push(10);
		ob.push(11);
		ob.push(12);
		ob.push(13);
		ob.push(14);

		ob.display();
		ob.pop();
		ob.display();
		

	}

}
