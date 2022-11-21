package com.in28minutes.newjavaproject;

public class MotorBike {
	// state
	private int speed;

	// behavior
	// method: inputs (int speed) output (void) name (setSpeed)

	void setSpeed(int speed) {
		if (speed >= 0)
			this.speed = speed;

	}

	int getSpeed() {
		return this.speed;
	}

	void start() {
		System.out.println("Bike Started");
	};
}