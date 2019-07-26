package com.nzsoft.springcar.backend.business.services;

import java.util.Date;
import java.util.List;

import com.nzsoft.springcar.backend.integration.model.Car;
import com.nzsoft.springcar.backend.integration.model.Office;

public interface CarServices {

	public List<Car> getAll();
	
	public List<Car> getNotAvailableBetweenDates(Office office, Date inicio, Date fin);
	
}
