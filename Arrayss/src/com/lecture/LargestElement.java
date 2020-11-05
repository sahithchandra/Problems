package com.lecture;

public class LargestElement {

	public static void main(String[] args) {
		
		int[] arr= {40,8,50,100};
		System.out.println(getLargestELementIndex(arr));
		
	}
	public static int getLargestELementIndex(int[] arr) {
		int max=Integer.MIN_VALUE;
		int index=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				index=i;
			}
		}
		return index;
	}

}
