package com.lecture;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 12, 20 };
		System.out.println(getSecondMaxIndex(arr));
	}

	public static int getSecondMaxIndex(int[] arr) {
		int first = 0;
		int second = -1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[first]) {
				second = first;
				first = i;
			} else if (arr[i] != arr[first]) {
				if(second==-1|| arr[i]>arr[second])
					second=i;
			}
		}
		return second;
	}

}
