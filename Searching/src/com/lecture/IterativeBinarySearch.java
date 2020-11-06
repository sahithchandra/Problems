package com.lecture;

public class IterativeBinarySearch {

	public static void main(String[] args) {
		int[] arr= {5,10,20,30,40,50,60};
		System.out.println(search(arr,70));
	}

	private static int search(int[] arr,int key) {
		int low=0, high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]<key)
				low=mid+1;
			if(arr[mid]>key)
				high=mid-1;			
		}
		return -1;
	}

}
