package com.application.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.application.springboot.Model.BikeModel;
import com.application.springboot.Repository.BikemodelRepository;

@Service
public class BikeService {
	@Autowired
	BikemodelRepository bserv;
	
	public BikeModel savebike(BikeModel b)
	{
		return bserv.save(b);
	}
	 public List<BikeModel> getInfo()
	 {
		 return bserv.findAll();
	 }
	 public BikeModel updateInfo(BikeModel b)
		{
			return bserv.saveAndFlush(b);
		}
	
	public void deleteInfo(int id)
	{
		bserv.deleteById(id);
	}

}
