package com.nzsoft.springcar.backend.business.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.ClientServices;
import com.nzsoft.springcar.backend.integration.model.Client;
import com.nzsoft.springcar.backend.integration.repositories.ClientRepository;

@Service
public class ClientServicesImpl implements ClientServices{

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> getAll() {

		return clientRepository.findAll();
	}
	
	@Override
	public Client getById(Long id){
		
		Optional<Client> optional = this.clientRepository.findById(id);
		
		return optional.isPresent()? optional.get() : null;
		
	}

	@Transactional
	@Override
	public Client create(Client newClient) {
		Client createdClient = clientRepository.save(newClient);
		return createdClient;
	}
	
}
