package com.examples.interfaces;

public class ChessGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("move piece to up");
		
	}

	@Override
	public void down() {
		System.out.println("move piece to down");
		
	}

	@Override
	public void left() {
		System.out.println("move piece to left");
		
	}

	@Override
	public void right() {
		System.out.println("move piece to right");
		
	}

}
