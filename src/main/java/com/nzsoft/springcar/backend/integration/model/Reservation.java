package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Date reservationDate;
	private Date pickupDate;
	private Date dropOffDate;
	private Client client;
	private Car car;
	private InsuranceType insuranceType;
	
	public Reservation(){
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public Date getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(Date pickupDate) {
		this.pickupDate = pickupDate;
	}

	public Date getDropOffDate() {
		return dropOffDate;
	}

	public void setDropOffDate(Date dropOffDate) {
		this.dropOffDate = dropOffDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public InsuranceType getInsuranceType() {
		return insuranceType;
	}

	public void setInsuranceType(InsuranceType insuranceType) {
		this.insuranceType = insuranceType;
	}
	
	

	/*
	 * INNER ENUM InsuranceType
	 * 
	 * 
	 */

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", reservationDate=" + reservationDate + ", pickupDate=" + pickupDate
				+ ", dropOffDate=" + dropOffDate + ", client=" + client + ", car=" + car + ", insuranceType="
				+ insuranceType + "]";
	}



	enum InsuranceType{
		BASE, TOP;
	}

}


