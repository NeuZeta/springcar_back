package com.nzsoft.springcar.backend.business.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.ReservationServices;
import com.nzsoft.springcar.backend.integration.model.Reservation;
import com.nzsoft.springcar.backend.integration.repositories.ReservationRepository;

@Service
public class ReservationServicesImpl implements ReservationServices {

	@Autowired
	private ReservationRepository reservationRespository;
	
	@Override
	public List<Reservation> getAll() {
		return reservationRespository.findAll();
	}

}
