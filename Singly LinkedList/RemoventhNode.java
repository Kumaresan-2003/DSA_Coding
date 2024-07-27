package com.handson;

import com.handson.SingleLinkedList.Node;

public class RemoventhNode {
	static void rem(Node head, int n) {
		int len = MiddleofLL.lenght(head);
	    //System.out.print(len+" ");
		int k = len - n + 1;
		System.out.print(k+" ");
		if (k == 0|| k==1) {
            head = head.next;
            return;
        }
		else {
		Node temp = head;
		Node prev = null;
		int i =0;
		for (i =1; i < k; i++) 
		{
		      prev = temp;
		      temp = temp.next;
		    }
		if (temp!=null &&prev != null) {
			prev.next = temp.next;
		} 
		}
	}

}
