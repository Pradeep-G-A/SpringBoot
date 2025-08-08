package com.spring.plants.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ws.wsdl.wsdl11.provider.ServicesProvider;

import com.spring.plants.Model.LoginModel;
import com.spring.plants.Model.Plant;
import com.spring.plants.Service.PlantService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/plants")
public class PlantController {
	@Autowired
	private PlantService servicee;
	
	@Tag(name = "Plants",description = "Details Of Plants")
	@GetMapping
	 public List<Plant> listAll(){
		 return servicee.getPlant(); 
	 }
	
	@Tag(name = "Plant",description = "Details Of Plants By Id")
	@GetMapping("/get/{id}")
	public Optional<Plant> readbyId(@PathVariable int id) {
		return servicee.getPlantbtId(id);
	}
	
	
	@Tag(name = "Updating Of Plants",description = "Updating The Details Of Plants")
	@PutMapping("/update/{id}")
	public Plant update(@PathVariable int id,@RequestBody Plant plant) {
		return servicee.editPlant(id, plant);
	}

	@Tag(name = "Deleting Of Plants",description = "Deleting The Details Of Plants")
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		 servicee.deletePlant(id);
		 return "Deleted";
	}
	
	
	@Tag(name = "Sorting Of Plants",description = "Sorting Of Plants")
	//Sort by Descending
	@GetMapping("/sortdes/{aplant}")
	public List<Plant> sortPlants(@PathVariable("aplant") String aplant)
	{
		return servicee.sortDesc(aplant);
	}
	
	
	@Tag(name = "Pagination Of Plants",description = "Pagination Of Plants")
	//pagination
	@GetMapping("/pagination/{aheight}/{arateofgrowth}")
	public List<Plant> paginationData(@PathVariable("aheight") int height, @PathVariable("arateofgrowth") int rateofgrowth)
	{
		return servicee.paginationData(height, rateofgrowth);
	}
	
	
	@Tag(name = "Sorting And Pagination Of Plants",description = " Sorting & Pagination Of Plants")
	//pagination and sorting
	@GetMapping("/paginationSorting/{aheight}/{arateofgrowth}/{aplant}")
	public List<Plant> paginationSorting(@PathVariable("aheight") int height,@PathVariable("arateofgrowth") int rateofgrowth ,@PathVariable("aplant") String plant)
	{
		return servicee.paginationDataSort(height, rateofgrowth, plant);
	}
	@PostMapping("/postuser")
	public String postdetail(@RequestBody Plant p) {
		servicee.saveuser(p);
		return "saved";
	}
	

	

}
