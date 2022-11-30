package com.in28minutes.oop2.inheritance;

public class Person {
	private String name;
	private String email;
	private String phone;

	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
