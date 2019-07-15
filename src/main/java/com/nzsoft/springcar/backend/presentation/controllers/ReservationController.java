package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.ReservationServices;
import com.nzsoft.springcar.backend.integration.model.Reservation;

@RestController
public class ReservationController {

	@Autowired
	private ReservationServices reservationServices;
	
	@RequestMapping(value="/reservations",
			        method=RequestMethod.GET,
			        produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Reservation> getAll(){
		return reservationServices.getAll();
	}
	
}
