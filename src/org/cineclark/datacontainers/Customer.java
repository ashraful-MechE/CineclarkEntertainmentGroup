package org.cineclark.datacontainers;

abstract public class Customer {

	private String customerCode;
	private Person contact;
	private String name;
	private Address address;

	public Customer(String customerCode, Person contact, String name, Address address) {
		super();
		this.customerCode = customerCode;
		this.contact = contact;
		this.name = name;
		this.address = address;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public Person getContact() {
		return contact;
	}

	public void setContact(Person contact) {
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//abstract classes to add additional functionality
	abstract public String getCustomerType();
	abstract public double getDiscount();
	abstract public double getadditionalFee();
	
	
	
}
