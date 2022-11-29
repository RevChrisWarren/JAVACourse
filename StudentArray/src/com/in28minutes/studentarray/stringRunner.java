package com.in28minutes.studentarray;

public class stringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String dayWithMostCharacters = "";
		for (String day : daysOfWeek)
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;

			}
		System.out.println("Day with most characters is " + dayWithMostCharacters);
		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
		for (int i = 0; i <= daysOfWeek.length - 1; i++) {
			System.out.println(daysOfWeek[i] + " has " + daysOfWeek[i].length() + " characters.");
		}
	}

}
