package com.examples;

public class Review {
	// State
	private int id;
	private String description;
	private int rating;

	// creation
	public Review(int id, String description, int rating) {
		super();
		this.id = id;
		this.description = description;
		this.rating = rating;
	}

	public String toString() {
		return id + " " + description + " " + rating + " ";
	}

}
