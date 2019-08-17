package com.cenfotec.examen3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cenfotec.examen3.model.Divisionr;

@Repository
public interface DivisionrRepository extends JpaRepository<Divisionr, Long>{

	List<Divisionr> findByidPaiss(long idPaiss);
}
