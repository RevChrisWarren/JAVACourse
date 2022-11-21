package com.in28minutes.newjavaproject;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

		ducati.start();
		honda.start();

		ducati.setSpeed(80);
		honda.setSpeed(100);

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}