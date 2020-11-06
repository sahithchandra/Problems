package com.lecture;

public class CountOnes {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 1, 1, 1, 1, 1, 1 };
		System.out.println(getCount(arr, 1));

	}

	private static int getCount(int[] arr, int key) {
		int firstOccurence = getFirstIndex(arr, key);
		return arr.length - firstOccurence;
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
