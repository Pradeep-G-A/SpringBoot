package com.spring.plants.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.plants.Model.Plant;
import com.spring.plants.Service.PlantService;

@RestController
@RequestMapping("/api/plants")
public class PlantController {
	@Autowired
	private PlantService servicee;
	@GetMapping
	 public List<Plant> read(){
		 return servicee.getPlant(); 
	 }
	@GetMapping("/{id}")
	public Optional<Plant> readbyId(@PathVariable int id) {
		return servicee.getPlantbtId(id);
	}
	@PostMapping
	public Plant create(@RequestBody Plant plant) {
		return servicee.addPlant(plant);
	}
	@PutMapping("/{id}")
	public Plant update(@PathVariable int id,@RequestBody Plant plant) {
		return servicee.editPlant(id, plant);
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		 servicee.deletePlant(id);
		 return "Deleted";
	}
	
	//Sort by Descending
	@GetMapping("/sortdes/{aplant}")
	public List<Plant> sortPlants(@PathVariable("aplant") String aplant)
	{
		return servicee.sortDesc(aplant);
	}
	
	//pagination
	@GetMapping("/pagination/{aheight}/{arateofgrowth}")
	public List<Plant> paginationData(@PathVariable("aheight") int height, @PathVariable("arateofgrowth") int rateofgrowth)
	{
		return servicee.paginationData(height, rateofgrowth);
	}
	
	//pagination and sorting
	@GetMapping("/paginationSorting/{aheight}/{arateofgrowth}/{aplant}")
	public List<Plant> paginationSorting(@PathVariable("aheight") int height,@PathVariable("arateofgrowth") int rateofgrowth ,@PathVariable("aplant") String plant)
	{
		return servicee.paginationDataSort(height, rateofgrowth, plant);
	}
	
}
