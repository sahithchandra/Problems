package com.lecture;

public class MaxinBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(100);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(90);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);
		System.out.println(getMax(root));
	}

	private static int getMax(Node root) {
		if(root==null)
			return Integer.MIN_VALUE;		
		return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
	}

}
