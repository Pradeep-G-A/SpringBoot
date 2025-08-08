package com.spring.plants.Repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.plants.Model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Integer> {

//	@Query("select s from Plant s where s.order=?1 and s.kingdom=?2")
//	List<Plant> queryCamara(String order, String kingdom);
//	
//	   //named parameters
//		@Query("select s from Plant s where s.kingdom=:kingdom")
//		public List<Plant> getPlantByName(String kingdom);
}
