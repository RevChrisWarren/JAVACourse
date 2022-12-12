package com.in28mintes.api4;

public class StringNewApiRunner {
	public static void main(String[] args) {
		System.out.println("".isBlank());
		System.out.println("  LR  ".strip().replace(" ", "*"));
		System.out.println("  LR  ".stripLeading().replace(" ", "*"));
		System.out.println("  LR  ".stripTrailing().replace(" ", "*"));
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
		System.out.println("UPPER".transform(str -> str.substring(2)));
		System.out.println("UPPER".transform(str -> str.toLowerCase()));
		System.out.println("My Name Is %s. My age is %d.".formatted("Chris", 48));

		String str = null;
		System.out.println(str.isBlank());
	}
}