package com.spring.plants.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.plants.Model.Plant;
import com.spring.plants.Repository.PlantRepository;

@Service
public class PlantService {
	@Autowired
	private PlantRepository repos;
	
	public List<Plant> getPlant() {
		return repos.findAll();
	}
	public Optional<Plant> getPlantbtId(int id) {
		return repos.findById(id);
	}
	public Plant addPlant (Plant plant) {
		return repos.save(plant);
	}
	public Plant editPlant(int id,Plant plant) {
		Plant planty = repos.findById(id).orElse(null);
		if(planty != null) {
			planty.setPlant(plant.getPlant() );
			planty.setBiological(plant.getBiological() );
			planty.setClassification(plant.getClassification());
			planty.setOrigin(plant.getOrigin());
			planty.setRoottype(plant.getRoottype());
			planty.setFamilytype(plant.getFamilytype());
			planty.setHeight(plant.getHeight());
			planty.setRateofgrowth(plant.getRateofgrowth());
		
			return repos.saveAndFlush(planty);
			
		}
		else {
			return null;
		}
 	}
	public String deleteCar(int id) {
		repos.deleteById(id);
		return id+ " deleted ! " ;
	}
	public String deletePlant(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
