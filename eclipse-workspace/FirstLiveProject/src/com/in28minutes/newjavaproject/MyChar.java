package com.in28minutes.newjavaproject;

public class MyChar {

	private char ch;
	private char i;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')

			return true;

		return false;
	}

	public boolean isDigit() {

		if (ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8'
				|| ch == '9' || ch == '0')
			return true;

		return false;
	}

	public boolean isAlphabet() {
		if (ch >= 65 && ch <= 122)
			return true;
		return false;
	}

	public boolean isConsonant() {
		if (!isVowel() && isAlphabet())
			return true;
		return false;
	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.println(ch);
	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++)
			System.out.println(ch);

	}
}