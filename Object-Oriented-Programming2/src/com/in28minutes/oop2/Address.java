package com.in28minutes.oop2;

public class Address {
	private String line1;
	private String city;
	private String zipCode;

	// creation
	public Address(String line1, String city, String zipCode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zipCode = zipCode;
	}

	public String toString() {
		return String.format("Street Address = %s, City = %s, Zip = %s", line1, city, zipCode);
	}

}
