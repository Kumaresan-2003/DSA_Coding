package com.handson;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {

	public Node root = null;

	public class Node {
		int data;
		public Node right, left;

		Node(int d) {
			data = d;
			left = null;
			right = null;
		}
	}

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		BinaryTree obj = new BinaryTree();
		BinaryTree obj1 = new BinaryTree();
		obj1.root = obj1.new Node(10);
		obj1.root.left = obj1.new Node(20);
		obj1.root.right = obj1.new Node(30);

//    	obj1.root.right.left = obj1.new Node(20);
//		obj1.root.right.right = obj1.new Node(60);
//		obj1.root.left.left = obj1.new Node(60);
//		obj1.root.left.left.left= obj1.new Node(70);
		System.out.println(isComplete(obj1.root));
		obj1.depestNode();

		System.out.println(isPerfect(obj1.root));
		System.out.println(isFull(obj1.root));
		maxmin(obj1.root);
		System.out.print(isBalanced(obj1.root));

		while (true) {
			System.out.println("1.Insert 2.delete 3.Traversal 4.search Enter your choice : ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				obj.root = obj.insert(obj.root);
				break;
			case 2:
				obj.root = obj.delete(obj.root);
				break;
			case 3:
				obj.traverse(obj.root);
				break;
			case 4:
				System.out.println("Enter the element to search : ");
				int search = sc.nextInt();
				if (obj.search(obj.root, search)) {
					System.out.println("Found");
				} else {
					System.out.println("Not Found");
				}
				break;
			default:
				return;
			}
		}
	}

	public static boolean Height2(Node root) {

		if (root == null)
			return true;
		Height2(root.left);
		Height2(root.right);
		if (root.right != null && root.left == null) {
			return false;
		}
		return true;

	}

	// isComplete method
	public static boolean isComplete(Node root) {
		if (Height1(root) == -1)
			return false;
		if (Height2(root) == false)
			return false;
		return true;

	}

	public static boolean isFull(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			if (temp.right != null) {
				q.add(temp.right);
			}
			if (temp.left != null) {
				q.add(temp.left);
			}
			if (!((temp.left == null && temp.right == null) || (temp.left != null && temp.right != null))) {
				return false;

			}

		}
		return true;
	}

//isBalanced
	public static boolean isBalanced(Node root) {

		if (root == null)
			return true;
		if (Height(root) == -1)
			return false;
		return true;
	}

