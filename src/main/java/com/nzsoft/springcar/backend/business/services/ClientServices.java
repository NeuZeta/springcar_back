package com.nzsoft.springcar.backend.business.services;

import java.util.List;

import com.nzsoft.springcar.backend.integration.model.Client;

public interface ClientServices {

	public List<Client> getAll();
	
	public Client getById(Long id);
	
	public Client create(Client newClient);
	
	public Client update(Client updatedClient);
	
}
