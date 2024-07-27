package com.handson;

import com.handson.SingleLinkedList.Node;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		SingleLinkedList ob=new SingleLinkedList();
		SingleLinkedList ob5=new SingleLinkedList();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		//ob.display();
		//1
		ob5.insert(50);
		ob5.insert(60);
		ob5.insert(70);
		ob5.insert(90);
		ob5.insert(110);
		//ob5.display();
		
		
		MiddleofLL ob1=new MiddleofLL();
		//System.out.print(ob1.lenght(ob.head));
		//2
		
		//ob1.mid(ob1.lenght(ob.head),ob.head);
		
		//3
		RemoventhNode ob3=new RemoventhNode();
		//ob3.rem(ob.head,1);
		//ob.display();
		
		AlternativeNode ob4 =new AlternativeNode();
		//ob4.AlternateNode(ob5.head);
		//ob.display();
		
		MergeList ob6=new MergeList();
		ob6.merge(ob.head,ob5.head);
		//ob.display();
		
		SortedList ob7=new SortedList();
		ob7.sort(ob.head);
		ob.display();
			
		StartNode ob8=new StartNode();
	    Node res=ob8.ans(ob.head,3);
		//ob.display();
	    res.next=ob.head;
	    ob.head=res;
	    ob.display();
	    
	    
	    
		
	}
}
