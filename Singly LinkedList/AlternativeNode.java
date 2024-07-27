package com.handson;
import com.handson.SingleLinkedList.Node;

public class AlternativeNode {
	static  void AlternateNode(Node head) {
		if(head==null) {
			return ;
		}
		else {
			Node temp=head;
			while(temp!=null) {
				temp.next=temp.next.next;
				temp=temp.next;
			}
		}
		
	}
	

}
