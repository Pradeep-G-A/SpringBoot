package com.spirng.cars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spirng.cars.model.Car;
import com.spirng.cars.repository.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository repository;
	
	public List<Car> getCar(){
		return repository.findAll();
	}
	public Optional<Car> getCarbtId(int id) {
		return repository.findById(id);
	}
	public Car addCar(Car car) {
		return repository.save(car);
	}
	public Car editCar(int id, Car car) {
		Car carx = repository.findById(id).orElse(null);
		if (carx !=null) {
			carx.setName(car.getName());
			carx.setHp(car.getHp());
			carx.setColor(car.getColor());
			return repository.saveAndFlush(carx);
		}
		else {
			return null;
		}	
	}
	public String deleteCar(int id) {
		repository.deleteById(id);
		return id+ " deleted !";
	}
}
