package com.examples.interfaces.runner;

interface Flyable {
	void fly();
}

 class Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird fly with wings");
		
	}
	
}
 class Flight implements Flyable{

	@Override
	public void fly() {
		System.out.println("Flight fly with fuel");
		
	}
	
}

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyableObjects = {new Bird(),new Flight()};
		for(Flyable object : flyableObjects) {
			object.fly();
		}

	}

}
