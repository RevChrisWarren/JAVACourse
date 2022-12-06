package com.in28minutes.functionalprogramming;

import java.util.List;

public class LambdaBehindTheScenesRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 36, 48, 45).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

	}

}
