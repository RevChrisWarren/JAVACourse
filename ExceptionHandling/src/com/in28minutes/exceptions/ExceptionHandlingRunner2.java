package com.in28minutes.exceptions;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main ended");
	}

	private static void method1() {
		try {
			String str = null;
			str.length();
			System.out.println("Method 1 ended");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
