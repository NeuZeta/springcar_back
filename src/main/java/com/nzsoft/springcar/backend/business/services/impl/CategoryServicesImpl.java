package com.nzsoft.springcar.backend.business.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nzsoft.springcar.backend.business.services.CategoryServices;
import com.nzsoft.springcar.backend.integration.model.Category;
import com.nzsoft.springcar.backend.integration.repositories.CategoryRepository;

@Service
public class CategoryServicesImpl implements CategoryServices {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Category> getAll() {
		return categoryRepository.findAll();
	}

}
