package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.ClientServices;
import com.nzsoft.springcar.backend.integration.model.Client;

@RestController
public class ClientController {

	@Autowired
	private ClientServices clientServices;
	
	@RequestMapping(value="/clients",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Client> getAll (){
		return clientServices.getAll();
	}
	
}