//Height
	public static int Height(Node root) {

		if (root == null)
			return 0;
		int leftHeight = Height(root.left);
		int rightHight = Height(root.right);
		if (leftHeight == -1 || rightHight == -1)
			return -1;
		if (Math.abs(leftHeight - rightHight) > 1)
			return -1;
		return Math.max(leftHeight, rightHight) + 1;
	}

	public static boolean isPerfect(Node root) {

		if (root == null)
			return true;
		if (Height1(root) == -1)
			return false;
		return true;
	}

	public static int Height1(Node root) {

		if (root == null)
			return 0;
		int leftHeight = Height(root.left);
		int rightHight = Height(root.right);
		if (leftHeight == -1 || rightHight == -1)
			return -1;
		if (leftHeight != rightHight)
			return -1;
		return Math.max(leftHeight, rightHight) + 1;
	}

	private void depestNode() {
		if (root == null) {
			return;
		}

		System.out.print("Enter the element to search : ");
		int sr = sc.nextInt();

		if (root.right.data == sr || root.left.data == sr) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}
		int maxdepth = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		System.out.print(root.data + " ");
		while (!q.isEmpty()) {
			Node temp = q.peek();

			q.remove();
			if (temp.left != null) {
				System.out.print(temp.left.data + " ");
				q.add(temp.left);
				maxdepth = temp.left.data;

			}
			if (temp.right != null) {
				System.out.print(temp.right.data + " ");
				q.add(temp.right);
				maxdepth = temp.right.data;

			}
		}
		System.out.println("\nThe node with the maximum depth is : " + maxdepth);

	}

	public static void paths(Node root, String s, List<String> a) {
		if (root.left == null && root.right == null) {
			s = s + Integer.toString(root.data);
			a.add(s);
		}
		if (root.left != null) {
			paths(root.left, s + root.data, a);
		}
		if (root.right != null) {
			paths(root.right, s + root.data, a);
		}
	}

	public static int height(Node root) {

		if (root == null)
			return 0;
		int leftHeight = Height(root.left);
		int rightHight = Height(root.right);
		return Math.max(leftHeight, rightHight) + 1;
	}

	private boolean search(Node root, int search) {

		if (root != null && root.data != search) {
			preorder(root.left);
			preorder(root.right);
		} else {
			return true;
		}
		return false;

	}

	private static void maxmin(Node root) {
		if (root == null) {
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		int min = root.data, max = root.data;

		while (!q.isEmpty()) {
			Node temp = q.peek();
			min = Math.min(temp.data, min);
			max = Math.max(temp.data, max);
			q.remove();
			min = Math.min(root.data, min);
			max = Math.max(root.data, max);
			if (temp.left != null) {
				min = Math.min(root.left.data, min);
				max = Math.max(root.left.data, max);
				q.add(temp.left);

			}
			if (temp.right != null) {
				min = Math.min(root.right.data, min);
				max = Math.max(root.right.data, max);
				q.add(temp.right);

			}
		}
		System.out.println("MAX : " + max + " MIN : " + min);
	}

	private void traverse(Node root) {
		System.out.println(
				"1.Pre Order Traversal 2.In Order Traversal 3.Post Order Traversal 4.Level Order Traversal Enter your choice : ");
		int ch = sc.nextInt();

		switch (ch) {
		case 1:
			preorder(root);
			break;
		case 2:
			inorder(root);
			break;
		case 3:
			postorder(root);
			break;
		case 4:
			levelorder(root);
			break;
		default:
			return;
		}
	}

	private void levelorder(Node root) {
		if (root == null) {
			return;
		}
		int maxdepth = 0, cnt = 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		System.out.print(root.data + " ");
		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			if (temp.left != null) {
				cnt++;
				System.out.print(temp.left.data + " ");
				q.add(temp.left);
				maxdepth = temp.left.data;
			}
			if (temp.right != null) {
				System.out.print(temp.right.data + " ");
				q.add(temp.right);
				maxdepth = temp.right.data;
				cnt++;
			}
		}
		System.out.print("Number of nodes : " + cnt + 1);
		System.out.println("The node with the maximum depth is : " + maxdepth);
	}

	private static void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data + " ");
		}

	}

	private static void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}

	}

	private static void preorder(Node root) {
		if (root != null) {

			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}

	}

	private Node delete(Node root1) {
		System.out.println("Enter the element to delete : ");
		int val = sc.nextInt();
		Node t = search1(root1, val);
		System.out.print(t.data);
		if (t.right == null && t.left == null) {
			Node p = search2(root1, val);

		} else if (t.right == null && t.left != null) {
			t.data = t.left.data;
			t.left = null;
		} else if (t.right != null && t.left == null) {
			t.data = t.right.data;
			t.right = null;
		} else {
			Node s = depestNode(root);
			t.data = s.data;
			search2(root, s.data);
		}
		return root;
	}

	private Node search2(Node root, int sr) {
		if (root == null) {
			return root;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			if (temp.left != null) {
				if (temp.left.data == sr) {
					temp.left = null;
					return temp;
				}
				q.add(temp.left);
			}
			if (temp.right != null) {
				if (temp.right.data == sr) {
					temp.right = null;
					return temp;
				}
				q.add(temp.right);
			}
		}
		return root;
	}

	private Node search1(Node root, int sr) {
		if (root == null) {
			return root;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			if (temp.left != null) {
				if (temp.left.data == sr)
					return temp.left;
				q.add(temp.left);
			}
			if (temp.right != null) {
				if (temp.right.data == sr)
					return temp.right;
				q.add(temp.right);
			}
		}
		return root;
	}

	private Node depestNode(Node root) {
		Node maxdepth = null;
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			if (temp.left != null) {
				q.add(temp.left);
				maxdepth = temp.left;
			}
			if (temp.right != null) {
				q.add(temp.right);
				maxdepth = temp.right;
			}
		}
		return maxdepth;
	}

	public Node insert(Node root) {
		System.out.println("Enter the element : ");
		int val = sc.nextInt();
		if (root == null) {

			Node newNode = new Node(val);
			root = newNode;
			return root;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			Node temp = q.peek();
			q.remove();
			if (temp.left == null) {
				Node newnode = new Node(val);
				temp.left = newnode;
				break;
			} else {
				q.add(temp.left);
			}
			if (temp.right == null) {
				Node newnode = new Node(val);
				temp.right = newnode;
				break;
			} else {
				q.add(temp.right);
			}
		}
		return root;
	}

}