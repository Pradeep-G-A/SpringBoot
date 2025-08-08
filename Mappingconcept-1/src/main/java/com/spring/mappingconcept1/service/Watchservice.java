package com.spring.mappingconcept1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mappingconcept.Repo.WatchRepo;
import com.spring.mappingconcept1.Model.Watch;

@Service
public class Watchservice {
	@Autowired
	private WatchRepo se;
	
	public List<Watch> getWatch(){
		return se.findAll();
	}

}
