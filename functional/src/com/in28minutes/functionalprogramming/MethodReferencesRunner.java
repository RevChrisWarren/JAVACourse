package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
	public static void print(Integer num) {
		System.out.println(num);
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(e -> e.length())
				.forEach(e -> System.out.println(e));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(e -> e.length()).forEach(System.out::println);

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length)
				.forEach(MethodReferencesRunner::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferencesRunner::isEven).max(Integer::compare)
				.orElse(0);
		System.out.println(max);
	}

	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

}
