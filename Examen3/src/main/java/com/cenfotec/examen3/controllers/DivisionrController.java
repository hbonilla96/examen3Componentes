package com.cenfotec.examen3.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen3.model.Divisionr;
import com.cenfotec.examen3.repository.DivisionrRepository;


@RestController 
@RequestMapping({"/divisionr"})
public class DivisionrController {

	private DivisionrRepository repository;
	
	DivisionrController(DivisionrRepository divisionrRepository) {       
		  this.repository = divisionrRepository;   
	}
	
	  @GetMapping 
	  public List findAll(){   
		  return repository.findAll(); 
	  }
	  
	  @GetMapping(path = {"/{idPais}"})
	   public List<Divisionr> findByIdPais(@PathVariable long idPais){
	       List<Divisionr> division = repository.findByidPaiss(idPais);
		        return division;
	  }		  
		  
	  @PostMapping 
	  public Divisionr create(@RequestBody Divisionr division){     
		  return repository.save(division); 
	  } 	
}
