package com.plants.plantsproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Plants {
	
	@Id
	private String id;
	private String plantname;
	private String plantSpecies;
	
	public Plants() {
		super();
		
	}
	
	public Plants(String id, String plantname, String plantSpecies) {
		super();
		this.id = id;
		this.plantname = plantname;
		this.plantSpecies = plantSpecies;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlantname() {
		return plantname;
	}
	public void setPlantname(String plantname) {
		this.plantname = plantname;
	}
	public String getPlantSpecies() {
		return plantSpecies;
	}
	public void setPlantSpecies(String plantSpecies) {
		this.plantSpecies = plantSpecies;
	}
	
	

}
