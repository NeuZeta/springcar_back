package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String address;
	
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	private String city;
	private String country;
	
	public Location(){
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [address=" + address + ", zipCode=" + zipCode + ", city=" + city + ", country=" + country
				+ "]";
	}
	
}
