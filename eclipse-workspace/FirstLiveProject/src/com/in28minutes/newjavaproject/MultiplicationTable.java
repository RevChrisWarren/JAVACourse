package com.in28minutes.newjavaproject;

public class MultiplicationTable {
	void print() {

		print(5, 1, 10);
	}

	void print(int num) {

		print(num, 1, 10);
	}

	void print(int num, int start, int finish) {

		for (int i = start; i <= finish; i++) {
			System.out.printf("%d * %d = %d", num, i, num * i).println();
		}
	}
}