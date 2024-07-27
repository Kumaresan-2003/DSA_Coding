package com.handson;
import com.handson.SingleLinkedList.Node;

public class MergeList {
	static void merge(Node h1,Node h2) {
        Node temp=h1;
        while(temp.next!=null) {
        	temp=temp.next;
        }
        temp.next=h2;
		
		   
	}
    
}
