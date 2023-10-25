package com.plants.plantsproject;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlantController {
    @RequestMapping("hello")
    public String hello() {
        return "Hello World..";
    }
    
    @Autowired
    private PlantsService plantsService; 
    
    @RequestMapping("/plants")
    public List<Plants> getPlants() { 
        return plantsService.getPlants();
    }
    
    @RequestMapping(method = RequestMethod.POST, value = "/plants")
    public void addPlant(@RequestBody Plants plants) { 
        plantsService.addPlants(plants); 
    }
    
    @RequestMapping("/plants/{id}")
    public Optional<Plants> getPlant(@PathVariable String id) {
        System.out.println("Inside getPlant");
        return plantsService.getPlants(id);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/plants/{id}")
    public void updatePlant(@RequestBody Plants plant, @PathVariable String id) { 
        System.out.println("Inside updatePlant");
        plantsService.updatePlants(id, plant);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/plants/{id}")
    public void deletePlant(@PathVariable String id) { 
        System.out.println("Inside deletePlant"); 
        plantsService.deletePlants(id);
    }
}
