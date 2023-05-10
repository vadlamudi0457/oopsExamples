package com.examples.interfaces;

public class CricketGame implements GameConsole{

	@Override
	public void up() {
		System.out.println("Move Forward");
		
	}

	@Override
	public void down() {
		System.out.println("Turn back");
		
	}

	@Override
	public void left() {
		System.out.println("left turn");
		
	}

	@Override
	public void right() {
		System.out.println("Right Turn");
		
	}

}
