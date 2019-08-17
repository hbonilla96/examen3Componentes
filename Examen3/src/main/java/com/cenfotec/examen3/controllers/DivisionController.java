package com.cenfotec.examen3.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen3.model.Division;
import com.cenfotec.examen3.repository.DivisionRepository;

@RestController 
@RequestMapping({"/division"})
public class DivisionController {

	private DivisionRepository repository;
	
	DivisionController(DivisionRepository divisionRepository) {       
		  this.repository = divisionRepository;   
	}
	
	  @GetMapping 
	  public List findAll(){   
		  return repository.findAll(); 
	  }
	  
	  @GetMapping(path = {"/{idPais}"})
	   public List<Division> findByIdPais(@PathVariable long idPais){
	       List<Division> division = repository.findByidPais(idPais);
		        return division;
	  }		  
		  
	  @PostMapping 
	  public Division create(@RequestBody Division division){     
		  return repository.save(division); 
	  } 
}
