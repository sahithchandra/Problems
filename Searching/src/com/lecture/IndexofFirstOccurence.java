package com.lecture;

public class IndexofFirstOccurence {

	public static void main(String[] args) {

		int[] arr = { 1, 10, 10, 10, 20, 20, 40 };
		System.out.println(getFirstIndex(arr, 10));
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
