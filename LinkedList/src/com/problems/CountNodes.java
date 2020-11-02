package com.problems;

public class CountNodes {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 5, 1, 0 };
		Node head = new Node(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			head = insertAtEnd(head, arr[i]);
		}
		System.out.println(countNodes(head));
	}

	private static Node insertAtEnd(Node head, int element) {
		Node temp = new Node(element);
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;
		return head;
	}

	private static int countNodes(Node head) {
		int count = 0;
		Node curr = head;
		if(head==null)
			return count;
		while (curr != null) {
			curr = curr.next;
			count++;
		}
		return count;
	}

}

class Node {

	int val;
	Node next;

	Node(int val) {
		this.val = val;
	}
}
