package com.in28minutes.apie;

import java.util.List;

public class TypeInferenceRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Ranga", "Ravi");
		List<String> names2 = List.of("John", "Adam");
		// List<List<String>> allNames = List.of(names1, names2);
		var allNames = List.of(names1, names2);

		allNames.stream().forEach(System.out::println);
	}

}
