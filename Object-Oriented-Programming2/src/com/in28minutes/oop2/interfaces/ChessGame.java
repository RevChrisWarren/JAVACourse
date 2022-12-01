package com.in28minutes.oop2.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move up");

	}

	@Override
	public void down() {
		System.out.println("Move down");

	}

	@Override
	public void left() {
		System.out.println("Move Left");

	}

	@Override
	public void right() {
		System.out.println("Move Right");

	}

}
