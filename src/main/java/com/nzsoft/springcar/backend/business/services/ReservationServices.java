package com.nzsoft.springcar.backend.business.services;

import java.util.List;

import com.nzsoft.springcar.backend.integration.model.Reservation;

public interface ReservationServices {

	public List<Reservation> getAll();
	
}
