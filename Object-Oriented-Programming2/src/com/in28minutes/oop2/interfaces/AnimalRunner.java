package com.in28minutes.oop2.interfaces;

public class AnimalRunner {

	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.bark();
		Cat garfield = new Cat();
		garfield.bark();

		Animal[] animals = { new Dog(), new Cat() };
		for (Animal obj : animals) {
			obj.bark();
		}
	}

}
