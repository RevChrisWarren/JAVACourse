package com.in28minutes.api.f;

public class SwitchExpressionRunner {
	public static String findDayOfTheWeek(int day) {
		String dayOfWeek = "";
		switch (day) {
		case 0:
			dayOfWeek = "Sunday";
			break;
		case 1:
			dayOfWeek = "Monday";
			break;
		case 2:
			dayOfWeek = "Tuesday";
			break;
		case 3:
			dayOfWeek = "Wednesday";
			break;
		case 4:
			dayOfWeek = "Thursday";
			break;
		case 5:
			dayOfWeek = "Friday";
			break;
		case 6:
			dayOfWeek = "Saturday";
			break;
		default:
			dayOfWeek = "Error";
		}
		return dayOfWeek;
	}

	// With Switch expression, there is no fall-through.
	public static String findDayOfTheWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Some complicated logic here");
			yield "Sunday";
		}
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4 -> "Thursday";
		case 5 -> "Friday";
		case 6 -> "Saturday";
		default -> "Error";
		};
		return dayOfWeek;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
