package com.lecture;

public class SimpleLinkedListImplementation {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		display(head);
	}

	public static void display(Node head) {
		Node curr=head;
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}

}

class Node {

	int val;
	Node next;

	Node(int val) {
		this.val = val;
	}
}
