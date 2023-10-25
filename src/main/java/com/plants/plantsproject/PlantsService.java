package com.plants.plantsproject;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlantsService {
	@Autowired
	private PlantsDAORepository plantsDAORepository;
	
	public List<Plants> getPlants(){
		List<Plants> plantsList = new ArrayList<Plants>();
		plantsDAORepository.findAll().forEach(plantsList::add);
		return plantsList;
		
	}
	public Optional<Plants> getPlants(String id) {
		return plantsDAORepository.findById(id);
	}
	
	public void updatePlants(String id, Plants Plants) {
		plantsDAORepository.save(Plants);
	}

	public void deletePlants(String id) {
		plantsDAORepository.deleteById(id);
	}

	public void addPlants(Plants Plants) {
		plantsDAORepository.save(Plants);
	}
}
