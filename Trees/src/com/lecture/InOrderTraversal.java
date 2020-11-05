package com.lecture;

public class InOrderTraversal {

	public static void main(String[] args) {
		
		Node root = new Node(100);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(90);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);
		
		inOrderTraversal(root);

	}

	private static void inOrderTraversal(Node root) {
		if(root==null)
			return;		
		inOrderTraversal(root.left);
		System.out.print(root.key+" ");
		inOrderTraversal(root.right);
	}

}
