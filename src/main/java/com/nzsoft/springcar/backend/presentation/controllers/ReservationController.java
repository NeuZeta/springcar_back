package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.ReservationServices;
import com.nzsoft.springcar.backend.integration.model.Office;
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
	
	@RequestMapping(value="/reservations/office/{id}",
	        method=RequestMethod.GET,
	        produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Reservation> getByOffice(@PathVariable("id") Long officeId){
		Office office = new Office();
		office.setId(officeId);
		return reservationServices.getByOffice(office);
	}
	
	
	@RequestMapping(value="/reservations/{id}",
					method=RequestMethod.DELETE)
	@ResponseStatus(value = HttpStatus.OK)
	public void delete(@PathVariable ("id") long reservationId){
		reservationServices.delete(reservationId);
	}
	
	
	// El JSON que esperamos recibir (@RequestBody) no tiene por qué tener
	// todos los atributos establecidos en los objetos anidados (HAS-A)
	// Lo que sí que tiene que estar es el código de dichos objetos..
	
	@RequestMapping(value="/reservations",
	        method=RequestMethod.POST,
	        consumes=MediaType.APPLICATION_JSON_VALUE,
	        produces=MediaType.APPLICATION_JSON_VALUE)
	public Reservation create(@RequestBody Reservation reservation){
		Reservation createdReservation = reservationServices.create(reservation);
		return createdReservation;
	}
	
}
