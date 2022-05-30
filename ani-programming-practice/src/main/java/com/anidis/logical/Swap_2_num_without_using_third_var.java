package com.anidis.logical;

public class Swap_2_num_without_using_third_var {

	public static void main(String[] args) {

		System.out.println("================= START ======================");

		int a = 5;
		int b = 7;
		System.out.println("input | A = " + a + " | B = " + b);
		System.out.println("Output | " + swap(a, b));
		System.out.println("================= END ======================");

	}

	private static String swap(int a, int b) {

		a = a + b;
		b = a - b;
		a = a - b;

		return "| A = " + a + " | B = " + b;
	}

}
