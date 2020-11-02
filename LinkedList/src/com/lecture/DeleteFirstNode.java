package com.lecture;

public class DeleteFirstNode {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head=deleteFirstNode(head);
		display(head);
		
	}

	public static Node deleteFirstNode(Node head) {
		if(head==null)
			return null;
		head=head.next;
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
