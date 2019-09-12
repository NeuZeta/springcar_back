package com.nzsoft.springcar.backend.business.services;

import java.util.List;

import com.nzsoft.springcar.backend.integration.model.Client;
import com.nzsoft.springcar.backend.integration.model.Office;
import com.nzsoft.springcar.backend.integration.model.Reservation;

public interface ReservationServices {

	public Reservation create(Reservation reservation);
	public Reservation getById(long id);
	public void delete(long id);
	
	public List<Reservation> getAll();
	public List<Reservation> getByOffice(Office office);
	public List<Reservation> getByClient(Client client);
	
}
