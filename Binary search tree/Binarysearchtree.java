package com.handson;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Node {
	int key;
	Node left, right;

	Node(int data) {
		this.key = data;
		left = null;
		right = null;
	}

}

public class Binarysearchtree {
	static Node root = null;

	// insertions
	void insert(int data) {
		Node newnode = new Node(data);
		if (root == null) {
			root = newnode;
			return;
		}
		Node curr = root;
		while (true) {
			if (data < curr.key) {
				if (curr.left == null) {
					curr.left = newnode;
					return;
				} else {
					curr = curr.left;
				}
			} else {
				if (curr.right == null) {
					curr.right = newnode;
					return;
				} else {
					curr = curr.right;
				}
			}
		}
	}

	// 1
	void inorder() {
		inordertraversal(root);
	}

	private void inordertraversal(Node root) {
		Node temp = root;
		if (temp == null) {
			return;
		}
		inordertraversal(temp.left);
		System.out.print(temp.key + " ");
		inordertraversal(temp.right);

	}

	// 2
	void preorder() {
		preordertraversal(root);
	}

	private void preordertraversal(Node root) {
		Node temp = root;
		if (temp == null) {
			return;
		}
		System.out.print(temp.key + " ");
		preordertraversal(temp.left);
		preordertraversal(temp.right);

	}

	// 3
	void postorder() {
		postordertraversal(root);
	}

	private void postordertraversal(Node root) {
		Node temp = root;
		if (temp == null) {
			return;
		}
		postordertraversal(temp.left);
		postordertraversal(temp.right);
		System.out.print(temp.key + " ");
	}
	// 4 Size

	static int MaxDepth(Node root) {
		if (root == null) {
			return 0;
		}
		int lh = MaxDepth(root.left);
		int rh = MaxDepth(root.right);
		return (1 + Math.max(lh, rh));

	}

//5
	static void insertaat(int data) {
		root=InsertionatBT(root,data);
	}
	static Node  InsertionatBT(Node root,int data) {
		Node newnode = new Node(data);
		Node temp = root;
		if (temp == null) {
			temp = newnode;
			return temp;
		}

		Queue<Node> li = new LinkedList<>();
		li.add(temp);

		while (!li.isEmpty()) {
			temp = li.poll();
			if (temp.left == null) {
				temp.left = newnode;
				break;
			} else {
				li.add(temp.left);
			}
			if (temp.right == null) {
				temp.right = newnode;
				break;
	
			} else {
				li.add(temp.right);
			}
		}
		return root;
	}

//6
	static boolean isBalance(Node root) {
		return Balancedbinary(root) != -1;
	}

	static int Balancedbinary(Node root) {
		if (root == null) {
			return 0;
		} else {
			int lh = Balancedbinary(root.left);
			if (lh == -1) {
				return -1;
			}
			int rh = Balancedbinary(root.right);
			if (rh == -1) {
				return -1;
			}
			if (Math.abs(lh - rh) > 1) {
				return -1;
			}
			return Math.max(lh, rh) + 1;
		}
	}
	//7
	static int max = Integer.MIN_VALUE;
	public static void path(Node n) {
   	 Stack<Integer> st = new Stack<Integer>();
       if (n == null) {
           return;
       }
       st.push(n.key);
       path(n.left);
       if (n.left == null && n.right == null) {
           int val = sum(st);
           if (val > max) {
               max = val;
           }
       }
       path(n.right);
       st.pop();
   }
	public static int sum(Stack<Integer> st) {
        int sum = 0;
        for(int i : st){
            sum += i;
        }
        return sum;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarysearchtree ob = new Binarysearchtree();
//		ob.insert(10);
//		ob.insert(2);
//		ob.insert(3);
//		ob.insert(4);
//		ob.insert(14);
//		ob.insert(1);
//		ob.insert(6);
//		ob.insert(7);
//		System.out.print("Inorder:");
//		ob.inorder();
//		System.out.println();
//		System.out.print("preorder:");
//		ob.preorder();
//		System.out.println();
//		System.out.print("postorder:");
//		ob.postorder();
		// int depth = MaxDepth(root);
		// System.out.print(depth);

		Binarysearchtree ob1 = new Binarysearchtree();
		
		ob1.insertaat(10);
		ob1.insertaat(11);
		ob1.insertaat(12);
		ob1.insertaat(13);
		ob1.insertaat(14);
		ob1.insertaat(15);
		ob1.insertaat(10);
		//ob1.inorder();
//		System.out.println(isBalance(ob1.root));
//		int depth = MaxDepth(ob1.root);
//		System.out.println(depth);
		
		path(ob1.root);
		System.out.print(max);
		
		

	}

}
