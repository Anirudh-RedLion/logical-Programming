package com.anidis.logical.sorting;

public class SelectionSort {

	public static void main(String args[]) {

		int input[] = { 5, 9, 4, 6, 12, 1, 3, 8, 7,0 ,2};
		printArray(input);
		System.out.println("--------------------------");
		selectionSort(input);
		printArray(input);
	}

	private static void selectionSort(int[] input) {
		// TODO Auto-generated method stub

		// 1st loop to traverse all element
		for (int i = 0; i < input.length-1; i++) {

			int smallest = i;
			// 2nd loop to select small element
			for (int j = i + 1; j < input.length; j++) {

				if (input[smallest] > input[j]) {
					smallest = j;
				}
			}
			int temp = input[i];
			input[i] = input[smallest];
			input[smallest] = temp;
			printArray(input);
		}

	}

	private static void printArray(int[] input) {
		// TODO Auto-generated method stub

		for (int i = 0; i < input.length; i++) {
			System.out.print(" ," + input[i]);
		}
		System.out.println();
	}

}
