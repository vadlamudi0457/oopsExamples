package com.examples.abstaract.methods;

public class RecipeWithMicrowave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("get the raw materails");
		System.out.println("get the bowls");
		
	}

	@Override
	void doTheDish() {
		System.out.println("Puton the microwave");
		System.out.println("do the dish");
		
	}

	@Override
	void cleanup() {
		System.out.println("do the cleanup bowls");
		System.out.println("Putoff the microwave");
		
	}

}
