package com.anidis.logical.string;

import java.util.Optional;

public class ReverseString {

	public static void main(String[] args) {

		System.out.println("================= START ======================");

		String input = "Anirudh";
//		reverseStringByChracter(input);
		System.out.println("Reverse | " + reverseStrinByJornelDev(input));
		System.out.println("================= END ======================");

	}

	private static String reverseStrinByJornelDev(String input) {

		// null check optional
		Optional<String> output = Optional.ofNullable(input);
		if (output.isPresent()) {
			System.out.println("input  | " + input);

			StringBuilder stb = new StringBuilder();
			for (int i = output.get().length()-1; i >= 0; i--) {
				stb.append(input.charAt(i));
			}

			return stb.toString();
		}
		
		return "No Value";
		// optional Map Logic

		// for logic

		// stream Logic
//		for()
	}

	private static StringBuilder reverseStringByChracter(String input) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		StringBuilder reverse = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse.append(Character.toString(input.charAt(i)));
			System.out.print(input.charAt(i));

		}
		System.out.println();
		System.out.println("Output => " + reverse);

		return reverse;

	}
}