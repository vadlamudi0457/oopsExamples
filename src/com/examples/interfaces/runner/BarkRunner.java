package com.examples.interfaces.runner;
 abstract class Animal{
	abstract void bark();
}
 
 class Dog extends Animal{

	@Override
	void bark() {
		System.out.println("Bow Bow");
		
	}
	 
 }
 class Cat extends Animal{

	@Override
	void bark() {
		System.out.println("Meow Meow");
		
		
	}
	 
 }
public class BarkRunner {

	public static void main(String[] args) {
		Animal[] animal = {new Dog(), new Cat()};
		for(Animal object : animal) {
			object.bark();
		}
 
	}

}
