package com.cenfotec.examen3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenfotec.examen3.model.Division;

@Repository
public interface DivisionRepository extends JpaRepository<Division, Long>{

	List<Division> findByidPais(long idPais);

}
