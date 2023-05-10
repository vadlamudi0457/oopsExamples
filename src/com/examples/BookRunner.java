package com.examples;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "OOPS", "Raju");
		book.addReview(new Review(125, "Good Book", 5));
		book.addReview(new Review(126, "Good Book", 4));
		System.out.println(book);

	}

}
