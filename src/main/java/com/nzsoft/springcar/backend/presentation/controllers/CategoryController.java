package com.nzsoft.springcar.backend.presentation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.CategoryServices;
import com.nzsoft.springcar.backend.integration.model.Category;

@RestController
public class CategoryController {

	@Autowired
	private CategoryServices categoryServices;
	
	@RequestMapping(value="categories",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Category> getAll(){
		return categoryServices.getAll();
	}
	
	
}
