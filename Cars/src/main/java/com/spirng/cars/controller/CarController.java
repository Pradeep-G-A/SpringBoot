package com.spirng.cars.controller;

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

import com.spirng.cars.model.Car;
import com.spirng.cars.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	@Autowired
	private CarService service;
	@GetMapping("/get")
	public List<Car> read(){
		return service.getCar();
	}
	@GetMapping("/{id}")
	public Optional<Car> readbyId(@PathVariable int id ) {
		return service.getCarbtId(id);
	}
	@PostMapping
	public Car create(@RequestBody Car car) {
		return service.addCar(car);
	}
	@PutMapping("/{id}")
	public Car update(@PathVariable int id, @RequestBody Car car) {
		return service.editCar(id, car);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		return service.deleteCar(id);
	}
}
