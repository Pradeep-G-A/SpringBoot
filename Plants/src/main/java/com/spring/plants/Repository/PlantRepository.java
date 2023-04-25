package com.spring.plants.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.plants.Model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Integer> {

}
