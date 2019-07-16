package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CARS")
public class Car implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String model;
	
	@Enumerated(EnumType.STRING)
	private Transmission transmission;
	
	@ManyToOne
	@JoinColumn(name="ID_OFFICE")
	private Office office;
	
	@Column(name="AIR_ACONDITIONED")
	private boolean hasAirAconditioned;
	
	private int numberOfSeats;
	private int numberOfDoors;
	
	
	private int suitcasesCapacity;
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

	public boolean isHaAirAconditioned() {
		return hasAirAconditioned;
	}

	public void setHaAirAconditioned(boolean hasAirAconditioned) {
		this.hasAirAconditioned = hasAirAconditioned;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", hasAirAconditioned=" + hasAirAconditioned + ", numberOfSeats="
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
