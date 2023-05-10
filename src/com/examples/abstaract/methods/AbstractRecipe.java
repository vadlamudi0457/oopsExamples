package com.examples.abstaract.methods;

public abstract class AbstractRecipe {
	public void excute() {
		getReady();
		doTheDish();
		cleanup();
	}
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
	

}
