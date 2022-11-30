package com.in28minutes.oop2;

public class Customer {
	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// operations

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	public String toString() {
		return String.format("Name = [%s], home address = [%s], work address = [%s]", name, homeAddress, workAddress);
	}
}
