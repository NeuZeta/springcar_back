package com.nzsoft.springcar.backend.business.services;

import java.util.List;

import com.nzsoft.springcar.backend.integration.model.Office;

public interface OfficeServices {
	
	public List<Office> getAll();
	
	public Office getById(Long id);
	
	public Office create(Office newOffice);

}
