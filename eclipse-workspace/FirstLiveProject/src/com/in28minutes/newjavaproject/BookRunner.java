package com.in28minutes.newjavaproject;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(20);
		Book effectiveJava = new Book(15);
		Book cleanCode = new Book(17);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		
		artOfComputerProgramming.setNoOfCopies(14);
		effectiveJava.setNoOfCopies(42);
		cleanCode.setNoOfCopies(12);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.increaseCopies(15);
		effectiveJava.increaseCopies(15);
		cleanCode.increaseCopies(15);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());

		artOfComputerProgramming.decreaseCopies(20);
		effectiveJava.decreaseCopies(20);
		cleanCode.decreaseCopies(20);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
