package com.handson;

import java.util.*;

public class LevelOrderTraversal {
	static void ans(Node root) {
		Queue<Node> qu=new LinkedList<>();
	    qu.add(root);
		while(!qu.isEmpty()) {
			
			Node temp=qu.poll();
	
			System.out.print(temp.key+" ");
			
			if(temp.left!=null) {
				qu.add(temp.left);
			}
			if(temp.right!=null) {
				qu.add(temp.right);
			}
		}
 
	}
	//2
	static void size(Node root) {
		int ct=0;
		Queue<Node> qu=new LinkedList<>();
	    qu.add(root);
		while(!qu.isEmpty()) {
			
			Node temp=qu.poll();
			ct++;
			
			if(temp.left!=null) {
				qu.add(temp.left);
			}
			if(temp.right!=null) {
				qu.add(temp.right);
			}
		}
     System.out.print(ct);
	}
//3
static void Insertion(Node root,int data) {
	Node temp=root;
	if(temp==null) {
		temp= new Node(data);
		return;
	}
	Queue<Node> li=new LinkedList<>();
	li.add(temp);
	while(!li.isEmpty()) {
		 temp=li.peek();
		 li.remove();
		 if(temp.left==null) {
			 temp.left=new Node(data);
			 return;
		 }
		 if(temp.right==null) {
			 temp.right=new Node(data);
			 return;
		 }
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarysearchtree ob1=new Binarysearchtree();
		ob1.insert(10);
		ob1.insert(2);
		ob1.insert(3);
		ob1.insert(4);
		ob1.insert(5);
		ob1.insert(6);
		//ans(ob1.root);
		
//		Insertion(ob1.root,15);
//		ob1.inorder();
		// size
		size(ob1.root);
		

}
}
