package com.in28minutes.oop2;

public class CustomerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Address homeAddress = new Address("105 Cedar Court", "Hendersonville", "37075");
		Customer customer = new Customer("George", homeAddress);
		Address workAddress = new Address("1050 Court Street", "Nashville", "37203");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
