package com.springcore.autowire.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

//	@Autowired To get setter injection by annotation
	public void setAddress(Address address) {
		this.address = address;
	}
}
