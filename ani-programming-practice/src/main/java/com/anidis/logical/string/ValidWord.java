package com.anidis.logical.string;

public class ValidWord {

	public static void main(String[] args) {

		// input
		String input = "dddd";
		System.out.println(" Input :" + input);

		System.out.println(" Output | " + validateWord(input));

	}

	private static boolean validateWord(String input) {
		// TODO Auto-generated method stub

		int capitalLatter = 0;
		for (Character ch : input.toCharArray()) {

			if (Character.isUpperCase(ch))
				capitalLatter++;

			// 1st case: check India

			// 2 case : Check All Capital
			// 3 case : Check All Small

		}

		System.out.println("c=" + capitalLatter + " | s=");

		return (input.length() == capitalLatter || capitalLatter == 0) ? true
				: (capitalLatter == 1 && Character.isUpperCase(input.charAt(0)));

//		if ((capitalLatter == 1 && lowerLetter == input.length() - 1) || capitalLatter == input.length()
//				|| lowerLetter == input.length())
//			return "OK";
//		else
//			return "invalid";

	}

}
