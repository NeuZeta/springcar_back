package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.ClientServices;
import com.nzsoft.springcar.backend.integration.model.Client;

@RestController
public class ClientController {

	@Autowired
	private ClientServices clientServices;
	
	
	
	// *************************************************************************************
	//  GET all clients
	// *************************************************************************************
	
	@RequestMapping(value="/clients",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Client> getAll (){
		return clientServices.getAll();
	}
	
	
	
	// *************************************************************************************
	//  GET a client by id
	// *************************************************************************************

	@RequestMapping(value="/clients/{id}",
				method=RequestMethod.GET,
				produces=MediaType.APPLICATION_JSON_VALUE)
	public Client getById (@PathVariable ("id") Long id){
		return clientServices.getById(id);
	}
	
	
	/* ************************************************************************************
  		CREATE a client
	 * ************************************************************************************/
	
	@RequestMapping(value="/clients",
					method=RequestMethod.POST,
					consumes=MediaType.APPLICATION_JSON_VALUE,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Client create(@RequestBody Client newClient){
		final Client createdClient = clientServices.create(newClient);
		return createdClient;
	}

	
	
	
}
