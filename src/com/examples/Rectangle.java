package com.examples;

public class Rectangle {
	
	//State
	public int length;
	public int width;
	
	//Creation(Constructor)
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area() {
		return length*width;
	}
	public int perimeter() {
		return 2*(length + width);
	}
	
	//Operations(Methods)
	
	public String toString() {
		return String.format("length - %d width - %d area - %d perimetr - %d ", length,width,area(),perimeter());
		
	}

}
