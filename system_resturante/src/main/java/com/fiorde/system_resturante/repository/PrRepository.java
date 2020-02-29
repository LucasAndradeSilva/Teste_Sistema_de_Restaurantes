package com.fiorde.system_resturante.repository;

import com.fiorde.system_resturante.model.PratosOfRestaurante;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PrRepository
 */
public interface PrRepository extends JpaRepository<PratosOfRestaurante, Long>{

    
}