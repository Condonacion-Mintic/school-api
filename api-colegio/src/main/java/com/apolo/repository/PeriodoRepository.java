package com.apolo.repository;

import com.apolo.model.Periodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PeriodoRepository extends JpaRepository<Periodo, Integer>{
}