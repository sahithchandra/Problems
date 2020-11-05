package com.lecture;

public class SizeofBinaryTree {

	public static void main(String[] args) {
		
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);
		System.out.println(getSize(root));

	}
	
	public static int getSize(Node root) {
		if(root==null)
			return 0;
		return 1+getSize(root.left)+getSize(root.right);
	}

}
