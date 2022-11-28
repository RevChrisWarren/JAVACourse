package com.in28minutes.studentarray;

import java.math.BigDecimal;

public class Student {
	
	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
	this.name = name;
	this.marks = marks;
	}
	public int getNumberOfMarks() {
	return marks.length;
	}
	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int i=0; i<marks.length; i++) {
			sum= sum+marks[i];
		}
		return sum;
	}
	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;
		for (int mark:marks) {
			if (mark > maximum) {
				maximum = mark;
			}
			
		}
		return maximum;
	}
	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for (int mark : marks) {
			if (mark < minimum) {
				minimum = mark;
			}
					}
		return minimum;
	
}
//	public BigDecimal average = getAverageMarks() {
//		BigDecimal sum = 0;
//		for (int i=0; i<marks.length; i++) {
//			sum= sum + marks[i];
//		}return sum / marks.length;
//	}
}
