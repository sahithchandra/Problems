package com.lecture;

public class SearchInLinkedList {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Node head = new Node(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			head = insertAtEnd(head, arr[i]);
		}
		System.out.println(iterativeSearch(head, 60));
		System.out.println(recursiveSearch(head, 40,0));

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

	public static int iterativeSearch(Node head, int element) {
		int count = 0;
		Node curr = head;
		while (curr != null) {
			count++;
			if (curr.val == element)
				return count;
			curr = curr.next;
		}
		return -1;
	}

	public static int recursiveSearch(Node head, int element, int count) {
		Node curr = head;
		while (curr != null) {
			count++;
			if (curr.val == element)
				return count;
			return recursiveSearch(curr.next, element, count);
		}
		return -1;
	}

}
