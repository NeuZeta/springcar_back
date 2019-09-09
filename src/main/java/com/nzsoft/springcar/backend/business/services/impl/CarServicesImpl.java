package com.nzsoft.springcar.backend.business.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.CarServices;
import com.nzsoft.springcar.backend.integration.model.Car;
import com.nzsoft.springcar.backend.integration.model.Office;
import com.nzsoft.springcar.backend.integration.repositories.CarRepository;

@Service
public class CarServicesImpl implements CarServices {

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<Car> getAll() {
		return carRepository.findAll();
	}

	@Override
	public List<Car> getNotAvailableBetweenDates(Office office, Date inicio, Date fin) {
		
	
		List<Car> allCars = carRepository.getByOffice(office);
		List<Car> notAvailableCars = carRepository.getNotAvailableCarsBetweenDates(office.getId(), inicio, fin);
		
		
		// Tenemos los NO available
		
		// Necesitamos TODOS los coches de esa oficina en una List<Car>
		// Cotejamos (Abrá algún método que lo haga directamente) con los coches que NO available
		// Acabamos devolviendo el List<Car>
		
		allCars.removeAll(notAvailableCars);
		
		return notAvailableCars;
	}

}
