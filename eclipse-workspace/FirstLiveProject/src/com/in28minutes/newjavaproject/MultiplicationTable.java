package com.in28minutes.newjavaproject;

public class MultiplicationTable {
	void print() {

	for(int i = 0; i<=10; i++) {
		System.out.printf("%d * %d = %d", 5, i, 5*i).println();
	}
}
	void print(int num) {

		for(int i = 0; i<=10; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i).println();
		}
	}
	void print(int num, int start, int finish) {

		for(int i = start; i<=finish; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i).println();
		}
	}
}