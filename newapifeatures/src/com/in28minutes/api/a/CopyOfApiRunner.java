package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ranga");
		names.add("Chris");
		names.add("Michael");

		List<String> copyOfNames = List.copyOf(names);

		doNotChange(copyOfNames);

	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");

	}

}
