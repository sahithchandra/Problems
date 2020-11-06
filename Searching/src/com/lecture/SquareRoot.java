package com.lecture;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(getSquareRoot(7));
	}

	public static int getSquareRoot(int num) {
		int mid = num / 2;
		while (mid > 0) {
			if (mid * mid > num) {
				mid = mid / 2;
			} else {
				if ((mid + 1) * (mid + 1) <= num)
					mid = mid + 1;
				else
					return mid;
			}
		}
		return 1;
	}

}
