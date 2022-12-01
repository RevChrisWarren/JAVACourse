package com.in28minutes.oop2.interfaces;

public class FlyRunner {

	public static void main(String[] args) {
		Bird robin = new Bird();
		robin.fly();

		Aeroplane cessna = new Aeroplane();
		cessna.fly();

		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable obj : flyingObjects) {
			obj.fly();
		}

	}

}
