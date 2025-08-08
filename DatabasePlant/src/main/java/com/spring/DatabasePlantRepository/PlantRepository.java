package com.spring.DatabasePlantRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.DatabasePlantModel.PlantModel;


public interface PlantRepository extends JpaRepository<PlantModel, Integer> {

}
