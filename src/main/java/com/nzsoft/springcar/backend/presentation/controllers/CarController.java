package com.nzsoft.springcar.backend.presentation.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/images/{carImage}",
			method=RequestMethod.GET,
			produces=MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImageAsResource(@PathVariable ("carImage") String carImage) throws IOException{

		ClassPathResource imgFile = new ClassPathResource("/img/" + carImage + ".png");

		//Para recoger las imagenes del sistema de archivos (sería lo ideal)
		//FileSystemResource imgFile = new FileSystemResource("c:\\imagenes\\chic1.jpg");

		byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

		return ResponseEntity.ok().body(bytes);
	}
	
}
