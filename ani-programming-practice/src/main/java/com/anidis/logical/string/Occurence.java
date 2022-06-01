package com.anidis.logical.string;

public class Occurence {
	public static void main(String[] ani) {

		String input = "aa";
		Character chracter = 'a';
		String output = getFirstAndLastOccu(input, chracter);
		System.out.println(output);
		
		 output = getFirstandlastOcc2ndSolution(input, chracter);
		System.out.println(output);

	}

	private static String getFirstAndLastOccu(final String input, final Character element) {

		int first = 0, last = 0;
		for (int i = 0; i < input.length(); i++) {
			if (first == 0 && element.equals(input.charAt(i))) {
				first = i;
			}

			if (element.equals(input.charAt(i))) {
				last = i;
			}
		}

		return "F :" + first + " |  L :" + last;
	}

	private static String getFirstandlastOcc2ndSolution(String input, Character character) {

		int size = input.length();
		int first = 0, last = 0;
		for (int i = 0; i < size; i++) {

			if (first == 0 && character.equals(input.charAt(i)))
				first = i;

			if (last ==0 && character.equals(input.charAt(size - i-1))) {
				last = size - i-1;

				if (first != 0 && last !=0)
					break;
			}

		}
		return "F :" + first + " |  L :" + last;
	}

}
