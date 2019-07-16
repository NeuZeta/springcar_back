package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String model;
	private Transmission transmission;
	private Office office;
	private boolean haAirAconditioner;
	private int numberOfSeats;
	private int numberOfDoors;
	private int suitcasesCapacity;
	private Category category;
	private double basePrice;
	private String photo;
	
	public Car(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public boolean isHaAirAconditioner() {
		return haAirAconditioner;
	}

	public void setHaAirAconditioner(boolean haAirAconditioner) {
		this.haAirAconditioner = haAirAconditioner;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getSuitcasesCapacity() {
		return suitcasesCapacity;
	}

	public void setSuitcasesCapacity(int suitcasesCapacity) {
		this.suitcasesCapacity = suitcasesCapacity;
	}

	
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", haAirAconditioner=" + haAirAconditioner + ", numberOfSeats="
				+ numberOfSeats + ", numberOfDoors=" + numberOfDoors + ", suitcasesCapacity=" + suitcasesCapacity
				+ ", photo=" + photo + "]";
	}
	
	
	/*
	 * INNER ENUM Transsmission
	 * 
	 * 
	 */
	
	enum Transmission {
		
		AUTO, MANUAL;
	}
	
	
}
