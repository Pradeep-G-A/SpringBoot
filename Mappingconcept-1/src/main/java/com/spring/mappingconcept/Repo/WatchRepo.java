package com.spring.mappingconcept.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mappingconcept1.Model.Watch;

public interface WatchRepo extends JpaRepository<Watch, Integer> {

}
