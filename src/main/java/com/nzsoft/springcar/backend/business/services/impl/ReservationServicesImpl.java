package com.nzsoft.springcar.backend.business.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.ReservationServices;
import com.nzsoft.springcar.backend.integration.model.Client;
import com.nzsoft.springcar.backend.integration.model.Office;
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

	@Override
	public Reservation getById(long id) {
		
		Optional<Reservation> optional = reservationRespository.findById(id);
		
		return optional.isPresent() ? optional.get() : null;
	}
	
	@Override
	@Transactional
	public void delete(long reservationId){
		reservationRespository.deleteById(reservationId);
	}

	@Override
	public List<Reservation> getByOffice(Office office) {
		
		List<Reservation> reservations = reservationRespository.findByOffice(office.getId());
		
		return reservations;
	}

	@Override
	public List<Reservation> getByClient (Client client) {
		
		List<Reservation> reservations = reservationRespository.findByClient(client.getId());
		
		return reservations;
	}
	
	
	@Override
	@Transactional
	public Reservation create(Reservation reservation) {
		
		Reservation createdReservation = reservationRespository.save(reservation);
		
		return createdReservation;
	}

}
