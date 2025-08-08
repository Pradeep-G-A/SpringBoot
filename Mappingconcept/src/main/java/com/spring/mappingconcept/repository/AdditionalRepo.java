package com.spring.mappingconcept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mappingconcept.model.Additionalmodel;

public interface AdditionalRepo extends JpaRepository<Additionalmodel, Integer> {

}
