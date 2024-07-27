package com.array;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}

}

public class LinkedList {
	static Node head;

	static Node createNode(int data) {
		return new Node(data);
	}

	static void AddNode(int data) {
		Node newNode = createNode(data);
		if (head == null) {
			head = newNode;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = newNode;
		}
	}

	static void nodePrint() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	static void insertion(int pos, int data) {
		Node newNode = createNode(data);
		if (pos < 1) {
			System.out.println("Invalid position");
		} else if (pos == 1) {
			AddNode(data);
			return;
		} else {
			Node curr = head;
			int curpos = 1;
			while (curpos < pos) {
				curr = curr.next;
				curpos++;
			}
			if (curr == null) {
				System.out.print("List out of bound");
			}
			newNode.next = curr.next;
			curr.next = newNode;

		}
	}

	static void insertionatmid(int data) {
		Node newNode = createNode(data);
		int pos = (len() / 2)+1;
	    //System.out.println(pos);
		
		if (pos < 1) {
			System.out.println("Invalid position");
		} 
		else if (pos == 1) {
			newNode.next = head;
	        head = newNode;
			return;
		}
		else {
			Node curr = head;
			int curpos = 1;
			while (curpos < pos-1 &&curr!=null){
				curr = curr.next;
	            curpos++;
			}
			if (curr == null) {
	            System.out.print("List out of bound");
	        } else {
	            newNode.next = curr.next;
	            curr.next = newNode;
	        }

		}
	}
	
	
	static void deleteoneNode(int ans) {
		Node curr=head;
		int pos=1;
	 
		while(curr.data<ans) {
			pos++;
			curr=curr.next;
		}
		if(pos==1) {
			head=head.next;
			return;
		}
		else {
			Node temp=head;
			for(int i=2;i<pos;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
		}
		
	}
	
	
	
	static void deleteatbegin() {
		Node curr = head;
		if(curr==null) {
			return;
		}
		else {
			head=head.next;
		}
	}
	static int len() {
		Node curr = head;
		int len = 0;
		if (head == null) {
			System.out.print("List is Empty");
		}

		while (curr.next != null) {
			len++;
			curr = curr.next;
		}
		return len + 1;
	}
     static void deleteatend() {
    	 Node curr=head;
    	 while(curr.next!=null) {
    		 curr=curr.next;
    	 }
    	 curr.next=null;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ob = new LinkedList();
		ob.AddNode(10);
		ob.AddNode(11);
		ob.AddNode(12);
		ob.AddNode(13);
		ob.AddNode(14);
		nodePrint();
		//System.out.print(ob.len());

//		insertion(2, 45);
//		nodePrint();
//		ob.insertionatmid(56);
//		nodePrint();
//		
//		deleteatbegin();
//		nodePrint();
//		
		ob.deleteoneNode(14);
		nodePrint();
		
		ob.deleteatend();
		nodePrint();
		
		
		

		
	}

}
