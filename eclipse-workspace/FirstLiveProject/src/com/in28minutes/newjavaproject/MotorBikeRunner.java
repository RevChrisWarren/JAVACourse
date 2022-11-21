package com.in28minutes.newjavaproject;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(120);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.start();
		honda.start();

		ducati.setSpeed(80);
		honda.setSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.increaseSpeed(50);
		honda.increaseSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());

		ducati.decreaseSpeed(40);
		honda.decreaseSpeed(250);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}