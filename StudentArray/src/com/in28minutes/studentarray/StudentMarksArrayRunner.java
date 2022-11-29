package com.in28minutes.studentarray;

import java.math.BigDecimal;

public class StudentMarksArrayRunner {

	public static void main(String[] args) {
		int[] marks = { 98, 99, 94, 90 };
		Student student = new Student("name", marks);
		int number = student.getNumberOfMarks();
		System.out.println("number of marks: " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks: " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum mark: " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum Mark: " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		System.out.println("Average: " + average);
	}

}
