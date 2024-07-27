package Com.handson;

class Node {
	int data;
	Node next;
	public Node prev;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

class Operations {
	public static Node head;
	// 1
	static void Creation(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			head.next = head;
			return;
		} 
		else {
			Node curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = newnode;
			newnode.next = head;
		}
	}

	// 2 Traversal
	static void printcll() {
		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();

	}

	// 3
	static void search(int val) {
		Node temp = head;
		while (temp != head) {
			if (temp.data == val) {
				System.out.print("Key is found");
				return;
			}
			temp = temp.next;
		}
		System.out.print("Key is not  found");
	}

	// 4 Insert at end
	static void Inseratend(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			head.next=head;
			return;
		} else {
			Node temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.next = head;
			head=newnode;

		}
	}

	// 5 Insert at begin
	static void Inseratbeg(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			Node curr = head;
			while (curr.next != head) {
				curr = curr.next;
			}
			curr.next = newnode;
			newnode.next = head;
			head = newnode;
		}
	}

	// 5
	static void Insertatpos(int pos, int data) {
		Node newnode = new Node(data);
		int len = length();
		if (len < 1 && pos > len + 1) {
			System.out.print("Invalid position");
			return;
		}
		if (pos == 1) {
			Inseratbeg(data);
			return;
		} 
		else if (pos == len + 1) {
			Inseratend(data);
			return;
		} else {
			Node temp = head;
			int i = 1;
			while (i < pos - 1 && temp.next != head) {
				temp = temp.next;
				i++;
			}
				newnode.next = temp.next;
				temp.next = newnode;

		}
	}

	// 6
	static int length() {
		Node temp = head;
		int len = 0;
		if(head==null) {
			return len;
		}
		while (temp.next != head) {
			len++;
			temp = temp.next;
		}
		return len;
	}
}

public class CircularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations ob = new Operations();
		// 1
		ob.Creation(10);
		ob.Creation(20);
		ob.Creation(30);
		ob.Creation(40);
		ob.Creation(50);
		ob.printcll();
		// 2
		 ob.Inseratend(12);
		 ob.Inseratend(13);
		 ob.printcll();

		 ob.Inseratbeg(34);
		 ob.printcll();
		
		
  	    ob.Insertatpos(7,78);
		ob.printcll();

	}

}
