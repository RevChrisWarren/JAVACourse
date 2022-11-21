package com.in28minutes.newjavaproject;

public class MotorBike {
	// state
	private int speed;
	//This will make the initial default speed 5
	//This is called a "no argument" constructor
	MotorBike() {
		this(5);
	}
	
MotorBike(int speed) {
	this.speed = speed;
}
	// behavior
	// method: inputs (int speed) output (void) name (setSpeed)

	void setSpeed(int speed) {
		if (speed >= 0)
			this.speed = speed;

	}

	int getSpeed() {
		return this.speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}

	void start() {
		System.out.println("Bike Started");
	};
}