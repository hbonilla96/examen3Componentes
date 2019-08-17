package com.cenfotec.examen3.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Divisionr {

	@Id   
	@GeneratedValue(strategy = GenerationType.IDENTITY)   
	private Long id; 
	private String nombre;   
	private Long idPaiss;
}
