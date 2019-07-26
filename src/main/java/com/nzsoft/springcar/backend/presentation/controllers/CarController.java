package com.nzsoft.springcar.backend.presentation.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nzsoft.springcar.backend.business.services.CarServices;
import com.nzsoft.springcar.backend.integration.model.Car;
import com.nzsoft.springcar.backend.integration.model.Office;

@RestController
public class CarController {

	@Autowired
	private CarServices carServices;
	
	@RequestMapping(value="cars",
					method=RequestMethod.GET,
			        produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Car> getAll(){
		return carServices.getAll();
	}
	
	
	// TODO... Spring MVC tiene conflictos con el registro de endpoints que difieren sólo en los requestparam.
	
	// Se debe crear un unico endpoint genérico para todos los casos.
	// Con el fin de hacer pruebas, vamos a añadir un end-point cars/nodisponibles cuya logica acabará en el endpoint /cars
	
	@RequestMapping(value="cars/nodisponibles",
					method=RequestMethod.GET,
					produces=MediaType.APPLICATION_PROBLEM_JSON_VALUE)
	public List<Car> getNotAvailables(@RequestParam (value = "officeId", required=true) Long officeId,
									  @RequestParam (value = "inicio", required = true) String inicio, 
									  @RequestParam (value = "fin", required = true) String fin){
		
		SimpleDateFormat sdf = new SimpleDateFormat ("dd-MM-yyyy");
		
		Date fechaInicio = null;
		Date fechaFin = null;
		
		try {
			fechaInicio = sdf.parse(inicio);
			fechaFin = sdf.parse(fin);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		Office office = new Office();
		office.setId(officeId);
		
		return this.carServices.getNotAvailableBetweenDates(office, fechaInicio, fechaFin);
	}
	
	
	@RequestMapping(value="cars/image/{carImage}",
			method=RequestMethod.GET,
			produces=MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImageAsResource(@PathVariable ("carImage") String carImage) throws IOException{

		ClassPathResource imgFile = new ClassPathResource("/img/" + carImage + ".png");

		byte[] bytes = StreamUtils.copyToByteArray(imgFile.getInputStream());

		return ResponseEntity.ok().body(bytes);
	}
	

}
