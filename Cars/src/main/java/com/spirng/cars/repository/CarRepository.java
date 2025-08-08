package com.spirng.cars.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spirng.cars.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
