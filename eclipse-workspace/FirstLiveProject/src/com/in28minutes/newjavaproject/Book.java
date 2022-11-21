package com.in28minutes.newjavaproject;

public class Book {
//no of copies
	private int noOfCopies;
	
	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies >= 0)
			this.noOfCopies = noOfCopies;
	}

	public void increaseCopies(int howMany) {
		setNoOfCopies(this.noOfCopies + howMany);
	}

	public void decreaseCopies(int howMany) {
		setNoOfCopies(this.noOfCopies - howMany);

	}

}
