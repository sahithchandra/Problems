package com.lecture;

public class PostOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(90);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);
		
		postOrderTraversal(root);
	}

	private static void postOrderTraversal(Node root) {
		if(root==null)
			return;	
		postOrderTraversal(root.left);	
		postOrderTraversal(root.right);
		System.out.print(root.key+" ");
	}
}
