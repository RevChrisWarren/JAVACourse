package com.in28minutes.oop2.inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Goober");
		employee.setPhone("615-615-6156");
		employee.setEmail("goober@email.com");
		employee.setTitle("programmer");
		employee.setEmployer("Vandy");
		employee.setEmployeeGrade(8);
		employee.setSalary(85000);

		System.out.println(employee);
	}

}
