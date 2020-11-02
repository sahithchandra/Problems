package com.problems;

public class IdenticalLinkedLists {

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 6, 7, 5, 1, 0 };
		int[] arr2 = { 2, 4, 6, 7, 5, 1, 10 };
		Node head1 = new Node(arr1[0]);
		Node head2 = new Node(arr2[0]);
		for (int i = 1; i < arr1.length; i++) {
			head1 = insertAtEnd(head1, arr1[i]);
		}
		for (int i = 1; i < arr2.length; i++) {
			head2 = insertAtEnd(head2, arr2[i]);
		}

		System.out.println(isIdentical(head1,head2));
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

	public static boolean isIdentical(Node head1, Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		boolean flag = false;
		while (temp1 != null & temp2 != null) {
			if (temp1.val == temp2.val) {
				flag = true;
				temp1 = temp1.next;
				temp2 = temp2.next;
			} else
				return false;
		}
		return flag;
	}

}
