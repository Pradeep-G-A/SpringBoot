package com.spring.plants.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

	public String deletePlant(int id) {
		repos.deleteById(id);
		return id+ " deleted ! " ;
	}
	
	//sorting
	public List<Plant> sortDesc(String aplant)
	{
		return repos.findAll(Sort.by(aplant).ascending());
	}
	
	//Pagination
	public List<Plant> paginationData(int pageNu, int pageSize)
	{
		Page<Plant> a=repos.findAll(PageRequest.of(pageNu, pageSize));
		return a.getContent();
	}
	//Pagination & Sorting
	public List<Plant> paginationDataSort(int pageNu, int pageSize,String col)
	{
		Page<Plant> a=repos.findAll(PageRequest.of(pageNu, pageSize,Sort.by(col).ascending()));
		return a.getContent();
	}
	public Plant saveuser(Plant p) {
		return repos.save(p);
		
		
	}
	
	
	
	
}
