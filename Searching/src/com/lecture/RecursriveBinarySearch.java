package com.lecture;

public class RecursriveBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 5, 10, 20, 30, 40, 50, 60 };
		System.out.println(search(arr, 40, 0, arr.length - 1));
	}

	private static int search(int[] arr, int key, int low, int high) {
		int mid = (low + high) / 2;
		if (low > high)
			return -1;
		if (arr[mid] == key)
			return mid;
		else if (arr[mid] > key)
			return search(arr, key, low, mid - 1);
		else
			return search(arr, key, mid + 1, high);

	}

}
