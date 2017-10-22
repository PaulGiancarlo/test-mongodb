package io.quantum.pdiaz.model;

import org.springframework.data.annotation.Id;

public class Customer {

	@Id
	public String id;
	
	public String firtsName;
	public String lastName;
	
	
	public Customer() {};
	
	public Customer(String firtsName, String lastName) {
		super();
		this.firtsName = firtsName;
		this.lastName = lastName;
	}


	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firtsName=" + firtsName + ", lastName=" + lastName + "]";
	}
	
	
	
}
