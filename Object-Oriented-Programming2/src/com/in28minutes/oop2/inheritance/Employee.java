package com.in28minutes.oop2.inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private int employeeGrade;
	private int salary;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public int getEmployeeGrade() {
		return employeeGrade;
	}

	public void setEmployeeGrade(int employeeGrade) {
		this.employeeGrade = employeeGrade;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return String.format("name: %s, phone: %s, email: %s, title: %s, employer: %s, employee grade: %d; salary: %d",
				getName(), getPhone(), getEmail(), title, employer, employeeGrade, salary);
	}
}
