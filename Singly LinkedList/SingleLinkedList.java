package com.handson;

public class SingleLinkedList {
	public class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public static  Node head;
	public void insert(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void display() {
		if(head==null) {
			System.out.print("List is Empty");
		}
		else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	public void deleteatpos(int pos) {
		 if (head == null || pos < 1) {
	            System.out.println("Invalid position or list is empty");
	            return;
	        }

	        if (pos == 1) {
	            head = head.next;
	            return;
	        }

	        Node temp = head;
	        for (int i = 1; i < pos - 1 && temp != null; i++) {
	            temp = temp.next;
	        }

	        if (temp == null || temp.next == null) {
	            System.out.println("Position out of range");
	            return;
	        }
	        temp.next = temp.next.next;
		
	}
	public static void insertionatmid(Node head,int data) {
		Node newNode = new Node(data);
		int pos = (MiddleofLL.length(head) / 2)+1;
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
}
