package com.handson;

import com.handson.SingleLinkedList.Node;

public class SortedList {

	static void sort(Node head) {
		Node temp = head;
		if (head == null) {
			System.out.print("List is Empty");
			return;
		}
		Node ind = temp.next;
		while (temp != null) {
			ind = temp.next;
			while (ind != null) {
				if (temp.data > ind.data) {
					int a = temp.data;
					temp.data = ind.data;
					ind.data = a;
				}
				ind = ind.next;
			}
			temp = temp.next;
		}
	}

}
