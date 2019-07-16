package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.CarServices;
import com.nzsoft.springcar.backend.integration.model.Car;

@RestController
public class CarController {

	@Autowired
	private CarServices carServices;
	
	@RequestMapping(method=RequestMethod.GET,
			        produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Car> getAll(){
		return carServices.getAll();
	}
	
}
