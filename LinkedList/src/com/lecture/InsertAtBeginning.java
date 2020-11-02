package com.lecture;

public class InsertAtBeginning {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head=insertAtBeginning(head, 5);
		display(head);
	}

	public static Node insertAtBeginning(Node head, int element) {
		Node temp= new Node(element);
		temp.next=head;
		head=temp;
		
		return head;
	}
	public static void display(Node head) {
		Node curr=head;
		while (curr != null) {
			System.out.println(curr.val);
			curr = curr.next;
		}
	}

}
