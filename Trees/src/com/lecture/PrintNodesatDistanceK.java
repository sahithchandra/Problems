package com.lecture;

public class PrintNodesatDistanceK {

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);
		
		printNodesAtKDistance(root, 1);

	}
	
	public static void printNodesAtKDistance(Node root, int k) {
		if(root==null)
			return;
		if(k==0) {
			System.out.println(root.key);
		}
		printNodesAtKDistance(root.left, k-1);
		printNodesAtKDistance(root.right, k-1);
	}

}
