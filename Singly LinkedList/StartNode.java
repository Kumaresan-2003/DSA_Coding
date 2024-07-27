package com.handson;

import com.handson.SingleLinkedList.Node;

public class StartNode {
	static Node  ans(Node head, int n) {
		int len = MiddleofLL.lenght(head);
		//System.out.print(len);
		int k = len - n + 1;
		Node temp = head;
		Node val = null;
		if (n > len || n <= 0) {
			System.out.println("Invalid value of n");
			return null;
		}
		
		if (k == 1) {
			head = head.next;
			return null;
		} 
		else {
			int j = 1;
			while (j < k - 1 && temp != null) {
				temp = temp.next;
				j++;
			}
			
			if (temp == null || temp.next == null) {
				return null;
			}
			val = temp.next;
			 temp.next = temp.next.next;
		}
        return val;
 

	}
}
