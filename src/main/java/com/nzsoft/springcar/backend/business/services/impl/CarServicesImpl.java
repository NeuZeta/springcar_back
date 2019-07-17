package com.nzsoft.springcar.backend.business.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.CarServices;
import com.nzsoft.springcar.backend.integration.model.Car;
import com.nzsoft.springcar.backend.integration.repositories.CarRepository;

@Service
public class CarServicesImpl implements CarServices {

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<Car> getAll() {
		return carRepository.findAll();
	}

}