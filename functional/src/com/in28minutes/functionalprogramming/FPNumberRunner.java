package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		numbers.stream().forEach(element -> System.out.println(element));

		// Sum only odd numbers
		int sum = numbers.stream().filter(element -> element % 2 == 1).reduce(0,
				(number1, number2) -> number1 + number2);

		System.out.println(sum);
	}

}
