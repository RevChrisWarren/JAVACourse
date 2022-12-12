package com.in28minutes.api.h;

public class RecordsRunner {
	record Person(String name, String email, String phoneNumber) {
	}

	public static void main(String[] args) {
		Person person1 = new Person("Chris", "Chris@email.com", "6511455242");

		System.out.println(person1);
	}

}
