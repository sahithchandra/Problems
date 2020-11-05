package com.lecture;

public class HeightOfTree {

	public static void main(String[] args) {

		Node root = new Node(10);

		root.left = new Node(8);
		root.right = new Node(30);
		root.right.left = new Node(40);
		root.right.right = new Node(50);
		root.right.right.left = new Node(50);

		System.out.println(getheight(root));

	}

	public static int getheight(Node root) {
		if (root == null)
			return 0;
		return 1 + Math.max(getheight(root.left), getheight(root.right));
	}

}

class Node {
	int key;
	Node left;
	Node right;

	Node(int key) {
		this.key = key;
	}
}