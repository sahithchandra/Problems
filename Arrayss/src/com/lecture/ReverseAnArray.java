package com.lecture;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr= {10,20,30,40,50,60};
		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] arr) {
		int first = 0;
		int last = arr.length - 1;
		while (first < last) {
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;
			first++;
			last--;
		}
	}

}
