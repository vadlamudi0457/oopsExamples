package com.examples;

public class Fan {
	// State
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	// Creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;

	}
	//Operations(Methods)

	public String toSting() {
		return String.format("make - %s  radius - %f color - %s  isOn - %b speed - %d", make, radius, color, isOn,
				speed);

	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public byte getSpeed() {
		return speed;
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	public boolean isOn(boolean isOn) {
		return isOn;
		
	}

	public String color() {
		return color;
		
	}

	public String make() {
		return make;
		
	}

}
