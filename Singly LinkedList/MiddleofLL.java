package com.handson;
import com.handson.SingleLinkedList.Node;
public class MiddleofLL {
    static int i=0;
	public static int lenght(Node head) {
		Node temp=head;
		if(head==null) {
			//System.out.print(i+" ");
			return i;
		}
		
		while(temp.next!=null) {
			i++;
			temp=temp.next;
		}
    	  return i+1;
      }
	static void mid(int i,Node head) {
		int mid=(i/2);
		int j=0;
		Node temp=head;
		
		while(j<mid && temp!=null) {
			temp=temp.next;
			j++;
		}
		while(j<=i && temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		
	}

}
