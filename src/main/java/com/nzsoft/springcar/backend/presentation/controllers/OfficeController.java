package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.OfficeServices;
import com.nzsoft.springcar.backend.integration.model.Office;

@RestController
public class OfficeController {
	
	@Autowired
	private OfficeServices officeServices;
	
	
	// *************************************************************************************
	//  GET all offices
	// *************************************************************************************
	
	@RequestMapping (value="/offices",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Office> getAll(){
		return officeServices.getAll();
	}
	
	
	// *************************************************************************************
	//  GET an office by id
	// *************************************************************************************
	
	@RequestMapping (value="/offices/{id}",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Office getById (@PathVariable ("id") Long id) {
		return officeServices.getById(id);
		
	}
		

	/* ************************************************************************************
  		CREATE an office
	 * ************************************************************************************/
	
	@RequestMapping (value="/offices",
					method=RequestMethod.POST,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public Office create (@RequestBody Office newOffice) {
		final Office createdOffice = officeServices.create(newOffice);
		return createdOffice;
	}

}
