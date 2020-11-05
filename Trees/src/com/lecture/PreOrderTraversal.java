package com.lecture;

public class PreOrderTraversal {

	public static void main(String[] args) {
		
		Node root = new Node(100);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(90);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);
		
		preOrderTraversal(root);

	}

	private static void preOrderTraversal(Node root) {
		if(root==null)
			return;	
		System.out.print(root.key+" ");
		preOrderTraversal(root.left);	
		preOrderTraversal(root.right);
	}

}
