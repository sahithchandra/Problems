package com.lecture;

public class InsertAtEnd {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head=insertAtEnd(head, 50);
		display(head);
	}

	private static void display(Node head) {
		Node curr=head;
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
		
	}

	private static Node insertAtEnd(Node head, int element) {
		Node temp= new Node(element);
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;
		return head;
	}

}
