package com.in28minutes.oop2;

public class Review {
	private int id;
	private String description;
	private int rating;

	public Review(int id, String description, int rating) {
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	public String toString() {
		return String.format("Review id = %d, Review Description = %s, Review rating = %d", id, description, rating);
	}
}
