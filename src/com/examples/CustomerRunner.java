package com.examples;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Line1","Hyderabad","500090");
		Customer customer = new Customer("Nagaraju", homeAddress);
		
		
		Address ofcAddress = new Address("Nagaraju","Hyderabad","500070");
		customer.setOfcAddress(ofcAddress );
		
		System.out.println(customer);

	}

}
