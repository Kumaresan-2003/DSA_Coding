package Com.handson;

class Node1 {
	static int data;
	static Node1 next;
	static Node1 prev;

	Node1(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

class OperationinDLL {
	public static Node head = null;

	// 1. Get the length of the list
	public static int length() {
		Node curr = head;
		int len = 0;
		while (curr != null) {
			len++;
			curr = curr.next;
		}
		return len;
	}

	// 2. Creation and insertion at end
	static Node creation(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
			newNode.prev = curr;
		}
		return head;
	}

	// 3. Print the list
	public static void print() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	// 4. Insert at the beginning
	static void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (head != null) {
			head.prev = newNode;
			newNode.next = head;
		}
		head = newNode;
	}

	// 5. Insert at a specific position
	public static void insertAtPos(int pos, int data) {
		int len = length();
		if (pos < 1 || pos > len + 1) {
			System.out.println("Invalid position");
			return;
		}

		if (pos == 1) {
			insertAtBegin(data);
		} else if (pos == len + 1) {
			insertAtEnd(data);
		} else {
			Node newNode = new Node(data);
			Node curr = head;
			int i = 1;
			while (i < pos - 1 && curr != null) {
				curr = curr.next;
				i++;
			}
			newNode.next = curr.next;
			newNode.prev = curr;
			if (curr.next != null) {
				curr.next.prev = newNode;
			}
			curr.next = newNode;
		}
	}

	// 6. Insert at the end
	static void insertAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
			newNode.prev = curr;
		}
	}

	// 7. Delete at the beginning
	static void deleteAtBegin() {
		if (head == null) {
			return;
		} else {
			head = head.next;
			if (head != null) {
				head.prev = null;
			}
		}
	}

	// 8. Delete at the end
	static void deleteAtEnd() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.prev.next = null;
		}
	}

	// 9. Delete at a specific position
	static void deleteAtPos(int pos) {
		int len = length();
		if (pos < 1 || pos > len) {
			System.out.println("Invalid position");
			return;
		}
		if (pos == 1) {
			deleteAtBegin();
		} else if (pos == len) {
			deleteAtEnd();
		} else {
			Node curr = head;
			int i = 1;
			while (i < pos && curr != null) {
				curr = curr.next;
				i++;
			}
			if (curr != null && curr.prev != null) {
				curr.prev.next = curr.next;
			}
			if (curr != null && curr.next != null) {
				curr.next.prev = curr.prev;
			}
		}
	}

	// 10. Print the list in reverse
	static void reversePrint() {
		Node temp = head;
		if (temp == null) {
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.prev;
		}
		System.out.println();
	}

	// 11. Reverse the list
	static void reverse() {
		Node curr = head;
		Node next = null;
		Node prev = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			curr.prev = next;
			prev = curr;
			curr = next;
		}
		if (prev != null) {
			head = prev;
		}
	}
}

public class DLL {
	public static void main(String[] args) {
		OperationinDLL ob = new OperationinDLL();
		// Insert elements
		ob.creation(10);
		ob.creation(20);
		ob.creation(30);
		ob.creation(40);
		ob.creation(50);

		// Print the list
		ob.print();

		// Insert at position
		ob.insertAtPos(3, 25);
		ob.print();

		// Insert at the end
		ob.insertAtEnd(60);
		ob.print();

		// Delete at position
		ob.deleteAtPos(4);
		ob.print();

		// Print in reverse order
		ob.reversePrint();

		// Reverse the list
		ob.reverse();
		ob.print();
	}


}
