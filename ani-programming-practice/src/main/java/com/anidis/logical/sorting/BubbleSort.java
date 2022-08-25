package com.anidis.logical.sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int input[] = { 5, 7, 4,0, 8, 9, 3,8, 2, 6, 1 };
//		int input[] = { 5 };
		System.out.println("============ Bubble Sort ============");
		System.out.println("Input = ");
		printArray(input);
		System.out.println("-------3-------");
		printArray(bubbleSort3(input));

	}

	private static void printArray(int[] bubbleSort) {
		// TODO Auto-generated method stub

		for (int i = 0; i < bubbleSort.length; i++) {

			System.out.print(" ," + bubbleSort[i]);
		}
		System.out.println();
	}

	private static int[] bubbleSort(int[] input) {
		// TODO Auto-generated method stub

		// first loop for iterate whole eleemnet
		for (int i = 0; i < input.length-1; i++) {

			// 2nd loop for check & swap each element
			for (int j = 0; j < input.length - i - 1; j++) {
				// check next element is smaller and swap
				if (input[j + 1] < input[j]) {
					int temp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = temp;
				}

			}
			// printArray(input);
		}
		return input;

	}
	
	private static int[] bubbleSort11(int[] input) {
		// TODO Auto-generated method stub

		// first loop for iterate whole eleemnet
		for (int i = 0; i < input.length-1; i++) {

			// 2nd loop for check & swap each element
			for (int j = 0; j < input.length - i - 1; j++) {
				// check next element is smaller and swap
				if (input[j ] > input[1]) {
					int temp = input[j + 1];
					input[j + 1] = input[j];
					input[j] = temp;
				}

			}
			// printArray(input);
		}
		return input;

	}
	
	
	private static int[] bubbleSort3(int[] a) {
		int n = a.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j< n-i-1;j++) {
				
				if(a[j]> a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j]= temp;
				}
			}
		}
		
		return a;
	}

}
