package com.problems;

public class InsertInMiddle {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 5, 1, 0 };
		Node head = new Node(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			head = insertAtEnd(head, arr[i]);
		}
		insertInMiddle(head, 100);
		display(head);
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

	private static Node insertInMiddle(Node head, int element) {
		Node midNode = new Node(element);
		if (head == null)
			return head;
		Node curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		int middle = 0;
		if (count % 2 == 0)
			middle = count / 2;
		else
			middle = (count + 1) / 2;

		Node temp = head;
		for (int i = 1; i < middle; i++) {
			temp = temp.next;
		}
		midNode.next = temp.next;
		temp.next = midNode;
		return head;

	}

	private static void display(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.val+" ");
			curr = curr.next;
		}

	}

}
