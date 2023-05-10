package com.examples.abstaract.methods;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materails");
		System.out.println("get the bowls");
		
	}

	@Override
	void doTheDish() {
		System.out.println("do the dish");
		
	}

	@Override
	void cleanup() {
		System.out.println("do the cleanup bowls");
		
	}

}
