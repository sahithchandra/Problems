package com.lecture;

public class CountOccurences {

	public static void main(String[] args) {

		int[] arr = { 1, 10, 10, 10, 20, 20, 40 };
		System.out.println(getCount(arr, 10));

	}

	private static int getCount(int[] arr, int key) {
		int firstOccurence = getFirstIndex(arr, key);
		if (firstOccurence == -1)
			return 0;
		return getLastIndex(arr, key) - firstOccurence + 1;
	}

	public static int getLastIndex(int[] arr, int key) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > key)
				high = mid - 1;
			else if (arr[mid] < key)
				low = mid + 1;
			else {
				if (mid == arr.length - 1 || arr[mid + 1] != arr[mid])
					return mid;
				else
					low = mid + 1;
			}

		}
		return -1;

	}

	public static int getFirstIndex(int[] arr, int key) {

		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > key)
				high = mid - 1;
			else if (arr[mid] < key)
				low = mid + 1;
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid])
					return mid;
				else
					high = mid - 1;
			}

		}
		return -1;

	}
}
