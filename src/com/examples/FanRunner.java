package com.examples;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Crompton", 0.545, "Brown");
		 boolean isOn = fan.isOn(true);
		 System.out.println("isOn: " +isOn);
		String color = fan.color();
		System.out.println("Color: " +color);
		String make = fan.make();
        System.out.println("Make: " +make);
        System.out.println(fan);
	}

}
