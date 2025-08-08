package com.spring.mappingconcept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mappingconcept.model.Camara;
import com.spring.mappingconcept.repository.CamaraRepo;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class CamaraController {
	@Autowired
	private CamaraRepo camrepository;
	@Tag(name = "SaveData",description = "Saving the Data")
	@PostMapping("/savedet")
	public String saveCamara(@RequestBody Camara camData) {
		camrepository.save(camData);
		return "Data saved";
		
	}
	@Tag(name = "Get Data",description = "Getting The Data")
	@GetMapping("/getData")
	public List<Camara> getCamaras(){
		return this.camrepository.findAll();
		
	}
	
	
	@Tag(name="jpqlQuery",description ="Getting")
	@GetMapping("/query")
    public List<Camara>fetchqueryIcecream(@RequestParam String cameraname,@RequestParam String sensorname )
    {
    	return camrepository.queryCamara(cameraname,sensorname);
    }
	
	@Tag(name="jpqlQuery",description ="Getting")
	@GetMapping("/query2")
    public List<Camara>fetchqueryIcecream2(@RequestParam String sensorname )
    {
    	return camrepository. getSensorByName(sensorname);
    }
	
	

	
}
