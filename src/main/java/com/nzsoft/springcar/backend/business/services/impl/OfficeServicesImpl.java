package com.nzsoft.springcar.backend.business.services.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.OfficeServices;
import com.nzsoft.springcar.backend.integration.model.Office;
import com.nzsoft.springcar.backend.integration.repositories.OfficeRepository;

@Service
public class OfficeServicesImpl implements OfficeServices {

	@Autowired
	private OfficeRepository officeRepository;
	
	@Override
	public List<Office> getAll() {
		
		return officeRepository.findAll();
	}

	@Override
	public Office getById(Long id) {
		
		Optional<Office> optional = this.officeRepository.findById(id);
		
		return optional.isPresent() ? optional.get() : null;
	}

	@Transactional
	@Override
	public Office create(Office newOffice) {
		
		Office createdOffice = officeRepository.save(newOffice);
		return createdOffice;
	}

}
