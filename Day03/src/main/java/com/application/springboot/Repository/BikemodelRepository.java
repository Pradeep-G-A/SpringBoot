package com.application.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.springboot.Model.BikeModel;
@Repository
public interface BikemodelRepository extends JpaRepository< BikeModel, Integer> {

}
