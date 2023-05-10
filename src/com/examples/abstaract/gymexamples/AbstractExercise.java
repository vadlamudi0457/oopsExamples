package com.examples.abstaract.gymexamples;

public abstract class AbstractExercise {
	public void excute() {
		wakeUp();
		doExercise();
		
	}
	abstract void wakeUp();
	abstract void doExercise();
	

}
