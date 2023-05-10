package com.examples.interfaces;

public class GameRunner {

	public static void main(String[] args) {
		//CricketGame game = new CricketGame();
		//ChessGame game = new ChessGame();
		GameConsole game = new CricketGame();
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
