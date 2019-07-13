package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

public class Contact implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String phoneNumber;
	private String email;
	
	public Contact () {
		
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	

}
