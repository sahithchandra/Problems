package com.lecture;

public class DeleteLastNode {

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head=deleteLastNode(head);
		display(head);
		
	}

	public static Node deleteLastNode(Node head) {
		if(head==null||head.next==null)
			return null;
		Node curr=head;
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
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
