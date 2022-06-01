package com.anidis.logical.string;

public class SumNeturalNumber {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int total = sumOfNeturalnumber(arr);
		System.out.println("total = " + total);

	}

	private static int sumOfNeturalnumber(int[] arr) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];

		}

		return sum;
	}
}