package com.anidis.logical.string;

public class MoveXXXinEndOfString {

	public static void main(String args[]) {

		String input = "axbcxxd";
		String selectedText = "x";
		char ch = 'x';
		Character cch = Character.valueOf('x');
		// expected : abcdxxx
		System.out.println("Input = "+input);
		String output = shiftChracter(input, selectedText, ch, cch);

		System.out.println(output);

	}

	private static String shiftChracter(String input, String selectedText, char ch, Character cch) {

		StringBuilder nonselected = new StringBuilder();
		StringBuilder selected = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {

			System.out.println(" a: " + input.charAt(i) + " | " + ch+" == "+cch);
			if (ch == input.charAt(i)) {
				selected.append(input.charAt(i));
			} else
				nonselected.append(input.charAt(i));

		}

		return nonselected.toString() + selected.toString();

	}
	
	private static String shiftChracterSol2(String input, String selectedText, char ch, Character cch) {
	

	return null;
	}
}
