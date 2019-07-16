package com.nzsoft.springcar.backend.integration.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="RESERVATIONS")
public class Reservation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RESERVATION_DATE")
	private Date reservationDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="PICKUP_DATE")
	private Date pickupDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DROPOFF_DATE")
	private Date dropOffDate;
	
	@ManyToOne
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@Transient
	private Car car;
	
	@Enumerated(EnumType.STRING)
	private InsuranceType insuranceType;
	
	@Column(name="TIRE_GLASS_PROTECTION")
	private boolean hasTireAndGlassProtection;
	
	@ManyToMany
	@JoinTable(
			  name = "RESERVATIONS_EXTRAS", 
			  joinColumns = @JoinColumn(name = "ID_RESERVATION"), 
			  inverseJoinColumns = @JoinColumn(name = "ID_EXTRA"))
	private List<CommonExtra> commonExtras;
	
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
	
	public boolean isHasTireAndGlassProtection() {
		return hasTireAndGlassProtection;
	}

	public void setHasTireAndGlassProtection(boolean hasTireAndGlassProtection) {
		this.hasTireAndGlassProtection = hasTireAndGlassProtection;
	}

	public List<CommonExtra> getCommonExtras() {
		return commonExtras;
	}

	public void setCommonExtras(List<CommonExtra> commonExtras) {
		this.commonExtras = commonExtras;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", reservationDate=" + reservationDate + ", pickupDate=" + pickupDate
				+ ", dropOffDate=" + dropOffDate + ", client=" + client + ", car=" + car + ", insuranceType="
				+ insuranceType + "]";
	}

	/*
	 * INNER ENUM InsuranceType
	 * 
	 * 
	 */

	enum InsuranceType{
		BASE, TOP;
	}
	
	public double getPrice() {
		
		double price = 0;
		
		//Primero calculamos los días de reserva
		long timeDifference = this.pickupDate.getTime() - this.dropOffDate.getTime();
		int differenceInDays = (int) TimeUnit.DAYS.convert(timeDifference, TimeUnit.MILLISECONDS);
		
		//Multiplicamos los días por el precio base del coche
		price = differenceInDays * this.getCar().getBasePrice();
		
		//Le sumamos el precio del seguro por categoria
		
		switch (insuranceType) {
			case BASE:
				price += this.getCar().getCategory().getBaseInsurancePrice();
				break;
			case TOP:
				price += this.getCar().getCategory().getTopInsurancePrice();
				break;
		}
		
		//Si tiene proteccion de ruedas y cristales le sumamos el precio por categoria
		
		if (hasTireAndGlassProtection) {
			price += this.getCar().getCategory().getTireAndGlassProtectionPrice();
		}
		
		//Sumamos el precio de cada extra que se le ha añadido
		
		for (CommonExtra commonExtra : commonExtras) {
			price += commonExtra.getPrice();
		}
		
		return price;
	}

}


