package com.examples;

public class Customer {
	// State

	private String name;

	private Address homeAddress;
	private Address ofcAddress;

	// constructor(creating)

	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;
	}

	// operations

	public Address getHomeaddress() {
		return homeAddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeAddress = homeaddress;
	}

	
	
	public Address getOfcAddress() {
		return ofcAddress;
	}

	public void setOfcAddress(Address ofcAddress) {
		this.ofcAddress = ofcAddress;
	}

	public String toString() {
		return String.format("name - [%s] homeAddress - [%s] ofcAddress - [%s] ", name,homeAddress,ofcAddress);
	}

}
