package com.application.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.springboot.Model.BikeModel;
import com.application.springboot.Service.BikeService;

@RestController
public class BikeModelController {
	@Autowired
	BikeService bserv;
	 
	@PostMapping("/postBike")
	public BikeModel addbike(@RequestBody  BikeModel bs)
	{
		return bserv.savebike(bs);
	}
	 @GetMapping("/getBike")
	 public List<BikeModel> getDetails()
	 {
		 return bserv.getInfo();
	 }
	  @PutMapping("/postBike")
	  public BikeModel updateDetails(@RequestBody BikeModel id)
	  {
		  return bserv.updateInfo(id);
	  }
	  @DeleteMapping("/deleteBike/{pid}")
		public String deleteDetails(@PathVariable("pid") int playerid)
		{
			bserv.deleteInfo(playerid);
			return "Player ID "+ playerid +"Deleted";
		}

}
