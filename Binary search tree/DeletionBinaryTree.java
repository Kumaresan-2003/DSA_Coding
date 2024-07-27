package com.handson;

public class DeletionBinaryTree {
    Node root;

    // Method to delete a node in a binary tree
    void deleteKey(int key) {
        root = deleteRec(root, key);
    }
    static Node deleteRec(Node root, int key) {
        if (root == null) return root;
        
        if (key < root.key)
            root.left = deleteRec(root.left, key);
        
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        
        else {
        	//Case one Child  
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            //case Two Child 
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }

        return root;
    }

    static int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        DeletionBinaryTree tree = new DeletionBinaryTree();

        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.right = new Node(70);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inorder();

        System.out.println("\n\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\n\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();

        System.out.println("\n\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
    }
}
