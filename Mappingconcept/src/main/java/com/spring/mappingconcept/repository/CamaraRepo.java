package com.spring.mappingconcept.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.mappingconcept.model.Camara;

public interface CamaraRepo extends JpaRepository<Camara, Integer> {
	@Query("select s from Camara s where s.cameraname=?1 and s.sensorname=?2")
	List<Camara> queryCamara(String cameraname, String sensorname);
	
	   //named parameters
		@Query("select s from Camara s where s.sensorname=:sensorname")
		public List<Camara> getSensorByName(String sensorname);
		

}
