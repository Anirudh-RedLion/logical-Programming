package com.anidis.logical.string;

import java.util.ArrayList;
import java.util.List;

public class FiboncciSequence {

	public static void main(String args[]) {

		int inputSequence = 8;

		printFebonicciSequence(inputSequence);
	}

	static private void printFebonicciSequence(int inputSeq) {

		List<Integer> feboList = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i <= inputSeq; i++) {

			sum += i;
			feboList.add(sum);

		}

		System.out.println(feboList);
		printArray(feboList);

	}

	private static void printArray(List<Integer> list) {
		list.forEach(l -> System.out.print(" ," + l));
	}

}
