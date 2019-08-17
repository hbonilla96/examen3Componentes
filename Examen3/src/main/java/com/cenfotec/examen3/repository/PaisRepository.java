package com.cenfotec.examen3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenfotec.examen3.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
