package com.problems;

public class LinkedListInsertion {

	public static void main(String[] args) {

	}
	public static void insertAtEnd(Node head, int element) {
		Node temp=new Node(element);
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;		
	}
	
	
	public static void insertAtBeginning(Node head, int element) {
		Node temp=new Node(element);
		temp.next=head;
		head=temp;		
	}

}
